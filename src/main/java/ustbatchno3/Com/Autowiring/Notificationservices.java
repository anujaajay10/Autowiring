package ustbatchno3.Com.Autowiring;

public class Notificationservices  {
	private MessageServices messageservices ;
	public void notifyservice() {
		messageservices.sendmessage("Hey! I'm autowired");
	}
	public void setMessageservices(MessageServices messageservices) {
		this.messageservices = messageservices;
	}

}
