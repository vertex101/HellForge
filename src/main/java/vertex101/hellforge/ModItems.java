package vertex101.hellforge;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vertex101.hellforge.items.ItemWhisperingIngot;

public class ModItems {

    @GameRegistry.ObjectHolder("hellforge:whispering_ingot")
    public static ItemWhisperingIngot whisperingingot;

    @SideOnly(Side.CLIENT)
    public static void initModels() {

        whisperingingot.initModel();
    }
}
