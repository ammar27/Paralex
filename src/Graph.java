import java.util.List;

public class Graph {
    private int[] nodeCosts;
    private int[] nodeBL;
    private int[][] edgeCosts;
    private List<Integer>[] adjListChildren;
    private List<Integer>[] adjListDependencies;

    private static Graph instance;

    public static Graph getInstance(){
        if(instance==null) {
            instance = new Graph();
        }
        return instance;
    }

    int getNodeCost(int node){
        return nodeCosts[node];
    }

    int getBottomLevel(int node){
        return nodeBL[node];
    }

    int getEdgeCost(int src, int dest){
        return edgeCosts[src][dest];
    }

    List<Integer> getChildren(int node){
        return adjListChildren[node];
    }

    List<Integer> getDependencies(int node){
        return adjListDependencies[node];
    }


}
