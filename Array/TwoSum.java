// Q - Add 2 Integers at different indexes to get target

// Eg. I/O ->  nums = [2,7,11,15]
//             Target = 9  

//     O/P  -> [0,1]      (nums[0] = 2 + nums[1] = 7  -> 9)


public int[] twoSum(int[] nums, int target){
     
     int first = 0; 
     int second = 1;
     int[] ansArray = new int[2];
     int len = nums.length;

 //  We're taking 2 Pointers(first, second), 1st one -> 0th index, 2nd one -> 1st index. 
//   When 2nd Pointer reaches last index we increment 1st pointer by 1 and start 2nd pointer starts from (first + 1).

     while(i < len){
          
          if (num[i] + num[j] == target){
                ansArray[0] = first;
                ansArray[1] = second;
                break;
          }

          if (j >= len - 1){
                first += 1;
                second = 1;
          }
          second +=1;
     }
     return ansArray;
}