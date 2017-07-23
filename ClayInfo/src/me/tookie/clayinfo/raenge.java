 package me.tookie.clayinfo;
 
 import org.bukkit.Sound;
 import org.bukkit.command.Command;
 import org.bukkit.command.CommandExecutor;
 import org.bukkit.command.CommandSender;
 import org.bukkit.entity.Player;
 
 public class raenge implements CommandExecutor
 {
   public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3)
   {
     Player p = (Player)sender;
     p.playSound(p.getLocation(), Sound.VILLAGER_HIT, 2.0F, 1.0F);

     p.sendMessage("§8§m=============================");
     p.sendMessage("§8§m");
     p.sendMessage("  §e/premium §8- §7gibt Informationen von Premium");
     p.sendMessage("  §e/titan §8- §7gibt Informationen von Titan");
     p.sendMessage("  §e/legende §8- §7gibt Information von Legende");
     p.sendMessage("  §e/youtube §8- §7gibt Information vom YouTuber Rang");
     p.sendMessage("§8§m=============================");
     return true;
   }
 }