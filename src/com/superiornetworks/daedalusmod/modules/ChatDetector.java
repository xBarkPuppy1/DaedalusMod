package com.superiornetworks.daedalusmod.modules;

import com.superiornetworks.daedalusmod.DaedalusMod;
import java.util.Set;
import static org.bukkit.Bukkit.getServer;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatDetector
  {

    protected final DaedalusMod plugin;
    protected final Server server;

    public ChatDetector(DaedalusMod plugin)
    {
        this.plugin = plugin;
        this.server = plugin.getServer();
    }
    
    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerChat(AsyncPlayerChatEvent e)
    {
        boolean chatDetectorEnabled = plugin.config.getBoolean("chatdetectorenabled");
        if(chatDetectorEnabled)
        {
            String message = e.getMessage();
            Player player = e.getPlayer();
            Set<String> keys = plugin.config.getConfigurationSection("chatdetector").getKeys(false);
            for(final String key : keys)
            {
                if(message.toLowerCase().contains(key)) // Example: "Give me admin"
                {
                    getServer().dispatchCommand(player, plugin.config.getString("chatdetector." + key + ".command"));
                    e.setCancelled(true);
                }
            }
        }
    }

  }