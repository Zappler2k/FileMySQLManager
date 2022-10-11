package de.filemysqlmanager;

import lombok.Getter;
import de.filemysqlmanager.file.ModuleManager;

@Getter
public class Manager {

    @Getter
    private static Manager instance;

    private ModuleManager moduleManager;

    public Manager() {
        instance = this;
        this.moduleManager = new ModuleManager();
    }
}
