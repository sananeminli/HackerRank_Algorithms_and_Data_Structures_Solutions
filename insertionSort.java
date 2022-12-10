//This java function solution for Hackerrank data structures question Insertation Sort.
//Question Link: https://www.hackerrank.com/challenges/insertionsort1/problem
    
    
    
    public static void insertionSort1(int n, List<Integer> arr) {
        for (int i = 0; i <n-1 ; i++) {
            int j = i+1;
            int left_value = arr.get(i);

            int next_value =  arr.get(j);
            
            while (left_value>next_value){
                arr.set(i,next_value);
                arr.set(j,left_value);
                String list = Arrays.toString(arr.toArray()).replace("[", "").replace("]", "").replace(",","").replace(String.valueOf(next_value) , String.valueOf(left_value) );
                System.out.println(list);
                i--;
                j--;
                left_value = arr.get(i);
                next_value = arr.get(j);
            }
        }
        String list = Arrays.toString(arr.toArray()).replace("[", "").replace("]", "").replace(",","");
        System.out.println(list);
    }
