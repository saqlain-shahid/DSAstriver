import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {1, 2, 3, 4, 5, 2, 3, 1, 4, 1};

        // Creating a HashMap to store the count of each element
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Counting occurrences using a loop
        for (int num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Displaying the count of each element
        System.out.println("Element Counts:");
        for (int key : countMap.keySet()) {
            System.out.println(key + ": " + countMap.get(key));
        }

    }


}

