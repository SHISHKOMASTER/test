package net.shishkomaster.whm.common.factions;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.shishkomaster.whm.common.factions.core.IFaction;
import net.shishkomaster.whm.common.factions.core.IFactionEntity;
import net.shishkomaster.whm.common.factions.core.IVillageFactionData;

import javax.annotation.Nonnull;
import java.awt.*;

public class Faction<T extends IFactionEntity> implements IFaction<T> {
    private static int nextId = 0;
    protected final ResourceLocation id;
    private final Class<T> entityInterface;
    private final Color color;
    private final boolean hostileTowardsNeutral;
    private final int integerId;
    @Nonnull
    private IVillageFactionData villageFactionData;
    @Nonnull
    private ITextComponent name;
    @Nonnull
    private ITextComponent namePlural;
    @Nonnull
    private TextFormatting chatColor;

    Faction(ResourceLocation id, Class<T> entityInterface, Color color, boolean hostileTowardsNeutral, @Nonnull IVillageFactionData villageFactionData, @Nonnull TextFormatting chatColor, @Nonnull ITextComponent name, @Nonnull ITextComponent namePlural) {
        this.id = id;
        this.entityInterface = entityInterface;
        this.color = color;
        this.hostileTowardsNeutral = hostileTowardsNeutral;
        this.villageFactionData = villageFactionData;
        this.chatColor = chatColor;
        this.name = name;
        this.namePlural = namePlural;
        this.integerId = nextId++;
    }

    void finish() {
        this.villageFactionData = this.villageFactionData.build();
    }

    public boolean equals(Object obj) {
        return obj instanceof Faction && this.id == ((Faction)obj).id;
    }

    @Nonnull
    public TextFormatting getChatColor() {
        return this.chatColor;
    }

    public Faction<T> setChatColor(TextFormatting chatColor) {
        this.chatColor = chatColor;
        return this;
    }

    public Color getColor() {
        return this.color;
    }

    public Class<T> getFactionEntityInterface() {
        return this.entityInterface;
    }

    public ResourceLocation getID() {
        return this.id;
    }

    public ITextComponent getName() {
        return this.name;
    }

    public ITextComponent getNamePlural() {
        return this.namePlural;
    }

    @Nonnull
    public IVillageFactionData getVillageData() {
        return this.villageFactionData;
    }

    public int hashCode() {
        return this.integerId;
    }

    public boolean isEntityOfFaction(CreatureEntity creature) {
        return this.entityInterface.isInstance(creature);
    }

    public boolean isHostileTowardsNeutral() {
        return this.hostileTowardsNeutral;
    }

    public Faction<T> setTranslationKeys(String unlocalizedName, String unlocalizedNamePlural) {
        this.name = new TranslationTextComponent(unlocalizedName);
        this.namePlural = new TranslationTextComponent(unlocalizedNamePlural);
        return this;
    }

    public String toString() {
        return "Faction{id='" + this.integerId + '\'' + ", hash=" + this.integerId + '}';
    }
}
