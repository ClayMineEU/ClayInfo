 package me.tookie.clayinfo;
 
 import org.bukkit.Sound;
 import org.bukkit.command.Command;
 import org.bukkit.command.CommandExecutor;
 import org.bukkit.command.CommandSender;
 import org.bukkit.entity.Player;
 
 public class Titan implements CommandExecutor
 {
   public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3)
   {
    if(sender instanceof Player) {
     Player p = (Player)sender;
     p.playSound(p.getLocation(), Sound.VILLAGER_HIT, 2.0F, 1.0F);
     
     p.sendMessage("§8§m=============================");
     p.sendMessage("§8§m");
     p.sendMessage("  §6Titan §8- §7LIFETIME");
     p.sendMessage("  §ePreis: §710‚¬ Euro");
     p.sendMessage("  §eRechte: §73 Homes");
     p.sendMessage("            §7Titan & Premium Kit");
     p.sendMessage("            §7/back");
     p.sendMessage("            §7/spawner");
     p.sendMessage("            §7/repair");
     p.sendMessage("            §7/enderchest");
     p.sendMessage("            §7/heal");
     p.sendMessage("            §7/feed");
     p.sendMessage("            §7/wb");
     p.sendMessage("§8§m");
     p.sendMessage("  §7Wenn du einen Rang kaufen moechtest,  dann benutze /Donate [RANG] [PSC]");
     
     p.sendMessage("§8§m=============================");
    }
     return true;
   }
 }