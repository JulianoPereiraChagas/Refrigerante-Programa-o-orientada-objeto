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
    }

    public void aberto() {
        this.fechado = false;
    }

    public void fechado() {
        this.fechado = true;
    }

    void tomar(){
        if (this.fechado) {
            System.out.println("Refrigerante fechado! Não é possível beber ele!");
        } else {
            System.out.println("Refrigerante aberto! Pode tomar a vontade! ");
        }
    }
}
