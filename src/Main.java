import Entidades.Automovel;
import Entidades.Carro;
import Entidades.Moto;
import Entidades.Veiculos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Automovel automovel = new Automovel("Yamaha", "CB 300");
        //System.out.println(automovel.informacoes());
        List<Automovel> automoveis = new ArrayList<>();

        automoveis.add(new Carro("Yamaha", "CBR 2000"));
        automoveis.add(new Moto("Honda", "XRE"));

        for (int i = 0; i < automoveis.size(); i++) {
            System.out.println(automoveis.get(i).acelerar() + " e " + automoveis.get(i).frear());

            if (automoveis.get(i) instanceof Automovel) {
                System.out.println("Tipo de combustível: " + automoveis.get(i).informarTipoCombustivel());
                System.out.println(automoveis.get(i).informacoes());
                System.out.println("=============================");
            }
        }

    }
}