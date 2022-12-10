    
    
    
    public static int beautifulBinaryString(String binary_string) {
        
        int result = 0;
        char[] charArray = binary_string.toCharArray();
        for (int i = 1; i <charArray.length-1 ; i++) {
            if (charArray[i-1] =='0' && charArray[i] =='1' && charArray[i+1] =='0' ){
                charArray[i+1]='1';
                result++;
            }
        }
        return  result;
    }
