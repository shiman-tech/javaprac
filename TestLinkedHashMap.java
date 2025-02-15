import java.util.LinkedHashMap;
import java.util.Map;




public class TestLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();

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

        
    }
}

