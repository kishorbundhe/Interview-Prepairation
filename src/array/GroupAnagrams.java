package array;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagram(str));
    }

    private static List<List<String>> groupAnagram(String[] str) {
            Map<String, ArrayList<String>> map = new HashMap<>();
            for (String s : str) {
                String copyOfS = new String(s);
                char[] chars = s.toCharArray();
                Arrays.sort(chars);
                String key = new String(chars);
                if (map.containsKey(key)) {
                    ArrayList<String> values = map.get(key);
                    values.add(copyOfS);
                    map.put(key, values);
                }else{
                    ArrayList add = new ArrayList<String>();
                    add.add(copyOfS);
                    map.put(key,add);
                }
            }
        List<List<String>> collection = map.values().stream().collect(Collectors.toList());
       Collections.sort(collection, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                return o1.size()- o2.size();
            }
        });
       return collection;
    }
}
