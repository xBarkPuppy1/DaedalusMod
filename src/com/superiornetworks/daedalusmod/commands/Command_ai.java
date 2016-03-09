package com.superiornetworks.daedalusmod.commands;

import com.superiornetworks.daedalusmod.DaedalusMod;
import net.pravian.aero.command.SimpleCommand;
import net.pravian.aero.util.ChatUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;


public class Command_ai extends SimpleCommand<DaedalusMod>
  {

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings)
    {
        if(plugin.mainConfig.getBoolean("aienable.title"))
        {
            sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("admininfo.title")));
        }
        
        if(plugin.mainConfig.getBoolean("aienable.line1"))
        {
            sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("admininfo.line1")));
        }
        
        if(plugin.mainConfig.getBoolean("aienable.line2"))
        {
            sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("admininfo.line2")));
        }
        
        if(plugin.mainConfig.getBoolean("aienable.line3"))
        {
            sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("admininfo.line3")));
        }
        
        if(plugin.mainConfig.getBoolean("aienable.line4"))
        {
            sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("admininfo.line4")));
        }
        
        if(plugin.mainConfig.getBoolean("aienable.line5"))
        {
            sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("admininfo.line5")));
        }
        
        if(plugin.mainConfig.getBoolean("aienable.line6"))
        {
            sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("admininfo.line6")));
        }
        
        
        return true;
    }
    
  }
