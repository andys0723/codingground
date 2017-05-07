Class Book implements Comparable<String>{
    int id;
    String name, auther, publisher;
    int quantity;
    Public Book(int id, String name, String auther, int quantity){
        this.id = id;
        String name   = name;
        String auther = auther;
        int quantity  = qunatity;
    }
    
    public comparableTo(Book b){
        if(this.id > b.id){
            return 1;
        }else if(this.id < b.id){
            return -1;
        }else{
            return 0;
        }
    }
}