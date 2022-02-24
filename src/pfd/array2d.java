package pfd;

public class array2d {
    int a[][];

    array2d(int rows , int cols){
        a=new int[rows][cols];

    }
    public  void insert(){
        a[0][0]=1;
        a[0][1]=2;
        a[0][2]=3;
        a[1][0]=4;
        a[1][1]=5;
        a[1][2]=6;
        a[2][0]=7;
        a[2][1]=8;
        a[2][2]=9;



    }
    public void display(){
        for (int i=0;i<a.length;i++){
            for(int j=0; j<a[0].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }

    }
    public  static void main(String[] args){
        array2d a=new array2d(3,3);

        a.insert();
        a.display();
    }
}
