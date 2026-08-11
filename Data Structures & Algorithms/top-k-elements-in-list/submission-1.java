class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> unique = new HashMap<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++) {
            int n = nums[i];
            if (!unique.containsKey(n)) {
                unique.put(n, 1);
            } else {
                int count = unique.get(n);
                count += 1;
                unique.put(n, count);
            }
        }
        List<List<Integer>> bucket = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : unique.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue(); 
            bucket.add(new ArrayList<>(Arrays.asList(count, num)));
        }
        //[[1,1],[2,2],[3,3]}
        Collections.sort(bucket, (a, b) -> b.get(0) - a.get(0));
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < bucket.size(); i++) {
            result.add(bucket.get(i).get(1));
            k--;
            if (k == 0) {
                return result.stream().mapToInt(Integer::intValue).toArray();
            }
        }
        return new int[] {};
    }
}
