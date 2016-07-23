package com.superiornetworks.daedalusmod;

import com.superiornetworks.daedalusmod.commands.Command_ai;
import com.superiornetworks.daedalusmod.listeners.PlayerListener;
import com.superiornetworks.daedalusmod.modules.DaedalusChatModule;
import com.superiornetworks.daedalusmod.modules.DaedalusModule;
import com.superiornetworks.daedalusmod.modules.DaedalusRedstoneModule;
import net.pravian.aero.command.handler.AeroCommandHandler;
import net.pravian.aero.command.handler.SimpleCommandHandler;
import net.pravian.aero.config.YamlConfig;
import net.pravian.aero.plugin.AeroPlugin;
import net.pravian.aero.util.Loggers;
import org.bukkit.plugin.PluginManager;

public class DaedalusMod extends AeroPlugin<DaedalusMod>
  {

    public static DaedalusMod plugin;

    public static AeroCommandHandler handler;
    //
    public Loggers logger;
    //
    public YamlConfig mainConfig;
    //
    public DaedalusModule interactBlocker;
    //
    public DaedalusChatModule chatDetector;
    //
    //public DaedalusRedstoneModule redstoneBlocker;

    @Override
    public void load()
    {
        DaedalusMod.plugin = this;
        Loggers.info("The DeadlusMod plugin has been loaded.");
        mainConfig = new YamlConfig(plugin, "config.yml");
        interactBlocker = new DaedalusModule(this);
        chatDetector = new DaedalusChatModule(this);
        //redstoneBlocker = new DaedalusRedstoneModule(this);
    }

    @Override
    public void enable()
    {
        DaedalusMod.plugin = this;

        mainConfig.load();

        final PluginManager pm = plugin.getServer().getPluginManager();
        pm.registerEvents(new PlayerListener(plugin), plugin);

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
