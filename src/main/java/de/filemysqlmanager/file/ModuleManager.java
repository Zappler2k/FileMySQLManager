package de.filemysqlmanager.file;


import java.util.ArrayList;

public class ModuleManager {

    private ArrayList<IModule> modules;

    public ModuleManager() {
        this.modules = new ArrayList<>();
    }

    public void register(IModule module) {
        this.modules.add(module.fromJson(new ConfigManager(module).getContent()));
    }

    public void unregister(IModule module) {
        this.modules.remove(module);
    }

    public IModule getModule(Class<? extends IModule> module) {
        for (IModule iModule : modules) {
            if (iModule.getClass().getName().equalsIgnoreCase(module.getName())) {
                return iModule;
            }
        }
        return null;
    }

    public ArrayList<IModule> getModules() {
        return modules;
    }
}
