package net.sc4rydreams.blossomeq.datagen;


import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.sc4rydreams.blossomeq.BlossomEq;

public class BlossomItemModelProvider extends ItemModelProvider {
    public BlossomItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, BlossomEq.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // ONE OFFS
        //       for (int var1 = 0; var1 < 1; ++var1) {
//            ((ItemModelBuilder) this.withExistingParent("pasture_blanket_" + "quilted_black", "item/generated"))
//                .texture("layer0", new ResourceLocation("blossomeq", "items/pasture_blanket/pasture_blanket_" + "quilted_black" + "_icon"));
//
//            ((ItemModelBuilder) this.withExistingParent("pasture_blanket_" + "quilted_white", "item/generated"))
//                    .texture("layer0", new ResourceLocation("blossomeq", "items/pasture_blanket/pasture_blanket_" + "quilted_white" + "_icon"));

//            ((ItemModelBuilder) this.withExistingParent("pasture_blanket_" + "quilted_brown", "item/generated"))
//                   .texture("layer0", new ResourceLocation("blossomeq", "item/pasture_blanket/pasture_blanket_" + "quilted_brown" + "_icon"));

               ((ItemModelBuilder) this.withExistingParent("halter_blossom_" + "brown", "item/generated"))
                     .texture("layer0", new ResourceLocation("blossomeq", "item/halters/halter_blossom_" + "brown"));

        ((ItemModelBuilder) this.withExistingParent("halter_blossom_" + "black", "item/generated"))
                .texture("layer0", new ResourceLocation("blossomeq", "item/halters/halter_blossom_" + "black"));

        ((ItemModelBuilder) this.withExistingParent("halter_blossom_" + "white", "item/generated"))
                .texture("layer0", new ResourceLocation("blossomeq", "item/halters/halter_blossom_" + "white"));

//
//        ((ItemModelBuilder) this.withExistingParent("halter_fluffy_blossom_" + "brown", "item/generated"))
//                .texture("layer0", new ResourceLocation("blossomeq", "item/halters/halter_fluffy_blossom_" + "brown"));
//
//        ((ItemModelBuilder) this.withExistingParent("halter_fluffy_blossom_" + "black", "item/generated"))
//                .texture("layer0", new ResourceLocation("blossomeq", "item/halters/halter_fluffy_blossom_" + "black"));
//
//        ((ItemModelBuilder) this.withExistingParent("halter_fluffy_blossom_" + "white", "item/generated"))
//                .texture("layer0", new ResourceLocation("blossomeq", "item/halters/halter_fluffy_blossom_" + "white"));
//

//
//        }

        // LOOPING - values are one more than you want
        //for (int var1 = 1; var1 < 50; ++var1) {
//            //int counter = var1 + 1;
//            ((ItemModelBuilder) this.withExistingParent("pasture_blanket_neon_" + var1, "item/generated"))
//                    .texture("layer0", new ResourceLocation("blossomeq", "item/pasture_blanket/pasture_blanket_neon_" + var1 + "_icon"));
//        }

//       for (int var1 = 1; var1 < 26; ++var1) {
//            //int counter = var1 + 1;
//            ((ItemModelBuilder) this.withExistingParent("transport_boots_" + var1, "item/generated"))
//                    .texture("layer0", new ResourceLocation("blossomeq", "item/transport_boots/transport_boots_" + var1));
//        }
//        for (int var1 = 1; var1 < 6; ++var1) {
//            ((ItemModelBuilder) this.withExistingParent("western_sheepskin_blossom_" + var1, "item/generated"))
//                    .texture("layer0", new ResourceLocation("blossomeq", "item/sheepskins/western_sheepskin_blossom_" + var1));
//        }
//
//        for (int var1 = 1; var1 < 6; ++var1) {
//                ((ItemModelBuilder) this.withExistingParent("english_sheepskin_blossom_" + var1, "item/generated"))
//                        .texture("layer0", new ResourceLocation("blossomeq", "item/sheepskins/english_sheepskin_blossom_" + var1));
//        }
//
//        for (int var1 = 1; var1 < 3; ++var1) {
//            ((ItemModelBuilder) this.withExistingParent("english_saddle_blossom_" + var1, "item/generated"))
//                    .texture("layer0", new ResourceLocation("blossomeq", "item/saddles/english_saddle_blossom_" + var1));
//        }

//        for (int var1 = 1; var1 < 9; ++var1) {
//            //int counter = var1 + 1;
//            ((ItemModelBuilder) this.withExistingParent("protection_boots_blossom_" + var1, "item/generated"))
//                    .texture("layer0", new ResourceLocation("blossomeq", "item/protection_boots/protection_boots_blossom_" + var1));
//        }

//
//        for (int var1 = 10; var1 < 16; ++var1) {
//            //int counter = var1 + 1;
//            ((ItemModelBuilder) this.withExistingParent("western_girth_blossom_" + var1, "item/generated"))
//                    .texture("layer0", new ResourceLocation("blossomeq", "item/girths/western_girth_blossom_" + var1));
//        }

//        for (int var1 = 1; var1 < 3; ++var1) {
//            //int counter = var1 + 1;
//            ((ItemModelBuilder) this.withExistingParent("english_bridle_blossom_" + var1, "item/generated"))
//                    .texture("layer0", new ResourceLocation("blossomeq", "item/bridles/english_bridle_blossom_" + var1));
//        }
//        for (int var1 = 1; var1 < 9; ++var1) {
//            //int counter = var1 + 1;
//            ((ItemModelBuilder) this.withExistingParent("english_bridle_blossom_" + var1, "item/generated"))
//                    .texture("layer0", new ResourceLocation("blossomeq", "item/bridle_models/english_bridle_blossom_" + var1 + "_model.png"));
//        }
//
//        for (int var1 = 1; var1 < 9; ++var1) {
//            //int counter = var1 + 1;
//            ((ItemModelBuilder) this.withExistingParent("western_bridle_blossom_" + var1, "item/generated"))
//                    .texture("layer0", new ResourceLocation("blossomeq", "item/bridle_models/western_bridle_blossom_" + var1 + "_model.png"));
//        }


//        for (int var1 = 1; var1 < 12; ++var1) {
//            //int counter = var1 + 1;
//            ((ItemModelBuilder) this.withExistingParent("western_bridle_blossom_" + var1, "item/generated"))
//                    .texture("layer0", new ResourceLocation("blossomeq", "item/bridles/western_bridle_blossom_" + var1));
//        }
//        for (int var1 = 1; var1 < 50; ++var1) {
//            //int counter = var1 + 1;
//            ((ItemModelBuilder) this.withExistingParent("saddle_pad_neon_" + var1, "item/generated"))
//                    .texture("layer0", new ResourceLocation("blossomeq", "item/saddle_pads/saddle_pad_neon_" + var1));
////        }
//        for (int var1 = 1; var1 < 50; ++var1) {
//            //int counter = var1 + 1;
//            ((ItemModelBuilder) this.withExistingParent("halter_blossom_" + var1, "item/generated"))
//                    .texture("layer0", new ResourceLocation("blossomeq", "item/halters/halter_blossom_" + var1));
//      }

//        for (int var1 = 1; var1 < 50; ++var1) {
//            //int counter = var1 + 1;
//            ((ItemModelBuilder) this.withExistingParent("halter_fluffy_blossom_" + var1, "item/generated"))
//                    .texture("layer0", new ResourceLocation("blossomeq", "item/halters/halter_fluffy_blossom_" + var1));
//        }



    }


    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BlossomEq.MOD_ID, "item/" + item.getRegistryName().getPath()));
    }
}
