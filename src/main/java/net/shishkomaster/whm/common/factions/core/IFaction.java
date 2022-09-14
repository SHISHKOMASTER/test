package net.shishkomaster.whm.common.factions.core;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;

import javax.annotation.Nonnull;
import java.awt.*;

public interface IFaction<T extends IFactionEntity> {
    TextFormatting getChatColor();

    /** @deprecated */
    @Deprecated
    IFaction<T> setChatColor(TextFormatting var1);

    Color getColor();

    Class<T> getFactionEntityInterface();

    ResourceLocation getID();

    ITextComponent getName();

    ITextComponent getNamePlural();

    @Nonnull
    IVillageFactionData getVillageData();

    boolean isEntityOfFaction(CreatureEntity var1);

    boolean isHostileTowardsNeutral();

    /** @deprecated */
    @Deprecated
    IFaction<T> setTranslationKeys(String var1, String var2);
}
