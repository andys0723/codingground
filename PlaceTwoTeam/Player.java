public Player implements Comparable<Player>{
    public Integer height;

    public Player(Integer height){
        this.height = height;
    }
    
    @overide
    public int compareTo(Player that){
        return Integer.compare(this.height, that.height );
    }
}
