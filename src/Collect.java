import java.util.*;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        HashMap<Integer, String> map = new HashMap<>();
        int cnt = 0;
        while (true) {

            System.out.print("Enter data: ");
            String str = sc.nextLine();
            switch (str) {
                case "show":
                    System.out.println(list.size() + ": list = " + list);
                    System.out.println(set.size() + ": set = " + set);
                    System.out.println(map.size() + ": map = " + map);
                    continue;
                case "stop":
                    break;
                case "map":
                    Set keys = map.keySet();
                    Collection values = map.values();
                    System.out.println("keys = " + keys);
                    System.out.println("values = " + values);
                    break;
                case "join":
                    String joined = list.stream()
                                        .map(Object::toString)
                                        .collect(Collectors.joining(", "));
                    System.out.println("joined = " + joined);
                    break;
            }

            Collections.sort(list);
            list.add(str);
            set.add(str);
            map.put(cnt++, str);
        }

    }
}
