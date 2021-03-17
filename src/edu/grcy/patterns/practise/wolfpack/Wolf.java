package edu.grcy.patterns.practise.wolfpack;

public abstract class Wolf {
    private String name;
    private WolfType wolfType;

    public Wolf(String name, WolfType wolfType) {
        this.name = name;
        this.wolfType = wolfType;
    }

    public String getName() {
        return name;
    }

    public WolfType getWolfType() {
        return wolfType;
    }

}
