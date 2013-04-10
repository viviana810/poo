public class Porcentaje{
   public static void main(String [] args){
     String h,m,s;
     System.out.println("ingrese la hora");
     h=System.console().readLine();
     int hr=Integer.parseInt(h);
    
     while(hr!=-1){
     System.out.println("ingrese los minutos");
     m=System.console().readLine();
     System.out.println("ingrese los segundos");
     s=System.console().readLine();
     hr=Integer.parseInt(h);
     int mt=Integer.parseInt(m);
     int sg=Integer.parseInt(s);
       int sum=hr*3600;
       int su=mt*60;
      double total=sum+su+sg;
      total=total/86400;
      total=total*100;
      System.out.println("el porcentaje del dia es"+ total);
      System.out.println("ingrese la hora");
      h=System.console().readLine();
      hr=Integer.parseInt(h);
           }
     System.out.println("chao");
  
 
   }
}