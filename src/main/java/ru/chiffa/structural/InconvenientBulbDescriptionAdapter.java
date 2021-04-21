package ru.chiffa.structural;

public class InconvenientBulbDescriptionAdapter extends ConvenientBulbDescription{
    private final InconvenientBulbDescription inconvenientBulbDescription;

    public InconvenientBulbDescriptionAdapter(InconvenientBulbDescription inconvenientBulbDescription) {
        super(inconvenientBulbDescription.getTemperature() < 2700 ? "yellow" : "white");
        this.inconvenientBulbDescription = inconvenientBulbDescription;
    }
}
