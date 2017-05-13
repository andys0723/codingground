public class Person implements Comparable<Persion>{
    public Integer age;
    public String  name;
    
    public Persion(Interger age, String name){
        this.aga  = age;
        this.name = name;
    }
    
    @overide
    public int ccompareTo(Person p){
        return Integer.compare(age, p.age);
    }
}