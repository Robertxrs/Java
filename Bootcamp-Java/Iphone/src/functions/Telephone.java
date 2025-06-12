package functions;

public class Telephone{
    private String number;

    public Telephone() {
    }
    
    public Telephone(String number) {
        this.number = number;
    }
    
    public void makeCall(String number) {
        System.out.println("Fazendo ligação para: " + number);
    }
    public void endCall() {
        System.out.println("Encerrando ligação");
    }

}
