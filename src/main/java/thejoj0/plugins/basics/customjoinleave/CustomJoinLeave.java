package thejoj0.plugins.basics.customjoinleave;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import thejoj0.plugins.basics.customjoinleave.listeners.ConnectionListener;

import java.io.File;

public final class CustomJoinLeave extends JavaPlugin {

    @Override
    public void onEnable() {
        FileManager.createFile();
       PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new ConnectionListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
