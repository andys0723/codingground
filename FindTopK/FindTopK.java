public class FinDTopK{


  public static List<String> topK(int k, Iterator<String> iter){
      PriorityQueue<String> minHeap
      = new PriorityQueue<>(k, new Comparator<String>{
         public int compare(String s1, String s2){
            return Integer.compare(s.length(), s2.length());   
         }
        } 
      )
      
      while(iter.hasNext()){
          minHeap.add(iter.next());
          if(minHeap.size() > k){
            //Remove the shortest string, Note that the comparison function above
            //will order the string by length
            minHeap.poll();
              
          }      
      }
  }

}
