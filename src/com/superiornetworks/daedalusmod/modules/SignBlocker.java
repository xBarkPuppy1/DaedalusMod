package com.superiornetworks.daedalusmod.modules;

import com.superiornetworks.daedalusmod.DaedalusMod;
import org.bukkit.Server;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class SignBlocker
  {

    protected final DaedalusMod plugin;
    protected final Server server;

    public SignBlocker(DaedalusMod plugin)
    {
        this.plugin = plugin;
        this.server = plugin.getServer();
    }
    
    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerInteract(PlayerInteractEvent e)
    {
        if(e.getAction() == Action.RIGHT_CLICK_BLOCK)
        {
            switch(e.getClickedBlock().getType())
            {
                case SIGN:
                case WALL_SIGN:
                case SIGN_POST:
                {
                    e.setCancelled(true);
                }
            }
        }
    }

  }
