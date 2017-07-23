 package me.tookie.clayinfo;
 
 import org.bukkit.Sound;
 import org.bukkit.command.Command;
 import org.bukkit.command.CommandExecutor;
 import org.bukkit.command.CommandSender;
 import org.bukkit.entity.Player;
 
 public class Help implements CommandExecutor
 {
   public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3)
   {
     Player p = (Player)sender;
     p.playSound(p.getLocation(), Sound.VILLAGER_HIT, 2.0F, 1.0F);

     p.sendMessage("§8§m=============================");
     p.sendMessage("§8§m");
     p.sendMessage("  §e/bewerben §8- §7gibt Informationen zum bewerben aus");
     p.sendMessage("  §e/vote §8- §7gibt Informationen zum Voten aus");
     p.sendMessage("  §e/ts §8- §7zeigt dir die Teamspeak ip an");
     p.sendMessage("  §e/spawn §8- §7kehrt zum Spawn zurueck");
     p.sendMessage("  §e/youtube §8- §7gibt Informationen Aeber den YouTuber Rang aus");
     p.sendMessage("  §e/raenge §8- §7Infomiert Ueber alle Raenge");
     p.sendMessage("  §e/warps §8- §7Oeffnet eine Liste mit allen Warps");
     p.sendMessage("  §e/kits §8- §7Oeffnet eine Liste mit allen Kits");
     p.sendMessage("  §e/tpa <Name> §8- §7telepotiert dich zu einem Spieler");
     p.sendMessage("  §e/sethome <Name> §8- §7setzt ein Home");
     p.sendMessage("  §e/home <Name> §8- §7kehrt zu einem Home zurueck");
     p.sendMessage("§8§m");
     p.sendMessage("§8§m=============================");
     return true;
   }
 }