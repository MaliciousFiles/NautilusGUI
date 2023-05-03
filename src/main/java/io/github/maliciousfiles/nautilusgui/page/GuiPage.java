package io.github.maliciousfiles.nautilusgui.page;

import io.github.maliciousfiles.nautilusgui.Gui;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryHolder;

public abstract class GuiPage implements InventoryHolder {

    protected GuiPage parent;
    protected Gui gui;

    public GuiPage() {}

    public boolean load(Player player) {return false;}

    public void open() {
        gui.openPage(this);
    }

    public Gui getGui() {
        return gui;
    }

    public GuiPage setGui(Gui gui) {
        this.gui = gui;
        return this;
    }

    protected GuiPage setParent(GuiPage parent) {
        this.parent = parent;
        return this;
    }

    public GuiPage getParent() {
        return parent;
    }

    public abstract void handleClick(InventoryClickEvent e);
}
