/*Calcualating how much rain water is trapped inside the building */

public class pr_04 {
    public static void trapped_water(int height[]){
      int  n = height.length;

    //   calculating left max boundry;
    
    int left_max[] = new int [n];
     left_max[0] = height[0];

    for(int i =1; i<n; i++){
        left_max[i] = Math.max(height[i], left_max[i-1]);
    }

    // calculating right max boundry;
    int right_max[] = new int[n];
    right_max[n-1] = height[n-1];

    for(int i =n-2; i>=0; i--){
        right_max[i] = Math.max(height[i], right_max[i+1]);
    }

    int trapwater =0;

    for(int i =0; i<height.length; i++){
        int waterlevel = Math.min(left_max[i], right_max[i]);

        trapwater +=waterlevel-height[i];
    }

    System.out.println("The trapwater inside the building is "+ trapwater);
    }
    public static void main(String args[]){
       // int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
       int height[] ={4, 2, 0, 3, 2, 5};
       

        trapped_water(height);
    }

}
