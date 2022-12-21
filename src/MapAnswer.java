import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapAnswer {
    public static void main(String[] args) {
        HashMap<Integer, String> visitorTovisits = new HashMap<>();
        visitorTovisits.put(4, "Vasya");
        visitorTovisits.put(3, "Marfa");
        visitorTovisits.put(1,"Feodosii");
        visitorTovisits.put(2,"Gavriil");

        var visitorToVisitsCount = getAnswer(args);
        System.out.println("Наши посетители:");
        System.out.println(visitorTovisits);

    }

    public static Map<String, Integer> getAnswer(String[] visitors) {
        if (visitors.length == 0) {
            return Collections.emptyMap();
        }

        var visitorToVisitsCount = new HashMap<String, Integer>();
        for (String visitor : visitors) {
            Integer visitsSoFar = visitorToVisitsCount.getOrDefault(visitor, 0);
            visitorToVisitsCount.put(visitor, visitsSoFar + 1);
        }

        return visitorToVisitsCount;
    }
}