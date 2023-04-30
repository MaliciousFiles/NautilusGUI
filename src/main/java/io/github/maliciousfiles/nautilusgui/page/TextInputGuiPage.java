package io.github.maliciousfiles.nautilusgui.page;

import io.github.maliciousfiles.nautilusgui.util.CustomAnvilInventory;
import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class TextInputGuiPage extends GuiPage {

    private ItemStack item;

    public TextInputGuiPage setItem(ItemStack item) {
        this.item = item;
        return this;
    }

    @Override
    public @NotNull Inventory getInventory() {
        AnvilInventory inv = new CustomAnvilInventory();
        inv.setFirstItem(item);

        return inv;
    }

    @Override
    public void handleClick(InventoryClickEvent e) {
        Bukkit.getLogger().info("Click");
    }
}
