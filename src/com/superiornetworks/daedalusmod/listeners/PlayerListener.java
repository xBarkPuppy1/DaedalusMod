package com.superiornetworks.daedalusmod.listeners;

import com.superiornetworks.daedalusmod.DaedalusMod;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class PlayerListener implements Listener
  {

    private final DaedalusMod plugin;

    public PlayerListener(DaedalusMod plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event)
    {
        plugin.signBlocker.onBlockPlace(event);
    }

  }
