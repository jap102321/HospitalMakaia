package Medicos;

public class Deportes extends Medicos{
    private String especialidad;
    public Deportes(String nombre, Long codigo, String especialidad) {
        super(nombre, codigo, especialidad);
        this.especialidad = especialidad;

    }

    @Override
    public String getEspecialidad() {
        return especialidad;
    }
}
