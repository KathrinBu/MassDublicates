import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

// Посчитать сколько раз каждое значение встречается в массиве

public class Main {
    public static void main(String[] args) {
        int [] mass=new int[10];
        create(mass);
        joinMap(mass);
    }

    public static int [] create(int [] mass){
        Random random=new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i]= random.nextInt(10);
        }
        System.out.println(Arrays.toString(mass));
        return mass;
    }

    public static void joinMap(int [] mass){
        Map<Integer, Integer> map=new HashMap<>();
        for (int i:mass) {
            if (map.containsKey(i)){
                map.put(i,(map.get(i)+1));
           }
            else {
                map.put(i,1);
            }
//            for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
//                if (! entry.getValue().equals(1)) {
//                //    System.out.println("число " + entry.getKey() + " , повторяется " + (entry.getValue() + 1) + " раз");
//
//                }
//            }
        }
        System.out.println(map);
    }
}
