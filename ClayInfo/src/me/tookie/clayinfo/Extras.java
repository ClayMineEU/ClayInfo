package de.LobbySystem.Update.Items;

import de.LobbySystem.Update.Main;
import de.LobbySystem.Update.Utils.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class Extras
  implements Listener
{
  Main plugin;
  
  public Extras(Main Main)
  {
    this.plugin = Main;
  }
  
  Inventory inv = Bukkit.createInventory(null, 36, "§eKöpfe");
  
  @EventHandler
  public void onInteract(PlayerInteractEvent e)
  {
    Player p = e.getPlayer();
    if ((e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK)) {
      try
      {
        if (e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eExtras §7<§fRechtsklick§7>"))
        {
          ItemStack Profil = new ItemStack(Material.SKULL_ITEM);
          SkullMeta ProfilMeta = (SkullMeta)Profil.getItemMeta();
          Profil.setDurability((short)3);
          ProfilMeta.setDisplayName("§eKöpfe");
          ProfilMeta.setOwner("DesAPI");
          Profil.setItemMeta(ProfilMeta);
          this.inv.setItem(0, Profil);
          
          this.inv.setItem(1, ItemManager.createItem(Material.STAINED_GLASS_PANE, 5, "§0."));
          
          ItemStack Head1 = new ItemStack(Material.SKULL_ITEM);
          SkullMeta Head1Meta = (SkullMeta)Head1.getItemMeta();
          Head1.setDurability((short)3);
          Head1Meta.setDisplayName("§f§lTookieGame");
          Head1Meta.setOwner("TookieGame");
          Head1.setItemMeta(Head1Meta);
          this.inv.setItem(12, Head1);
          
          ItemStack Head11 = new ItemStack(Material.SKULL_ITEM);
          SkullMeta Head1Meta1 = (SkullMeta)Head11.getItemMeta();
          Head11.setDurability((short)3);
          Head1Meta1.setDisplayName("§5VeniCraft");
          Head1Meta1.setOwner("VeniCraft");
          Head11.setItemMeta(Head1Meta1);
          this.inv.setItem(13, Head11);
          
          ItemStack Head111 = new ItemStack(Material.SKULL_ITEM);
          SkullMeta Head1Meta11 = (SkullMeta)Head111.getItemMeta();
          Head111.setDurability((short)3);
          Head1Meta11.setDisplayName("§5BastiGHG");
          Head1Meta11.setOwner("BastiGHG");
          Head111.setItemMeta(Head1Meta11);
          this.inv.setItem(14, Head111);
          
          ItemStack Head1111 = new ItemStack(Material.SKULL_ITEM);
          SkullMeta Head1Meta111 = (SkullMeta)Head1111.getItemMeta();
          Head1111.setDurability((short)3);
          Head1Meta111.setDisplayName("§5GommeHD");
          Head1Meta111.setOwner("GommeHD");
          Head1111.setItemMeta(Head1Meta111);
          this.inv.setItem(15, Head1111);
          
          ItemStack Head11111 = new ItemStack(Material.SKULL_ITEM);
          SkullMeta Head1Meta1111 = (SkullMeta)Head11111.getItemMeta();
          Head11111.setDurability((short)3);
          Head1Meta1111.setDisplayName("§5Ungespielt");
          Head1Meta1111.setOwner("ungespielt");
          Head11111.setItemMeta(Head1Meta1111);
          this.inv.setItem(16, Head11111);
          
          this.inv.setItem(19, ItemManager.createItem(Material.STAINED_GLASS_PANE, 7, "§0."));
          
          ItemStack Head111111 = new ItemStack(Material.SKULL_ITEM);
          SkullMeta Head1Meta11111 = (SkullMeta)Head111111.getItemMeta();
          Head111111.setDurability((short)3);
          Head1Meta11111.setDisplayName("§5Rewinside");
          Head1Meta11111.setOwner("rewinside");
          Head111111.setItemMeta(Head1Meta11111);
          this.inv.setItem(21, Head111111);
          
          ItemStack Head1111111 = new ItemStack(Material.SKULL_ITEM);
          SkullMeta Head1Meta111111 = (SkullMeta)Head1111111.getItemMeta();
          Head1111111.setDurability((short)3);
          Head1Meta111111.setDisplayName("§5DnerTV");
          Head1Meta111111.setOwner("DnerTV");
          Head1111111.setItemMeta(Head1Meta111111);
          this.inv.setItem(22, Head1111111);
          
          ItemStack Head11111111 = new ItemStack(Material.SKULL_ITEM);
          SkullMeta Head1Meta1111111 = (SkullMeta)Head11111111.getItemMeta();
          Head11111111.setDurability((short)3);
          Head1Meta1111111.setDisplayName("§5LOGO");
          Head1Meta1111111.setOwner("LOGO");
          Head11111111.setItemMeta(Head1Meta1111111);
          this.inv.setItem(23, Head11111111);
          
          ItemStack Head111111111 = new ItemStack(Material.SKULL_ITEM);
          SkullMeta Head1Meta11111111 = (SkullMeta)Head111111111.getItemMeta();
          Head111111111.setDurability((short)3);
          Head1Meta11111111.setDisplayName("§5Paluten");
          Head1Meta11111111.setOwner("Paluten");
          Head111111111.setItemMeta(Head1Meta11111111);
          this.inv.setItem(24, Head111111111);
          
          ItemStack Head1111111111 = new ItemStack(Material.SKULL_ITEM);
          SkullMeta Head1Meta111111111 = (SkullMeta)Head1111111111.getItemMeta();
          Head1111111111.setDurability((short)3);
          Head1Meta111111111.setDisplayName("§5Sturmwaffel");
          Head1Meta111111111.setOwner("SturmwaffelHD");
          Head1111111111.setItemMeta(Head1Meta111111111);
          this.inv.setItem(25, Head1111111111);
          
          ItemStack Boots = new ItemStack(Material.LEATHER_BOOTS);
          ItemMeta BootsMeta = Boots.getItemMeta();
          BootsMeta.setDisplayName("§eBoots");
          Boots.setItemMeta(BootsMeta);
          this.inv.setItem(9, Boots);
          
          this.inv.setItem(10, ItemManager.createItem(Material.STAINED_GLASS_PANE, 7, "§0."));
          
          this.inv.setItem(18, ItemManager.createItem(Material.GLASS, 0, "§eHüte"));
          
          this.inv.setItem(19, ItemManager.createItem(Material.STAINED_GLASS_PANE, 7, "§0."));
          
          this.inv.setItem(27, ItemManager.createItem(Material.TNT, 11, "§eGadets"));
          
          this.inv.setItem(28, ItemManager.createItem(Material.STAINED_GLASS_PANE, 7, "§0."));
          
          p.openInventory(this.inv);
        }
      }
      catch (Exception ex)
      {
        ex.printStackTrace();
      }
    }
  }
  
  @EventHandler
  public void onClick(InventoryClickEvent e)
  {
    Player p = (Player)e.getWhoClicked();
    if (e.getClickedInventory() != null) {
      e.setCancelled(true);
    } else {
      e.setCancelled(true);
    }
    if ((e.getClickedInventory() != null) && (e.getClickedInventory().getTitle().equalsIgnoreCase("§eKöpfe"))) {
      e.setCancelled(true);
    }
    if ((e.getClickedInventory() != null) && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eKöpfe")))
    {
      p.openInventory(this.inv);
      e.setCancelled(true);
    }
    if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eBoots")))
    {
      Inventory invboot = Bukkit.createInventory(null, 36, "§eBoots");
      ItemStack Profil = new ItemStack(Material.SKULL_ITEM);
      SkullMeta ProfilMeta = (SkullMeta)Profil.getItemMeta();
      Profil.setDurability((short)3);
      ProfilMeta.setDisplayName("§eKöpfe");
      ProfilMeta.setOwner("DesAPI");
      Profil.setItemMeta(ProfilMeta);
      invboot.setItem(0, Profil);
      
      invboot.setItem(1, ItemManager.createItem(Material.STAINED_GLASS_PANE, 7, "§0."));
      
      invboot.setItem(19, ItemManager.createItem(Material.STAINED_GLASS_PANE, 7, "§0."));
      
      ItemStack Boot1 = new ItemStack(Material.LEATHER_BOOTS);
      LeatherArmorMeta Boot1Meta = (LeatherArmorMeta)Boot1.getItemMeta();
      Boot1Meta.setDisplayName("§cLoveBoots");
      Boot1Meta.setColor(Color.RED);
      Boot1.setItemMeta(Boot1Meta);
      invboot.setItem(12, Boot1);
      
      ItemStack Boot11 = new ItemStack(Material.LEATHER_BOOTS);
      LeatherArmorMeta Boot1Meta1 = (LeatherArmorMeta)Boot11.getItemMeta();
      Boot1Meta1.setDisplayName("§aMusikBoots");
      Boot1Meta1.setColor(Color.LIME);
      Boot11.setItemMeta(Boot1Meta1);
      invboot.setItem(13, Boot11);
      
      ItemStack Boot111 = new ItemStack(Material.LEATHER_BOOTS);
      LeatherArmorMeta Boot1Meta11 = (LeatherArmorMeta)Boot111.getItemMeta();
      Boot1Meta11.setDisplayName("§5EnderBoots");
      Boot1Meta11.setColor(Color.PURPLE);
      Boot111.setItemMeta(Boot1Meta11);
      invboot.setItem(14, Boot111);
      
      ItemStack Boot1111 = new ItemStack(Material.LEATHER_BOOTS);
      LeatherArmorMeta Boot1Meta111 = (LeatherArmorMeta)Boot1111.getItemMeta();
      Boot1Meta111.setDisplayName("§bAquaBoots");
      Boot1Meta111.setColor(Color.AQUA);
      Boot1111.setItemMeta(Boot1Meta111);
      invboot.setItem(15, Boot1111);
      
      ItemStack Boot11111 = new ItemStack(Material.LEATHER_BOOTS);
      LeatherArmorMeta Boot1Meta1111 = (LeatherArmorMeta)Boot11111.getItemMeta();
      Boot1Meta1111.setDisplayName("§fCloudBoots");
      Boot1Meta1111.setColor(Color.WHITE);
      Boot11111.setItemMeta(Boot1Meta1111);
      invboot.setItem(16, Boot11111);
      
      invboot.setItem(18, ItemManager.createItem(Material.STAINED_CLAY, 11, "§eHüte"));
      
      invboot.setItem(19, ItemManager.createItem(Material.STAINED_GLASS_PANE, 7, "§0."));
      ItemStack Boots = new ItemStack(Material.LEATHER_BOOTS);
      ItemMeta BootsMeta = Boots.getItemMeta();
      BootsMeta.setDisplayName("§eBoots");
      Boots.setItemMeta(BootsMeta);
      invboot.setItem(9, Boots);
      
      invboot.setItem(10, ItemManager.createItem(Material.STAINED_GLASS_PANE, 5, "§0."));
      
      invboot.setItem(18, ItemManager.createItem(Material.GLASS, 0, "§eHüte"));
      
      invboot.setItem(19, ItemManager.createItem(Material.STAINED_GLASS_PANE, 7, "§0."));
      
      invboot.setItem(27, ItemManager.createItem(Material.TNT, 11, "§eGadets"));
      
      invboot.setItem(28, ItemManager.createItem(Material.STAINED_GLASS_PANE, 7, "§0."));
      
      p.openInventory(invboot);
      e.setCancelled(true);
    }
    if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eGadets")))
    {
      p.closeInventory();
      p.sendMessage(this.plugin.getConfig().getString("Prefix").replace("&", "§") + "§7Die §eGadets §7sind derzeit in §f§lEntwicklung");
      e.setCancelled(true);
    }
    if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eHüte")))
    {
      Inventory invhüte = Bukkit.createInventory(null, 36, "§eHüte");
      ItemStack Profil = new ItemStack(Material.SKULL_ITEM);
      SkullMeta ProfilMeta = (SkullMeta)Profil.getItemMeta();
      Profil.setDurability((short)3);
      ProfilMeta.setDisplayName("§eKöpfe");
      ProfilMeta.setOwner("DesAPI");
      Profil.setItemMeta(ProfilMeta);
      invhüte.setItem(0, Profil);
      
      invhüte.setItem(1, ItemManager.createItem(Material.STAINED_GLASS_PANE, 7, "§0."));
      
      invhüte.setItem(19, ItemManager.createItem(Material.STAINED_GLASS_PANE, 7, "§0."));
      
      ItemStack Head1 = new ItemStack(Material.GLASS);
      ItemMeta Head1Meta = Head1.getItemMeta();
      Head1Meta.setDisplayName("§9Astronaut");
      Head1.setItemMeta(Head1Meta);
      invhüte.setItem(12, Head1);
      
      ItemStack Head11 = new ItemStack(Material.DAYLIGHT_DETECTOR);
      ItemMeta Head1Meta1 = Head11.getItemMeta();
      Head1Meta1.setDisplayName("§9Schal");
      Head11.setItemMeta(Head1Meta1);
      invhüte.setItem(13, Head11);
      
      ItemStack Head111 = new ItemStack(Material.ANVIL);
      ItemMeta Head1Meta11 = Head111.getItemMeta();
      Head1Meta11.setDisplayName("§9Einhorn");
      Head111.setItemMeta(Head1Meta11);
      invhüte.setItem(14, Head111);
      
      ItemStack Head1111 = new ItemStack(Material.DISPENSER);
      ItemMeta Head1Meta111 = Head1111.getItemMeta();
      Head1Meta111.setDisplayName("§9OHHHH");
      Head1111.setItemMeta(Head1Meta111);
      invhüte.setItem(15, Head1111);
      
      invhüte.setItem(18, ItemManager.createItem(Material.STAINED_CLAY, 11, "§eHüte"));
      
      invhüte.setItem(19, ItemManager.createItem(Material.STAINED_GLASS_PANE, 7, "§0."));
      ItemStack Boots = new ItemStack(Material.LEATHER_BOOTS);
      ItemMeta BootsMeta = Boots.getItemMeta();
      BootsMeta.setDisplayName("§eBoots");
      Boots.setItemMeta(BootsMeta);
      invhüte.setItem(9, Boots);
      
      invhüte.setItem(10, ItemManager.createItem(Material.STAINED_GLASS_PANE, 7, "§0."));
      
      invhüte.setItem(18, ItemManager.createItem(Material.GLASS, 0, "§eHüte"));
      
      invhüte.setItem(19, ItemManager.createItem(Material.STAINED_GLASS_PANE, 5, "§0."));
      
      invhüte.setItem(27, ItemManager.createItem(Material.TNT, 11, "§eGadets"));
      
      invhüte.setItem(28, ItemManager.createItem(Material.STAINED_GLASS_PANE, 7, "§0."));
      
      p.openInventory(invhüte);
      e.setCancelled(true);
    }
    if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§f§lDesAPI")))
    {
      p.getInventory().setHelmet(e.getCurrentItem());
      p.closeInventory();
      p.playSound(p.getLocation(), Sound.LEVEL_UP, 15.0F, 15.0F);
      e.setCancelled(true);
    }
    if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5VeniCraft")))
    {
      p.getInventory().setHelmet(e.getCurrentItem());
      p.closeInventory();
      p.playSound(p.getLocation(), Sound.LEVEL_UP, 15.0F, 15.0F);
      e.setCancelled(true);
    }
    if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5Paluten")))
    {
      p.getInventory().setHelmet(e.getCurrentItem());
      p.closeInventory();
      p.playSound(p.getLocation(), Sound.LEVEL_UP, 15.0F, 15.0F);
      e.setCancelled(true);
    }
    if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5Sturmwaffel")))
    {
      p.getInventory().setHelmet(e.getCurrentItem());
      p.closeInventory();
      p.playSound(p.getLocation(), Sound.LEVEL_UP, 15.0F, 15.0F);
      e.setCancelled(true);
    }
    if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5BastiGHG")))
    {
      p.getInventory().setHelmet(e.getCurrentItem());
      p.closeInventory();
      p.playSound(p.getLocation(), Sound.LEVEL_UP, 15.0F, 15.0F);
      e.setCancelled(true);
    }
    if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5DnerTV")))
    {
      p.getInventory().setHelmet(e.getCurrentItem());
      p.closeInventory();
      p.playSound(p.getLocation(), Sound.LEVEL_UP, 15.0F, 15.0F);
      e.setCancelled(true);
    }
    if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5GommeHD")))
    {
      p.getInventory().setHelmet(e.getCurrentItem());
      p.closeInventory();
      p.playSound(p.getLocation(), Sound.LEVEL_UP, 15.0F, 15.0F);
      e.setCancelled(true);
    }
    if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5Ungespielt")))
    {
      p.getInventory().setHelmet(e.getCurrentItem());
      p.closeInventory();
      p.playSound(p.getLocation(), Sound.LEVEL_UP, 15.0F, 15.0F);
      e.setCancelled(true);
    }
    if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5LOGO")))
    {
      p.getInventory().setHelmet(e.getCurrentItem());
      p.closeInventory();
      p.playSound(p.getLocation(), Sound.LEVEL_UP, 15.0F, 15.0F);
      e.setCancelled(true);
    }
    if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5Rewinside")))
    {
      p.getInventory().setHelmet(e.getCurrentItem());
      p.closeInventory();
      p.playSound(p.getLocation(), Sound.LEVEL_UP, 15.0F, 15.0F);
      e.setCancelled(true);
    }
    if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§9Astronaut")))
    {
      p.getInventory().setHelmet(e.getCurrentItem());
      p.closeInventory();
      p.playSound(p.getLocation(), Sound.LEVEL_UP, 15.0F, 15.0F);
      e.setCancelled(true);
    }
    if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§9Schal")))
    {
      p.getInventory().setHelmet(e.getCurrentItem());
      p.closeInventory();
      p.playSound(p.getLocation(), Sound.LEVEL_UP, 15.0F, 15.0F);
      e.setCancelled(true);
    }
    if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§9Einhorn")))
    {
      p.getInventory().setHelmet(e.getCurrentItem());
      p.closeInventory();
      p.playSound(p.getLocation(), Sound.LEVEL_UP, 15.0F, 15.0F);
      e.setCancelled(true);
    }
    if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§9OHHHH")))
    {
      p.getInventory().setHelmet(e.getCurrentItem());
      p.closeInventory();
      p.playSound(p.getLocation(), Sound.LEVEL_UP, 15.0F, 15.0F);
      e.setCancelled(true);
    }
  }
  
  @EventHandler
  public void onClickBoot(InventoryClickEvent e)
  {
    if ((e.getWhoClicked() instanceof Player))
    {
      Player p = (Player)e.getWhoClicked();
      if ((e.getClickedInventory() != null) && (e.getClickedInventory().getTitle().equalsIgnoreCase("§eBoots")))
      {
        e.setCancelled(true);
        if ((e.getCurrentItem().getType() != Material.AIR) && (e.getCurrentItem() != null))
        {
          p.getInventory().setBoots(e.getCurrentItem());
          p.playSound(p.getLocation(), Sound.LEVEL_UP, 15.0F, 15.0F);
          p.closeInventory();
        }
      }
    }
  }
  
  @EventHandler
  public void onMove(PlayerMoveEvent e)
  {
    Player p = e.getPlayer();
    if ((p.getInventory().getBoots() != null) && (p.getInventory().getBoots().getType() != Material.AIR))
    {
      String str;
      switch ((str = p.getInventory().getBoots().getItemMeta().getDisplayName()).hashCode())
      {
      case -1634163481: 
        if (str.equals("§5EnderBoots")) {}
        break;
      case -1167072117: 
        if (str.equals("§fCloudBoots")) {}
        break;
      case -1160135117: 
        if (str.equals("§cLoveBoots")) {
          break;
        }
        break;
      case -1008037426: 
        if (str.equals("§aMusikBoots")) {}
        break;
      case -72858614: 
        if (!str.equals("§bAquaBoots"))
        {
          return;p.playEffect(p.getLocation().add(0.0D, 1.0D, 0.0D), Effect.HEART, 1);
          return;
          
          p.playEffect(p.getLocation().add(0.0D, 1.0D, 0.0D), Effect.ENDER_SIGNAL, 1);
        }
        else
        {
          p.playEffect(p.getLocation().add(0.0D, 1.0D, 0.0D), Effect.WATERDRIP, 1);
          return;
          
          p.playEffect(p.getLocation().add(0.0D, 1.0D, 0.0D), Effect.NOTE, 1);
          return;
          
          p.playEffect(p.getLocation().add(0.0D, 1.0D, 0.0D), Effect.CLOUD, 1);
        }
        break;
      }
    }
  }
}
