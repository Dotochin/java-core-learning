package HW_4;

import java.util.*;

class Main {

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    private static void exercise1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Unit", "Hello", "Number", "Plural", "Tape", "Unit", "Point", "Point", "Tape", "Point"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void exercise2() {
        Directory directory = new Directory();

        directory.add("Ivanov", "+79003002241");
        directory.add("Ivanov", "+79003002242");
        directory.add("Petrov", "+79003002243");
        directory.add("Petrov", "+79003002244");
        directory.add("Petrov", "+79003002245");
        directory.add("Sidorov", "+79003002246");
        directory.add("Sidorov", "+79003002247");
        directory.add("Sidorov", "+79003002248");
        directory.add("Sidorov", "+79003002249");

        System.out.println(directory.get("Ivanov"));
        System.out.println(directory.get("Petrov"));
        System.out.println(directory.get("Sidorov"));
    }
}

class Directory {
    private Map<String, List<String>> phone_directory = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (phone_directory.containsKey(surname)) {
            phone_number_list = phone_directory.get(surname);
            phone_number_list.add(phone_number);
            phone_directory.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            phone_directory.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return phone_directory.get(surname);
    }

}