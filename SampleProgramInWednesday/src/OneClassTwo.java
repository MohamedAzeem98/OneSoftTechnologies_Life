import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.Builder;

public class OneClassTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	HttpClient client=HttpClient.newHttpClient();
	
	HttpRequest request=HttpRequest.newBuilder().uri(URI.create("http://webNet.me")).GET().build();
	
	HttpResponse<void>response=client.send(request,HttpResponse.BodyHandlers.discarding());
	
	
	System.out.println(response.statusCode());
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
