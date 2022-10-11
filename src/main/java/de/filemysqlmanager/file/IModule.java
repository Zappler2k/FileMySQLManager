package de.filemysqlmanager.file;

import java.io.File;

public interface IModule {

    File getFile();

    String getDefaultConfig();

    IModule fromJson(String content);

    String toJson();
}
