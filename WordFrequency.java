import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class F_WordFrequency {
    public static void main(String[] args) {
        String n;
            try (BufferedReader bfr = new BufferedReader(new FileReader("/home/vijay/Desktop/Tring_Apps Assignment/Data Structure/a.txt"))) 
            {
                HashMap<String,Integer> map = new HashMap<>();
                
                while ((n = bfr.readLine()) != null) 
                {
                    String words[] = n.split(" ");
                    for (int i = 0; i < words.length; i++) 
                    {
                        if(map.containsKey(words[i]))
                            map.put(words[i],map.get(words[i])+1);
                        else
                            map.put(words[i],1);
                    }

    Stream<Entry<String, Integer>> sorted=  map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        sorted.forEach(System.out::println);
                }
            } 
            catch (Exception e) 
            {
            System.out.println(e);
            }    
    }
}
