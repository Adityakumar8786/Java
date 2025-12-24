public class MaxSegmentTree {

    static int[]tree ; 

    public static void init(int n){

tree = new int[4*n] ;

    }

    public static int buildSegMentTree(int[]arr,int i , int start,int end){

if(start == end){
    tree[i] = arr[start] ; 
    return arr[start] ; 
}

int mid = (start + end ) / 2 ; 

buildSegMentTree(arr, 2*i+1, start, mid);
buildSegMentTree(arr, 2*i+2, mid+1, end);

return tree[i] = Math.max(tree[2*i+1] , tree[2*i+2]) ;
    }

    public static int findMaxUtil(int[]arr,int i , int qi , int qj , int si , int sj){

        if(qi > sj || qj < si ){
return Integer.MIN_VALUE ;
        }

        else if(qi <= si && qj >= sj){
return tree[i] ;
        }

        else{

            int mid = (si+sj)/2 ; 
            int left = findMaxUtil(arr,2*i+1,qi,qj,si,mid);
            int right = findMaxUtil(arr,2*i+2,qi,qj,mid+1,sj);

            return Math.max(left , right ) ;
        }
    }

    public static int findMax(int[]arr,int qi,int qj){
int n = arr.length;
return findMaxUtil(arr,0,qi,qj,0,n-1) ;

    }

    public static void update(int arr[],int idx , int newVal){
int n = arr.length ; 
arr[idx] = newVal ; 

updateUtil(0,0,n-1,idx,newVal);
    }

    public static void updateUtil(int i ,int si , int sj ,int idx , int newVal){

        if(idx < si || idx > sj){
            return ; 
        }

    if(si != sj){
tree[i] = Math.max(tree[i],newVal) ; 
int mid = (si + sj) / 2 ;

updateUtil(2*i+1, si, mid, idx, newVal);
updateUtil(2*i+2, mid+1, sj, idx, newVal);
     }


    }

    public static void main(String[]args){

        int[] arr = {1,2,3,4,5,6,7,8} ; 
         int n = arr.length ; 
        init(n);
        buildSegMentTree(arr, 0, 0, n-1);
        System.out.println(findMax(arr, 1, 5));
        update(arr, 5, 9);
        System.out.println(findMax(arr, 1, 5));

    }
}