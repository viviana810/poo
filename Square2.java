class Square2 { 
  //el argumento del metodo printSquare es un entero 
   public static void printSquare(int x){ 
   System.out.println(x*x); 
   } 
   public static void main(String[] arguments){ 
  //el metodo printSquare no puede recibir String porque lo que recibe es un entero, 
  //si recibe una cadena saldra error 
   printSquare("hello"); 
  //el metodo no puede recibir double 
   printSquare(5.5); 
   } 
}