package com.ithillel.dhryn.collections;

import com.ithillel.dhryn.enums.Report;
import com.ithillel.dhryn.enums.Seasons;

import java.util.*;

public class CollectionExamples {

    public static void main(String[] args) {
        String[] primitiveArray = {"John", "Carl"};

        ArrayList<String> employeesArrayList = new ArrayList<>(Arrays.asList(primitiveArray));
        employeesArrayList.add(1, "Eduardo");
        System.out.println("ArrayList created from primitive array: " + employeesArrayList);
        System.out.println("element #2 is " + employeesArrayList.get(1));

        for (String employee : employeesArrayList) {


            int i = employeesArrayList.indexOf(employee);
            employeesArrayList.set(i, "Din");
            System.out.println("employeesArrayList " + employee);
        }

        for (int i = 0; i < employeesArrayList.size() - 1; i++) {
            System.out.println("employeesArrayList " + employeesArrayList.get(i));
        }


        LinkedList<String> employeesLinkedList = new LinkedList<>(employeesArrayList);
        employeesLinkedList.addFirst("Edwin");
        employeesLinkedList.add(3, "Garry");
        employeesLinkedList.addLast("Melissa");
        employeesLinkedList.push("Clare");
        System.out.println("LinkedList populated: " + employeesLinkedList);
        System.out.println("get last element: " + employeesLinkedList.pollLast());
        System.out.println("LinkedList: " + employeesLinkedList);

        HashSet<Report> reportHashSet = new HashSet<>();
        reportHashSet.add(new Report(Seasons.AUTUMN, "AUTUMN report"));
        reportHashSet.add(new Report(Seasons.WINTER, "WINTER report"));
        reportHashSet.add(new Report(Seasons.WINTER, "WINTER report"));
        reportHashSet.add(new Report(Seasons.WINTER, "another WINTER report"));
        reportHashSet.add(new Report(Seasons.SPRING, "SPRING report"));
        reportHashSet.add(new Report(Seasons.SUMMER, "SUMMER report"));
        System.out.println("report hash Set " + reportHashSet);

        System.out.println("report tree Set  " + reportHashSet);

        TreeMap<Integer, String> dictionary = new TreeMap<>();
        dictionary.put(5, "stonks");
        dictionary.put(3, "corner");
        dictionary.put(1, "zalphabet");
        System.out.println(dictionary);

        HashMap<String, String> info = new HashMap<>();
        info.put("name", "Bill");
        info.put("phone", "222-33-44");
        info.put("address", "Kyiv");
        System.out.println(info);

        String phone = info.get("phone");
    }
}

