package io.github.maliciousfiles.nautilusgui.components;

import io.github.maliciousfiles.nautilusgui.page.PagedGuiPage;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PagingGuiComponent extends ItemGuiComponent {

    private Direction direction;

    public PagingGuiComponent setDirection(Direction direction) {
        this.direction = direction;
        return this;
    }

    @Override
    public void handleClick(InventoryClickEvent e) {
        if (e.getClickedInventory().getHolder() instanceof PagedGuiPage page) {
            if (direction == Direction.FORWARD) page.nextPage();
            else if (direction == Direction.BACK) page.previousPage();

            page.open();
        }
    }

    public enum Direction {
        FORWARD,
        BACK
    }
}
