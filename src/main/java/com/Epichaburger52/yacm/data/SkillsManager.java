package com.Epichaburger52.yacm.data;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.storage.DimensionDataStorage;

public class SkillsManager extends SavedData
{

    public static SkillsManager get(Level level){

        DimensionDataStorage storage = ((ServerLevel)level).getDataStorage();


        return storage.computeIfAbsent(SkillsManager::new,SkillsManager::new,"skillmanager");
    }

    public SkillsManager() {
    }

    public SkillsManager(CompoundTag tag) {

    }

    @Override
    public CompoundTag save(CompoundTag tag) {
        return null;
    }



}
