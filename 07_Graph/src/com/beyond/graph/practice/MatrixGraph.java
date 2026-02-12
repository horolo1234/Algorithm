package com.beyond.graph.practice;

public class MatrixGraph {
    // 꼭짓점의 개수
    private final int numOfVertices;

    private final int[][] matrix;

    public MatrixGraph(int numOfVertices) {
        this.numOfVertices = numOfVertices;
        this.matrix = new int[numOfVertices][numOfVertices];
    }

    public void addEdge(int src, int dest, int weight){
        // 행 시작 꼭짓점
        // 열 도착 꼭짓점
        this.matrix[src][dest] = weight;
    }

    public void removeEdge(int src, int dest){
        matrix[src][dest] = 0;

        // 그래프가 방향이 없는 경우
        //matrix[dest][src] = 0;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] <= 0){
                    continue;
                }

                sb.append(String.format("Vertex %d -> Vertex %d (Weight: %d)\n",i,j,matrix[i][j]));

            }
        }


        return sb.toString();
    }
}
