class maxwaterproblem {
    public static int maxWater(int arr[]) {
        int largest = 0 ; 
        int left = 0;
        int right = arr.length-1;
        
            while(left<right){
                int height = Math.min(arr[left],arr[right]);
                int width = right-left ;
                int area = height*width ; 
                largest = Math.max(largest,area);
                if(arr[left] < arr[right]){
                    left++ ;
                }
                else{
                   right-- ; 
                }
            }
        
        return largest ; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 2, 3, 4, 5, 7};
        System.out.println(maxWater(arr)); // Output: 16
    }
}
