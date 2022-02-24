package pfd;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Iterator;
        import java.util.List;

public class adjacencyMatrix{
    public static class Edge implements Comparable<Edge>{
        int u;
        int v;
        int w;
        Edge(int u,int v,int w){
            this.u=u;
            this.v=v;
            this.w=w;
        }
        @Override
        public int compareTo(Edge o) {
            return this.w - o.w;
        }
    }



    int vertices;

    int graph [][];
    Edge[] edges;


    adjacencyMatrix(int V){
        this.vertices=V;
        graph=new int[vertices][vertices];
        edges = new Edge[vertices*(vertices-1)/2];

    }

    int edgecount=0;
    public void addEdge(int source, int destination, int weight) {

        graph[source][destination]=weight;
        graph[destination][source]=weight;

//adding edges to the an array
        edges[edgecount++]=new Edge(source,destination,weight);
    }

    public void printMatrix() {

        for(int i=0;i<vertices;i++) {
            for(int j=0;j<vertices;j++) {
            System.out.print(graph[i][j]+" ");
            }
            System.out.println("");
        }

    }
    boolean visited[];
    int distance [];

    public void dijaxtra(int source, int destination) {
        distance =new int[vertices];
        visited = new boolean[vertices];
        int path[]=new int[vertices];

        for(int i=0;i<distance.length;i++) {
            distance[i]=Integer.MAX_VALUE;
            path[i]=-1;
        }
        distance[source]=0;
        for(int i=0;i<vertices;i++) {
            int minvertex=findMinvertex();
            visited[minvertex]=true;
            for(int j=0;j<vertices;j++) {
                if(!visited[j] && graph[minvertex][j]!=0) {
                    int newdist=distance[minvertex]+graph[minvertex][j];
                    int exisgtingdist=distance[j];
                    if(newdist<exisgtingdist) {
                        distance[j]=newdist;
                        path[j]=minvertex;
                    }
                }
            }
        }
        System.out.println("shortest distance from "+source+" to destination "+destination+" is "+distance[destination]);

        int crawl=destination;
        Linkedlistt list1=new Linkedlistt();
        list1.addNode(crawl);
        while(path[crawl]!=-1) {

            list1.addNode(path[crawl]);
            crawl=path[crawl];

        }
        System.out.println("valid path is");
        for(int k=list1.getSize();k>0;k--) {

            System.out.print(list1.getDataAtanyposition(k)+" ");
        }
        System.out.println("");

    }


    public int findMinvertex() {
        int minvertex=-1;

        for(int i=0;i<vertices;i++) {
            if(!visited[i]&&(minvertex==-1 || distance[i]<distance[minvertex])) {
                minvertex=i;
            }
        }
        return minvertex;

    }

    public void printEdge() {

        for(int i=0;i<vertices;i++) {
            System.out.print(i+" is connected to: ");

            for(int j=0;j<vertices;j++) {
                if(graph[i][j]!=0) {
                    System.out.print(j+ " ");
                }

            }
            System.out.println("");
        }

    }

    public void KrusKalsAlgorithm() {
        int mst[][]=new int[vertices][vertices];

        Arrays.sort(edges);

        int[] parents = new int[vertices + 1];
        int[] size = new int[vertices + 1];
        for (int vertex = 1; vertex <vertices + 1; vertex++) {
            parents[vertex] = -1;
            size[vertex] = 0;
        }

        int edgeCounter = 0;
        int edgedTaken = 1;

        while (edgedTaken <= vertices - 1) {

            Edge e = edges[edgeCounter];
            edgeCounter++;

            if (isCyclic(e.u, e.v, parents))
                continue;

            union(findParent(e.u, parents), findParent(e.v, parents), parents, size);
            mst[e.u][e.v] = e.w;
            edgedTaken++;
        }



    }

    public static void union(int u, int v, int[] parents, int[] size) {
        u = findParent(u, parents);
        v = findParent(v, parents);
        if (size[u] > size[v]) {
            parents[v] = u;
            size[u] += size[v];
        } else {
            parents[u] = v;
            size[v] += size[u];
        }
    }


    public static boolean isCyclic(int u, int v, int[] parents) {
        return findParent(u, parents) == findParent(v, parents);
    }

    public static int findParent(int u, int[] parents) {

        if (parents[u] == -1) {
            return u;
        } else { //1
            parents[u] = findParent(parents[u], parents);
            return parents[u];
        }
    }


    public static void main(String [] args) {

        adjacencyMatrix m=new adjacencyMatrix(6);
        m.addEdge(0, 1,8);
        m.addEdge(0, 2,3);
        m.addEdge(0, 5,20);
        m.addEdge(2, 3,2);
        m.addEdge(1, 4,4);
        m.addEdge(3, 4,5);
        m.addEdge(4, 5,5);
        m.addEdge(3, 5,5);

        System.out.println("distance");
        m.dijaxtra(2,5);
        m.printEdge();
    }



}