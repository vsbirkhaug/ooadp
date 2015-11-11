/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_classes;

/**
 *
 * @author VSB
 */
public class SingleGame extends Game {
    private Player homePlayer;
    private Player awayPlayer;

    public SingleGame(int homeScore, int awayScore) {
        super(homeScore, awayScore);
    }

    public void setHomePlayer(Player player) {
       this.homePlayer = player;
    }
    public Player getHomePlayer() {
       return this.homePlayer;
    }
    public void setAwayPlayer(Player player) {
       this.awayPlayer = player;
    }
    public Player getAwayPlayer() {
       return this.awayPlayer;
    }

}