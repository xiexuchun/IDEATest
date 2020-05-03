import java.util.HashMap;

/**
 * @author xie_xuchun
 * @create 2020-05-03 14:25
 */
public class Test {
    public static void main(String[] args) {
        HashMap<String, String> stringHashMap = new HashMap<>();

        stringHashMap.put("name","tom");
        stringHashMap.put("age","22");
        stringHashMap.put("sex","男");

        String sex = stringHashMap.get("sex");
        System.out.println(sex);


        stringHashMap.remove("age");
        System.out.println(stringHashMap);

    }

}
