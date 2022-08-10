public static void main(String[] args) {
    
    int c = 0;
   
    int[] listanumero = new int[5];

    Scanner digitos  = new Scanner(System.in);

    for(c=0; c<listanumero.length; c++)
    {
        System.out.println("DIGITA AQUÍ EL DATO: ");
        
        listanumero[c] = digitos.nextInt();
    }

    for(c=0; c<listanumero.length; c++)
    {
        System.out.println("LA LISTA ES: "+listanumero[c]);
    } 
}
