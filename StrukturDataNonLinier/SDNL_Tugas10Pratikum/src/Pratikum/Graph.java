package Pratikum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    
    private int maxVertex = 10;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int countVertex = 0;
    
    
    Graph() {
        
        vertexList = new Vertex[maxVertex];
        adjacencyMatrix = new int[maxVertex][maxVertex];
        for(int i = 0; i < maxVertex; i++) {
            for(int j = 0; j < maxVertex; j++) {
                if(i == j) {
                    adjacencyMatrix[i][j] = 0;
                } else {
                    adjacencyMatrix[i][j] = 0;
                }
            }
        }
        countVertex = 0;
    }
    
    public void addVertex(char Data) {
        if(countVertex <= maxVertex) {
            vertexList[countVertex] = new Vertex(Data);
            countVertex++;
        }
    }
    
    public void addEdge(int x, int y, int z) {
        adjacencyMatrix[x][y] = z;
        adjacencyMatrix[y][x] = z;
    }
    
    public void addEdge(char x, char y, int Bobot) {
        addEdge(indexVertex(x), indexVertex(y), Bobot);
    }
    
    private int indexVertex(char Indeks) {
        for(int i = 0; i < countVertex; i++) {
            if(vertexList[i].label == Indeks) {
                return i;
            }
        }
        return -1;
    }
    
    public void DFS() {
        
        int seed = 0;
        Stack stack = new Stack();
        
        stack.push(seed);
        
        while(!stack.isEmpty()) {
            int bantu = (int)stack.pop();
            if(!vertexList[bantu].flangVisited == true) {
                System.out.print(vertexList[bantu].label + " ");
                vertexList[bantu].flangVisited = true;
                for(int i = countVertex - 1; i >= 0; i--) {
                    if(adjacencyMatrix[bantu][i] >= 1 && !vertexList[i].flangVisited == true) {
                        stack.push(i);
                    }
                }
            } 
        }
    }
    
    public void BFS() {

        int seed = 0;
        Queue queue = new LinkedList();

        queue.add(seed);

        while (!queue.isEmpty()) {
            int bantu = (int) queue.remove();
            if (!vertexList[bantu].flangVisited == true) {
                System.out.print(vertexList[bantu].label + " ");
                vertexList[bantu].flangVisited = true;
                for (int i = 0; i <= countVertex - 1; i++) {
                    if (adjacencyMatrix[bantu][i] >= 1 && !vertexList[i].flangVisited == true) {
                        queue.add(i);
                    }
                }
            }
        }
    }
    
    public ArrayList<Edge> getPrimaEdges() {
        
        ArrayList<Edge> primEdges = new ArrayList<>();
        ArrayList<Integer> primVertexs = new ArrayList<>();
        
        primVertexs.add(0);
        vertexList[0].flangVisited = true;
        
        while(primVertexs.size() < countVertex) {
            int tempMinWeight = Integer.MAX_VALUE;
            int tempMinIndekVertexI = -1;
            int tempMinIndekVertexJ = -1;
            for(int i = 0; i < primVertexs.size(); i++) {
                for(int j = 0; j < countVertex; j++) {
                    if(adjacencyMatrix[primVertexs.get(i)][j] > 0 && !vertexList[j].flangVisited && 
                            adjacencyMatrix[primVertexs.get(i)][j] < tempMinWeight) {
                        tempMinWeight = adjacencyMatrix[primVertexs.get(i)][j];
                        tempMinIndekVertexI = primVertexs.get(i);
                        tempMinIndekVertexJ = j;
                    }
                }
            }
            primVertexs.add(tempMinIndekVertexJ);
            vertexList[tempMinIndekVertexJ].flangVisited = true;
            Edge edge = new Edge(tempMinIndekVertexI, tempMinIndekVertexJ, tempMinWeight);
            primEdges.add(edge);
        }
        return primEdges;
    }
    
    public void show(){ // Digunakan Untuk Menampilkan Hasil Berdasarkan Kalimat
        for(int i = 0; i < countVertex; i++) {
            for(int j = 0; j < countVertex; j++) {
                if(adjacencyMatrix[i][j] > 0) {
                    System.out.println(vertexList[i].label + " Terhubung " + vertexList[j].label 
                            + " Dengan Bobot " + adjacencyMatrix[i][j]);
                }
            }
            System.out.println(" ");
        }
    }
    
    public String toString() { // Digunakan Untuk Menampilkan Matrix

        String tamp = " ";

        for (int i = 0; i < countVertex; i++) {
            for (int j = 0; j < countVertex; j++) {
                    tamp = adjacencyMatrix[i][j] + "\t";
                    System.out.print(tamp);
            }
            System.out.println(" ");
        }
        return tamp;
    }
}
