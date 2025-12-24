import java.util.ArrayList ; 
import java.util.Collections ; 
class basic{
    public static void main(String[] args){
        ArrayList<Integer> listName = new ArrayList<>() ; 

        listName.add(1); 
        listName.add(3); 
        listName.add(2); //O(1) ; 


        System.out.println(listName) ; 
        System.out.println(listName.get(2)) ; //O(1) ; 


listName.remove(2) ; //delete the ith idx ;  O(n)
System.out.println(listName) ; 


        listName.add(6); 



listName.set(2,5) ; //O(n)
System.out.println(listName) ; 


System.out.println(listName.contains(11));
System.out.println(listName.contains(5));//O(n)

listName.add(3,9);
System.out.println(listName) ; //O(n)



System.out.println(listName.size()) ;

for(int i = 0 ; i <listName.size() ; i++ ){
    System.out.println(listName.get(i)+" ") ;
}


Collections.sort(listName) ; 
System.out.println(listName) ; 

Collections.sort(listName,Collections.reverseOrder()) ; //comparetor 
System.out.println(listName) ; 
//implementation 
 

 ArrayList<ArrayList<Integer>> mainList = new ArrayList<>() ; 
 ArrayList<Integer>currentlist1 = new ArrayList<>() ;
 ArrayList<Integer>currentlist2 = new ArrayList<>() ;
 ArrayList<Integer>currentlist3 = new ArrayList<>() ;

 currentlist1.add(1);
 currentlist1.add(5);
 currentlist2.add(2);
 currentlist2.add(4);
 currentlist3.add(3);
 currentlist3.add(6);

 mainList.add(currentlist1);
 mainList.add(currentlist2);
 mainList.add(currentlist3); 

 System.out.println(mainList) ; 


 for(int i = 0 ; i<mainList.size() ; i++){
    ArrayList<Integer>currentlist = mainList.get(i) ; 
    for(int j = 0 ; j < currentlist.size() ; j++){
System.out.print(currentlist.get(j)+" ") ; 
    }
    System.out.println() ; 
 }
    }
}