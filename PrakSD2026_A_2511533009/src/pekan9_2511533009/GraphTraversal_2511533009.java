package pekan9_2511533009;

import java.util.*;

public class GraphTraversal_2511533009 {
    private Map<String, List<String>> grap_3009 = new HashMap<>();

    //Menambakan edge (graf tak berarah)
    public void addEdge_3009(String node1_3009, String node2_3009){
        grap_3009.putIfAbsent(node1_3009,new ArrayList<>());
        grap_3009.putIfAbsent(node2_3009,new ArrayList<>());
        grap_3009.get(node1_3009).add(node2_3009);
        grap_3009.get(node2_3009).add(node1_3009);
    }
    /// Menampilkan graf awal
    public void printGraph_3009(){
        System.out.println("Graf Awal (Adjacency List): ");
        for (String node_3009 : grap_3009.keySet()){
            System.out.printf(node_3009 + " -> ");
            List<String> neighbors_3009 = grap_3009.get(node_3009);
            System.out.println(String.join(", ", neighbors_3009));
        }
        System.out.println();
    }

    //DFS rkursif
    public void dfs_3009(String start_3009){
        Set<String> visited_3009 = new HashSet<>();
        System.out.println("Penelusuran DFS: ");
        dfsHelper_3009(start_3009,visited_3009);
        System.out.println();
    }
    private void dfsHelper_3009(String current_3009, Set<String> visited_3009){
        if (visited_3009.contains(current_3009)) return;
        visited_3009.add(current_3009);
        System.out.printf(current_3009 + " ");
        for (String neihgbor_3009 : grap_3009.getOrDefault(current_3009,new ArrayList<>())){
            dfsHelper_3009(neihgbor_3009,visited_3009);
        }
    }

    //BFS iteraftif
    public void bfs_3009(String start_3009){
        Set<String> visited_3009 = new HashSet<>();
        Queue<String> queue_3009 = new LinkedList<>();
        queue_3009.add(start_3009);
        visited_3009.add(start_3009);
        System.out.println("Penelusuran BFS: ");
        while (!queue_3009.isEmpty()){
            String current_3009 = queue_3009.poll();
            System.out.print(current_3009 + " ");
            for (String neighbor_3009 : grap_3009.getOrDefault(current_3009,new ArrayList<>())){
            	if(!visited_3009.contains(neighbor_3009)) {
                    queue_3009.add(neighbor_3009);
                    visited_3009.add(neighbor_3009);
            		
            	}
            }
        }
        System.out.println();
    }

    //Main
    public static void main(String [] args){
        GraphTraversal_2511533009 graph_3009 = new GraphTraversal_2511533009();

        //Cntoh graf: A-B, A-C, B-D, B-E
        graph_3009.addEdge_3009("A","B");
        graph_3009.addEdge_3009("A","C");
        graph_3009.addEdge_3009("B","D");
        graph_3009.addEdge_3009("B","E");
        //Cetak graf awal
        System.out.println("Garf Awal adalah: ");
        graph_3009.printGraph_3009();
        // Lakkan penelusuran
        graph_3009.bfs_3009("A");
        graph_3009.bfs_3009("A");
    }
}
