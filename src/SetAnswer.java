
import java.util.*;

public class SetAnswer {
    public static void main(String[] args) {
        HashSet <String> uniqueVisitors = new HashSet<String>();
        uniqueVisitors.add("Петя");
        uniqueVisitors.add("Анна");
        uniqueVisitors.add("Сергей");
        uniqueVisitors.add("Яшка");
        uniqueVisitors.add("Феодосий");
        uniqueVisitors.add("Гавриил");
        uniqueVisitors.addAll(Arrays.asList(args));


        System.out.println("Уникальные посетители:");
        System.out.println(uniqueVisitors);

        List sortedList = new ArrayList(uniqueVisitors);
        Collections.sort(sortedList);

        System.out.println(sortedList);
        }
    }

