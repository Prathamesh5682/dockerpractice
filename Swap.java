public class Swap{
    public static void main(String args[]){
        int i=10,j=20;

        System.out.println("Values i :  "+i+" and j : "+j);

        swap(i,j);

        
    }

    public static void swap(int i, int j){
        int temp = i;
        i=j;
        j=temp;
        System.out.println("Values i :  "+i+" and j : "+j);
    }
    
}
