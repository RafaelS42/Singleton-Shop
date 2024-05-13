import Teste.GetSetTeste;
import Teste.Singleton;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //Testes and making it work
        GetSetTeste arroz = new GetSetTeste();

        System.out.println(arroz.getNome());
        arroz.setNome("Sal");
        System.out.println(arroz.getNome());

        Singleton carro = Singleton.getInstance("Palio");
        System.out.println(carro.Name);
        Singleton segundoCarro = Singleton.getInstance("Camaro");
        System.out.println(segundoCarro.Name);

        // Let's do the shop

        ClientInfo Client = ClientInfo.getInstance("Arthur", 123);
        System.out.println(Client.Name);

        System.out.println(Client.getCPF());

    }
}