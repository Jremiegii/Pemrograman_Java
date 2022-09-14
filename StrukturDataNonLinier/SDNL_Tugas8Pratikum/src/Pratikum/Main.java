package Pratikum;

public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');

        graph.addEdge('A', 'B', 5);
        graph.addEdge('A', 'D', 7);
        graph.addEdge('A', 'F', 4);
        graph.addEdge('B', 'C', 7);
        graph.addEdge('B', 'D', 6);
        graph.addEdge('C', 'D', 9);
        graph.addEdge('C', 'G', 15);
        graph.addEdge('F', 'G', 9);
        graph.addEdge('G', 'D', 5);
        graph.addEdge('G', 'H', 8);
        
        System.out.println("Vertex Pada Graph = ");
        graph.DFS();
        System.out.println("\n");
        
        System.out.println("Vertex Berhubungan = ");
        graph.show();
        System.out.println("\n");
        
        System.out.println("Matrix = ");
        graph.toString();
        
    }
}
