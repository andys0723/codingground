public ArrangeTwoTeam{
    ArrayList<Players> team1;
    ArrayList<Players> team2;
    
    public ArrangeTwoTeam(ArrayList<Players> team1, ArrayList<Players> team2){
        this.team1 = team1.sortHeightByHeight();
        this.team2 = team2.sortHeightByHeight();
    }
    
    public boolean validPlaceExists(){
        if(team1.size() != team2.size()){
            return false;
        }
        
        for(int i =0 ; i < team1.size(); i++){
            if(team1.get(i).compareTo(team2.get(i)) >=0){
                retrun false;
            }
        }
        
        return true;
    }
    

}