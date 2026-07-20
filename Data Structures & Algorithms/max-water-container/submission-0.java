class Solution {
    public int maxArea(int[] heights) {
     int water,height,dist;
          int left=0;
        int right=heights.length-1;
        int max=0;
     while(left<right){
        height=Math.min(heights[left],heights[right]);
        water=(right-left)*height;
         max=Math.max(max,water);
         if(heights[left]<heights[right])
            left++;
         else
            right--;   
         
         
     }   
     return max;
    
    }
    
}
