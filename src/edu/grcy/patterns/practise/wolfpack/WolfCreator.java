package edu.grcy.patterns.practise.wolfpack;

public class WolfCreator {
    public static Wolf createWolf(String wolfTypeShortcut, String wolfName){
        //factory style
        switch (WolfType.getByShortcut(wolfTypeShortcut)){
            case ALFA:
                return AlfaWolf.getALFA();
            case HUNTER:
                return new HunterWolf(wolfName);
            case FEMALE:
                return new FemaleWolf(wolfName);
            case YOUNG:
                return new YoungWolf(wolfName);
            default:
                System.out.println("No wolf with type " + wolfTypeShortcut);
                return null;
        }
    }
}
