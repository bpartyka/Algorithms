import java.util.*;

public class ListTest {

    List<String> list1 = new ArrayList<>();

    public List<String> fun() {
        list1.add("1");
        list1.add("2");

        Iterator iterator = list1.iterator();

        if (iterator.hasNext()) {
            iterator.next();
            iterator.remove();

        }
        return list1;
    }


}
