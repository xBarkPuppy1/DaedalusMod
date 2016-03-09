package com.superiornetworks.daedalusmod;

import com.superiornetworks.daedalusmod.commands.Command_ai;
import net.pravian.aero.command.handler.AeroCommandHandler;
import net.pravian.aero.command.handler.SimpleCommandHandler;
import net.pravian.aero.config.YamlConfig;
import net.pravian.aero.plugin.AeroPlugin;
import net.pravian.aero.util.Loggers;

public class DaedalusMod extends AeroPlugin<DaedalusMod>
  {

    public static DaedalusMod plugin;

    public static AeroCommandHandler handler;
    //
    public Loggers logger;
    //
    public YamlConfig mainConfig;

    @Override
    public void load()
    {
        DaedalusMod.plugin = this;
        Loggers.info("The DeadlusMod plugin has been loaded.");
        mainConfig = new YamlConfig(plugin, "config.yml");
    }

    @Override
    public void enable()
    {
        DaedalusMod.plugin = this;
        
        mainConfig.load();
        
        handler = new SimpleCommandHandler(plugin);
        handler.setCommandClassPrefix("Command_");
        handler.loadFrom(Command_ai.class.getPackage());
        handler.registerAll();

        Loggers.info("The DeadlusMod plugin has been enabled.");
        Loggers.info("The DeadlusMod plugin was created by Wild1145 for the TotalFreedom server.");
    }

    @Override
    public void disable()
    {
        DaedalusMod.plugin = null;

        Loggers.info("The DeadlusMod plugin has been disabled.");
        Loggers.info("The DeadlusMod plugin was created by Wild1145 for the TotalFreedom server.");
    }

  }
