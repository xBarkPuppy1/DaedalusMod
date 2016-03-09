package com.superiornetworks.daedalusmod.commands;

import com.superiornetworks.daedalusmod.DaedalusMod;
import net.md_5.bungee.api.ChatColor;
import net.pravian.aero.command.SimpleCommand;
import net.pravian.aero.util.ChatUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Command_verify extends SimpleCommand<DaedalusMod>
  {

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings)
    {
        if (plugin.mainConfig.getBoolean("verifyenabled"))
        {

            if (plugin.mainConfig.getBoolean("verenable.title"))
            {
                sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("verify.title")));
            }

            if (plugin.mainConfig.getBoolean("verenable.line1"))
            {
                sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("verify.line1")));
            }

            if (plugin.mainConfig.getBoolean("verenable.line2"))
            {
                sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("verify.line2")));
            }

            if (plugin.mainConfig.getBoolean("verenable.line3"))
            {
                sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("verify.line3")));
            }

            if (plugin.mainConfig.getBoolean("verenable.line4"))
            {
                sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("verify.line4")));
            }

            if (plugin.mainConfig.getBoolean("verenable.line5"))
            {
                sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("verify.line5")));
            }

            if (plugin.mainConfig.getBoolean("verenable.line6"))
            {
                sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("verify.line6")));
            }

            if (plugin.mainConfig.getBoolean("verenable.line7"))
            {
                sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("verify.line7")));
            }

            if (plugin.mainConfig.getBoolean("verenable.line8"))
            {
                sender.sendMessage(ChatUtils.colorize(plugin.mainConfig.getString("verify.line8")));
            }
        }
        else
        {
            sender.sendMessage(ChatColor.DARK_RED + "Sorry, but this command has been disabled in the configuration file. Please contact a developer to enable this command.");
        }

        return true;
    }

  }
