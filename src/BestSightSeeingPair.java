public class BestSightSeeingPair {
    public int maxScoreSightseeingPair(int[] a) {
        int max_so_far = a[0];
        int result = 0;
        for (int i = 1; i < a.length; i++) {
            result = Math.max(result, max_so_far + a[i] - i);
            max_so_far = Math.max(max_so_far, a[i] + i);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] grid = {8,1,5,2,6};
        System.out.println(new BestSightSeeingPair().maxScoreSightseeingPair(grid));
    }
}
