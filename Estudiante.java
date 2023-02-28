public class Estudiante extends Persona{
  private int codigo;
  private String sede;

  public Estudiante(String nombre, String apellido, String carrera, int semestre, int codigo, String sede){
    super(nombre,apellido,carrera,semestre);
    this.codigo=codigo;
    this.sede=sede;
  }

  public void mostrarDatos(){
  System.out.println("Nombre: "+getNombre()+
                    "\nApellido: "+getApellido()+
                    "\nEdad: "+getCarrera()+
                    "\nCarrera: "+getSemestre()+
                    "\nCodigo: "+codigo+
                    "\nSede: "+sede);
  }
}
                   
