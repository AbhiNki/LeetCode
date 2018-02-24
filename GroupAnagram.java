package level_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] list ={"eat", "tea", "tan", "ate", "nat", "bat"};
		
		List<List<String>> result = groupAnagrams(list);
		System.out.println(result);
		

	}
	public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result =new ArrayList<List<String>>();
        Map<String, ArrayList<String>> map =new HashMap<String, ArrayList<String>>();
        
        for(String s : strs)
        {
            String key=sortChars(s);
            
            if(map.containsKey(key))
            {
            	ArrayList<String> tempInner =new ArrayList<String>();
            	tempInner=map.get(key);
            	tempInner.add(s);
                map.put(key, tempInner);
            }
            else
            {
            
            ArrayList<String> temp=new ArrayList<String>();
            temp.add(s);
            map.put(key, temp);
            }
        }
        
        
        for(String key :map.keySet())
        {
            result.add(map.get(key));
        }
        return result;
    }
    
    public static String sortChars(String s)
    {
        char[] chars =s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
