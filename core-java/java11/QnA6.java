package assignment.java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Version;
import java.net.http.HttpResponse.BodyHandlers;

public class QnA6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 6. Write a code using HttpClient API which sends a GET request to
		// https://httpbin.org/get, and print out the response header, status code,
		// and body for the given URL.
		//		Sample output could be (Note: date and other attribute values may differ in your 
		//				results):
		//				access-control-allow-credentials:[true] 
		//				access-control-allow-origin:[*] 
		//				connection:[keep-alive] 
		//				content-length:[273] 
		//				content-type:[application/json] 
		//				date:[Fri, 06 Aug 2021 13:07:41 GMT] 
		//				server:[gunicorn/19.9.0] 
		//				200 
		//				{ 
		//				 "args": {}, 
		//				 "headers": { 
		//				 "Content-Length": "0", 
		//				 "Host": "httpbin.org", 
		//				 "User-Agent": "Java 11 HttpClient Bot", 
		//				 "X-Amzn-Trace-Id": "Root=1-610d341d-092dc33f698b192a219426d1" 
		//				 }, 
		//				 "origin": "43.255.221.184", 
		//				 "url": "https://httpbin.org/get" 
		//				}

		String uri = "https://httpbin.org/get";
		HttpRequest req = HttpRequest.newBuilder().uri(URI.create(uri)).GET().version(Version.HTTP_2).build();
		HttpClient client = HttpClient.newBuilder().build();

		try {

			HttpResponse<String> res = client.send(req, BodyHandlers.ofString());
			System.out.println(res.headers() + "\n" + res.statusCode() + "\n" + res.body());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
