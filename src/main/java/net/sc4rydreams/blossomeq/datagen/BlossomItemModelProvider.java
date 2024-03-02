package net.sc4rydreams.blossomeq.datagen;


import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.sc4rydreams.blossomeq.blossomeq;

public class BlossomItemModelProvider extends ItemModelProvider {
    public BlossomItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, blossomeq.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // ONE OFFS
        for (int var1 = 0; var1 < 1; ++var1) {
//            ((ItemModelBuilder) this.withExistingParent("pasture_blanket_" + "quilted_black", "item/generated"))
//                .texture("layer0", new ResourceLocation("blossomeq", "items/pasture_blanket/pasture_blanket_" + "quilted_black" + "_icon"));
//
//            ((ItemModelBuilder) this.withExistingParent("pasture_blanket_" + "quilted_white", "item/generated"))
//                    .texture("layer0", new ResourceLocation("blossomeq", "items/pasture_blanket/pasture_blanket_" + "quilted_white" + "_icon"));

            ((ItemModelBuilder) this.withExistingParent("sheepskin", "item/generated"))
                    .texture("layer0", new ResourceLocation("blossomeq", "items/sheepskins/sheepskin"));
        }

    // LOOPING - values are one more than you want
        for (int var1 = 40; var1 < 50; ++var1) {
            //int counter = var1 + 1;
            ((ItemModelBuilder) this.withExistingParent("pasture_blanket_neon_" + var1, "item/generated"))
                    .texture("layer0", new ResourceLocation("blossomeq", "item/pasture_blanket/pasture_blanket_neon_" + var1 + "_icon"));
        }

//        for (int var1 = 1; var1 < 26; ++var1) {
//            //int counter = var1 + 1;
//            ((ItemModelBuilder) this.withExistingParent("transport_boots_" + var1, "item/generated"))
//                    .texture("layer0", new ResourceLocation("blossomeq", "item/transport_boots/transport_boots_" + var1));
//        }

    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(blossomeq.MOD_ID,"items/" + item.getRegistryName().getPath()));
    }
}