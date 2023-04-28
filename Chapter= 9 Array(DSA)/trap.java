public class trap {
    public static void main(String args[]){
    //public static void trapwater(int height[]){
        int height[] = {4,2,0,3,2,5};
        int n = height.length;
        int leftmax[] = new int[n];
        int rightMax[] = new int[n];

        leftmax[0] = height[0];
        rightMax[n-1] = height[n-1];

        for(int i =1; i<n; i++){
            leftmax[i] = Math.max(rightMax[i-1], height[i]);
        }

        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);

        }
        int water = 0 ;

        for(int i = 0; i<n; i++){
            water+= Math.min(leftmax[i],rightMax[i])-height[i]; 
        }
        System.out.println(water);

    }
    
    // public static void main(String args[]){
    //     int height[] = {4,2,0,3,2,5};
    // }
    
    
    //System.out.println(trapwater(height));

}
