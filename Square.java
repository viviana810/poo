class Square { 
  //el metodo printSquare multiplica enteros 
    public static void printSquare(int x){ 
    System.out.println(x*x); 
    } 
    public static void main(String[] arguments){ 
  //inicializamos la variable value 
    int value = 2; 
  //al metodo printSquare le pasamos la variable value
    printSquare(value); 
  //al metodo printSquare le pasamos un entero 
    printSquare(3); 
  //primero multiplicamos la variable value por dos y ese resultado lo pasamos la metodo printSquare
    printSquare(value*2); 
    } 
} 