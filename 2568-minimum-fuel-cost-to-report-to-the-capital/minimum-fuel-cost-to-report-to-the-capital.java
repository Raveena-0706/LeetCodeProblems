import java.util.*;

class Solution {

    long fuel = 0;

    public long minimumFuelCost(int[][] roads, int seats) {

        int n = roads.length + 1;

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for (int[] road : roads) {
            graph.get(road[0]).add(road[1]);
            graph.get(road[1]).add(road[0]);
        }

        dfs(0, -1, graph, seats);

        return fuel;
    }

    private int dfs(int node, int parent,
                    List<List<Integer>> graph,
                    int seats) {

        int people = 1;

        for (int next : graph.get(node)) {

            if (next != parent) {
                people += dfs(next, node, graph, seats);
            }
        }

        if (node != 0) {
            fuel += (people + seats - 1) / seats;
        }

        return people;
    }
}