import java.util.TreeMap;
import java.util.Map;




public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> map=new TreeMap<>();

        map.put("Shiman",100);
        map.put("Akshay",95);
        map.put("Lingesh",95);
        map.put("BabuBoi",90);

        System.out.println(map);

        System.out.println(map.containsKey("Lingesh"));

        System.out.println(map.containsValue(90));

        System.out.println(map.get("Shiman"));

        System.out.println(map.size());

        System.out.println(map.isEmpty());

        map.remove("BabuBoi");
        System.out.println(map);

        for(String e:map.keySet())
        {
            System.out.println(e+" "+map.get(e));

        }

        for(Map.Entry<String,Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println(map.firstEntry());

        System.out.println(map.lastEntry());

        System.out.println(map.firstKey());

        System.out.println(map.lastKey());

        System.out.println(map.higherEntry("Akshay"));

        System.out.println(map.lowerEntry("Shiman"));

        System.out.println(map.ceilingEntry("Akshay"));

        System.out.println(map.floorEntry("Shiman"));

    }
}

