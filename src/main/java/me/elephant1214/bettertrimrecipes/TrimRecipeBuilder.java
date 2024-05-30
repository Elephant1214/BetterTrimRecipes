package me.elephant1214.bettertrimrecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

public final class TrimRecipeBuilder {
    private final Material trim;
    private final RecipeChoice.MaterialChoice primary;
    private final Material surrounding;

    public TrimRecipeBuilder(Material trim, RecipeChoice.MaterialChoice primary, Material surrounding) {
        this.trim = trim;
        this.primary = primary;
        this.surrounding = surrounding;
    }

    public void build() {
        NamespacedKey key = NamespacedKey.minecraft(this.trim.toString().toLowerCase());
        ItemStack stack = new ItemStack(this.trim, 2);
        ShapedRecipe sr = new ShapedRecipe(key, stack);
        sr.shape("STS", "SPS", "SSS");
        sr.setIngredient('T', this.trim);
        sr.setIngredient('P', this.primary);
        sr.setIngredient('S', this.surrounding);
        if (Bukkit.getRecipe(key) != null) {
            Bukkit.removeRecipe(key);
            Bukkit.addRecipe(sr);
        }
    }
}
