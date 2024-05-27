class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0, rsum = 0, maxSum = 0;
        int n = cardPoints.length;
        for (int i = 0; i < k; i++)
            lsum = lsum + cardPoints[i];
        maxSum = lsum;

        int rightIndex = n - 1;
        for (int j = k - 1; j >= 0; j--) {
            lsum = lsum - cardPoints[j];
            rsum = rsum + cardPoints[rightIndex];
            rightIndex -= 1;

            maxSum = Math.max(maxSum, (lsum + rsum));
        }
        return maxSum;
    }
}

class Max_Points_From_Card{
    public static void main(String[] args) {
        int[] cardPoints = {6,2,3,4,7,2,1,7,1};
        int k = 4;
        Solution solution = new Solution();
        System.out.println("Maximum points from card: " + solution.maxScore(cardPoints, k));
    }
}