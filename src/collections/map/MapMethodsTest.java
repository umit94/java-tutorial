package collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapMethodsTest {
    public static void main(String[] args) {
        //TreeMap comparable olan classları sıralayarak tutar. Comparable olmayanlar için comparator nesnesi geçilebilir.
        //HashMap sırasız şekilde tutar ancak elemanlara erişim, ekleme, çıkarma konusunda TreeMap'den daha performanslıdır.

        Map<String,String> map = new HashMap<>();
        map.put("Key","Value"); //Map'e ekleme yapar, eğer aynı key zaten map içerisinde bulunuyorsa bunun value'sunu değiştirir. Aynı key bulunuyorsa eski value'yu döndürür, bulunmuyorsa null döndürür.
        map.putIfAbsent("Key","Value"); //Aynı key map içerisinde bulunmuyorsa ekler.
        map.get("Key"); // Key'in value'sunu döndürür, key yoksa null döndürür
        map.getOrDefault("Key","DefaultValue"); // Key'in value'sunu döndürür, key yoksa geçilen default value'yü döndürür
        map.put("Key2","Value2");
        map.remove("Key2"); // Silme işlemi yapar. Opsiyonel olarak value da geçilebilir, bu durumda silmek için hem value hem key eşleşmesi gerekmektedir
        map.replace("Key","New Value"); // Değiştirir. Opsiyonel olarak old value da geçilebilir, bu durumda silmek için hem old value hem key eşleşmesi gerekmektedir
        map.replaceAll((key,value)->value+"1"); //Geçilen BiFunction ile tüm valuelar değiştirilebilir
        System.out.println(map);

        map.merge("Key","Merge Value",(key,value)->value+1); // Key yoksa veya value null ise BiFunction ile döndürülen value geçilir
        System.out.println(map);

        map.compute("Key",(key,value)->"Value"+1); // Key için yeni value değeri belirler. Key bulunmadığı takdirde exception fırlatır, key'in olduğundan emin olduğumuz durumlarda kullanılmalı
        System.out.println(map);

        map.computeIfPresent("Key",(key,value)->value+1); // Key için yeni value değeri belirler. Key bulunmadığı takdirde hiçbir şey yapmaz.
        System.out.println(map);

        map.put("Key3",null);
        map.computeIfAbsent("Key3",(key)->key); // Key yoksa oluşturup Function ile döndürülen value geçilir.
        System.out.println(map);

        Map map2 = Map.of("Key1","Value1","Key2","Value2"); // Unmodifiable (Immutable) map oluşturur
        System.out.println(map2);
    }
}
