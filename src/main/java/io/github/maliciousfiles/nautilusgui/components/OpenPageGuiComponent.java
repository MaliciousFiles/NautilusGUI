package io.github.maliciousfiles.nautilusgui.components;

import io.github.maliciousfiles.nautilusgui.page.BasicGuiPage;
import org.bukkit.event.inventory.InventoryClickEvent;

public class OpenPageGuiComponent extends ItemGuiComponent {

    private int childIdx;

    public OpenPageGuiComponent setChildIdx(int childIdx) {
        this.childIdx = childIdx;
        return this;
    }

    @Override
    public void handleClick(InventoryClickEvent e) {
        if (e.getClickedInventory().getHolder() instanceof BasicGuiPage page) {
            e.getWhoClicked().openInventory(page.getChild(childIdx).getInventory());
        }
    }
}
