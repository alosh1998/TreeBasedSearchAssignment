package solver;

import java.util.LinkedList;

public class DFSStrategy extends SearchMethod {

    public  DFSStrategy()
    {
        code = "DFS";
        longName = "Depth First Search";
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
