package Teste;

public class Singleton {

    private static Singleton instance;
    public String Name;

    private Singleton(String value) {
        this.Name = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}

