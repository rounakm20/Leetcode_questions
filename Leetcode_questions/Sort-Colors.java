1class Solution {
2    public void sortColors(int[] nums) {
3        int low = 0 ;
4        int high = nums.length-1 ;
5        int mid =  0 ;
6        while ( mid <= high ) {
7            if ( nums[mid] == 0) {
8                int temp = nums[low];
9                nums[low] = nums[mid] ;
10                nums[mid]= temp;
11                low++;
12                mid++ ;
13
14            }
15             else if (nums[mid] == 1 ) {
16                mid++;
17            }
18            else {
19                int temp = nums[mid];
20                nums[mid]= nums[high];
21                nums[high]= temp ;
22                high--;
23
24            }
25        }
26        return ;
27    }
28}