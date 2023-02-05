class Knapsack {

    public int solveKnapsack(int[] profits, int[] weights, int capacity) {

        int globalProfit = -1;
        for(int i = 0; i < weights.length; i++) {
            int currentWeight = weights[i];
            int currentProfit = profits[i];
            for (int j = i+1; j < weights.length; j++) {
                if (currentWeight >= capacity) {
                    break;
                }
                currentWeight += weights[j];
                currentProfit += profits[j];
            }
            if (globalProfit < currentProfit) {
                globalProfit = currentProfit;
            }
        }
        return globalProfit;
    }

    public static void main(String[] args) {
        Knapsack ks = new Knapsack();
        int[] profits = {1, 6, 10, 16};
        int[] weights = {1, 2, 3, 5};
        int maxProfit = ks.solveKnapsack(profits, weights, 7);
        System.out.println("Total knapsack profit ---> " + maxProfit);
        maxProfit = ks.solveKnapsack(profits, weights, 6);
        System.out.println("Total knapsack profit ---> " + maxProfit);
    }
}