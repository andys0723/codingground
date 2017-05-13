public void groupByAge(List<Person> people){
    Map<Integer, Integer> ageToCount = hashMap<>();
    for(Person p:people){
        if(ageCount.contains(p.age)){
            ageToCount.put(p.age, ageToCOunt.get(p.age) + 1);
        }else{
            ageToCount.put(p.age);
        }
    }
    
    Map<Integer, Integer> ageToOffset =  new HashMap<>();
    int offset = 0;
    for(Map.Entry<Integer, Integer> kc, ageToCount.entrySet()){
        ageToOffset.put(kc.getKey(), offset);
        offset += kc.getValue();
    }
    
    while(){
        
    }
    
}