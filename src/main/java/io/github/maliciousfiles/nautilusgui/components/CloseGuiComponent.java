package io.github.maliciousfiles.nautilusgui.components;

import org.bukkit.event.inventory.InventoryClickEvent;

public class CloseGuiComponent extends ItemGuiComponent {
    @Override
    public void handleClick(InventoryClickEvent e) {
        e.getWhoClicked().closeInventory();
    }
}
