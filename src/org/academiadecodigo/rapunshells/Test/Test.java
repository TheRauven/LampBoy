package org.academiadecodigo.rapunshells.Test;

import org.academiadecodigo.rapunshells.Environment.Foreground;
import org.academiadecodigo.rapunshells.Game.Game;
import org.academiadecodigo.rapunshells.Game.Screen1;
import org.academiadecodigo.rapunshells.Game.Screen2;
import org.academiadecodigo.rapunshells.Grid.Grid;
import org.academiadecodigo.rapunshells.Player.Player;

public class Test {

    public static void main(String[] args) {

        new Grid();
       new Screen1().BackGround1();
        //new Screen2().BackGround2();
        Player player = new Player();

        Foreground.drawFloor();
        try{
            Game.executeOrders(player);
        } catch (Exception e) {
            System.out.println("Thread sleep busted");
        }
    }
}
