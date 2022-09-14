package net.shishkomaster.whm.common.factions.core;

import net.minecraft.entity.LivingEntity;

import javax.annotation.Nonnull;

public interface IFactionEntity {
    @Nonnull
    IFaction getFaction();

    LivingEntity getRepresentingEntity();
}
