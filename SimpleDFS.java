import java.util.*;
public class SimpleDFS {
    private int vertices;
    private List<List<Integer>> adjList;
    public SimpleDFS(int vertices) {
        this.vertices=vertices;
        adjList=new ArrayList<>();
        for (int i=0;i<vertices;i++) {
            adjList.add(new ArrayList<>());
        }
    }
    public void addEdge(int src,int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src); 
    }
    public void dfs(int start) {
        boolean[] visited=new boolean[vertices];
        System.out.print("DFS Traversal: ");
        dfsUtil(start,visited);
        System.out.println();
    }
    private void dfsUtil(int v,boolean[] visited) {
        visited[v]=true;
        System.out.print(v+ " ");
        for (int neighbor:adjList.get(v)) {
            if(!visited[neighbor]){
                dfsUtil(neighbor, visited);
            }
        }
    }
    public static void main(String[] args) {
        SimpleDFS graph=new SimpleDFS(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.dfs(0);
    }
}
