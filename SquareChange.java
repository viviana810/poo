class SquareChange { 
  public static void printSquare(int x){ 
  System.out.println("printSquare x = " + x); 
  x = x * x; 
  System.out.println("printSquare x = " + x); 
  } 
  public static void main(String[] arguments){ 
//inicializamos la variable x
  int x = 5; 
//imprime main x=5 porque la variable x no ha cambiado 
  System.out.println("main x = " + x); 
//pasamos la variable x al metodo 
  printSquare(x); 
//imprime main x=5
  System.out.println("main x = " + x); 
  } 
} 
