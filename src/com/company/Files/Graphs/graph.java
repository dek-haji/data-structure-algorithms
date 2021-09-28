package com.company.Files.Graphs;

import java.util.ArrayList;

public class graph {
    // A utility function to add an edge in an
    // undirected graph
    //adding edge method
    public void AddEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);

    }
}
