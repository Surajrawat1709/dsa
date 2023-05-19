package com.graph.basics;

import java.util.Scanner;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of vertices and edges");
        // n is the number of vertices
        // m is the number of edges
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][] adjMatrix=new int[n+1][n+1];

        for (int i=0;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjMatrix[u][v]=1;
            adjMatrix[v][u]=1;

        }
    }
}
