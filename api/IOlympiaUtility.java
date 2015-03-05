package com.dasumlaut.olympia.api;

import net.minecraft.item.ItemStack;

public interface IOlympiaUtility {

	public ItemStack getOlympiaItemStack(String slug, int stackSize, int damage);

	public ItemStack getOlympiaItemStack(String slug, int stackSize);

	public ItemStack getOlympiaItemStack(String slug);

}
