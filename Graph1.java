import java.util.*;
public class Graph1 {
    private int vertices;
    private List<LinkedList<Integer>> adjList;
    public Graph1(int v) {
        vertices = v;
        adjList = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adjList.add(new LinkedList<>());
        }
    }
    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src); 
    }
    public void print() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (Integer nn : adjList.get(i)) {
                System.out.print(nn + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Graph1 g = new Graph1(4); 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        g.print();
    }
}
