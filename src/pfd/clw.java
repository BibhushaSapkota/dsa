package pfd;

public class clw {
    int trapwater(int height[]){
        int ans=0;
        int n=height.length;

        for (int i=0; i<n; i++){
            int leftmax=height[i];
            for (int j=i-1;j>=0;j--){
                leftmax=Math.max(leftmax,height[j]);

            }
            int rightmax = height[i];
            for (int j=i+1;j<=n-1;j++){
                rightmax=Math.max(rightmax,height[j]);

            }
            ans=ans+(Math.min(leftmax,rightmax)-height[i]);

        }
        return ans;
    }
    public static void main(String[] args){
        clw c= new clw();
        int height[]={2,3,1,2,5};
        System.out.println(c.trapwater(height));

    }
}
