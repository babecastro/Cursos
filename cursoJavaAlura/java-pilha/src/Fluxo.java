  public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try{
		    metodo1();
		} catch(Exception ex) {
		    String msg = ex.getMessage();
		    System.out.println("Exception " + msg);
		    ex.printStackTrace();
		} 
		System.out.println("Fim do main");
	}

	private static void metodo1()  throws MinhaExcecao{
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecao{
		System.out.println("Ini do metodo2");
		throw new MinhaExcecao("deu muito errado");
		//throw new NullPointerException("deu mto errado");
		//System.out.println("Fim do metodo2");		
	}
}

