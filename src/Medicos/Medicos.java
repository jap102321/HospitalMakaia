package Medicos;

public abstract class Medicos{

    private String nombre;
    private Long codigo;
    private String especialidad;

    public Medicos(String nombre, Long codigo, String especialidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.especialidad = especialidad;
    }


    public abstract String getEspecialidad();
}
