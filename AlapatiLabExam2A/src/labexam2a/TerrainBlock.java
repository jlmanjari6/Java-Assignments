/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexam2a;

/**
 *
 * @author S530719
 */
public class TerrainBlock {

    private boolean powerPallet;
    private GameCharacter gameCharacter;

    public TerrainBlock(boolean powerPallet, GameCharacter gameCharacter) {
        this.powerPallet = powerPallet;
        this.gameCharacter = gameCharacter;
    }

    public int getTerrainPoints() {
        return powerPallet == true ? 100 : 10;
    }

    public int getPoints() {
        if (gameCharacter != null) {
            return gameCharacter.getPoints();
        }
        return getTerrainPoints();
    }

    public boolean containsGhost() {
        return gameCharacter != null;
    }

    public boolean isPowerPallet() {
        return powerPallet;
    }

    public GameCharacter getGameCharacter() {
        return gameCharacter;
    }

    public void setGameCharacter(GameCharacter gameCharacter) {
        this.gameCharacter = gameCharacter;
    }   
    
}
