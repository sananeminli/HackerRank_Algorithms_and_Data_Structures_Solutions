    //This java function solution for Hackerrank question Happy Ladybugs.
    //Question Link: https://www.hackerrank.com/challenges/happy-ladybugs/problem


public static String happyLadybugs(String b) {
            if(!b.contains("_")) {return "NO";}
        
        
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i)!='_'&&b.indexOf(b.charAt(i))==b.lastIndexOf(b.charAt(i)){
                return "NO";
            }
        }

    return "YES";
    }
