Scanner reader = new Scanner(System.in);
// Para leer cada uno de los numeros se ejecutara nextInt() dos veces,
para cada número y  se almacenara el resultado en variables de tipo int.
int numero1 = 0;
int numero2 = 0;
  
System.out.println("Introduce el primer número:");      
numero1 = reader.nextInt();
      
System.out.println("Introduce el segundo número:");
numero2 = reader.nextInt();

resultado = numero1+numero2;
System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + resultado);
