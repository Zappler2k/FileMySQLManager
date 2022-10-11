package de.filemysqlmanager.bungee;

import de.filemysqlmanager.Manager;
import net.md_5.bungee.api.plugin.Plugin;

public class BungeeCore extends Plugin {

    public void onEnable() {
        System.out.println("[MySQLConnector] BungeeCore is enabled!");
        new Manager();
    }

    public void onDisable() {
        System.out.println("[MySQLConnector] BungeeCore is disabled!");
    }

}
