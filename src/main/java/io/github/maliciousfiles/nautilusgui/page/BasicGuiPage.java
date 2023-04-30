package io.github.maliciousfiles.nautilusgui.page;

import io.github.maliciousfiles.nautilusgui.components.FillerGuiComponent;
import io.github.maliciousfiles.nautilusgui.components.GuiComponent;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.List;

public class BasicGuiPage extends GuiPage {

    private int rows;
    private String name;
    private GuiComponent[][] components;
    private final List<GuiPage> children = new ArrayList<>();

    public BasicGuiPage addChild(GuiPage child) {
        children.add(child.setParent(this));
        return this;
    }

    public GuiPage getChild(int idx) {
        return children.get(idx);
    }

    public BasicGuiPage setSize(int rows) {
        this.rows = rows;

        components = new GuiComponent[rows][];
        for (int i = 0; i < rows; i++) components[i] = new GuiComponent[9];

        return this;
    }

    public BasicGuiPage addComponent(GuiComponent component, int row, int column) {
        components[row][column] = component;
        return this;
    }

    public BasicGuiPage setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(this, rows*9, Component.text(name));

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < 9; c++) {
                GuiComponent component = components[r][c];
                if (component == null) component = new FillerGuiComponent();

                inv.setItem(r*9+c, component.render());
            }
        }

        return inv;
    }

    @Override
    public void handleClick(InventoryClickEvent e) {
        components[e.getSlot()/9][e.getSlot()%9].handleClick(e);
    }
}
