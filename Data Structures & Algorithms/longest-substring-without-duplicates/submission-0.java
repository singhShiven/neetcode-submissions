class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
       int left=0;
        int count=0,longest=0;
    for (int i=0;i<s.length();i++){
         while(set.contains(s.charAt(i))){
            set.remove(s.charAt(left));
            left=left+1;  
         }
         set.add(s.charAt(i));
        count=i-left+1;
        longest=Math.max(longest,count);
        
          
            

        
    }

     
            return longest;       
            
        }
     
    }

