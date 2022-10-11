package de.filemysqlmanager.file;

import lombok.SneakyThrows;

import java.io.FileWriter;
import java.nio.file.Files;


public class ConfigManager {

    private IModule iModule;


    @SneakyThrows
    public ConfigManager(IModule iModule) {
        this.iModule = iModule;
        if (!iModule.getFile().getParentFile().exists()) {
            iModule.getFile().getParentFile().mkdirs();
        }
        if (!iModule.getFile().exists()) {
            iModule.getFile().createNewFile();
            FileWriter fileWriter = new FileWriter(iModule.getFile());
            fileWriter.write(iModule.getDefaultConfig());
            fileWriter.flush();
            fileWriter.close();
        }
    }

    @SneakyThrows
    public void insert(String data) {
        FileWriter fileWriter = new FileWriter(iModule.getFile());
        fileWriter.write(data);
        fileWriter.flush();
        fileWriter.close();
    }

    @SneakyThrows
    public String getContent() {
        return new String(Files.readAllBytes(iModule.getFile().toPath()));
    }
}
