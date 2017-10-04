
import java.util.ArrayList;
import java.util.List;

public class DjurBackend 
{
												//instansera med referensklasss Djur och objekttyp för respektive djur
	Djur sixten = new Hund (5000, "Sixten");	//polyformism
	Djur dogge = new Hund(10000, "Dogge");
	Djur venus = new Katt(5000, "Venus");
	Djur ove = new Katt(3000, "Ove");
	Djur hypno = new Orm(1000, "Hypno");
	
	
	public List <Djur> anropaAllaDjurPåHotellet()		//metod som skapar samt adderar varje objekt till en lista och returnerar
	{
		
		List <Djur> allaDjurPåHotellet = new ArrayList<>();
		
		allaDjurPåHotellet.add(sixten);
		allaDjurPåHotellet.add(dogge);
		allaDjurPåHotellet.add(venus);
		allaDjurPåHotellet.add(ove);
		allaDjurPåHotellet.add(hypno);
		
		return allaDjurPåHotellet;
	}
}

	   