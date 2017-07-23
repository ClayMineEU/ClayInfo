 package me.tookie.clayinfo;
 
 import org.bukkit.Sound;
 import org.bukkit.command.Command;
 import org.bukkit.command.CommandExecutor;
 import org.bukkit.command.CommandSender;
 import org.bukkit.entity.Player;
 
 public class Bewerben implements CommandExecutor
 {
   public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3)
   {
     Player p = (Player)sender;
     p.playSound(p.getLocation(), Sound.VILLAGER_HIT, 2.0F, 1.0F);
     
     p.sendMessage("§8§m=============================");
     p.sendMessage("§8§m");
     p.sendMessage("  §7Du kannst dich Bewerben indem du");
     p.sendMessage("  §7eine Bewerbung ims Forum schreibst.");
     p.sendMessage("§8§m");
     p.sendMessage("  §eForum: §7ClayMine.eu/Forum");
     p.sendMessage("  §eStatus der Bewerbungsphase: §aOffen");
     p.sendMessage("§8§m");
     p.sendMessage("§8§m=============================");
     return true;
   }
 }