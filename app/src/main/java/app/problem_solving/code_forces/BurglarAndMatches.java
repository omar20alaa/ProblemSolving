package app.problem_solving.code_forces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BurglarAndMatches {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numBags = scanner.nextInt();
        int numBox = scanner.nextInt();
        Map<Integer, Integer> boxs = new HashMap<>();
        for (int i = 0; i < numBox; i++) {
            int nums = scanner.nextInt();
            int total = scanner.nextInt();
            if (boxs.containsKey(total)) {
                boxs.put(total, boxs.get(total) + nums);
            } else {
                boxs.put(total, nums);
            }
        }

        List<Integer> keys = new ArrayList<>(boxs.keySet());
        System.out.println(keys);
        int result = 0;
        for (int i = keys.size() - 1; i >= 0; i--) {
            if (boxs.get(keys.get(i)) < numBags) {
                result += (keys.get(i) * boxs.get(keys.get(i)));
            } else {
                result += (keys.get(i) * numBags);
                break;
            }
            numBags -= boxs.get(keys.get(i));
        }
        System.out.println(result);

    }

}
