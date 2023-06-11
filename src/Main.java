import message.Newsletter;
import people.Customer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<Customer> customers = List.of(
                new Customer("Manoel", "(63) 1111-2222", "manoel@teste.com"),
                new Customer("Breno",  "(63) 3333-4444", "breno@teste.com"),
                new Customer("Raysa",  "(63) 5555-6666", "raysa@teste.com")
        );

        final Newsletter newsletterZap = new Newsletter(customers,"Whatsapp" );
        final Newsletter newsletterSms = new Newsletter(customers,"Sms");
        final Newsletter newsletterEmail = new Newsletter(customers,"Email");
        final String msgTemplate = "Aproveite as promoções de natal #name.";

        System.out.println("---------------------------------Mensagens do zap---------------------------------");
        newsletterZap.send(msgTemplate);
        System.out.println("\n------------------------------------------SMS------------------------------------------");
        newsletterSms.send(msgTemplate);
        System.out.println("\n------------------------------------------EMAIL------------------------------------------");
        newsletterEmail.send(msgTemplate);
    }
}