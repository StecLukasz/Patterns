package edu.grcy.patterns.practise.wolfpack;

public class YoungWolf extends Wolf{
    public final int MAX_AGE_FOR_YOUNGSTER=3;
    private int age;

    public YoungWolf(String name) {
        super(name,WolfType.YOUNG);
        age = 1;
    }
    public boolean shouldSeekNewGroup(){
        return MAX_AGE_FOR_YOUNGSTER-age<=0;
    }

    public int increaseAge(){
        return age++;
    }

}
