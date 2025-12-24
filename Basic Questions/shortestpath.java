class shortestpath {
    public static void shortestpath(String str){
int x = 0 ; 
int y = 0 ; 
for(int i = 0 ; i < str.length() ; i++){
    if(str.charAt(i)=='W'){
        x--;
    }
    else if(str.charAt(i)=='E'){
        x++;
    }
    else if(str.charAt(i) == 'N'){
        y--;
    }
    else{
        y++;
    }
}

int x2 = x*x ; 
int y2 = y*y ; 

int distance = (int)Math.sqrt(x2+y2);
System.out.print(distance);
    }
public static void main(String[] args){
    String str= "WNEENESENNN";
    shortestpath(str);

}
}