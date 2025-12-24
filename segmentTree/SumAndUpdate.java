public class SumAndUpdate {
static int[] tree ; 

public static void init(int n){
tree = new int[n*4] ; 
}
    
public static int buildst(int[]arr , int i , int start , int end){

if(start == end){
tree[i] = arr[start] ; 
return arr[start] ;
}


int mid = (start +end) / 2 ; 

buildst(arr, 2*i+1, start, mid) ; 
buildst(arr, 2*i+2, mid+1, end) ; 

tree[i] = tree[2*i+1]+tree[2*i+2] ; 
return tree[i] ;

}
    public static int getsumutil(int[]arr,int si , int sj ,int qi , int qj , int i ){

        if(qj<si || qi>sj){ //non overlapping 

            return 0 ; 

        }else if(qj>=sj && qi <= si){ // completely overlapping  

            return tree[i] ; 

        }else{ //partial overlap

            int mid = (si+sj)/2 ; 
            int left = getsumutil(arr, si , mid , qi, qj , 2*i+1);
            int right = getsumutil(arr, mid+1,sj,qi,qj,2*i+2);

            return left + right ; 

        }
    }


    public static int getSum(int[]arr,int qi , int qj){
        int n = arr.length ;
        return getsumutil(arr,0 ,n-1 , qi ,qj,0);
    }


    public static void updateUtil(int[]arr ,int idx, int i , int diff , int si ,int sj){

        if(idx >= sj || idx <= si){
return ;
        }
tree[i] += diff ;

if(si != sj){
    int mid = (si+sj)/2 ; 
    updateUtil(arr, idx, 2*i+1, diff, si, mid);
    updateUtil(arr, idx, 2*i+2, diff, mid+1, sj);
}
    }


    public static void update(int[]arr,int idx , int newval){
int n = arr.length ;
   int diff = arr[idx]-newval ; 
   arr[idx] = newval ;
updateUtil(arr,idx,0,diff,0,n-1);
    }

public static void print(int[]arr){

    for(int i = 0 ; i < arr.length ; i++){
System.out.print(arr[i]+" ");
    }
System.out.println();
}
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8} ; 
        int n = arr.length ; 
        init(n);
        buildst(arr, 0, 0, n-1) ;
        System.out.println(getSum(arr, 0, 4)) ;

        print(arr);
        update(arr, 5, 10);
        print(arr);
    }
}