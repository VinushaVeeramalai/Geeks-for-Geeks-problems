public class max_consecutive_ones {
    
        public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int current = 0;

        for (int num : nums) {
            if (num == 1) {
                current++;
                maxCount = Math.max(maxCount, current);
            } else {
                current = 0;
            }
        }

        return maxCount;
    }
}
