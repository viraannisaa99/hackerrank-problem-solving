package hackerrank;

import java.util.*;

public class UsernameChanges {
	/*
     * Complete the 'possibleChanges' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY usernames as parameter.
     */

    public static List<String> possibleChanges(List<String> usernames) {
    	
    List<String> solutionStr = new ArrayList<String>();
    boolean flag = false;
    
    for(String username: usernames){
        flag = false; 
        
        String lower = username.toLowerCase();
        for(int i=0; i< lower.length(); i++){
            int x = lower.charAt(i);
            for(int j = i+1; j < lower.length(); j++){ 
                int y = lower.charAt(j);
                if(y < x){
                    flag = true;
                    break;
                }
            }
            if(flag){
                solutionStr.add("YES");
                break;
            }
        }
        if(!flag){
            solutionStr.add("NO");
        }
    }
    
    return solutionStr;
    }

}

