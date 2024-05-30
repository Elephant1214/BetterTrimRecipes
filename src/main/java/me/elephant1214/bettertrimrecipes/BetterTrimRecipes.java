package me.elephant1214.bettertrimrecipes;

import org.bukkit.inventory.RecipeChoice.MaterialChoice;
import org.bukkit.plugin.java.JavaPlugin;

import static org.bukkit.Material.*;

public final class BetterTrimRecipes extends JavaPlugin {
    private static final MaterialChoice ALL_SHERDS = new MaterialChoice(
            ANGLER_POTTERY_SHERD, ARCHER_POTTERY_SHERD, ARMS_UP_POTTERY_SHERD, BLADE_POTTERY_SHERD, BREWER_POTTERY_SHERD,
            BURN_POTTERY_SHERD, DANGER_POTTERY_SHERD, EXPLORER_POTTERY_SHERD, FLOW_POTTERY_SHERD, FRIEND_POTTERY_SHERD,
            GUSTER_POTTERY_SHERD, HEART_POTTERY_SHERD, HEARTBREAK_POTTERY_SHERD, HOWL_POTTERY_SHERD, MINER_POTTERY_SHERD,
            MOURNER_POTTERY_SHERD, PLENTY_POTTERY_SHERD, PRIZE_POTTERY_SHERD, SCRAPE_POTTERY_SHERD, SHEAF_POTTERY_SHERD,
            SHELTER_POTTERY_SHERD, SKULL_POTTERY_SHERD, SNORT_POTTERY_SHERD
    );

    @Override
    public void onEnable() {
        new TrimRecipeBuilder(NETHERITE_UPGRADE_SMITHING_TEMPLATE, new MaterialChoice(NETHERRACK), DIAMOND).build();
        new TrimRecipeBuilder(SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE, new MaterialChoice(OAK_PLANKS), EMERALD).build();
        new TrimRecipeBuilder(DUNE_ARMOR_TRIM_SMITHING_TEMPLATE, new MaterialChoice(SANDSTONE), GUNPOWDER).build();
        new TrimRecipeBuilder(COAST_ARMOR_TRIM_SMITHING_TEMPLATE, new MaterialChoice(NAUTILUS_SHELL), COBBLESTONE).build();
        new TrimRecipeBuilder(WILD_ARMOR_TRIM_SMITHING_TEMPLATE, new MaterialChoice(AMETHYST_SHARD), MOSSY_COBBLESTONE).build();
        new TrimRecipeBuilder(WARD_ARMOR_TRIM_SMITHING_TEMPLATE, new MaterialChoice(ECHO_SHARD), COBBLED_DEEPSLATE).build();
        new TrimRecipeBuilder(EYE_ARMOR_TRIM_SMITHING_TEMPLATE, new MaterialChoice(ENDER_EYE), END_STONE).build();
        new TrimRecipeBuilder(VEX_ARMOR_TRIM_SMITHING_TEMPLATE, new MaterialChoice(IRON_SWORD), DARK_OAK_PLANKS).build();
        new TrimRecipeBuilder(TIDE_ARMOR_TRIM_SMITHING_TEMPLATE, new MaterialChoice(DIAMOND), PRISMARINE_SHARD).build();
        new TrimRecipeBuilder(SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE, new MaterialChoice(BLACKSTONE), GOLD_INGOT).build();
        new TrimRecipeBuilder(RIB_ARMOR_TRIM_SMITHING_TEMPLATE, new MaterialChoice(NETHERRACK), BLAZE_ROD).build();
        new TrimRecipeBuilder(SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE, new MaterialChoice(DIAMOND), PURPUR_BLOCK).build();
        new TrimRecipeBuilder(WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE, ALL_SHERDS, TERRACOTTA).build();
        new TrimRecipeBuilder(SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE, ALL_SHERDS, TERRACOTTA).build();
        new TrimRecipeBuilder(SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE, new MaterialChoice(ECHO_SHARD), COBBLED_DEEPSLATE).build();
        new TrimRecipeBuilder(RAISER_ARMOR_TRIM_SMITHING_TEMPLATE, ALL_SHERDS, TERRACOTTA).build();
        new TrimRecipeBuilder(HOST_ARMOR_TRIM_SMITHING_TEMPLATE, ALL_SHERDS, TERRACOTTA).build();
        new TrimRecipeBuilder(BOLT_ARMOR_TRIM_SMITHING_TEMPLATE, new MaterialChoice(DIAMOND), COPPER_BLOCK).build();
        new TrimRecipeBuilder(FLOW_ARMOR_TRIM_SMITHING_TEMPLATE, new MaterialChoice(BREEZE_ROD), OXIDIZED_COPPER).build();
    }
}
