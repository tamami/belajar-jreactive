package lab.aikibo.iso8583;

import com.solab.iso8583.IsoMessage;
import com.solab.iso8583.MessageFactory;
import org.jreactive.iso8583.client.Iso8583Client;

public class IsoClientDemo {
  public static void main(String args[]) {
    MessageFactory<IsoMessage> messageFactory = ConfigParser.createDefault();
    Iso8583Client<IsoMessage> client = new Iso8583Client<>(messageFactory);

    client.addMessageListener(new IsoMessageListener<IsoMessage>() {

    });
    client.getConfiguration().replyOnError(true);
    client.init();

    client.connect(localhost, 123456);
    if(client.isConnected() {
      IsoMessage message = messageFactory.newMessage();
      client.send(message);
    })

    client.shutdown();
  }
}
