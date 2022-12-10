    



public static List<Integer> serviceLane(int n,List<Integer> width, List<List<Integer>> cases) {
        List<Integer> result_array = new ArrayList<>();
        for(int i = 0;i<cases.size();i++){
            int temp = 999999999;
            for (int j = cases.get(i).get(0);j<=cases.get(i).get(1);j++){
                if (width.get(j)<temp) {
                    temp= width.get(j);
                }
            }
            result_array.add(temp);

        }
        return result_array;
    }
