package DAY_15;


public class TrappingRainwater {

    public static int trappedRainwater(int height[]){
        int n = height.length;
        //calculate left max boundary
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        //calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i=0; i<n; i++){
            //waterlevel = min(leftmax bound, rightmax bound)
            int waterlevel = Math.min(leftmax[i], rightMax[i]);

            //trapped water = waterlevel - height[i]
            trappedWater += waterlevel - height[i]; 
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
    }
}
