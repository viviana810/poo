class Gravity {

   public static void main(String []args){
      //la aceleracion es de tipo double
      double a=9.8;
      //se ingresan los demas datos por teclado
      System.out.println("ingrese el tiempo");
      String t=System.console().readLine();
      System.out.println("ingrese la velocidad inicial");
      String v=System.console().readLine();
      System.out.println("ingrese la posicion inicial");
      String p=System.console().readLine();
      //pasamos los datos de tipo string ingresados por teclado a de tipo int y double
      double i=Double.parseDouble(t);
      double j=Double.parseDouble(v);
      double k=Double.parseDouble(p);
      //realizamos la ecuacion con todos los datos 
       double df=((0.5*a*i*i)+(j*i)+k);
      //resultado final
      System.out.println(df);
   }
}