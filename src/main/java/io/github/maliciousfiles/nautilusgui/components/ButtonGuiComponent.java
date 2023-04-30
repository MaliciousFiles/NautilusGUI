package io.github.maliciousfiles.nautilusgui.components;

import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.function.Consumer;

public class ButtonGuiComponent extends ItemGuiComponent {

    private Consumer<InventoryClickEvent> action;

    public ButtonGuiComponent setAction(Consumer<InventoryClickEvent> action) {
        this.action = action;
        return this;
    }

    @Override
    public void handleClick(InventoryClickEvent e) {
        action.accept(e);
    }
}
