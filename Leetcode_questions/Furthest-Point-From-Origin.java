1class Solution {
2    public int furthestDistanceFromOrigin(String moves) {
3        int countL = 0 ; 
4        int countR = 0 ;
5        int countm = 0 ;
6        for (int i = 0 ; i< moves.length() ; i ++) {
7            if(moves.charAt(i)== 'L') {
8                countL++;
9            } else if ( moves.charAt(i) == 'R') {
10                countR++;
11            } else {
12                countm++;
13            }
14        }
15        int Distance =  Math.abs(countR - countL) + countm;
16        return Distance;
17    }
18}