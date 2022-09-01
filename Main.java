public class Auto {
    int puertas;

    public static void incrementarPuertas(){
        this.puertas = this.puertas + 1;
    }
    public static void mostrarCantPuertas(){
        System.out.println(this.puertas);
    }
}

public class Main {
    public static void suma(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int resultado;
        a = 1;
        b = 2;
        c = 3;
        resultado = suma(a,b,c);

        System.out.println(resultado);
    Auto miAuto = new Auto();

    miAuto.incrementarPuertas();

    }
}