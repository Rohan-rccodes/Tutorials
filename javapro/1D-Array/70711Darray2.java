import java.util.HashMap;
import java.util.Map;

class FrequencyCounter {
    public static void main(String[] args) {
       
        int[] array = {1, 2, 3, 4, 1, 2, 2, 3, 5, 4, 6, 7, 6, 8, 9, 9};

        
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        
        for (int element : array) {
           
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
               
                frequencyMap.put(element, 1);
            }
        }

        System.out.println("Element frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}