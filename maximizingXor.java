    //This java function solution for Hackerrank question Maximizing XOR.
    //Question Link: https://www.hackerrank.com/challenges/maximizing-xor/problem
    
    
    public static int maximizingXor(int l, int r) {
        if (r-l==1) {return l^r;}
    
            int max= 0;
        for (int i = l; i <r ; i++) {
            for (int j = l+1; j <r ; j++) {
                int a = i^j;
                if (a>max){
                    max  = a;
                    
                }
            }

        }
        
        return max;

    }
