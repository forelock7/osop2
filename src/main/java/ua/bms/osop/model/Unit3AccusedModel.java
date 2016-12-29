package ua.bms.osop.model;

/**
 * Created by ChubenkoV on 29.12.2016.
 */
public class Unit3AccusedModel {

    private String name;

    public Unit3AccusedModel(int i) {
        this.name = "Особа " + i;
    }

    public Unit3AccusedModel(String name) {
        this.name = name;
    }

    /*---Get Methods---*/
    public String getName() {
        return name;
    }

}
