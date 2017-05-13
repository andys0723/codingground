class Team{
    List<Player> players;
    public Team(List<Integer> height){
        players = new ArrayList<Player>(height.size());
        for(int i =0l i < height.size(); i++){
            palyers.add(new Player(height.get(i)));
        }
    }
    
    public sortHeightByHeight(){
        Collections.sort(players);
    }
}