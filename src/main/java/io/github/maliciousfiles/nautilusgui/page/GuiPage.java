package io.github.maliciousfiles.nautilusgui.page;

import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryHolder;

public abstract class GuiPage implements InventoryHolder {

    protected GuiPage parent;

    public GuiPage() {}

    protected GuiPage setParent(GuiPage parent) {
        this.parent = parent;
        return this;
    }

    public abstract void handleClick(InventoryClickEvent e);
}
