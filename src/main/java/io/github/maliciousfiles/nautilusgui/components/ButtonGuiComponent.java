package io.github.maliciousfiles.nautilusgui.components;

import io.github.maliciousfiles.nautilusgui.page.GuiPage;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.function.Consumer;

public class ButtonGuiComponent extends ItemGuiComponent {

    private Consumer<InventoryClickEvent> action;
    private boolean closeOnClick = false;

    public ButtonGuiComponent setAction(Consumer<InventoryClickEvent> action) {
        this.action = action;
        return this;
    }

    public ButtonGuiComponent setCloseOnClick(boolean closeOnClick) {
        this.closeOnClick = closeOnClick;
        return this;
    }

    @Override
    public void handleClick(InventoryClickEvent e) {
        action.accept(e);
        if (closeOnClick && e.getInventory().getHolder() instanceof GuiPage page) {
            InventoryClickEvent.getHandlerList().unregister(page.getGui());
            e.getWhoClicked().closeInventory();
        }
    }
}
