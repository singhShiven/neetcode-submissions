class Solution {
    public int characterReplacement(String s, int k) {
HashMap<Character, Integer> map=new HashMap<Character, Integer>();
int left=0,max=0,longest=0;
for (int i=0;i<s.length();i++){
 map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0) + 1); 
 max=Math.max(max,map.get(s.charAt(i)));
while ((i - left + 1) - max > k) {
    map.put(s.charAt(left),map.get(s.charAt(left))-1);
    left++;

}
longest=Math.max(longest,i-left+1);

}



    return longest;    
    }
}
