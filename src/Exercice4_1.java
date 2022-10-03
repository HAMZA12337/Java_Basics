import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Exercice4_1 {
    static void characterCount1(String inputString)
    {
        // collection
        TreeMap<Character, Integer> charCountMap = new TreeMap<Character, Integer>();
        //convert strong to array
        char[] strArray = inputString.toCharArray();
        for (char temp : strArray) {
            if (charCountMap.containsKey(temp)) {
                charCountMap.put(temp, charCountMap.get(temp) + 1);
            }
            else {
                charCountMap.put(temp, 1);
            }
        }
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }







    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentnece ");
       String str=sc.nextLine();
       // first version
        characterCount1(str);
        // second version
    }
} 