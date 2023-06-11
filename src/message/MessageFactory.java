package message;

public class MessageFactory {
    public MessageFactory() {
    }

    public MessageService createService(String type){
        if (type.equals("Whatsapp")){
            return new Whatsapp();
        } else if (type.equals("Sms")) {
            return new Sms();
        } else if (type.equals("Email")) {
            return new Email();
        }else return null;
    }
}
