
import java.util.HashMap;
import java.util.Map;

public class Ika {
    public static void main(String[] args) {
        Map<Integer, Double> ageDistribution = new HashMap<>();
        ageDistribution.put(18, 0.1);
        ageDistribution.put(19, 0.15);
        ageDistribution.put(20, 0.2);
        ageDistribution.put(21, 0.15);
        ageDistribution.put(22, 0.2);
        ageDistribution.put(23, 0.1);
        ageDistribution.put(24, 0.1);

        int[] ageSums = new int[32];

        for (int i = 0; i < 1000; i++) {
            double r = Math.random();
            double sum = 0.0;
            for (Map.Entry<Integer, Double> entry : ageDistribution.entrySet()) {
                sum += entry.getValue();
                int age = entry.getKey();
                if (sum >= r) {
                    ageSums[age] += 1;
                    break;
                }
            }
        }

        for (int i = 15; i < ageSums.length; i++) {
            System.out.printf("Age %d count is: %d\n", i, ageSums[i]);
        }
    }
}
