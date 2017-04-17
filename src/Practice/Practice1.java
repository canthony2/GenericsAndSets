package Practice;

import java.util.ArrayList;

/**
 *
 * @author canthony2
 */
public class Practice1 {
    public static void main(String[] args) {
        
//        Manual Boxing and Unboxing
//        Integer x = new Integer(1);
//        int primitive = x.intValue();

        //Automatic Boxing and Unboxing
        Integer x = 1;
        int primitve = x;
        
        //Type Wrapper classes
        //int ---> Integer
        //long ---> Long
        //double ---> Double
        //etc...
        
        //Wrong way
        ArrayList list = new ArrayList();
        
        list.add("hello");
        list.add(1);
        Object value = list.get(1);
        


    }
}
