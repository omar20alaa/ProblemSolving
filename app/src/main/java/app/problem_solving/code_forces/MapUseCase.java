package app.problem_solving.code_forces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapUseCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap();
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            int key = scanner.nextInt();
            int value = scanner.nextInt();
            if (map.containsKey(key)) {
                int temp = map.get(key);
                map.put(key, temp + value);
            } else {
                map.put(key , value);
            }
        }

        for (Map.Entry<Integer , Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }


    }

}
