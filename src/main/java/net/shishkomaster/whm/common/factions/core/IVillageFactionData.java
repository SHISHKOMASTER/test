package net.shishkomaster.whm.common.factions.core;

import net.minecraft.entity.MobEntity;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Effect;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.shishkomaster.whm.common.factions.CaptureEntityEntry;
import org.apache.commons.lang3.tuple.Pair;
import java.util.List;

public interface IVillageFactionData {
    @Nullable
    default Effect getBadOmenEffect() {
        return null;
    }

    @Nonnull
    default ItemStack getBanner() {
        return new ItemStack(Items.WHITE_BANNER);
    }

    List<CaptureEntityEntry> getCaptureEntries();

    @Nonnull
    VillagerProfession getFactionVillageProfession();

    @Nonnull
    Class<? extends MobEntity> getGuardSuperClass();


    /** @deprecated */
    @Deprecated
    @Nonnull
    Pair<Block, Block> getTotemTopBlock();

    @Nonnull
    default Block getTotemTopBlock(boolean crafted) {
        return crafted ? (Block)this.getTotemTopBlock().getRight() : (Block)this.getTotemTopBlock().getLeft();
    }

    default boolean isBanner(@Nonnull ItemStack stack) {
        return false;
    }

    /** @deprecated */
    @Deprecated
    default IVillageFactionData build() {
        return this;
    }
}
