package com.superiornetworks.daedalusmod.modules;

import com.superiornetworks.daedalusmod.DaedalusMod;
import java.util.ArrayList;
import java.util.List;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.chat.ComponentSerializer;
import net.minecraft.server.v1_10_R1.IChatBaseComponent;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.craftbukkit.v1_10_R1.inventory.CraftMetaBook;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.meta.BookMeta;

public class InteractBlocker
  {

    protected final DaedalusMod plugin;
    protected final Server server;

    public InteractBlocker(DaedalusMod plugin)
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
        else if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK)
        {
            switch(e.getPlayer().getItemInHand().getType())
            {
                case BOOK_AND_QUILL:
                case WRITTEN_BOOK:
                {
                    BookMeta bookMeta = (BookMeta) e.getPlayer().getItemInHand().getItemMeta();
                    List<IChatBaseComponent> pages;
                    List<String> stringpages = new ArrayList();
                    try
                    {
                        pages = (List<IChatBaseComponent>) CraftMetaBook.class.getDeclaredField("pages").get(bookMeta);
                    }
                    catch(ReflectiveOperationException ex)
                    {
                        e.getPlayer().sendMessage(ChatColor.RED + "An error occured when reading this book.");
                        e.setCancelled(true);
                        return;
                    }
                    for(final IChatBaseComponent page : pages)
                    {
                        String pagetext = page.getText();
                        stringpages.add(pagetext);
                    }
                    bookMeta.setPages(stringpages);
                    e.getPlayer().getItemInHand().setItemMeta(bookMeta);
                    e.getPlayer().sendMessage(ChatColor.GREEN + "Succcessfully opened book.");
                }
            }
        }
    }

  }
