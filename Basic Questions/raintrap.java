public class raintrap{
    public static void raintrap(int height[],int width){
        //build left array
int [] maxleft = new int[height.length] ;
maxleft[0] = height[0];

for(int i = 1 ; i < height.length ; i++){
maxleft[i] = Math.max(height[i],maxleft[i-1]);
}



        //build right array 

        int [] maxright = new int[height.length]; 
maxright[height.length-1] = height[height.length-1] ; 
for(int i = height.length-2 ; i>=0 ; i-- ){
    maxright[i] = Math.max(height[i],maxright[i+1]);
}


        //calculate the amount of water 

        int trapwater = 0;

        for(int i = 0 ; i < height.length ; i++){
            trapwater += (Math.min(maxleft[i],maxright[i])-height[i])*width ; 
        }
System.out.println(trapwater);
    }

    public static void main(String [] args){
        int [] height = {4,2,0,6,3,2,5};
        int width = 1 ; 
        raintrap(height,width);
    }
}