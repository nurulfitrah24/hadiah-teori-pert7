public class hitung extends volume 
{
	
	public hitung (double jari2){
		super(jari2);
	
	}
	protected void hasil()
	{
		System.out.println("volume bola adalah : "+(4/3*PI*getjari()*getjari()*getjari()));
	}
	
	
}