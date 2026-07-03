public class Main {

    public static void main(String[] args) {
        Refrigerante r1 = new Refrigerante();

        r1.marca = "Coca Cola ";
        r1.Sabor = "Refrescante ";
        r1.Modelo ="Lata";
        r1.Cor = "Avermelhado e preto ";

        r1.aberto();
        r1.tomar();

        r1.getSabor();
        r1.getModelo();
        r1.getCor();
        r1.getmarca();
        r1.status();

        r1.fechado();
        r1.tomar();
    }
}
