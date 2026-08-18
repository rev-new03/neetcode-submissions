class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        String s2 = Arrays.toString(s1);
        String t2 = Arrays.toString(t1);
        if(s2.equals(t2)){
            return true;
        }
        return false;
    }
}
