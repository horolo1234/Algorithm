package com.beyond.graph;

import com.beyond.graph.practice.LinkedListGraph;
import com.beyond.graph.practice.MatrixGraph;

public class Application {
    public static void main(String[] args) {
        MatrixGraph matrixGraph = new MatrixGraph(4);
        matrixGraph.addEdge(0,1,30);
        matrixGraph.addEdge(0,2,20);
        matrixGraph.addEdge(1,2,40);
        matrixGraph.addEdge(2,3,50);

        System.out.println(matrixGraph);
        System.out.println();

        // 인접 리스트 테스트
        LinkedListGraph linkedListGraph = new LinkedListGraph(4);
        linkedListGraph.addEdge(0,1,30);
        linkedListGraph.addEdge(0,2,20);
        linkedListGraph.addEdge(1,2,40);
        linkedListGraph.addEdge(2,3,50);
        System.out.println(linkedListGraph);
        System.out.println();

        //removeEdge() 메서드 구현
        linkedListGraph.removeEdge(0,1);
        linkedListGraph.removeEdge(0,2);
        System.out.println(linkedListGraph);
        System.out.println();


    }
}
