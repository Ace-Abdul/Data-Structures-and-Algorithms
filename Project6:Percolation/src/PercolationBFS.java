import java.util.*;

public class PercolationBFS extends PercolationDFSFast{
    public  PercolationBFS (int x){
        super(x);
    }

    @Override
    protected void dfs(int row, int col){
        Queue <int[]> q = new LinkedList<>();
        myGrid[row][col] = FULL;
        q.add(new int[]{row,col});

        while(q.size() >0){
            int[] temp= q.remove();
            if(temp[0] + 1 < myGrid.length && (isOpen(temp[0] + 1, temp[1] )&& !isFull(temp[0] + 1, temp[1] ))){
                myGrid[temp[0] + 1][temp[1] ] = FULL;
                q.add(new int[]{temp[0] + 1,temp[1]});
            }
            if(temp[0] - 1 != -1 && (isOpen(temp[0] -1, temp[1]) && !isFull(temp[0] -1, temp[1] ))){
                myGrid[temp[0] - 1][temp[1] ] = FULL;
                q.add(new int[]{temp[0] - 1,temp[1]});
            }
            if(temp[1] + 1 < myGrid[0].length && (isOpen(temp[0], temp[1] +1) && !isFull(temp[0], temp[1] +1))){
                myGrid[temp[0] ][temp[1] +1] = FULL;
                q.add(new int[]{temp[0],temp[1]+1});
            }
            if(temp[1] - 1 != -1 && (isOpen(temp[0] , temp[1] -1) &&! isFull(temp[0] , temp[1] -1))){
                myGrid[temp[0]][temp[1] -1 ] = FULL;
                q.add(new int[]{temp[0],temp[1]-1});
            }

        }
        //int [] temp = q.remove();


        /*if(temp[0] + 1 < myGrid.length && isOpen(temp[0] + 1, temp[1] )){
            dfs(temp[0] + 1,temp[1] );
        }
        if(temp[0] - 1 != -1 && isOpen(temp[0] -1, temp[1] )){
            dfs(temp[0] - 1,temp[1]);
        }
        if(temp[1] + 1 < myGrid[0].length && isOpen(temp[0], temp[1] +1)){
            dfs(temp[0],temp[1] +1)

        }
        if(temp[1] - 1 != -1 && isOpen(temp[0] , temp[1] -1)){
            dfs(temp[0],temp[1] -1);

        }*/
    }
}
