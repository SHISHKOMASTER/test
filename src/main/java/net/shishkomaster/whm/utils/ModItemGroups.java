package net.shishkomaster.whm.utils;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;
import net.shishkomaster.whm.registry.ItemRegistry;

public class ModItemGroups {

    public static ItemGroup createGroup(String id, RegistryObject<Item> icon) {

       return new ItemGroup(id) {
           @Override
           public ItemStack makeIcon() {
               return new ItemStack(icon.get());
           }
       };
    }

    public static ItemGroup WHM_TAB = createGroup("whm_mod_tab", ItemRegistry.Whm_logo1);

}




