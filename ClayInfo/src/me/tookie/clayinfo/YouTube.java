 package me.tookie.clayinfo;
 
 import org.bukkit.Sound;
 import org.bukkit.command.Command;
 import org.bukkit.command.CommandExecutor;
 import org.bukkit.command.CommandSender;
 import org.bukkit.entity.Player; 
 public class YouTube implements CommandExecutor
 {
   public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3)
   {
     Player p = (Player)sender;
     p.playSound(p.getLocation(), Sound.VILLAGER_HIT, 2.0F, 1.0F);
     p.sendMessage("§8§m=============================");
     p.sendMessage("§8§m");
     p.sendMessage("  §7Dies sind die Vorraussetzungen fuer den YouTuber Rang:");
     p.sendMessage("  §e500+ Abonnenten");
     p.sendMessage("  §e150+ Aufrufe pro Video");
     p.sendMessage("  §emin. 1 Video von ClayMine.eu");
     p.sendMessage("  §emonatlich vllt 1 Video von ClayMine.eu");
     p.sendMessage("");
     p.sendMessage("  §7Vorteile als YouTuber:");
     p.sendMessage("  §ealle Rechte von Titan §7/titan");
     p.sendMessage("§8§m");
     p.sendMessage("§8§m=============================");
   return true;
}
 }