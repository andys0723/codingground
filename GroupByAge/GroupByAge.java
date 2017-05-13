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
    
    while(!ageToOffset.isEmpty()){
        Map.Entry<Integer, Integer> from = ageToOffset.iterator().next();
        Integer toAge   = people.get(from.getValue()).age;
        Integer toValue = ageToOffset.get(toAge);
        Collections.swap(people, from.getValue(), toValue);
        Integer count = ageToCount.get(toAge) - 1;
        agetToCount.put(toAge, count);
        if(count > 0){
            ageToOffset.put(toAge, tovalue + 1);
        }else{
            ageToOffset.remove(toAge);
        }
        
    }
    
}
