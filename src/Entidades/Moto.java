package Entidades;

public class Moto extends Automovel {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    public String informarTipoCombustivel() {
        return "Etanol";
    }

}
