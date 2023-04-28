// Traping rain water--> calculating how much water is trapped inside the building or we can say inside the bars;

public class TrapingWater_12 {
    public static int TraprainWater(int height[]){
        int n = height.length;

        // calculating left max boundry -- array;
         int leftMax[] = new int[n];
         leftMax[0] =  height[0];

        for(int i=1; i<n; i++){
            leftMax[i]= Math.max(height[i], leftMax[i-1]);
        }

        // calculating Right max boundry;

        int rightMax[] = new int [n];
        rightMax[n-1] = height[n-1];

        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int TrapWater = 0;
        // loop

        for(int i = 0; i<n; i++){
            int waterlevel = Math.min(leftMax[i],rightMax[i]);
            
            TrapWater+= waterlevel-height[i];
        }

        return TrapWater;
    }
    public static void main(String args[]){
       int height[] = {4,2,0,6,3,2,5};


        //TrapWater(height);
        System.out.print("The total trapwater is "+(TraprainWater(height)));
        //TrapWater(height);

    
    }
}
