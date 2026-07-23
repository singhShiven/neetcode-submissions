class Solution {
    public boolean checkInclusion(String s1, String s2) {
       HashMap<Character, Integer> map1=new  HashMap<>();
       HashMap<Character, Integer> map2 = new HashMap<>();
       int left=0;
      for(int i=0;i<s1.length();i++){
        map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i), 0) + 1);
      }
      for(int i=0;i<s2.length();i++){
         map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i), 0) + 1);
        if(map1.equals(map2))
         return true;
         while ((i - left + 1) == s1.length()) {
                char c = s2.charAt(left);
                int newVal = map2.get(c) - 1;

                // CRITICAL FIX: Remove key if value becomes 0
                if (newVal == 0) {
                    map2.remove(c);
                } else {
                    map2.put(c, newVal);
                }
                
                left++;
            }
        }
        return false;
    }
}