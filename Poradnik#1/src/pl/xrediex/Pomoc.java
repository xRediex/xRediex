package pl.xrediex;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Pomoc implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        Player p = (Player)sender;
        p.sendMessage("Nasza wiadomosc po wpisaniu /pomoc");
        p.sendMessage("&aTak koloru nie zrobimy :(");
        p.sendMessage("Potrzebny specjalny znak xd");
        p.sendMessage("§a Tak robimy kolorek :)");
        p.sendMessage("✖ tekst");
        p.sendMessage("Tak robbimy ile chcemy xd");//dziala xd
        return false;
    }
}
