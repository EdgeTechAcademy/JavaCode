import java.util.*;
import java.util.stream.Collectors;

public class Collect {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		Set<String> set = new HashSet<>();

		Map<Integer, String> map = new HashMap<>();
		int cnt = 0;

		while (true) {
			String str = Utils.getInput("Enter data: (show, map, join, stop, data to add to Collections)\n-> ");
			switch (str) {
				case "show":
					System.out.println(list.size() + ": list = " + list);
					System.out.println(set.size() + ": set  = " + set);
					System.out.println(map.size() + ": map  = " + map);
					continue;

				case "map":
					Set keys = map.keySet();
					Collection values = map.values();
					Set reduced = new HashSet(values);
					System.out.println("keys    = " + keys);
					System.out.println("values  = " + values);
					System.out.println("reduced = " + reduced);
					break;

				case "join":
					String joined = list.stream().map(Object::toString).collect(Collectors.joining(", "));
					System.out.println("joined = " + joined);
					break;

				case "stop":
					return;

				default:
					// Collections.sort(list);
					list.add(str);
					set.add(str);
					map.put(cnt++, str);
					break;
			}
		}
	}
}
