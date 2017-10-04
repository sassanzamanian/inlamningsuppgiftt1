import javax.swing.JOptionPane;

abstract class Djur 
{
							    //4 nedånstående variabler, inkappsling, tillgängliga och ärvda av subklasserna
	protected double vikt;
	protected String matTyp;
	protected double portion;
	protected String name;
	
	Djur(double vikt, String name)		//construktor med namn och vikt
	{
		this.vikt = vikt;			
		this.name = name;
	}
	
	
	public String getName(){		
		return name;
	}
	
	public String getMatTyp(){
		return matTyp;
	}
	
	
	public void printMe(){
		JOptionPane.showMessageDialog(null, "ehhhh? ");
	}
}
