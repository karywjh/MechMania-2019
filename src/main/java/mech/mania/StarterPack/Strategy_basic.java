package mech.mania.StarterPack;

import mech.mania.API.*;

import java.util.ArrayList;
import java.util.List;

/**
 * A class where contestants will implement their strategy for the MechMania25 Hackathon.
 */
public class Strategy {
    // define any private variables here
    // NOTE: Since the server may be restarted or moved mid-game, you MUST initialize any variables you put here in each of the below constructors.
    //       If the server is restarted or moved, these variables will not have the values you previously set them with.
    //       If you need truly persistent data, you could set up a database and communicate with that from your script

    /**
     * This constructor is called when a game is first started.
     * @param init The initial state of this new game
     * @see GameInit
     */
    public Strategy(GameInit init) {
        // initialize variables here
    }

    /**
     * This constructor is called if/when the server restarts in the middle of a game
     * @param state the current state of the game
     * @see GameState
     */
    public Strategy(GameState state) {
        // initialize variables here
    }

    /**
     * Method to set unit initializations. Run at the beginning of a game, after assigning player numbers.
     * @return An array of {@link UnitSetup} objects which define attack pattern, terrain creation pattern, health, and speed.
     * @see UnitSetup
     */
    public UnitSetup[] getSetup(int playerNum){
        // Default values
        boolean[][] terrainPattern = {
                {false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false}
        };

        boolean[][] xTerrainPattern1 = {
                {false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false},
                {true, false, false, false, false, false, false},
                {false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false},
                {false, false, false, true, false, false, false}
        };

        boolean[][] xTerrainPattern2 = {
                {false, false, false, true, false, false, false},
                {false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false},
                {true, false, false, false, false, false, true},
                {false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false},
                {false, false, false, true, false, false, false}
        };

        int health = 4;
        int speed = 4;

        UnitSetup unit1;
        UnitSetup unit2;
        UnitSetup unit3;
        if(playerNum == 1) {
            // Define units if player 1
            // Top Left

            // "X" Player
            int[][] xAttackPattern = {
                    {0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0},
                    {1, 1, 0, 0, 0, 0, 0},
                    {0, 1, 1, 0, 0, 0, 0},
                    {0, 0, 1, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0}
            };
            unit1 = new UnitSetup(xAttackPattern, xTerrainPattern1, 7, 2, 1);

            int[][] yAttackPattern = {
                    {0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0},
                    {1, 1, 1, 0, 0, 0, 0},
                    {0, 1, 1, 1, 0, 0, 0},
                    {0, 0, 1, 1, 0, 0, 0},
                    {0, 0, 0, 2, 0, 0, 0}
            };
            unit2 = new UnitSetup(yAttackPattern, terrainPattern, 7, 2, 2);

            int[][] zAttackPattern = {
                    {0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0},
                    {2, 1, 1, 0, 0, 0, 0},
                    {0, 1, 1, 1, 0, 0, 0},
                    {0, 0, 1, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0}
            };
            unit3 = new UnitSetup(zAttackPattern, terrainPattern, 7, 2, 3);
        } else {
            // Define units if player 2

            int[][] xAttackPattern = {
                    {0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 1, 0, 0},
                    {0, 0, 0, 0, 1, 1, 0},
                    {0, 0, 0, 0, 0, 1, 1},
                    {0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0}
            };
            unit1 = new UnitSetup(xAttackPattern, xTerrainPattern2, 7, 2, 4);

            int[][] yAttackPattern = {
                    {0, 0, 0, 2, 0, 0, 0},
                    {0, 0, 0, 1, 1, 0, 0},
                    {0, 0, 0, 1, 1, 1, 0},
                    {0, 0, 0, 0, 1, 1, 1},
                    {0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0}
            };
            unit2 = new UnitSetup(yAttackPattern, terrainPattern, 7, 2, 5);

            int[][] zAttackPattern = {
                    {0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 1, 0, 0},
                    {0, 0, 0, 1, 1, 1, 0},
                    {0, 0, 0, 0, 1, 1, 2},
                    {0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0}
            };
            unit3 = new UnitSetup(zAttackPattern, terrainPattern, 7, 2, 6);
        }

        UnitSetup[] unitSetup = {unit1, unit2, unit3};
        return unitSetup;
    }

