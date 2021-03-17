package edu.grcy.patterns.practise.wolfpack;

import java.util.*;
import java.util.stream.Collectors;

public class WolfGroup {
    public static void main(String[] args) {
        Wolf alfa = WolfCreator.createWolf("a", "ALFA");
        Wolf hunter1 = WolfCreator.createWolf("h", "Kiki");
        Wolf hunter2 = WolfCreator.createWolf("h", "Rafi");
        Wolf hunter3 = WolfCreator.createWolf("h", "Burek");
        Wolf female1 = WolfCreator.createWolf("f", "Liza");
        Wolf female2 = WolfCreator.createWolf("f", "Raja");
        Wolf female3 = WolfCreator.createWolf("f", "Marlena");
        Wolf youngster1 = WolfCreator.createWolf("y", "Siwy");
        Wolf youngster2 = WolfCreator.createWolf("y", "Bury");
        Wolf youngster3 = WolfCreator.createWolf("y", "Szary");

        Wolf secondAlfa = WolfCreator.createWolf("a", "AnotherALFA");

        //jak mamy ten sam obiekt to możemy sprawdzić referencję, nie trzeba hashCode / equals()
        if (alfa == secondAlfa) {
            System.out.println("To ten sam wilk");
        }

        List<Wolf> group = Arrays.asList(alfa, hunter1, hunter2, hunter3, female1, female2, female3, youngster1, youngster2, youngster3);
        System.out.println("Wolf names: ");
        group.forEach(x -> System.out.println(x.getName()));

        Map<WolfType, List<Wolf>> wolfTypeMap = getWolfesGroupedByType(group);
        System.out.println("przecinek");

        Map<WolfType, List<Wolf>> wolfTypeMapStreamed = group.stream()
                .collect(Collectors.groupingBy(Wolf::getWolfType, HashMap::new, Collectors.toList()));
        System.out.println("przecinek again");


    }

    public static Map<WolfType, List<Wolf>> getWolfesGroupedByType(List<Wolf> wolves) {
        Map<WolfType, List<Wolf>> wolfTypeMap = new HashMap<>();
        //mamy zgrupować wilki wg typu
        // czyli wszystkie youngi, female itp
        //

        for (Wolf wolf : wolves) {
            if (wolfTypeMap.keySet().contains(wolf.getWolfType())) {
                //tu wchodzimy jak w mapie jest już klucz z danym typem wilka czyli np. FEMALE, YOUNG
                List<Wolf> listByType = wolfTypeMap.get(wolf.getWolfType());
                listByType.add(wolf);
                wolfTypeMap.put(wolf.getWolfType(), listByType);
            } else {
                //tu wchodzimy jak danego typu wilka jescze w mapie nie ma więc rrobimy wpisa z listą z 1 elementem
                List<Wolf> newListByType = new ArrayList<>();
                newListByType.add(wolf);
                wolfTypeMap.put(wolf.getWolfType(), newListByType);
            }
        }
        return wolfTypeMap;
    }
}
