import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		List<Map<String, Object>> lm = Arrays.asList(new HashMap<>() {
			{
				put("id", "-id3-");
				put("name", "name1");
				put("age", "11");
				put("add", "add1");
			}
		}, new HashMap<>() {
			{
				put("id", "-id3-");
				put("name", "name2");
				put("age", "12");
				put("add", "add2");
			}
		}, new HashMap<>() {
			{
				put("id", "-id3-");
				put("name", "name3");
				put("age", "13");
				put("add", "add3");
			}
		});
		Map<Object, List<Map<String, Object>>> xx = lm.stream().filter(x -> x.get("id") != null && !x.get("id").equals(""))
		.collect(Collectors.groupingBy(x -> x.get("id")));
		
		for (Object x : xx.keySet()) {
			System.out.println("-- <> --");
			int i = 1;
			List<Map<String, Object>> lmTmp = xx.get(x);
			for (Map<String, Object> mapTmp : lmTmp) {
				System.out.println(mapTmp + " -> " + i++);
			}
		}
	}
}
























