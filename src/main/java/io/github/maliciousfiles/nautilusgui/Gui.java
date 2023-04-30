package io.github.maliciousfiles.nautilusgui;

import io.github.maliciousfiles.nautilusgui.page.GuiPage;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.UUID;

public class Gui implements Listener {

    private UUID player;

    private GuiPage root;
    private GuiPage open;

    public Gui() {}

    public Gui setRoot(GuiPage root) {
        this.root = root;
        return this;
    }

    public void display(Player player) {
        this.player = player.getUniqueId();
        player.openInventory(root.getInventory());
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        if (e.getWhoClicked().getUniqueId() == player) {
            e.setCancelled(true);

            if (e.getView().getTopInventory() == e.getClickedInventory()) {
                open.handleClick(e);
            }
        }
    }
}
