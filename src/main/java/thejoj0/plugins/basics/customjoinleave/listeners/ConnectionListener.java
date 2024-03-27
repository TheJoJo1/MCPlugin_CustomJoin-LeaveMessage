package thejoj0.plugins.basics.customjoinleave.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.w3c.dom.stylesheets.LinkStyle;
import thejoj0.plugins.basics.customjoinleave.CustomJoinLeave;
import thejoj0.plugins.basics.customjoinleave.FileManager;

import java.io.File;

public class ConnectionListener implements Listener {

    private CustomJoinLeave plugin;

    @EventHandler
    public void  onJoin(PlayerJoinEvent event){
        String msgJoin = FileManager.cfg.getString("Join.Message");
        String msgJoinbn = FileManager.cfg.getString("beforePNJoin.Message");
        Player player = event.getPlayer();
        event.setJoinMessage(msgJoinbn + player.getName() + msgJoin);

    }



    @EventHandler
    public void  onJoin(PlayerQuitEvent event){
    String msgQuit = FileManager.cfg.getString("Quit.Message");
    String msgQuitbn = FileManager.cfg.getString("beforePNQuit.Message");
        Player player = event.getPlayer();
        event.setQuitMessage(msgQuitbn + player.getName() + msgQuit);

    }
}



