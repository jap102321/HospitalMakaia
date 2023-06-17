package Medicos;

public class Interna extends Medicos{
    private String especialidad;
    public Interna(String nombre, Long codigo, String especialidad) {
        super(nombre, codigo, especialidad);
        this.especialidad = especialidad;
    }

    @Override
    public String getEspecialidad() {
        return especialidad;
    }

}
