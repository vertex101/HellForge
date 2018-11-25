package vertex101.hellforge;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import vertex101.hellforge.items.ItemWhisperingIngot;

public class ModItems {

    @GameRegistry.ObjectHolder("hellforge:whispering_ingot")
    public static ItemWhisperingIngot itemWhisperingIngot;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        itemWhisperingIngot.initModel();
    }

    public static void register(IForgeRegistry<Item> registry) {
        registry.register(new ItemWhisperingIngot());
    }
}
