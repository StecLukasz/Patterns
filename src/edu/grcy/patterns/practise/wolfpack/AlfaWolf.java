package edu.grcy.patterns.practise.wolfpack;

public class AlfaWolf extends Wolf{
    private static final Wolf ALFA = new AlfaWolf();

    private AlfaWolf(){
        super("Alfa",WolfType.ALFA);
    }

    public static Wolf getALFA(){
        return ALFA;
    }

    @Override
    public String toString() {
        return "AlfaWolf{" +
                "ALFA=" + ALFA +
                "rules the group" +
                '}';
    }
}
