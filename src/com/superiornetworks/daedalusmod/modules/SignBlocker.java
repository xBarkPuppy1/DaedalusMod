package com.superiornetworks.daedalusmod.modules;

import com.superiornetworks.daedalusmod.DaedalusMod;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

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
    public void onBlockPlace(BlockPlaceEvent event)
    {
        Player player = event.getPlayer();

        {
            switch (event.getBlockPlaced().getType())
            {
                case SIGN:
                case SIGN_POST:
                {

                    event.setCancelled(true);
                    player.getInventory().setItem(player.getInventory().getHeldItemSlot(), new ItemStack(Material.COOKIE, 1));
                    player.sendMessage(ChatColor.GRAY + "For security reasons the use of Signs have been disabled");

                    break;
                }
            }
        }
    }

  }
