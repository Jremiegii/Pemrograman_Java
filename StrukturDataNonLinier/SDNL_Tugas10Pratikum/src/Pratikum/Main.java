package Pratikum;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();
        
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');
        graph.addVertex('I');
        graph.addVertex('J');
        
        graph.addEdge('A', 'B', 5);
        graph.addEdge('A', 'C', 5);
        graph.addEdge('B', 'E', 9);
        graph.addEdge('B', 'D', 4);
        graph.addEdge('C', 'D', 4);
        graph.addEdge('C', 'F', 7);
        graph.addEdge('D', 'E', 8);
        graph.addEdge('D', 'F', 6);
        graph.addEdge('E', 'F', 10);
        graph.addEdge('E', 'G', 10);
        graph.addEdge('F', 'G', 3);
        graph.addEdge('G', 'H', 6);
        graph.addEdge('G', 'J', 7);
        graph.addEdge('H', 'E', 8);
        graph.addEdge('H', 'I', 4);
        graph.addEdge('I', 'E', 9);
        graph.addEdge('I', 'J', 7);
        graph.addEdge('J', 'H', 6);
        
        ArrayList<Edge> MST = graph.getPrimaEdges();
        for(int i = 0; i < MST.size(); i++) {
            System.out.println(MST.get(i).getVertexA() + " Ke " + MST.get(i).getVertexB() + " = " + MST.get(i).getweight());
        }
        System.out.println("\n");
    }
}
