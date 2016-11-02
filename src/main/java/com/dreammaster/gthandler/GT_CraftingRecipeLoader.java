package com.dreammaster.gthandler;

import cpw.mods.fml.common.Loader;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.enums.ToolDictNames;
import gregtech.api.util.GT_ModHandler;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GT_CraftingRecipeLoader extends gregtech.loaders.postload.GT_CraftingRecipeLoader
        implements Runnable {
    public void run() {

        //Mine and Blade Battlegear remove recipes NBT
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "quiver", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "shield.wood", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "shield.hide", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "shield.iron", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "shield.gold", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "shield.diamond", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "dagger.wood", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "dagger.stone", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "dagger.iron", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "dagger.gold", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "dagger.diamond", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "spear.wood", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "spear.stone", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "spear.iron", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "spear.gold", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "spear.diamond", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "waraxe.wood", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "waraxe.stone", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "waraxe.iron", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "waraxe.gold", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "waraxe.diamond", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "mace.wood", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "mace.stone", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "mace.iron", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "mace.gold", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "mace.diamond", 1L, 0), true, false, true);
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("battlegear2", "chain", 1L, 0), true, false, true);

//Add recipes
        GT_ModHandler.addCraftingRecipe(CustomItemList.RawOrbTier1.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"XTX", "POP", "PPP", 'X', OrePrefixes.screw.get(Materials.Aluminium), 'T', ToolDictNames.craftingToolScrewdriver, 'P', OrePrefixes.plate.get(Materials.AnnealedCopper), 'O', CustomItemList.ReinforcedGlassLense.get(1L, new Object[0])});
        GT_ModHandler.addCraftingRecipe(CustomItemList.RawOrbTier2.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"XTX", "POP", "PPP", 'X', OrePrefixes.screw.get(Materials.StainlessSteel), 'T', ToolDictNames.craftingToolScrewdriver, 'P', OrePrefixes.plate.get(Materials.RoseGold), 'O', CustomItemList.ReinforcedGlassLense.get(1L, new Object[0])});
        GT_ModHandler.addCraftingRecipe(CustomItemList.RawOrbTier3.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"XTX", "POP", "PPP", 'X', OrePrefixes.screw.get(Materials.Titanium), 'T', ToolDictNames.craftingToolScrewdriver, 'P', OrePrefixes.plate.get(Materials.PulsatingIron), 'O', CustomItemList.ReinforcedGlassLense.get(1L, new Object[0])});
        GT_ModHandler.addCraftingRecipe(CustomItemList.RawOrbTier4.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"XTX", "POP", "PPP", 'X', OrePrefixes.screw.get(Materials.TungstenSteel), 'T', ToolDictNames.craftingToolScrewdriver, 'P', OrePrefixes.plate.get(Materials.EnergeticAlloy), 'O', CustomItemList.ReinforcedGlassLense.get(1L, new Object[0])});
        GT_ModHandler.addCraftingRecipe(CustomItemList.RawOrbTier5.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"XTX", "POP", "PPP", 'X', OrePrefixes.screw.get(Materials.Chrome), 'T', ToolDictNames.craftingToolScrewdriver, 'P', OrePrefixes.plate.get(Materials.FierySteel), 'O', CustomItemList.ReinforcedGlassLense.get(1L, new Object[0])});
        GT_ModHandler.addCraftingRecipe(CustomItemList.RawOrbTier6.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"XTX", "POP", "PPP", 'X', OrePrefixes.screw.get(Materials.Iridium), 'T', ToolDictNames.craftingToolScrewdriver, 'P', OrePrefixes.plate.get(Materials.Plutonium241), 'O', CustomItemList.ReinforcedGlassLense.get(1L, new Object[0])});

        GT_ModHandler.addCraftingRecipe(CustomItemList.WoodenCasing.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"SSS", "UCU", "SDS", 'S', OrePrefixes.slab.get(Materials.Wood), 'D', ToolDictNames.craftingToolScrewdriver, 'U', OrePrefixes.screw.get(Materials.Iron), 'C', OrePrefixes.frameGt.get(Materials.Wood)});

        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("Railcraft", "machine.beta", 1L, 3));
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("Railcraft", "machine.beta", 1L, 4));
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.beta", 1L, 3), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"III", "SHS", "III", 'H', ToolDictNames.craftingToolHardHammer, 'I', ItemList.IC2_Item_Casing_Iron, 'S', OrePrefixes.screw.get(Materials.AnyIron)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.beta", 1L, 4), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"LLL", "SHS", "LLL", 'H', ToolDictNames.craftingToolHardHammer, 'L', ItemList.IC2_Item_Casing_Steel, 'S', OrePrefixes.screw.get(Materials.Steel)});

        GT_ModHandler.addShapelessCraftingRecipe(GT_ModHandler.getIC2Item("miningPipe", 1L), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{GT_ModHandler.getIC2Item("miningPipeTip", 1L)});

        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.ModuleSmallCanister", 1L, 0), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"PPP", "PCP", "PPP", 'P', OrePrefixes.compressed.get(Materials.Steel), 'C', GT_ModHandler.getModItem("GalacticraftCore", "item.oilCanisterPartial", 1L, 1001)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.ModuleSmallFuelCanister", 1L, 0), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"SRS", "TCD", "SHS", 'S', OrePrefixes.screw.get(Materials.StainlessSteel), 'R', ToolDictNames.craftingToolScrewdriver, 'T', GT_ModHandler.getModItem("GalaxySpace", "item.CompressedDualBronze", 1L, 0), 'D', GT_ModHandler.getModItem("GalaxySpace", "item.CompressedDualAluminium", 1L, 0), 'C', GT_ModHandler.getModItem("GalaxySpace", "item.ModuleSmallCanister", 1L, 0), 'H', ToolDictNames.craftingToolHardHammer});
        GT_ModHandler.addCraftingRecipe(CustomItemList.MediumFuelCanister.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"SRS", "TCD", "SHS", 'S', OrePrefixes.screw.get(Materials.Titanium), 'R', ToolDictNames.craftingToolScrewdriver, 'T', CustomItemList.TitaniumDualCompressedPlates.get(1, new Object[0]), 'D', CustomItemList.DeshDualCompressedPlates.get(1, new Object[0]), 'C', GT_ModHandler.getModItem("GalaxySpace", "item.ModuleSmallFuelCanister", 1L, 0), 'H', ToolDictNames.craftingToolHardHammer});
        GT_ModHandler.addCraftingRecipe(CustomItemList.LargeFuelCanister.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"SRS", "TCD", "SHS", 'S', OrePrefixes.screw.get(Materials.Chrome), 'R', ToolDictNames.craftingToolScrewdriver, 'T', CustomItemList.QuantinumDualCompressedPlates.get(1, new Object[0]), 'D', CustomItemList.IceDualCompressedPlates.get(1, new Object[0]), 'C', CustomItemList.MediumFuelCanister.get(1, new Object[0]), 'H', ToolDictNames.craftingToolHardHammer});
        GT_ModHandler.addCraftingRecipe(CustomItemList.ExtraLargeFuelCanister.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"SRS", "TCD", "SHS", 'S', OrePrefixes.screw.get(Materials.Iridium), 'R', ToolDictNames.craftingToolScrewdriver, 'T', CustomItemList.MytrylDualCompressedPlates.get(1, new Object[0]), 'D', CustomItemList.MysteriousCrystalDualCompressedPlates.get(1, new Object[0]), 'C', CustomItemList.LargeFuelCanister.get(1, new Object[0]), 'H', ToolDictNames.craftingToolHardHammer});
        GT_ModHandler.addCraftingRecipe(CustomItemList.HeavyDutyRocketEngineTier3.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"BPB", "PPP", "EPE", 'B', CustomItemList.Tier2Booster.get(1, new Object[0]), 'P', CustomItemList.HeavyDutyPlateTier5.get(1, new Object[0]), 'E', GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 1L, 1)});
        GT_ModHandler.addCraftingRecipe(CustomItemList.HeavyDutyRocketEngineTier4.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"BPB", "PPP", "EPE", 'B', CustomItemList.Tier3Booster.get(1, new Object[0]), 'P', CustomItemList.HeavyDutyPlateTier7.get(1, new Object[0]), 'E', CustomItemList.HeavyDutyRocketEngineTier3.get(1, new Object[0])});
        GT_ModHandler.addCraftingRecipe(CustomItemList.HeavyDutyNoseConeTier3.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"SNH", "CPC", "PPP", 'N', GT_ModHandler.getModItem("GalacticraftMars", "item.heavyNoseCone", 1L, 0), 'P', CustomItemList.HeavyDutyPlateTier5.get(1, new Object[0]), 'C', OrePrefixes.screw.get(Materials.TungstenSteel), 'S', ToolDictNames.craftingToolScrewdriver, 'H', ToolDictNames.craftingToolHardHammer});
        GT_ModHandler.addCraftingRecipe(CustomItemList.HeavyDutyNoseConeTier4.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"SNH", "CPC", "PPP", 'N', CustomItemList.HeavyDutyNoseConeTier3.get(1, new Object[0]), 'P', CustomItemList.HeavyDutyPlateTier7.get(1, new Object[0]), 'C', OrePrefixes.screw.get(Materials.NaquadahAlloy), 'S', ToolDictNames.craftingToolScrewdriver, 'H', ToolDictNames.craftingToolHardHammer});
        GT_ModHandler.addCraftingRecipe(CustomItemList.HeavyDutyRocketFinsTier3.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"HPF", "QPQ", "QSQ", 'P', CustomItemList.HeavyDutyPlateTier4.get(1, new Object[0]), 'Q', CustomItemList.HeavyDutyPlateTier5.get(1, new Object[0]), 'S', GT_ModHandler.getModItem("GalaxySpace", "item.CompressedSDHD120", 1L, 0) , 'F', ToolDictNames.craftingToolFile, 'H', ToolDictNames.craftingToolHardHammer});
        GT_ModHandler.addCraftingRecipe(CustomItemList.HeavyDutyRocketFinsTier4.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"HPF", "QPQ", "QSQ", 'P', CustomItemList.HeavyDutyPlateTier6.get(1, new Object[0]), 'Q', CustomItemList.HeavyDutyPlateTier7.get(1, new Object[0]), 'S', GT_ModHandler.getModItem("GalaxySpace", "item.CompressedSDHD120", 1L, 0), 'F', ToolDictNames.craftingToolFile, 'H', ToolDictNames.craftingToolHardHammer});
        GT_ModHandler.addCraftingRecipe(CustomItemList.Tier2Booster.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"LLL", "PBP", "PVP", 'L', CustomItemList.LedoxCompressedPlate.get(1, new Object[0]), 'P', GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 1L, 0), 'B', GT_ModHandler.getModItem("GalacticraftCore", "item.engine", 1L, 1), 'V', GT_ModHandler.getModItem("GalaxySpace", "item.CompressedSDHD120", 1L, 0)});
        GT_ModHandler.addCraftingRecipe(CustomItemList.Tier3Booster.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"LLL", "PBP", "PVP", 'L', CustomItemList.MytrylCompressedPlate.get(1, new Object[0]), 'P', CustomItemList.HeavyDutyPlateTier5.get(1, new Object[0]), 'B', CustomItemList.Tier2Booster.get(1, new Object[0]), 'V', GT_ModHandler.getModItem("GalaxySpace", "item.CompressedSDHD120", 1L, 0)});
        GT_ModHandler.addCraftingRecipe(CustomItemList.Tier4Booster.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"LLL", "PBP", "PVP", 'L', CustomItemList.BlackPlutoniumCompressedPlate.get(1, new Object[0]), 'P', CustomItemList.HeavyDutyPlateTier7.get(1, new Object[0]), 'B', CustomItemList.Tier3Booster.get(1, new Object[0]), 'V', GT_ModHandler.getModItem("GalaxySpace", "item.CompressedSDHD120", 1L, 0)});

        GT_ModHandler.addCraftingRecipe(ItemList.Teleporter.get(1L, new Object[0]), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"CPC", "PMP", "BIB", 'M', ItemList.Hull_LuV, 'B', ItemList.Tool_DataOrb, 'C', CustomItemList.PikoCircuit.get(1, new Object[0]), 'P', ItemList.Field_Generator_UV, 'I', GT_ModHandler.getModItem("Avaritia", "Resource_Block", 1L, 1)});

        GT_ModHandler.addCraftingRecipe(CustomItemList.IndustryFrame.get(1L, new Object[0]), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"PPP", "SBS", "SSS", 'P', OrePrefixes.plate.get(Materials.Palladium), 'S', OrePrefixes.stick.get(Materials.Osmium), 'B', CustomItemList.IridiumBars.get(1, new Object[0])});

        GT_ModHandler.addCraftingRecipe(ItemList.Generator_Naquadah_Mark_I.get(1L, new Object[0]), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"UCU", "FMF", "WCW", 'M', ItemList.Hull_EV, 'F', ItemList.Field_Generator_EV, 'C', OrePrefixes.circuit.get(Materials.Master), 'W', OrePrefixes.cableGt04.get(Materials.Aluminium), 'U', OrePrefixes.stick.get(Materials.Uranium235)});
        GT_ModHandler.addCraftingRecipe(ItemList.Generator_Naquadah_Mark_II.get(1L, new Object[0]), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"PCP", "FMF", "WCW", 'M', ItemList.Hull_IV, 'F', ItemList.Field_Generator_IV, 'C', CustomItemList.HighEnergyFlowCircuit, 'W', OrePrefixes.cableGt04.get(Materials.Tungsten), 'P', OrePrefixes.stick.get(Materials.Plutonium241)});
        GT_ModHandler.addCraftingRecipe(ItemList.Generator_Naquadah_Mark_III.get(1L, new Object[0]), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"NCN", "FMF", "WCW", 'M', ItemList.Hull_LuV, 'F', ItemList.Field_Generator_LuV, 'C', CustomItemList.NanoCircuit, 'W', OrePrefixes.cableGt04.get(Materials.HSSG), 'N', OrePrefixes.stick.get(Materials.Europium)});
        GT_ModHandler.addCraftingRecipe(ItemList.Generator_Naquadah_Mark_IV.get(1L, new Object[0]), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"NCN", "FMF", "WCW", 'M', ItemList.Hull_ZPM, 'F', ItemList.Field_Generator_ZPM, 'C', CustomItemList.PikoCircuit, 'W', OrePrefixes.cableGt04.get(Materials.Naquadah), 'N', OrePrefixes.stick.get(Materials.Americium)});
        GT_ModHandler.addCraftingRecipe(ItemList.Generator_Naquadah_Mark_V.get(1L, new Object[0]), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"NCN", "FMF", "WCW", 'M', ItemList.Hull_UV, 'F', ItemList.Field_Generator_UV, 'C', CustomItemList.QuantumCircuit, 'W', OrePrefixes.cableGt04.get(Materials.ElectrumFlux), 'N', OrePrefixes.stick.get(Materials.NaquadahAlloy)});

        GT_ModHandler.addCraftingRecipe(ItemList.LargeHPSteamTurbine.get(1L, new Object[0]), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"CPC", "PMP", "BPB", 'M', ItemList.Hull_IV, 'B', OrePrefixes.pipeLarge.get(Materials.TungstenSteel), 'C', CustomItemList.NanoCircuit, 'P', OrePrefixes.gearGt.get(Materials.TungstenSteel)});
        GT_ModHandler.addCraftingRecipe(ItemList.LargePlasmaTurbine.get(1L, new Object[0]), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"CPC", "PMP", "BPB", 'M', ItemList.Hull_UV, 'B', OrePrefixes.pipeHuge.get(Materials.Naquadah), 'C',  CustomItemList.PikoCircuit, 'P', OrePrefixes.gearGt.get(Materials.NaquadahAlloy)});

        GT_ModHandler.addCraftingRecipe(CustomItemList.Casing_AirFilter_Vent.get(1L, new Object[0]), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"ThT", "TFT", "TwT", 'T', CustomItemList.TitaniumBars, 'F', OrePrefixes.frameGt.get(Materials.Steel)});
        GT_ModHandler.addCraftingRecipe(CustomItemList.Casing_AirFilter_Turbine.get(1L, new Object[0]), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"SSS", "RVR", "MSM", 'V', CustomItemList.Casing_AirFilter_Vent, 'S', OrePrefixes.stickLong.get(Materials.Titanium), 'R', OrePrefixes.rotor.get(Materials.Titanium), 'M', ItemList.Electric_Motor_EV, 'R', OrePrefixes.screw.get(Materials.Titanium)});
        GT_ModHandler.addCraftingRecipe(CustomItemList.Machine_Multi_AirFilter.get(1L, new Object[0]), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"RPR", "MBM", "CGC", 'B', ItemList.Hull_EV, 'R', OrePrefixes.rotor.get(Materials.Titanium), 'P',  ItemList.Electric_Pump_EV, 'M', ItemList.Electric_Motor_EV, 'C', OrePrefixes.cableGt01.get(Materials.Titanium), 'G', ItemList.Casing_Turbine2});

        GT_ModHandler.addCraftingRecipe(CustomItemList.Casing_Pyrolyze.get(1L, new Object[0]), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"PhP", "SFS", "PwP", 'S', OrePrefixes.plate.get(Materials.Steel), 'P', OrePrefixes.plate.get(Materials.Iron), 'F', ItemList.Casing_BronzePlatedBricks});

        if (Loader.isModLoaded("HardcoreEnderExpansion")) {
            long tBitMask = GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_RECIPES_IF_SAME_NBT | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_SHAPED_RECIPES | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_NATIVE_RECIPES | GT_ModHandler.RecipeBits.ONLY_ADD_IF_THERE_IS_ANOTHER_RECIPE_FOR_IT;
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("HardcoreEnderExpansion", "altar_nexus", 1L, 0), tBitMask, new Object[]{"DED", "EDE", "DED", 'D', new ItemStack(Items.diamond, 1), 'E', new ItemStack(Items.ender_eye, 1),});
        }
    }
}
