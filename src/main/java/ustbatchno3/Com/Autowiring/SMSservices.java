package ustbatchno3.Com.Autowiring;

public class SMSservices implements MessageServices {

	public void sendmessage(String message) {
		System.out.println("SMS message: "+message);
		
	}

}
