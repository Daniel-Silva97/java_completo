package genericsSetMap.mapExercises.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> elections = new LinkedHashMap<>();

        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                Integer votes = Integer.parseInt(fields[1]);

                if (elections.containsKey(name)) {
                    int votesSoFar = elections.get(name);
                    elections.put(name, votes + votesSoFar);
                } else {
                    elections.put(name, votes);
                }
                line = br.readLine();
            }

            for (String key : elections.keySet()) {
                System.out.println(key + ": " + elections.get(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
