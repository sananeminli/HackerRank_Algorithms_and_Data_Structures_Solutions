//This java function solution for Hackerrank question ACM ICPC Team.
//Question Link: https://www.hackerrank.com/challenges/acm-icpc-team/problem  

public static List<Integer> acmTeam(List<String> topic) {
        
        int max_topic_num = 0;
        int student_num= topic.size();
        int topic_num = topic.get(0).length();

        int known_num = 0;

        for (int i = 0; i <student_num ; i++) {
            for (int j = i+1; j < student_num; j++) {
                int sum = 0;

                for (int k = 0; k < topic_num; k++) {
                    int inside_sum = Integer.valueOf(String.valueOf(topic.get(i).charAt(k))) +Integer.valueOf(String.valueOf(topic.get(j).charAt(k)));
                    if (inside_sum==2) {
                        sum++;
                        continue;
                    }
                    sum+=inside_sum;
                }
                if (sum>max_topic_num){
                    max_topic_num = sum;
                    known_num=1;

                }
                else if (sum==max_topic_num){
                    known_num++;
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<>();

        System.out.println(max_topic_num);
        System.out.println(known_num);
        res.add(max_topic_num);
        res.add(known_num);
        return  res;
    }
