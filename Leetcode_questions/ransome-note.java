class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> have = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            have.put(ch, have.getOrDefault(ch, 0) + 1);
        }

        for (char c : need.keySet()) {
            int neededCount = need.get(c);
            int haveCount = have.getOrDefault(c, 0);

            if (haveCount < neededCount) {
                return false;
            }
        }

        return true;
    }
}
