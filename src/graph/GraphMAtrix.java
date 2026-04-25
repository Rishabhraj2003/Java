package  graph;
class GraphMatrix {

    private int vertices;
    private int[][] adjMatrix;

    // Constructor
    public GraphMatrix(int v) {
        vertices = v;
        adjMatrix = new int[v][v];
    }

    // Add edge (undirected graph)
    public void addEdge(int src, int dest) {
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1; // comment for directed
    }

    // Delete edge
    public void removeEdge(int src, int dest) {
        adjMatrix[src][dest] = 0;
        adjMatrix[dest][src] = 0; // comment for directed
    }

    // Add vertex
    public void addVertex() {
        vertices++;
        int[][] newMatrix = new int[vertices][vertices];

        // copy old data
        for (int i = 0; i < vertices - 1; i++) {
            for (int j = 0; j < vertices - 1; j++) {
                newMatrix[i][j] = adjMatrix[i][j];
            }
        }

        adjMatrix = newMatrix;
    }

    // Delete vertex
    public void removeVertex(int v) {
        if (v >= vertices) {
            System.out.println("Vertex doesn't exist!");
            return;
        }

        int[][] newMatrix = new int[vertices - 1][vertices - 1];

        // Copy all except row/col v
        int row = 0, col = 0;
        for (int i = 0; i < vertices; i++) {
            if (i == v) continue;
            col = 0;
            for (int j = 0; j < vertices; j++) {
                if (j == v) continue;
                newMatrix[row][col] = adjMatrix[i][j];
                col++;
            }
            row++;
        }

        vertices--;
        adjMatrix = newMatrix;
    }

    // Print graph
    public void printGraph() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main
    public static void main(String[] args) {
        GraphMatrix g = new GraphMatrix(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        g.printGraph();

        System.out.println("\nRemove edge 1-2:");
        g.removeEdge(1, 2);
        g.printGraph();

        System.out.println("\nAdd new vertex:");
        g.addVertex();
        g.addEdge(3, 4);
        g.printGraph();

        System.out.println("\nRemove vertex 2:");
        g.removeVertex(2);
        g.printGraph();
    }
}
