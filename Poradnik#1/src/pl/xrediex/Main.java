package pl.xrediex;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("pomoc").setExecutor(new Pomoc());//teraz event przy on plg :)
        Bukkit.getConsoleSender().sendMessage("Plg sie onn wtf?");
        Bukkit.getPluginManager().registerEvents(new Eventwejwyj(), this);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("Ehh ide spac");//dzk za ogladanie mam nadzieje ze sie podobało :) 
    }
}
