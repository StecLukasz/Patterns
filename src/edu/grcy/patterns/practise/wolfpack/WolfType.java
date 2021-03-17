package edu.grcy.patterns.practise.wolfpack;

public enum WolfType {
    ALFA("a"),
    FEMALE("f"),
    HUNTER("h"),
    YOUNG("y");

    private String shortcut;

    WolfType(String shortcut){
        this.shortcut = shortcut;
    }
    public static WolfType getByShortcut(String shortcut){
        for (WolfType wolfType : WolfType.values()){
            if (wolfType.shortcut.equals(shortcut)){
                return wolfType;
            }
        }
        return null;
    }
}
