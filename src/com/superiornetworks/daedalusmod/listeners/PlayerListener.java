package com.superiornetworks.daedalusmod.listeners;

import com.superiornetworks.daedalusmod.DaedalusMod;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerListener implements Listener
  {

    private final DaedalusMod plugin;

    public PlayerListener(DaedalusMod plugin)
    {
        this.plugin = plugin;
    }
    
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event)
    {
        plugin.signBlocker.onPlayerInteract(event);
    }
  }
