//********************************************************************************
// PantherID:  [2649014]
// CLASS: COP 2210 – [Spring 2017]
// ASSIGNMENT # [1]
// DATE: [February 1st, 2017]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************

package gloriouslotterymachine;

import java.util.Random;
import javax.swing.JOptionPane;

public class GloriousLotteryMachine {

    public static void main(String[] args) {

        String game = JOptionPane.showInputDialog(
                "Welcome to the Glorious Lottery Machine!"
                + " To play, please type either:"
                + " Lottery or Fantasy 5");

        Random lottoNum = new Random();
        int x = 1 + lottoNum.nextInt();

        if (game.equalsIgnoreCase("lottery")) {
            JOptionPane.showMessageDialog(null, "Here are your numbers: "
                    + lottoNum.nextInt(52)
                    + " "
                    + lottoNum.nextInt(52)
                    + " "
                    + lottoNum.nextInt(52)
                    + " "
                    + lottoNum.nextInt(52)
                    + " "
                    + lottoNum.nextInt(52)
                    + " "
                    + lottoNum.nextInt(52));
        } else if (game.equalsIgnoreCase("fantasy 5")) {
            JOptionPane.showMessageDialog(null, "Here are your numbers: "
                    + lottoNum.nextInt(35)
                    + " "
                    + lottoNum.nextInt(35)
                    + " "
                    + lottoNum.nextInt(35)
                    + " "
                    + lottoNum.nextInt(35)
                    + " "
                    + lottoNum.nextInt(35));
        } else {
            JOptionPane.showMessageDialog(null,
                    "Looks like you don't want to play");
        }

    }
}
