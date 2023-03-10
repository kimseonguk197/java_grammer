package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorClass {
    public static void main(String[] args) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(1, 10);
        m.put(2, 20);

        for(int a : m.keySet()){
            System.out.println(a);
        }

        Iterator<Integer> it = m.keySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
