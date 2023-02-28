public class Persona{
  private String nombre;
  private String apellido;
  private String carrera;
  private int semestre; 

  public Persona(String nombre, String apellido, String carrera, int semestre){
    this.nombre=nombre;
    this.apellido=apellido;
    this.carrera=carrera;
    this.semestre=semestre;
  }

  public String getNombre(){
   return nombre;
  }

  public String getApellido(){
   return apellido;
  }

  public String getCarrera(){
   return carrera;
  }

  public int getSemestre(){
   return semestre;
  }
}
