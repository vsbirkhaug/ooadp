/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_classes;

import java.util.ArrayList;

/**
 *
 * @author VSB
 */
public class DoubleGame extends Game {
//    private Player[] homePlayers;
//    private Player[] awayPlayers;
//    
//    public Player[] getHomePlayer() {
//        return homePlayers;
//    }
//
//    public void setHomePlayer(Player[] homePlayers) {
//        this.homePlayers = homePlayers;
//    }
//
//    public Player[] getAwayPlayer() {
//        return awayPlayers;
//    }
//
//    public void setAwayPlayer(Player[] awayPlayers) {
//        this.awayPlayers = awayPlayers;
//    }

    public DoubleGame(Player[] homePlayers, int homeScore, Player[] awayPlayers, int awayScore) {
        super(homePlayers, homeScore, awayPlayers, awayScore);
//        setHomePlayer(homePlayers);
//        setAwayPlayer(awayPlayers);
    }

//    public void addHomePlayer(Player player) {
//      if(homePlayers == null) {
//        homePlayers = new Player[2];
//      }
//      if(homePlayers.length < 2) {
//          if(homePlayers[0] == null) {
//              homePlayers[0] = player;
//          } else if (homePlayers[1] == null) {
//              homePlayers[1] = player;
//          } else {
//                  //TODO error message saying team is full
//          }
//      } else {
//        //TODO some error that says you cannot add more playes
//      }
//    }
//    
//    public void addAwayPlayer(Player player) {
//      if(awayPlayers == null) {
//        awayPlayers = new Player[2];
//      }
//      if(awayPlayers.length < 2) {
//          if(awayPlayers[0] == null) {
//              awayPlayers[0] = player;
//          } else if (awayPlayers[1] == null) {
//              awayPlayers[1] = player;
//          } else {
//                  //TODO error message saying team is full
//          }
//      } else {
//        //TODO some error that says you cannot add more playes
//      }
//    }
}
