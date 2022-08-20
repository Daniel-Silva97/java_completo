package genericsSetMap.map.application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("fone", "99711112");

        cookies.remove("email");
        cookies.put("fone", "997711113");

        System.out.println("Contains 'fone' key: " + cookies.containsKey("fone"));
        System.out.println("Fone: " + cookies.get("fone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("All cookies: ");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
