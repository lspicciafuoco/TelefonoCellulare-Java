package telefonocellulare;

public class TelefonoCellulare_1 {

    private String Sms;

    public TelefonoCellulare_1() {
        
        Sms="";
    }

    public void inviaSms(TelefonoCellulare_1 altro, String Sms) {
        
        altro.riceviSms(Sms);
    }

    public String riceviSms(String Sms) {
        
        this.Sms = Sms;
        return Sms;
    }
    
    public String mostraSms(){
        return Sms;
    }
}
