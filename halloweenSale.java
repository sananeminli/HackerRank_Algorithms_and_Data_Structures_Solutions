    //This java function solution for Hackerrank question Halloween Sale.
    //Question Link: https://www.hackerrank.com/challenges/halloween-sale/problem
    
    
    
    
    
    public static int howManyGames(int price, int sale, int min_price, int capital) {
            if (price>capital) return 0;
            int res = 0;
            res++;
            capital-= price;
            while(price-sale> min_price&&capital-price>0){
                price-=sale;
                capital-=price;
                res++;
            }
            int remaining = capital/price;


        return res+remaining;
    }
