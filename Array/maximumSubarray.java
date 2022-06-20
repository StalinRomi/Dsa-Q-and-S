// Q - Find continous subarray, which has largest sum.

// Eg. I/O -> nums = [-2,1,-3,4,-1,2,1,-5,4]
    
//     O/P -> 6   (4,-1,2,1  ->   6)

// Add up each element to variable 'sum' and keep maximum of current sum, in variable 'maxNo'  

public int maxSubarray(int[] ar){
      
      int len = ar.length;
      int maxNo = Integer.MIN_VALUE;
      int sum = 0;

      for (int i = 0; i < len; i++){
          
          sum += nums[i];
          max = Math.max(sum, maxNo);
        
        // if sum is a negative no then no point in keeping it
          if (sum < 0) sum = 0;
      }
      return sum;
}    