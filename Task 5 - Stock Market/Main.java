class Main{
    public static void main(String[] args) {
        int[] stock_prices = {7,6,4,3,1};

        int i, j, profit=0;
        
        for(i=0; i<stock_prices.length; i++){
            for(j=i+1; j<stock_prices.length; j++){
                if(stock_prices[j]-stock_prices[i]>profit)
                    profit = stock_prices[j]-stock_prices[i];
    
            
            }
        }
        System.out.println("Max Profit : " + profit);
    }
}