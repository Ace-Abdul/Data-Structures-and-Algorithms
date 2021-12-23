import java.util.*;

public class PercolationDFSFast extends PercolationDFS {
    public  PercolationDFSFast (int x){
        super(x);
    }
    @Override
    protected void updateOnOpen(int row, int col){
        if (! inBounds(row,col)) {
            throw new IndexOutOfBoundsException(
                    String.format("(%d,%d) not in bounds", row,col));
        }
        if((row==0) || (row+1 < myGrid.length && isFull(row+1,col)) | (row-1 !=-1 && isFull(row-1,col)) || (col+1 < myGrid[0].length && isFull(row,col+1)) || (col-1 !=-1 && isFull(row,col-1))){
            dfs(row, col);

    }

}}
