import Teste.Singleton;

public class ClientInfo {
    private static ClientInfo instance;
    public String Name;
    private int CPF;

    private ClientInfo(String Name ,int CPF){
        this.Name = Name;
        this.CPF = CPF;
    }
    public static ClientInfo getInstance(String Name, int CPF) {
        if (instance == null) {
            instance = new ClientInfo(Name ,CPF);
        }
        return instance;
    }

    public int getCPF() {
        return CPF;
    }
}
