package io.github.maliciousfiles.nautilusgui.components;

import org.bukkit.event.inventory.InventoryClickEvent;

public class ButtonGuiComponent extends ItemGuiComponent {

    private Runnable action;

    public ButtonGuiComponent setAction(Runnable action) {
        this.action = action;
        return this;
    }

    @Override
    public void handleClick(InventoryClickEvent e) {
        action.run();
    }
}
