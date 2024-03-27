package thejoj0.plugins.basics.customjoinleave;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class FileManager {

    public static File file = new File("plugins//BP//Join_Leave//", "config.yml");


    public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);


    public static void createFile(){
        if (!file.exists()) {
            (new File("plugins//BP//Join_Leave//")).mkdir();
            try {

                cfg.set("beforePNJoin.Message", " §7[§2+§7] ");
                cfg.set("Join.Message", "");
                cfg.set("beforePNQuit.Message", " §7[§4-§7] ");
                cfg.set("Quit.Message", "");

                cfg.save(file);
                file.createNewFile();

            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}
