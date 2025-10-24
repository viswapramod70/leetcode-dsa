class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) 
                merged.add(new int[]{interval[0], interval[1]});
            else {
                int[] last = merged.get(merged.size() - 1);
                last[1] = Math.max(last[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}