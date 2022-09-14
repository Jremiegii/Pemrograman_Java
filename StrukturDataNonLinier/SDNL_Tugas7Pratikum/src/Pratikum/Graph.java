package Pratikum;

public class Graph {
    
    private int maxVertex = 5;
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
                    adjacencyMatrix[i][j] = -1;
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
