package com.ithillel.dhryn.comparing;

import java.util.*;

public class MainSortingTreeMap {
    public static void main(String[] args) {

        ArrayList<AppUser> usersList = generateUsersList(10);
//        printHashCodes(usersList);

        TreeMap<AppUser, String> usersMap = usersListToMap(usersList);

        System.out.println(usersMap);

        AppUserComparator appUserComparator = new AppUserComparator();
        TreeMap <AppUser, String> usersMapWithComparator = new TreeMap<>(appUserComparator);
        usersMapWithComparator.putAll(usersMap);
        System.out.println("-------------------------------");
        System.out.println(usersMapWithComparator);
    }

    private static TreeMap<AppUser, String> usersListToMap(ArrayList<AppUser> usersList) {
        TreeMap<AppUser, String> usersMap = new TreeMap<>();
        for (AppUser entranceUser: usersList) {
            usersMap.put(entranceUser, "value placeholder");
        }
        return usersMap;
    }

    public static ArrayList<AppUser> generateUsersList(int quantity) {
        ArrayList<AppUser> genUsersList = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            AppUser generatedAppUser = new AppUser("login" + i, "password" + i, getRandomUserType());
            genUsersList.add(generatedAppUser);
        }
        return genUsersList;
    }

    public static AppUserType getRandomUserType() {
        Random randomizer = new Random();
        AppUserType[] userTypeList = AppUserType.values();
        int randomOrdinal = randomizer.nextInt(userTypeList.length);
        return userTypeList[randomOrdinal];
    }

    private static void printHashCodes(ArrayList<AppUser> users) {
        for (AppUser user : users) {
            System.out.println("Hash code of " + user.getLogin() + " is " + user.hashCode());
        }
    }
}



