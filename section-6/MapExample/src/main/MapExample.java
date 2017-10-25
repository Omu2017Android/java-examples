package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author sentinel
 */
public class MapExample {

    public static void main(String[] args) {

        Map<String, String> countryCodes = new HashMap<>();

        if (countryCodes.isEmpty()) {
            System.out.println("countryCodes is empty!");
        }

        countryCodes.put("US", "Amerika Birleşik Devletleri");
        countryCodes.put("TR", "Türkiye");
        countryCodes.put("CY", "Kıbrıs");
        countryCodes.put("FR", "Fransa");
        countryCodes.put("UK", "İngiltere");

        if (!countryCodes.isEmpty()) {
            System.out.println("countryCodes not empty!");
        }

        System.out.println("countryCodes: " + countryCodes);
        System.out.println("keySet: " + countryCodes.keySet());
        System.out.println("values: " + countryCodes.values());
        System.out.println("entrySet: " + countryCodes.entrySet());

        System.out.println("TR code country name: " + countryCodes.get("TR"));

        System.out.println("Is Cyprus in the map? " + countryCodes.containsValue("Kıbrıs"));
        System.out.println("Is Iraq in the map? " + countryCodes.containsValue("Irak"));

        System.out.println("Is UK code in the map?" + countryCodes.containsKey("UK"));

        countryCodes.forEach((k, v) -> {
            if (k.equals("FR")) {
                System.out.println("Continue...");
                return;
            }
            System.out.println("Country Code(key): " + k + " Country(value): " + v);
        });

        for (Map.Entry<String, String> entry: countryCodes.entrySet()) {
            System.out.println("entry code: " + entry.getKey() + " entry value: " + entry.getValue());
        }

        countryCodes.clear();

        System.out.println("countryCodes result after clear: " + countryCodes);

        Map<String, List<String>> countryCities = new HashMap<>();

        countryCities.put("Türkiye", Arrays.asList("Ankara", "İstanbul", "İzmir", "Bayburt"));
        countryCities.put("İngiltere", Arrays.asList("Londra", "Manchester", "Oxford"));

        for (Map.Entry<String, List<String>> entry: countryCities.entrySet()) {
            System.out.print("Country: " + entry.getKey() + " -> ");
            
            entry.getValue().forEach(cities -> {
                System.out.print(cities + ", ");
            });
            
            System.out.println();
        }
    }

}
