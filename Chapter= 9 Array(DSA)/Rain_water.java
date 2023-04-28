// calculating how much water is trapped inside the building ;

public class Rain_water {
    public static void RainWater(int height[]){
        int n = height.length;

        // calculate left max boundry;

        int left_max[] = new int [n];
        left_max[0] = height[0];

        for(int i =1; i<n; i++){
            left_max[i] = Math.max(height[i], left_max[i-1]);
        }

        // calculating Right max boundry;

         int right_max[] = new int [n];
         right_max[n-1] = height[n-1];

         for(int i = n-2; i>=0; i--){
            right_max[i] = Math.max(right_max[i+1], height[i]);
         }


        int building_water =0; 

         for(int i=0; i<n; i++ ){
             int Rain_water = Math.min(left_max[i],right_max[i]);

             building_water += Rain_water - height[i];
         }

         System.out.println("The rain water inside the building is "+ building_water);

    }
    public static void main(String args[]){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        RainWater(height);
    }
}
