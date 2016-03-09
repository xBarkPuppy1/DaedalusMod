package com.superiornetworks.daedalusmod.commands;

import com.superiornetworks.daedalusmod.DaedalusMod;
import net.md_5.bungee.api.ChatColor;
import net.pravian.aero.command.SimpleCommand;
import net.pravian.aero.util.ChatUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Command_ai extends SimpleCommand<DaedalusMod>
  {

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings)
    {
        if (plugin.mainConfig.getBoolean("admininfoenabled"))
        {

            if (plugin.mainConfig.getBoolean("aienable.title"))
            {
                sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("admininfo.title")));
            }

            if (plugin.mainConfig.getBoolean("aienable.line1"))
            {
                sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("admininfo.line1")));
            }

            if (plugin.mainConfig.getBoolean("aienable.line2"))
            {
                sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("admininfo.line2")));
            }

            if (plugin.mainConfig.getBoolean("aienable.line3"))
            {
                sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("admininfo.line3")));
            }

            if (plugin.mainConfig.getBoolean("aienable.line4"))
            {
                sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("admininfo.line4")));
            }

            if (plugin.mainConfig.getBoolean("aienable.line5"))
            {
                sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("admininfo.line5")));
            }

            if (plugin.mainConfig.getBoolean("aienable.line6"))
            {
                sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("admininfo.line6")));
            }

            if (plugin.mainConfig.getBoolean("aienable.line7"))
            {
                sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("admininfo.line7")));
            }

            if (plugin.mainConfig.getBoolean("aienable.line8"))
            {
                sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("admininfo.line8")));
            }
        }
        else
        {
            sender.sendMessage(ChatColor.DARK_RED + "Sorry, but this command has been disabled in the configuration file. Please contact a developer to enable this command.");
        }

        return true;
    }

  }
