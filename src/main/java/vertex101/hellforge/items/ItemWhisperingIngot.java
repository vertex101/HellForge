package vertex101.hellforge.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vertex101.hellforge.HellForge;

public class ItemWhisperingIngot extends Item {

    public ItemWhisperingIngot() {
        setTranslationKey(HellForge.MODID + ".whispering_ingot");
        setRegistryName(new ResourceLocation(HellForge.MODID, "whispering_ingot"));
        setCreativeTab(HellForge.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
