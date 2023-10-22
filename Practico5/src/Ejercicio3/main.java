package Ejercicio3;

public class main {
    public static void main(String[] args) {
        Lote l1 = new Lote(1, 45);

        Pastura p1 = new Pastura("Alfalfa", 40);
        Cereal c1 = new Cereal("Maiz");
        Mineral m1 = new Mineral("calcio");
        c1.addMinerales(m1);
        Mineral m2 = new Mineral("Nitrogeno");
        Lote l2 = new Lote(2, 60);
        p1.addMinerales(m1);
        l1.addMinerales(m1);
        System.out.println(p1.sePuedeSembrar(l1));
        System.out.println(c1.sePuedeSembrar(l1));
        System.out.println(l1.elLoteEsEspecial());
        System.out.println(l2.elLoteEsEspecial());
    }

}
