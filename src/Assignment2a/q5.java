package Assignment2a;

import java.util.ArrayDeque;

public class q5 {

    public static void main(String[] args) {

        // Create a graph with 5 nodes
        int[][] graph = new int[][]{
            {0, 1, 0, 0, 1}, 
            {1, 0, 1, 0, 0}, 
            {0, 1, 0, 1, 0}, 
            {0, 0, 1, 0, 1}, 
            {1, 0 ,0 ,1 ,0} 
        };

        // Create a queue to store the nodes to be visited
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        boolean[] visited = new boolean[graph.length];
        // Add the first node to the queue and mark it as visited
        queue.add(0);
        visited[0] = true;

        // While there are still nodes in the queue...
        while (!queue.isEmpty()) {
           
        	int cvertex = queue.remove();
        	System.out.print(cvertex+" ");
        	
        	for(int i=0 ; i<graph[cvertex].length; i++) {
        		if(graph[cvertex][i] == 1 && !visited[i]) {
        			queue.add(i);
        			visited[i] = true;
        		}

            }   

        }   

    }   
}