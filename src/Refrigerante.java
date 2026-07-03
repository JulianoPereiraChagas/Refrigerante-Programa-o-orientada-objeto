public class Refrigerante {
    String marca;
    String Sabor;
    String Modelo;
    String Cor;
    boolean fechado;

    public void getmarca(){
        System.out.println("Marca: " + this.marca);
    }

    public void getSabor() {
        System.out.println("Sabor: " + this.Sabor);
    }

    public void getModelo() {
        System.out.println("Modelo: " + this.Modelo);
    }

    public void getCor() {
        System.out.println("Cor: " + this.Cor);
    }

    public void status() {
        System.out.println("--- STATUS ---");
        System.out.println("Marca: " + this.marca);
        System.out.println("Sabor: " + this.Sabor);
        System.out.println("Modelo: " + this.Modelo);
        System.out.println("Cor: " + this.Cor);
        System.out.println("Está fechado? " + this.fechado);
    }

    public void aberto() {
        this.fechado = false;
        System.out.println("O refrigerante foi aberto!");
    }

    public void fechado() {
        this.fechado = true;
        System.out.println("O refrigerante foi fechado!");
    }

    void tomar(){
        if (this.fechado) {
            System.out.println("Refrigerante fechado! Não é possível beber ele!");
        } else {
            System.out.println("Refrigerante aberto! Pode tomar a vontadade! ");
        }
    }
}