    /**
     * Method to implement the competitors strategy in the next turn of the game. This is where competitors should be
     * putting most of their code.
     * @param gameState An object recording the current state of the game.
     * @return An object representing the actions to execute this turn. Includes the movement and attack directions
     * for each unit and the priorities (order) in which to execute them.
     * @see Decision
     */
    public Decision[] doTurn(GameState gameState){
        int playerNum = gameState.getPlayerNum();
        List<Unit> myUnits = gameState.getPlayerUnits(playerNum);
        List<Unit> enemyUnits = gameState.getPlayerUnits(playerNum == 1 ? 2 : 1);

        int turn = gameState.getTurnsTaken() + 1;

        Decision[] turnResponse = new Decision[myUnits.size()];

        /*
         * LOGIC FOR X AND Y UNITS
         */
        if (turn == 2 || turn == 18 || turn == 22 || turn == 25 || turn >= 27) {
            for (int u = 0; u < myUnits.size(); u++) {
                if (u == 0) {
                    // X Unit
                    int priority = 3;
                    Direction[] movementSteps = new Direction[myUnits.get(u).getSpeed()];
                    for (int s = 0; s < movementSteps.length; s++) {
                        movementSteps[s] = Direction.STAY;
                    }
                    if (playerNum == 1) {
                        movementSteps[0] = Direction.DOWN;
                        movementSteps[1] = Direction.RIGHT;
                    } else {
                        movementSteps[0] = Direction.UP;
                        movementSteps[1] = Direction.LEFT;
                    }
                    Direction attackDirection = Direction.UP;
                    turnResponse[u] = new Decision(priority, movementSteps, attackDirection, myUnits.get(u).getId());
                } else if (u == 1) {
                    // Y Unit
                    int priority = 2;
                    Direction[] movementSteps = new Direction[myUnits.get(u).getSpeed()];
                    for (int s = 0; s < movementSteps.length; s++) {
                        movementSteps[s] = Direction.STAY;
                    }
                    if (playerNum == 1) {
                        movementSteps[0] = Direction.RIGHT;
                        movementSteps[1] = Direction.DOWN;
                    } else {
                        movementSteps[0] = Direction.LEFT;
                        movementSteps[1] = Direction.UP;
                    }
                    Direction attackDirection = Direction.UP;
                    turnResponse[u] = new Decision(priority, movementSteps, attackDirection, myUnits.get(u).getId());
                } else {
                    // Z Unit
                    int priority = 1;
                    Direction[] movementSteps = new Direction[myUnits.get(u).getSpeed()];
                    for (int s = 0; s < movementSteps.length; s++) {
                        movementSteps[s] = Direction.STAY;
                    }
                    if (playerNum == 1) {
                        movementSteps[0] = Direction.RIGHT;
                        movementSteps[1] = Direction.DOWN;
                    } else {
                        movementSteps[0] = Direction.LEFT;
                        movementSteps[1] = Direction.UP;
                    }
                    Direction attackDirection = Direction.UP;
                    turnResponse[u] = new Decision(priority, movementSteps, attackDirection, myUnits.get(u).getId());
                }
            }
        } else {
            for(int u = 0; u < myUnits.size(); u++) {
                if(u == 0) {
                    // X Unit
                    int priority = 3;
                    Direction[] movementSteps = new Direction[myUnits.get(u).getSpeed()];
                    for (int s = 0; s < movementSteps.length; s++) {
                        movementSteps[s] = Direction.STAY;
                    }
                    Direction attackDirection = Direction.UP;
                    turnResponse[u] = new Decision(priority, movementSteps, attackDirection, myUnits.get(u).getId());
                } else if (u == 1) {
                    // Y Unit
                    int priority = 2;
                    Direction[] movementSteps = new Direction[myUnits.get(u).getSpeed()];
                    for (int s = 0; s < movementSteps.length; s++) {
                        movementSteps[s] = Direction.STAY;
                    }
                    Direction attackDirection = Direction.UP;
                    turnResponse[u] = new Decision(priority, movementSteps, attackDirection, myUnits.get(u).getId());
                } else {
                    // Z Unit
                    int priority = 1;
                    Direction[] movementSteps = new Direction[myUnits.get(u).getSpeed()];
                    for (int s = 0; s < movementSteps.length; s++) {
                        movementSteps[s] = Direction.STAY;
                    }
                    Direction attackDirection = Direction.UP;
                    turnResponse[u] = new Decision(priority, movementSteps, attackDirection, myUnits.get(u).getId());
                }
            }
        }
        return turnResponse;
    }
}
