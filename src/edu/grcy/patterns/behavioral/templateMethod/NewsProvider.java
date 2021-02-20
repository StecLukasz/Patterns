package edu.grcy.patterns.behavioral.templateMethod;

public abstract class NewsProvider {
    private int id;
    private String message;

    // mamy metodę które musimy zaimplementować
    public abstract boolean authorize();

    //mamy metodę która jest na stae, nie można jej zmieniać (final)
    public final boolean sendMessage() {
        System.out.println("Message sent:"+message);
        return true;
    }
    //mamy metody które możemy zaimplementować
    public  boolean endConnection(){
        System.out.println("Generic end connection");
        return true;
    };

    //mamy finalną metodę która definiuje jakiś algorym lub ścieżkę wykonania
    //kolejnosci wykonana nie można zmienaiać, ale można dospisać kod do metod abstrakcyjnych
    //lub/i niefinalnych
    public final void provideNews() {
        authorize();
        sendMessage();
        endConnection();
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
