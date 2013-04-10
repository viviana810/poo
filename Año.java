public class Año{
 public static void main (String [] args){
      String x;
      System.out.println("ingrese el año");
      x=System.console().readLine();
      int a=Integer.parseInt(x);
       
         while(a!=-1){
          if ((a%4==0)&&(a%100!=0)){
             System.out.println("si");

           }
            else{
               System.out.println("no");
             }
          System.out.println("ingrese el año");
          x=System.console().readLine();
          a=Integer.parseInt(x);
        }
 
    }
  }
