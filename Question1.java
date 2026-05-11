import java.util.ArrayList;

public class Question1 {
    static void adjMatrix(int v){
        int[][] adjMatrix = new int[v][v];
        for (int i=0; i< v; i++){
            for (int j=0; j< v; j++){
                if (i != j){
                    adjMatrix[i][j] = 1;
                }
            }
        }
        System.out.println("Adjacency Matrix");
        System.out.print("  ");
        for (int j=0; j< v; j++ ){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("---------");

        for (int i=0; i< v; i++){
            System.out.print(i + " ");
            for (int j=0; j < v; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void adjList(int v){
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i=0; i< v; i++){
            adjList.add(new ArrayList<>());
        }
        for (int i=0; i<v; i++){
            for (int j=0; j<v; j++){
                if (i != j){
                    adjList.get(i).add(j);
                }
            }
        }
        System.out.println("Adjacency List:");
       for (int i =0; i<v; i++){
           System.out.println(i + "-->" + adjList.get(i));
       }
    }
    public static void main(String[] args) {
        adjMatrix(4);
        adjList(4);
    }
}