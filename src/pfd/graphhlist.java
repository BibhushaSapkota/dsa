package pfd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class graphhlist {
    Linkedlistt[] list;
    int size;
    graphhlist(int v){
        list=new Linkedlistt[v];
        this.size=v;

        for(int i=0;i<size;i++){
            list[i]=new Linkedlistt();
        }
    }
    public void addEdges(int source,int destination ){
        list[source].addNode(destination);
        list[destination].addNode(source);
    }

    public void printGraph(){
        for (int i=0 ; i<size ; i++) {
            System.out.print(i + " is connected to ");
            if (list[i].getSize() > 0) {
                for (int j = 1; j <= list[i].getSize(); j++) {
                    System.out.print(list[i].getDataAtanyposition(j) + " ");

                }
                System.out.println(" ");
            }
        }

    }

    public List<Integer> getadjnodes(int i) {
        ArrayList<Integer> adjlist = new ArrayList<Integer>();

        if (list[i].getSize() > 0) {
            for (int j = 1; j <= list[i].getSize(); j++) {
                adjlist.add(list[i].getDataAtanyposition(j));
            }

        }
        return adjlist;
    }
    public void BFs(int rootnode){
        QueueTest queue=new QueueTest(5);
        boolean[] visited=new boolean[5];

        visited[rootnode]=true;
        queue.enqueue(0);

        while (!queue.isEmpty()){
            int x=queue.dequeue();
            System.out.println(x);
            Iterator<Integer> iterator=getadjnodes(x).iterator();
            while (iterator.hasNext()){
                int adjval=iterator.next();
                if(!visited[adjval]){
                    queue.enqueue(adjval);
                    visited[adjval]=true;
                }
            }
        }


    }
    public void DepthFirstSearch(int rootnode){
        System.out.println("Printing result");
        boolean[] visited = new boolean[size];
        dfs(rootnode,visited);

    }
    public void dfs(int rootnode,boolean [] visited) {
        visited[rootnode] = true;
        System.out.println(rootnode);
        Iterator<Integer> iterator = getadjnodes(rootnode).iterator();
        while (iterator.hasNext()) {
            int adjval = iterator.next();
            if (!visited[adjval]) {
                dfs(adjval, visited);
            }
        }
    }





    public static void main (String[]args){
            graphhlist g = new graphhlist(5);
            g.addEdges(0, 1);
            g.addEdges(0, 2);
            g.addEdges(1, 3);
            g.addEdges(1, 4);
            g.addEdges(2, 3);
            g.addEdges(3, 4);


            g.printGraph();
            g.BFs(0);
            g.DepthFirstSearch(0);

        }
    }
