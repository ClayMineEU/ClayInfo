package me.tookie.clayinfo;

import org.bukkit.plugin.java.JavaPlugin;


	public class main extends JavaPlugin 
{
		public void onEnable()
		{
			getCommand("Premium").setExecutor(new Premium());
			getCommand("Titan").setExecutor(new Titan());
			getCommand("Legende").setExecutor(new Legende());
			getCommand("youtube").setExecutor(new YouTube());
			getCommand("help").setExecutor(new Help());
			getCommand("hilfe").setExecutor(new Hilfe());
			getCommand("bewerben").setExecutor(new Bewerben());
			getCommand("ts").setExecutor(new TS());
			getCommand("vote").setExecutor(new Vote());
			getCommand("tutorial").setExecutor(new Tutorial());
			getCommand("raenge").setExecutor(new raenge());
		}

	
}

