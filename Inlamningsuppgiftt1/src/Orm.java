import javax.swing.JOptionPane;

public class Orm extends Djur
{

	Orm(double vikt, String name) 
	{
		super(vikt, name);
		this.portion = 20; 		//hårdkoda värdet 20 till portion för varje instans av Orm
		this.matTyp = "ormpellets";	
	}
	
	@Override
	public void printMe(){
		
		JOptionPane.showMessageDialog(null, "Ormen "+getName() + " ska ha " + (int)this.portion + " gram av "+getMatTyp()+"!");
	}
}
