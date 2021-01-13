package pl.xrediex;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Eventwejwyj implements Listener {

    @EventHandler
    public void onJojn(PlayerJoinEvent e){
        Player p = e.getPlayer();
        p.sendMessage("");
        p.sendMessage("   §2§l»§m-----§r§2§l«  §6§lGrascraft.pl  §2§l»§m-----§r§2§l«");
        p.sendMessage("  §6* §7Witaj §6" + p.getName() + " §7 na Grascraft.pl ");
        p.sendMessage("  §6* §7Pomoc pod komenda §6/pomoc§7.");
        p.sendMessage("  §6* §7Strona: §6www.Grascraft.pl ");
        p.sendMessage("  §6* §7Discord: §6dc.Grascraft.pl ");
        p.sendMessage("  §6* §7Zyczymy milej gry!");
        p.sendMessage("   §2§l»§m-----§r§2§l«  §6§lGrascraft.pl   §2§l»§m-----§r§2§l«");
        p.sendMessage("");
        Bukkit.broadcastMessage("§8[§a+§8] Wszedł" + p.getName() + "serwer");
    }
    @EventHandler
    public void onDisable(PlayerQuitEvent e){
        Player p = e.getPlayer();
        p.sendMessage("");
        p.sendMessage("   §2§l»§m-----§r§2§l«  §6§lGrascraft.pl  §2§l»§m-----§r§2§l«");
        p.sendMessage("  §6* §7Witaj §6" + p.getName() + " §7 na Grascraft.pl ");
        p.sendMessage("  §6* §7Pomoc pod komenda §6/pomoc§7.");
        p.sendMessage("  §6* §7Strona: §6www.Grascraft.pl ");
        p.sendMessage("  §6* §7Discord: §6dc.Grascraft.pl ");
        p.sendMessage("  §6* §7Zyczymy milej gry!");
        p.sendMessage("   §2§l»§m-----§r§2§l«  §6§lGrascraft.pl   §2§l»§m-----§r§2§l«");
        p.sendMessage("");
        Bukkit.broadcastMessage("§8[§a+§8] Wszedł" + p.getName() + "serwer");

    }
}
