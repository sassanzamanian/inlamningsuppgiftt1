import javax.swing.JOptionPane;

public class Hund extends Djur implements ICalculateFood  
{

	Hund(double vikt, String name) 
	{
		super(vikt, name);
		this.matTyp = "hundfoder"; //varje instans av hund ska ha tilldelat stringen hundfoder för mattyp

	}
	
	public int calculateFood()			//obligatorisk metod för uträkning av portionstorlek, med heltal return
	{
		this.portion = (this.vikt / 100);
		
		return (int)this.portion;
	}
	
	@Override               //dynamisk bindning, bekräftar att metoden i klassen väljs först när instans av relevant typ anropar printMe()
	public void printMe(){
		 
		JOptionPane.showMessageDialog(null, "Hunden "+getName() + " ska ha " +calculateFood() + " gram av "+getMatTyp()+"!");
	}
}
