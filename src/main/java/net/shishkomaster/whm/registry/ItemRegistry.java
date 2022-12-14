package net.shishkomaster.whm.registry;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.shishkomaster.whm.Whm;
import net.shishkomaster.whm.common.item.armor.ModArmorMaterial;
import net.shishkomaster.whm.common.item.ModItemTier;
import net.shishkomaster.whm.common.item.armor.PowerArmorItem;

import net.shishkomaster.whm.common.item.weapon.BolterItem;
import net.shishkomaster.whm.utils.ModItemGroups;

public class ItemRegistry {
//Items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Whm.MOD_ID);

    public static final RegistryObject<Item> Whm_logo1 = ITEMS.register("whm_logo1",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<BolterItem> Bolter = ITEMS.register("bolter", () -> new BolterItem());

    public static final RegistryObject<Item> Lasgun = ITEMS.register("lasgun",
            () -> new Item(new Item.Properties().tab(ModItemGroups.WHM_TAB).stacksTo(1)));

    public static final RegistryObject<Item> Laspistol = ITEMS.register("laspistol",
            () -> new Item(new Item.Properties().tab(ModItemGroups.WHM_TAB).stacksTo(1)));


    public static final RegistryObject<Item> Chainsword = ITEMS.register("chainsword",
            () -> new SwordItem(ModItemTier.Chainsword, 2, -3f, new Item.Properties().tab(ModItemGroups.WHM_TAB)));
    
    public static final RegistryObject<Item> POWERARMOR_BOOTS = ITEMS.register("power_armor_boots",
            () -> new PowerArmorItem(ModArmorMaterial.POWERARMOR, EquipmentSlotType.FEET));

    public static final RegistryObject<Item> POWERARMOR_CHESTPLATE = ITEMS.register("power_armor_chestplate",
                () -> new PowerArmorItem(ModArmorMaterial.POWERARMOR, EquipmentSlotType.CHEST));

    public static final RegistryObject<Item> POWERARMOR_LEGGINGS = ITEMS.register("power_armor_leggings",
                () -> new PowerArmorItem(ModArmorMaterial.POWERARMOR, EquipmentSlotType.LEGS));

    public static final RegistryObject<Item> POWERARMOR_HELMET = ITEMS.register("power_armor_helmet",
                () -> new PowerArmorItem(ModArmorMaterial.POWERARMOR, EquipmentSlotType.HEAD));
//BlockItems
    public static final RegistryObject<Item> Gigachad = ITEMS.register("gigachad",
            () -> new BlockItem(BlockRegistry.Gigachad.get(),new Item.Properties().tab(ModItemGroups.WHM_TAB).stacksTo(1)));

    public  static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}
