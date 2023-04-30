package io.github.maliciousfiles.nautilusgui.components;

import io.github.maliciousfiles.nautilusgui.page.GuiPage;
import org.bukkit.event.inventory.InventoryClickEvent;

public class BackGuiComponent extends ItemGuiComponent {
    @Override
    public void handleClick(InventoryClickEvent e) {
        if (e.getInventory().getHolder() instanceof GuiPage page) {
            if (page.getParent() != null) {
                page.getParent().open();
            } else {
                InventoryClickEvent.getHandlerList().unregister(page.getGui());
                e.getWhoClicked().closeInventory();
            }
        }
    }
}
