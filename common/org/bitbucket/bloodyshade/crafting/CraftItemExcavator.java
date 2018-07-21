/*
 * This piece of software is part of the PowerMining Bukkit Plugin
 * Author: BloodyShade (dev.bukkit.org/profiles/bloodyshade)
 *
 * Licensed under the LGPL v3
 * Further information please refer to the included lgpl-3.0.txt or the gnu website (http://www.gnu.org/licenses/lgpl)
 */

/*
 * This class is responsible for creating the Excavator items and their respective crafting recipes
 */

package org.bitbucket.bloodyshade.crafting;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class CraftItemExcavator {
	public JavaPlugin plugin;
	public static String loreString = "POUND!";

	ItemStack WoodExcavator = new ItemStack(Material.WOOD_SPADE, 1);
	ItemStack StoneExcavator = new ItemStack(Material.STONE_SPADE, 1);
	ItemStack IronExcavator = new ItemStack(Material.IRON_SPADE, 1);
	ItemStack GoldExcavator = new ItemStack(Material.GOLD_SPADE, 1);
	ItemStack DiamondExcavator = new ItemStack(Material.DIAMOND_SPADE, 1);

	ShapedRecipe WoodExcavatorRecipe;
	ShapedRecipe StoneExcavatorRecipe;
	ShapedRecipe IronExcavatorRecipe;
	ShapedRecipe GoldExcavatorRecipe;
	ShapedRecipe DiamondExcavatorRecipe;

	public CraftItemExcavator(JavaPlugin plugin) {
		this.plugin = plugin;

		modifyItemMeta();
		setRecipes();
		registerRecipes();
	}

	// Get metadata for all excavator types, add lore and change the names to identify them as excavators
	public void modifyItemMeta() {
		ItemMeta WoodExcavatorMeta = WoodExcavator.getItemMeta();
		ItemMeta StoneExcavatorMeta = StoneExcavator.getItemMeta();
		ItemMeta IronExcavatorMeta = IronExcavator.getItemMeta();
		ItemMeta GoldExcavatorMeta = GoldExcavator.getItemMeta();
		ItemMeta DiamondExcavatorMeta = DiamondExcavator.getItemMeta();

		ArrayList<String> lore = new ArrayList<String>();
		lore.add(loreString);

		WoodExcavatorMeta.setDisplayName("Wooden Excavator");
		StoneExcavatorMeta.setDisplayName("Stone Excavator");
		IronExcavatorMeta.setDisplayName("Iron Excavator");
		GoldExcavatorMeta.setDisplayName("Golden Excavator");
		DiamondExcavatorMeta.setDisplayName("Diamond Excavator");

		WoodExcavatorMeta.setLore(lore);
		StoneExcavatorMeta.setLore(lore);
		IronExcavatorMeta.setLore(lore);
		GoldExcavatorMeta.setLore(lore);
		DiamondExcavatorMeta.setLore(lore);

		WoodExcavator.setItemMeta(WoodExcavatorMeta);
		StoneExcavator.setItemMeta(StoneExcavatorMeta);
		IronExcavator.setItemMeta(IronExcavatorMeta);
		GoldExcavator.setItemMeta(GoldExcavatorMeta);
		DiamondExcavator.setItemMeta(DiamondExcavatorMeta);
	}

	// Creates the ShapedRecipe patterns for all excavator types
	public void setRecipes() {
		WoodExcavatorRecipe = new ShapedRecipe(WoodExcavator);
		StoneExcavatorRecipe = new ShapedRecipe(StoneExcavator);
		IronExcavatorRecipe = new ShapedRecipe(IronExcavator);
		GoldExcavatorRecipe = new ShapedRecipe(GoldExcavator);
		DiamondExcavatorRecipe = new ShapedRecipe(DiamondExcavator);

		WoodExcavatorRecipe.shape(" m ", "mim", " m ");
		WoodExcavatorRecipe.setIngredient('m', Material.LOG);
		WoodExcavatorRecipe.setIngredient('i', Material.WOOD_SPADE);

		StoneExcavatorRecipe.shape(" m ", "mim", " m ");
		StoneExcavatorRecipe.setIngredient('m', Material.STONE);
		StoneExcavatorRecipe.setIngredient('i', Material.STONE_SPADE);

		IronExcavatorRecipe.shape(" m ", "mim", " m ");
		IronExcavatorRecipe.setIngredient('m', Material.IRON_INGOT);
		IronExcavatorRecipe.setIngredient('i', Material.IRON_SPADE);

		GoldExcavatorRecipe.shape(" m ", "mim", " m ");
		GoldExcavatorRecipe.setIngredient('m', Material.GOLD_INGOT);
		GoldExcavatorRecipe.setIngredient('i', Material.GOLD_SPADE);

		DiamondExcavatorRecipe.shape(" m ", "mim", " m ");
		DiamondExcavatorRecipe.setIngredient('m', Material.DIAMOND);
		DiamondExcavatorRecipe.setIngredient('i', Material.DIAMOND_SPADE);
	}

	// Registers all created recipes into the game
	public void registerRecipes() {
		plugin.getServer().addRecipe(WoodExcavatorRecipe);
		plugin.getServer().addRecipe(StoneExcavatorRecipe);
		plugin.getServer().addRecipe(IronExcavatorRecipe);
		plugin.getServer().addRecipe(GoldExcavatorRecipe);
		plugin.getServer().addRecipe(DiamondExcavatorRecipe);
	}
}
