import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Container<Integer, String> container = new Container<>(22, "Hello");
        Container<Double, Integer> container2 = new Container<>(22.65, 35);
        // The data type of the generics are instantiated in the constructor.
        int i = container.getItem1();
        String ia = container.getItem2();
        System.out.println(i);
        System.out.println(ia);

        Set <String> set1 = new HashSet<>();
        set1.add("First");
        set1.add("Second");
        set1.add("Third");
        set1.add("Forth");

        Set <String> set2 = new HashSet<>();
        set2.add("First");
        set2.add("Second");
        set2.add("Third");
        set2.add("Forth");

        Set <String> resultSet = union(set1, set2);

        Iterator <String> itr = resultSet.iterator();
        while(itr.hasNext()) {
            String var = itr.next();
            System.out.println(var);
            
        }
    }

    public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
// The type parameters for methods are defined before the return value <E> union
// The <E> before set is a placeholder for the Type being passed to the entire method.


}
