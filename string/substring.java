class substring{
    public static void substringg(String str, int stidx , int endidx){
        String substr ="";
        for(int i = stidx ; i < endidx ; i++){
substr+=str.charAt(i);
        }
        System.out.println(substr);
    }
    public static void main(String[] args){
        String str = "Aditya Kumar pradhan";
        substringg(str,0,5);
        System.out.print(str.substring(0,5));
    }
}