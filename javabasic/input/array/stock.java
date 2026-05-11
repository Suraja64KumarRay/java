public class stock {
    public static int buysellstck(int prices[])
    {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0;i<prices.length;i++)
        {
            if (buyprice<prices[i]) {
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit, profit);
            }
            else {
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args)
    {
        int prices[]={7,1,5,3,6,4};   // I will buy at 1 and sell at 6 to get the maximum profit which is 5. But not at starting price 7 which we can not sell to get profit.
        System.out.println(buysellstck(prices));
    }
} 
