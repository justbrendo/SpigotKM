package me.brendo.spigotkm

import me.brendo.spigotkm.listeners.PlayerDataListener
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class SpigotKM : JavaPlugin() {

    companion object {
        var instance: SpigotKM? = null
            private set
    }

    /* Server's start up logic */
    override fun onEnable() {
        /* Sends a message to the console */
        Bukkit.getConsoleSender().sendMessage("§aHello, i'm a plugin made in Kotlin!")

        /* This adds our class PlayerDataListener as a Listener */
        Bukkit.getPluginManager().registerEvents(PlayerDataListener, this)
    }

    /* Server's shutdown logic */
    override fun onDisable() {
        Bukkit.getConsoleSender().sendMessage("§cGood Bye.")
    }
}