import java.util.TreeMap; 
class Main {
    public static void main(String[] args) {
        int arr[] = {7, 8, 9, 5, 6, 7, 8, 9, 8};
        TreeMap<Integer, Integer> a = new TreeMap<>();
        
        for (int a1 : arr) {
            if (a.containsKey(a1)) {
                a.put(a1, a.get(a1) + 1);
            } else {
                a.put(a1, 1);
            }
        }
        
        System.out.println(a);
    }
}