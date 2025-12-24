class basic{
    public static class node {
        int data ; 
        node next ; 

        public node(int data){
            this.data = data ; 
            this.next = null ; 
        }
    }

    public static void main(String [] args){
        node a = new node(5) ; 
        node b = new node(6) ; 
        node c = new node(7) ; 
        node d = new node(8) ; 

a.next = b ; 
b.next = c ; 
b.next.next = d ; 


node temp = a ; 
        while(temp!=null){
            System.out.println(temp.data+" ") ; 
            temp = temp.next ; 
        }


        while(temp!=null){
            System.out.println(temp.data+" ") ; 
            temp = temp.next ; 
        }
//This will not print my name as temp has been nulled 
// for this we will use function 


System.out.println("printing by function") ; 
print(a) ; 
System.out.println("printing by function") ; 
print(a) ; 
System.out.println("printing by recursion") ; 
recursionprint(a) ; 

length(a) ; 
    }


    public static void print(node headnode){
node temp = headnode ; 
while(temp!=null){
            System.out.println(temp.data+" ") ; 
            temp = temp.next ; 
        }

    }


    public static void recursionprint(node headnode){
        if( headnode == null ) return ; 
        System.out.print(headnode.data+" ") ;
        recursionprint(headnode.next) ; 
    }

    public static void length (node headnode){
        node temp = headnode ;
        int count = 0 ;  
while(temp!=null){
            temp = temp.next ; 
            count ++ ; 
        }
        System.out.println("The Size Of The Linked List is "+count) ; 
    }
}