1class Solution {
2    public int lengthOfLastWord(String s) {
3         int num = 0 ;
4        for (int i= s.length() -1 ; i >=0 ;   i-- ) {
5            if (s.charAt(i) == ' ' && num ==0) {
6              continue;
7            } 
8            else if (s.charAt(i) == ' ' && num >0)  {
9             break;
10            } 
11             else {
12                num++;
13             }
14        }
15        return num;
16    }
17}