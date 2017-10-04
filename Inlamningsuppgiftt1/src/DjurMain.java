
import java.util.List;
import javax.swing.JOptionPane;

public class DjurMain {
														//ny metod som tar djubackend-listan in i en ny lista för "cleanare" kod
	public static List<Djur> allaDjurPåHotellet() {

		DjurBackend djurbackend = new DjurBackend();

		List<Djur> allaDjur = djurbackend.anropaAllaDjurPåHotellet();

		return allaDjur;
	}

	public static void main(String[] args) {
									
		while (true) {			//loop som ständigt loopar o frågar om djurets mat

			String input = JOptionPane.showInputDialog("Vilket djur ska få mat?");

			//foreach loop för varje objekt av djur i listan av djur
			for (Djur djur : allaDjurPåHotellet()) {
				if (input.equalsIgnoreCase(djur.name)) { //ignorerar om användaren använder versaler eller gemener vid tillkallning
					djur.printMe();						//anropar relevant printMe->följer objektstyp inte referensklassen--> polymorfism
				}
				

			}

		}
	}
}
