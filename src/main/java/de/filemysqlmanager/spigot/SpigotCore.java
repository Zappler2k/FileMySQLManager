package de.filemysqlmanager.spigot;

import de.filemysqlmanager.Manager;
import de.filemysqlmanager.mysql.MySQLConnnector;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class SpigotCore extends JavaPlugin {

    public void onEnable() {
        new Manager();
    }

    public void onDisable() {
    }
}
