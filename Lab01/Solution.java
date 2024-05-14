package Lab01;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private int[] startingCoordinates; 
    private String word;
    private String direction; 

    public Solution(int[] startingCoordinates, String word, String direction){
        this.startingCoordinates = startingCoordinates; 
        this.word = word; 
        this.direction = direction; 
    }

    public int[] getstartingCoordinates(){
        return startingCoordinates;
    }

    public String getWord(){
        return word; 
    }

    public String getDirection(){
        return direction;
    }

    public String toString(){
        return String.format("%-15s %-7d %d,%-7d%s\n", word, word.length(), startingCoordinates[0],
        startingCoordinates[1], direction);
    }

    // Constante para direções
    public static final String[] DIRECTIONS = { "horizontal", "vertical", "diagonal" };
    // Constante para deltas de direções
    // Obter os deltas correspondentes para cada direção específica 
    public static final Map<String, int[]> DIRECTIONS_PUZZLE = new HashMap<>();
    static {
        DIRECTIONS_PUZZLE.put("horizontal", new int[] { 0, 1 });
        DIRECTIONS_PUZZLE.put("vertical", new int[] { 1, 0 });
        DIRECTIONS_PUZZLE.put("diagonal", new int[] { 1, 1 });
    }
}

