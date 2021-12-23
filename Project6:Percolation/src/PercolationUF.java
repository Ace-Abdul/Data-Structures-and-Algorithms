import java.util.Arrays;

public class PercolationUF implements IPercolate{

    private IUnionFind myFinder;
    private boolean[][] myGrid;
    private final int VTOP;
    private final int VBOTTOM;
    private int myOpenCount;


    public PercolationUF(IUnionFind Finder, int size) {
        myGrid = new boolean [size][size];
        Finder.initialize(size*size+2);
        myFinder = Finder;
        VTOP = size * size;
        VBOTTOM = size * size+1;
        myOpenCount= 0;
    }

    @Override
    public boolean isOpen(int row, int col){
        int val = row * myGrid.length + col;
        if ( row >= myGrid.length || col>=myGrid[0].length || row<0 || col<0){
            throw new IndexOutOfBoundsException(
                    String.format("(%d) (%d) not in bounds", row, col));
        }
        return myGrid[row][col];
    }

    @Override
    public boolean isFull(int row, int col){
        int val = row * myGrid.length + col;

        if ( row >= myGrid.length || col>=myGrid[0].length || row<0 || col<0){
            throw new IndexOutOfBoundsException(
                    String.format("(%d) (%d) not in bounds", row, col));
        }

        return myFinder.connected(VTOP,val);

    }

    @Override
    public boolean percolates(){return myFinder.connected(VTOP, VBOTTOM);}

    @Override
    public int numberOfOpenSites(){return myOpenCount;}

    @Override
    public void open(int row, int col){
        int val = row * myGrid.length + col;

        if ( row >= myGrid.length || col>=myGrid[0].length || row<0 || col<0){
            throw new IndexOutOfBoundsException(
                    String.format("(%d) (%d) not in bounds", row, col));
        }

        if(!isOpen(row,col)){
            myGrid[row][col]= true;
            myOpenCount++;
        }

        if(valid(row+1, col) && isOpen(row+1, col)){
            int cval = (row + 1) * myGrid.length + col;
            myFinder.union(cval,val);

        }

        if(valid(row-1, col) && isOpen(row-1, col)){
            int cval = (row - 1) * myGrid.length + col;
            myFinder.union(cval,val);

        }

        if(valid(row, col - 1) && isOpen(row, col - 1)){
            int cval = row * myGrid.length + (col - 1);
            myFinder.union(cval,val);

        }

        if(valid(row, col + 1) && isOpen(row, col + 1)){
            int cval = row * myGrid.length + (col + 1);
            myFinder.union(cval,val);

        }

        if(val<myGrid[0].length) {myFinder.union(VTOP, val);}
        if(val>=((myGrid.length - 1)*(myGrid[0].length)) ) {myFinder.union(val, VBOTTOM);}
    }

    private boolean valid(int row, int col) { return !(row >= myGrid.length || col>=myGrid[0].length || row<0 || col<0); }


}
