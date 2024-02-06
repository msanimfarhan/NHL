

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class NHLStats {

    private LinkedList<PlayerRecord> players = new LinkedList<PlayerRecord>();

    public void addPlayer(PlayerRecord player){
        players.add(player);
    }

    public void displayPlayerNameAndTeam(){
        int highest=0;
        LinkedList<PlayerRecord> maxPlayers = new LinkedList<>();

        for(int i=0; i<players.size();i++){
            int x = players.getAt(i).getPoints();
//        [1,4,5,3,5,7,5,7]
            if(x>=highest){
                if(x == highest){

                    maxPlayers.add(players.getAt(i));

                }else{ /* Hello */
                    maxPlayers.clear();
                    highest = x;
                    maxPlayers.add(players.getAt(i));
                }


            }
        }

        for(int i=0; i<maxPlayers.size();i++){
            System.out.println(maxPlayers.getAt(i).getName()+" "+ maxPlayers.getAt(i).getTeamName());
        }



    }

    public void displayMostAgressivePlayer(){
        LinkedList<PlayerRecord> agressivePlayer = new LinkedList<>();
        int highest=0;

        for(int i=0; i< players.size();i++){
            int x = players.getAt(i).getPenaltyMin();

            if(x>=highest){
               if(x == highest){
                   agressivePlayer.add(players.getAt(i));
               }else{
                   agressivePlayer.clear();
                   highest=x;
                   agressivePlayer.add(players.getAt(i));
               }


            }
        }

        for(int i=0; i<agressivePlayer.size();i++){
            System.out.println(agressivePlayer.getAt(i).getName()+ " "+ agressivePlayer.getAt(i).getTeamName()+" "+ agressivePlayer.getAt(i).getPosition());

        }

    }


    public void displayMvp(){
        LinkedList<PlayerRecord> mvpPlayer = new LinkedList<>();
        int highest =0;

        for(int i=0; i< players.size(); i++){
            int x = players.getAt(i).getGameWinGoal();
            if(x>= highest){
                if(x == highest){
                    mvpPlayer.add(players.getAt(i));

                }
                mvpPlayer.clear();
                highest=x;
                mvpPlayer.add(players.getAt(i));
            }
        }

        for(int i=0; i< mvpPlayer.size();i++){
            System.out.println(mvpPlayer.getAt(i).getName()+" "+mvpPlayer.getAt(i).getTeamName());
        }
    }


    public void displayPromisingPlayer(){
        LinkedList<PlayerRecord> promisingPlayer = new LinkedList<>();
        int highest =0;

        for(int i=0; i< players.size(); i++){
            int x = players.getAt(i).getGameWinGoal();
            if(x>= highest){
                if(x == highest){
                    promisingPlayer.add(players.getAt(i));

                }
                promisingPlayer.clear();
                highest=x;
                promisingPlayer.add(players.getAt(i));
            }
        }

        for(int i=0; i< promisingPlayer.size();i++){
            System.out.println(promisingPlayer.getAt(i).getName()+" "+promisingPlayer.getAt(i).getTeamName());
        }
    }


    public void displayBestpenaltyTeam(){
        Map<String, Integer> mp = new HashMap<>();

        for(int i = 0;i< players.size();i++){
            String name = players.getAt(i).getTeamName();
            int score = players.getAt(i).getPenaltyMin();

           if(mp.containsKey(name)){
               score += mp.get(name);
               mp.put(name,score);
           }else{
               mp.put(name,score);

           }
        }

        int highest=0;
        String teamName = null;
        for(String key: mp.keySet()){
            if(highest<mp.get(key)){
                highest = mp.get(key);
                teamName = key;
            }
        }
        System.out.println(teamName);
    }



    public void displayGameWinGoals(){
        Map<String,Integer> mp = new Hashtable<>();

        for(int i=0;i<players.size();i++) {
            String name = players.getAt(i).getTeamName();
            int goalCount = players.getAt(i).getGameWinGoal();

            if (mp.containsKey(name)) {
                goalCount += mp.get(name);
                mp.put(name, goalCount);
            } else {
                mp.put(name, goalCount);
            }
        }

            int highest = 0;
            String teamName= null;
            for(String key: mp.keySet()){
                if(highest<mp.get(key)){
                    highest = mp.get(key);
                    teamName = key;
                }
            }
            System.out.println(teamName);
        }





}

