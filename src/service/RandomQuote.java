package service;
import javax.jws.*;

@WebService

public interface RandomQuote {
	@WebMethod
	public String getQuote();
	
	@WebMethod
	public void addQuote(String quote);

}
