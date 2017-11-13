/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexam2a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S530719
 */
public class PacmanDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
       
        Scanner scan = new Scanner(new File("PacmanMaze.txt"));
        while (scan.hasNext()) {
            ArrayList<TerrainBlock> terrain = new ArrayList<>();
            Pacman pacman = new Pacman();
            String c = scan.nextLine();
            for (int i = 0; i < c.length(); i++) {
                switch (c.charAt(i)) {
                    case '*':
                        terrain.add(new TerrainBlock(false, null));
                        break;
                    case 'O':
                        terrain.add(new TerrainBlock(true, null));
                        break;
                    case 'B':
                        terrain.add(new TerrainBlock(false, new Ghost(2, "Blinky", 40)));
                        break;
                    case 'Y':
                        terrain.add(new TerrainBlock(false, new Ghost(2, "Pinky", 30)));
                        break;
                    case 'I':
                        terrain.add(new TerrainBlock(false, new Ghost(1, "Inky", 20)));
                        break;
                    case 'C':
                        terrain.add(new TerrainBlock(false, new Ghost(1, "Clyde", 10)));
                        break;
                    default:
                        break;
                }
            }
            for (TerrainBlock t : terrain) {
                if (pacman.getLife() > 0) {
                    pacman.setPoints(pacman.getPoints() + t.getPoints());
                    if (t.isPowerPallet()) {
                        pacman.setInvincible(true);
                    }
                    if (t.containsGhost()) {
                        if (pacman.isInvincible()) {
                            t.getGameCharacter().setLife(t.getGameCharacter().getLife() - 1);

                        } else {
                            pacman.setLife(0);
                            t.setGameCharacter(pacman);
                        }
                    }
                }
            }

            if (pacman.getLife() > 0) {
                terrain.get(terrain.size() - 1).setGameCharacter(pacman);
            }
            System.out.println(pacman.printState());
            System.out.println("");
        }
    }
}
