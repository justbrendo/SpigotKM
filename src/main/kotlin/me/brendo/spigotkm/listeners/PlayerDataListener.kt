package me.brendo.spigotkm.listeners

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

object PlayerDataListener : Listener {

    @EventHandler
    fun onPlayerJoin(e: PlayerJoinEvent) {
        e.player.sendMessage("§aSpigotKM: §eHello, §${e.player.name}, thanks for joining the server!")
    }

}