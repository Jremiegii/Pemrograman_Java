package Pratikum;

public class Main {
    
    public static void main(String[] args) {
        
        Graph graph = new Graph();
        
        graph.addVertex('a');
        graph.addVertex('b');
        graph.addVertex('c');
        graph.addVertex('e');
        graph.addVertex('f');
        
        graph.addEdge('a', 'b', 4);
        graph.addEdge('a', 'f', 5);
        graph.addEdge('b', 'c', 5);
        graph.addEdge('b', 'f', 2);
        graph.addEdge('b', 'e', 4);
        graph.addEdge('c', 'f', 3);
        graph.addEdge('c', 'e', 2);
        graph.addEdge('e', 'f', 10);
        
        graph.show();
        System.out.println("\n");
        
        System.out.println("Matrix : " + "\n");
        graph.toString();
        
    }
}
