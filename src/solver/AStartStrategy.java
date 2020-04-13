package solver;

import java.util.LinkedList;

public class AStartStrategy extends SearchMethod {

    public AStartStrategy(){
        code = "AStar";
        longName = "A* Search";
        Frontier = new LinkedList<PuzzleState>();
        Searched = new LinkedList<PuzzleState>();
    }

    @Override
    public direction[] Solve(nPuzzle aPuzzle) {
        return new direction[0];
    }

    @Override
    public boolean addToFrontier(PuzzleState aState) {
        return false;
    }

    @Override
    protected PuzzleState popFrontier() {
        return null;
    }
}
