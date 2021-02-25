package MiCodigo;

public class ParejaNumeros {
	//Aqui van los atributos
	int num1;
	int num2;
	
	//El constructor
	public ParejaNumeros(int Nuevonum1, int Nuevonum2){
		num1=Nuevonum1;
		num2=Nuevonum2;
	}
	//Resto de metodos
	public int devuelveSuma(){
		int suma;
		suma=num1+num2;
		return (suma);
		
	}
	public int devuelveResta(){
		return (num1-num2);
		
	}
	public int devuelveMultiplicacion() {
		return (num1*num2);
	}
	public float devuelveDivision() {
		float division;
		division=num1/num2;
		return(division);
	}

}