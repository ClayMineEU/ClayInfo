 package me.tookie.clayinfo;
 
 import org.bukkit.Sound;
 import org.bukkit.command.Command;
 import org.bukkit.command.CommandExecutor;
 import org.bukkit.command.CommandSender;
 import org.bukkit.entity.Player;
 
 public class Vote implements CommandExecutor
 {
   public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3)
   {
     Player p = (Player)sender;
     p.playSound(p.getLocation(), Sound.VILLAGER_HIT, 2.0F, 1.0F);
     
     p.sendMessage("§8§m=============================");
     p.sendMessage("§8§m");
     p.sendMessage("  §7Du kannst jeden Tag 2 mal Voten");
     p.sendMessage("  §7Hier sind die Links dazu");
     p.sendMessage("§8§m");
     p.sendMessage("  §eVote1: §ahttp://bit.ly/ClayVote1");
     p.sendMessage("  §eVote2: §ahttp://bit.ly/ClayVote2");
     p.sendMessage("§8§m");
     p.sendMessage("§8§m=============================");
     return true;
   }
 }