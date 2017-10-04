import javax.swing.JOptionPane;

public class Katt extends Djur implements ICalculateFood
{

	Katt(double vikt, String name) 		//koden i classen Katt är kodade i samma mönster som Hund
	{
		super(vikt, name);
		this.matTyp = "kattfoder";

	}
	
	public int calculateFood(){
		
		this.portion = (this.vikt / 150);
		
		return (int)this.portion;
	}
	
	@Override
	public void printMe(){
		
		JOptionPane.showMessageDialog(null, "Katten "+getName() + " ska ha " + calculateFood() + " gram av "+getMatTyp()+"!");
	}
}
