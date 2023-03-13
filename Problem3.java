package Java;

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("d34", "g54", "d12", "b87", "g1", "c65", "g40", "g5", "d77");

        // Sort the list in ascending order with respect to the first character
        Collections.sort(inputList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.charAt(0) - s2.charAt(0);
            }
        });
        System.out.println("L1: " + inputList);

        List<String> l1 = new ArrayList<>(inputList);
        List<String> l2 = new ArrayList<>();

        // Sort the strings in descending order with respect to the number formed by the remaining characters
        for (int i = 0; i < l1.size(); i++) {
            String firstChar = l1.get(i).substring(0, 1);
            int j = i + 1;
            while (j < l1.size() && l1.get(j).startsWith(firstChar)) {
                j++;
            }
            List<String> sublist = l1.subList(i, j);
            Collections.sort(sublist, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    int num1 = Integer.parseInt(s1.substring(1));
                    int num2 = Integer.parseInt(s2.substring(1));
                    return num2 - num1;
                }
            });
            l2.addAll(sublist);
            i = j - 1;
        }

        // Print the two lists
        
        System.out.println("L2: " + l2);
    }
}
