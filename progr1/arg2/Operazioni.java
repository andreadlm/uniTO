class Operazioni {
    public static void main(String[] args) {

        int op, a, b;

        System.out.print("Operazioni:\n\t1: somma\n\t2: sottrazione\n\t3: moltiplicazione\n\t4: divisione\nOperazione scelta: ");
        op = SIn.readInt();

        System.out.print("Inserire il primo numero: ");
        a = SIn.readInt();

        System.out.print("Inserire il secondo numero: ");
        b = SIn.readInt();
        
        if(op == 1) System.out.println("La somma dei due numeri e': " + (a + b));
        else if(op == 2) System.out.println("La differenza dei due numeri e': " + (a - b));
        else if(op == 3) System.out.println("Il prodotto dei due numeri e': " + (a*b));
        else if(op == 4) System.out.println("Il quoziente dei due numeri e': " + ((float)a / b));
        else System.out.println("L'operazione inserita non esiste");
    }
}