package hackerrank;

import java.util.*;

public class ActiveTraders {
	/*
     * Complete the 'mostActive' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY customers as parameter.
     * 
     */

    public static List<String> mostActive(List<String> customers) {
            	
        List<String> tradeSolution = new ArrayList<String>(); // create object from array list

        Map<String, Integer> map = new TreeMap<String, Integer>(); // sort collection by key from <key,value>
    
        for(int i = 0; i < customers.size(); i++){
            String key = customers.get(i); // get key from customer list
            if(map.containsKey(key)){ // boolean
                Integer count = map.get(key); 
                map.put(key, ++count); // increment value + push key-value to map
            }else{
                map.put(key, 1);
            }
        }

        // create a new set and store the key elements from map
        Set<String> mapKey = map.keySet(); // sort by key
        
        // display all data using foreach
        for(String key: mapKey){
            int count = map.get(key);
            double average = (double) (count) / (double) customers.size(); // get average (customer count / array length)
            double percent = average * 100; // get percent of average
            
            if(percent >= 5.0){
                tradeSolution.add(key); // if true, add key to arrayList
            }
        }
        
        return tradeSolution;
    }
}

/*
 * Step:
 * 
 * 1. Sort array berdasarkan key-value dengan map
 * 2. Count panjang array
 * 3. Get setiap key dari arrayList customers
 * 4. Check jika map memiliki key dari arrayList customers
 * 5. If true, count kemunculan customers dan push ke string key
 * 6. Create set baru untuk menampung key dari map
 * 7. Tampilkan data dengan foreach
 * 8. Hitung average dari frequency customer dibagi keseluruhan customer
 * 9. Jadikan dalam persen
 * 10. Jika persen >= 5.0, masukkan ke dalam arrayList tradeSolution
 * 
 */
