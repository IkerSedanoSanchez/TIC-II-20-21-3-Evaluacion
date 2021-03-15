package MiCodigo;

public class ManejaAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno pepe;
		Fecha nacimientoJose;
		nacimientoJose=new Fecha(14,3,2021);
		pepe=new Alumno("José","López","García",nacimientoJose);
		System.out.println("Nuevo alumno: ");
		System.out.println(pepe.getNombre());
		System.out.println(pepe.getApellido1());
		System.out.println(pepe.getApellido2());
		System.out.println((pepe.getFechaNacimiento()).getFechaConFormatoLargo());
	}

}
