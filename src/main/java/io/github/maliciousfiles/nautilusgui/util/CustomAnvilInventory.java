package io.github.maliciousfiles.nautilusgui.util;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class CustomAnvilInventory implements AnvilInventory {

    private String name = "";
    private ItemStack[] items = new ItemStack[3];

    @Override
    public String getRenameText() {
        return null;
    }

    @Override
    public int getRepairCostAmount() {
        return 0;
    }

    @Override
    public void setRepairCostAmount(int i) {}

    @Override
    public int getRepairCost() {return 0;}

    @Override
    public void setRepairCost(int i) {}

    @Override
    public int getMaximumRepairCost() {return 0;}

    @Override
    public void setMaximumRepairCost(int i) {}

    @Override
    public int getSize() {return 3;}

    @Override
    public int getMaxStackSize() {return 1;}

    @Override
    public void setMaxStackSize(int i) {}

    @Override
    public @Nullable ItemStack getItem(int i) {return null;}

    @Override
    public void setItem(int i, @Nullable ItemStack itemStack) {}

    @Override
    public @NotNull HashMap<Integer, ItemStack> addItem(@NotNull ItemStack... itemStacks) throws IllegalArgumentException {return new HashMap<>();}

    @Override
    public @NotNull HashMap<Integer, ItemStack> removeItem(@NotNull ItemStack... itemStacks) throws IllegalArgumentException {return new HashMap<>();}

    @Override
    public @NotNull HashMap<Integer, ItemStack> removeItemAnySlot(@NotNull ItemStack... itemStacks) throws IllegalArgumentException {return new HashMap<>();}

    @Override
    public @Nullable ItemStack @NotNull [] getContents() {return new ItemStack[0];}

    @Override
    public void setContents(@Nullable ItemStack @NotNull [] itemStacks) throws IllegalArgumentException {}

    @Override
    public @Nullable ItemStack @NotNull [] getStorageContents() {return new ItemStack[0];}

    @Override
    public void setStorageContents(@Nullable ItemStack @NotNull [] itemStacks) throws IllegalArgumentException {}

    @Override
    public boolean contains(@NotNull Material material) throws IllegalArgumentException {return false;}

    @Override
    public boolean contains(@Nullable ItemStack itemStack) {return false;}

    @Override
    public boolean contains(@NotNull Material material, int i) throws IllegalArgumentException {return false;}

    @Override
    public boolean contains(@Nullable ItemStack itemStack, int i) {return false;}

    @Override
    public boolean containsAtLeast(@Nullable ItemStack itemStack, int i) {return false;}

    @Override
    public @NotNull HashMap<Integer, ? extends ItemStack> all(@NotNull Material material) throws IllegalArgumentException {return new HashMap<>();}

    @Override
    public @NotNull HashMap<Integer, ? extends ItemStack> all(@Nullable ItemStack itemStack) {return new HashMap<>();}

    @Override
    public int first(@NotNull Material material) throws IllegalArgumentException {return 0;}

    @Override
    public int first(@NotNull ItemStack itemStack) {return 0;}

    @Override
    public int firstEmpty() {return 0;}

    @Override
    public boolean isEmpty() {return false;}

    @Override
    public void remove(@NotNull Material material) throws IllegalArgumentException {}

    @Override
    public void remove(@NotNull ItemStack itemStack) {}

    @Override
    public void clear(int i) {}

    @Override
    public void clear() {}

    @Override
    public int close() {return 0;}

    @Override
    public @NotNull List<HumanEntity> getViewers() {return null;}

    @Override
    public @NotNull InventoryType getType() {return null;}

    @Override
    public @Nullable InventoryHolder getHolder() {return null;}

    @Override
    public @Nullable InventoryHolder getHolder(boolean b) {return null;}

    @Override
    public @NotNull ListIterator<ItemStack> iterator() {return new ArrayList<ItemStack>().listIterator();}

    @Override
    public @NotNull ListIterator<ItemStack> iterator(int i) {return new ArrayList<ItemStack>().listIterator();}

    @Override
    public @Nullable Location getLocation() {return null;}
}
