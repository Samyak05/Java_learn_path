class MaxSubarraySum {
    public int maxSubarraySum(int[] arr, int k) {
        int i=0, j=0, sum = 0;

        for(j =0; j<k; j++){
            sum += arr[j];
        }
        int max = sum;

        while(j<arr.length){
            sum += arr[j];
            sum -= arr[i];
            j++;
            i++;
            max = Math.max(sum,max);
        }
        return max;
    }

    public static void main() {
        MaxSubarraySum s = new MaxSubarraySum();
        System.out.println(s.maxSubarraySum(new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20}, 4));
    }
}