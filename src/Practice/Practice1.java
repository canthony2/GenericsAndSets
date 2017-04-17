package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author canthony2
 */
public class Practice1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        
        list.add("Beer");
        list.add("Chips");
        list.add("Vodka");
        list.add("Beer");
        
        for (String item : list) {
            System.out.println(list);
        }
        
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
    }
}
