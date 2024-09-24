
import java.util.*;

public class LAB16_1{
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 5);
        g.addEdge(5, 6);
        g.addEdge(6, 7);
        System.out.println();
        System.out.print("DFS is ");
        g.dfs(0);
        System.out.println();
        System.out.print("BFS is ");
        g.bfs(0);
    }
}
class Graph{
    private Map<Integer , List<Integer>> adjlist;

    public Graph(){
        adjlist = new HashMap<>();
    }

    public void addEdge(int u , int v){
        adjlist.putIfAbsent(u, new ArrayList<>());
        adjlist.putIfAbsent(v, new ArrayList<>());
        adjlist.get(u).add(v);
        adjlist.get(v).add(u);
    }

    public void dfs(int start){
        Set<Integer> visited = new HashSet<>();
        dfsHelper(start, visited);
    }

    private void dfsHelper(int vertax , Set<Integer> visited){
        visited.add(vertax);
        System.out.print(vertax + " ");
        for(int neighbor : adjlist.getOrDefault(vertax, new ArrayList<>())){
            if(!visited.contains(neighbor)){
                dfsHelper(neighbor, visited);
            }
        }
    }

    public void bfs(int start){
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(start);
        queue.add(start);
        
        while(!queue.isEmpty()){
            int vertax = queue.poll();
            System.out.print(vertax + " ");
            for(int neighbor : adjlist.getOrDefault(vertax, new ArrayList<>())){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

    }
}