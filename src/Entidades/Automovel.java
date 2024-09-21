package Entidades;

public class Automovel implements Veiculos {

    String marca;
    String modelo;

    // Construtor que inicialisa Marca e Modelo
    public Automovel(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String acelerar() {
        return "Acelerando...";
    }

    @Override
    public String frear() {
        return "Freando...";
    }

    public String informarTipoCombustivel() {
        return null;
    }

    // Função extra experimental
    public String informacoes() {
        return "Marca: " + marca + " | " + "Modelo: " + modelo;
    }
}
