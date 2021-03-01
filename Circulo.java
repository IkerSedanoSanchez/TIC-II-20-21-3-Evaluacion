package MiCodigo;

public class Circulo {
	double radio;
	double centro_x;
	double centro_y;
	public Circulo(double radio,double centro_x, double centro_y){
		this.radio=radio;
		this.centro_x=centro_x;
		this.centro_y=centro_y;
	}
	double devuelveArea(){
		double area;
		area=(double)(Math.PI*radio*radio);
		return(area);
		
	}
	
}
