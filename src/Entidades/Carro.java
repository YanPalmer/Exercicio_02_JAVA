package Entidades;

public class Carro extends Automovel{
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    public String informarTipoCombustivel() {
        return "Gasolina";
    }

    /*
    public String getTipoAutomovel() {
        return "Carro";
    }
     */
}
