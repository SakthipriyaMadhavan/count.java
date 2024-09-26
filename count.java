import java.util.Scanner;
import java.util.Arrays;
class Count{
    public static void main(String[] args){
        
        int i,n;
        Scanner k= new Scanner(System.in);
        System.out.println("Enter first number");
        int n1=k.nextInt();
        System.out.println("Enter second number");
        int n2=k.nextInt();
       
        int count=0;
        
        for(i=n1;i<=n2;i++)
            System.out.println(i);//prints the numbers from your given range
         
           
        for(i=n1;i<=n2;i++){
            
        boolean arr[]=new boolean[10];//array to check if there is a "true"
        int c=i;
        
        while(c>0){
        n=c%10;
            
         if(arr[n]==false)
         arr[n]=true;

        else
        break;
             
        c=c/10;
             
             }
               
    
             if(c==0)
             {
             count++;
             
    
             }
         }
         
        
          System.out.println("the no.of unrepeated numbers is "+count)  ;
       
}
    
}
