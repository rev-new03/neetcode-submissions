class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> sortedArray = new ArrayList<>();
        List<List<Integer>> value = new ArrayList<>();
        HashMap<Integer, String> original = new HashMap<>();
        HashMap<String, List<Integer>> matched = new HashMap<>();
        for(int i=0; i<=strs.length - 1; i++){
            original.put(i, strs[i]);
        }
        for (int i = 0; i <= strs.length - 1; i++) {
            String s = strs[i];
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            sortedArray.add(sorted);
        }
        for (int j = 0; j <= sortedArray.size() - 1; j++) {
            for (int k = j; k < sortedArray.size(); k++) {
                if (sortedArray.get(j) == sortedArray.get(k)) {
                    String key = sortedArray.get(j);
                    if (!matched.containsKey(key)) {
                        matched.put(key, new ArrayList<>());
                    }
                    matched.get(key).add(k); // act:[1]
                }
            }
        }

        for (Map.Entry<String, List<Integer>> entry : matched.entrySet()) {
            value.add(entry.getValue()); // store each value in an array and combined in another
        }

        List<List<String>> result = new ArrayList<>();
        for (int l = 0; l <= value.size() - 1; l++) {
            List<String> temp = new ArrayList<>();
            for (int m = 0; m < value.get(l).size(); m++) {
                int index = value.get(l).get(m);
                String val = original.get(index);
                temp.add(val);
            }
            result.add(temp);
        }
        return result;
        // convert each string in the list of array back to its original string
    }
}