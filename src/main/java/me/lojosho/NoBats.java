package me.lojosho;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoBats extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onBatSpawn(EntitySpawnEvent event) {
        Entity entity = event.getEntity(); {
            if (entity.getType() == EntityType.BAT) {
                event.setCancelled(true);
            }
        }
    }
}
