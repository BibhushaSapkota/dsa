package pfd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Graphh {
    int matrix[][];
    int size;
    Graphh(int v){
        matrix=new int[v][v];
        this.size=v;


    }
    public void addEdges(int source,int destination ){
        matrix[source][destination]=1;
        matrix[destination][source]=1;
    }
    public void printMatrix(){
        System.out.println("printing matrix");
        for(int i=0; i<size;i++){
            for (int j=0; j<size ;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public void printGraph(){
        //adjacant node lai print garcha
        for (int i=0 ; i<size ; i++){

            System.out.print(i+ " is connected to:");
            for(int j=0; j<size ;j++){
                if (matrix[i][j]!=0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }

    }
    public List<Integer> getadjNodes(int i){
        ArrayList<Integer> adjlist=new ArrayList<Integer>();
        for(int j=0;j<size;j++) {
            if(matrix[i][j]!=0) {
                adjlist.add(j);
            }
        }
        return adjlist;
    }


    public void dijakastra(int source, int desination) {
        int [] distance=new int[size];
        int [] path=new int [size];

        boolean [] visited=new boolean[size];

        for(int i=0;i<size;i++) {

            distance[i]=Integer.MAX_VALUE;
            path[i]=-1;
        }

        distance[source]=0;

        for(int i=0;i<size;i++) {

            int minvertex=findMinVertex(distance,visited);
            visited[minvertex]=true;
            for(int j=0;j<size;j++) {
//j=0
                if(matrix[minvertex][j]!=0 && !visited[j]) {

                    int newdistance=distance[minvertex]+matrix[minvertex][j];
                    if(newdistance<distance[j]) {
                        distance[j]=newdistance;
                        path[j]=minvertex;
                    }
                }

            }
        }
//


    }

    public int findMinVertex(int [] distance, boolean [] visited) {
        int minvertex=-1;

        for(int i=0;i<distance.length;i++) {

            if(!visited[i] && (minvertex==-1 || distance[i]<distance[minvertex] )) {
                minvertex=i;
//minvertex=0
            }

        }

        return minvertex;

    }

    public void shortestDistance(int source, int destination) {

        int [] distance=new int[size];
        int [] path=new int [size];

        boolean [] visited=new boolean[size];

        QueueTest queue=new QueueTest(size);

        for(int i=0; i<size; i++) {
            distance[i]=-1;
            path[i]=-1;
        }

        distance[source]=0;
        queue.enqueue(source);
        visited[source]=true;

        while(!queue.isEmpty()) {
            int u=queue.dequeue();

            Iterator<Integer> iterator=getadjNodes(u).iterator();
            while(iterator.hasNext()) {
                int v=iterator.next();

                if(!visited[v]) {
                    distance[v]=distance[u]+1;
                    path[v]=u;
                    queue.enqueue(v);
                    visited[v]=true;
                }
            }

        }

        System.out.print("distance from source "+ source+" to destination "+destination+" is: ");
        System.out.print(distance[destination]);



        Linkedlistt prevpath=new Linkedlistt();
        prevpath.addNode(destination);
        int crwal=destination;
//crawl=4;
        while(path[crwal]!=-1) {
            prevpath.addNode(path[crwal]);
            crwal=path[crwal];

        }
        System.out.println("");
        System.out.print(" and the shortest path is: ");
        for(int i=prevpath.getSize();i>0;i--) {
            System.out.print(prevpath.getDataAtanyposition(i)+" ");

        }


    }




    public static void main(String[]args){
        Graphh g=new Graphh(5);
        g.addEdges(0,1);
        g.addEdges(0,2);
        g.addEdges(1,4);
        g.addEdges(2,3);
        g.addEdges(3,4);

        g.printMatrix();
        g.printGraph();
        g.shortestDistance(0,4);

    }

}
