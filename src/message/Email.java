package message;

/**
 * Envia mensagens de email.
 * @author Manoel Campos da Silva Filho
 */
public class Email implements MessageService {
    @Override
    public void send(final String destination, final String msg) throws MessageSendException {
        System.out.printf("Enviando E-mail para %s: %s%n", destination, msg);
    }
}