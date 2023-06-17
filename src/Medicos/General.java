package Medicos;

public class General extends Medicos{

    private String especialidad;

    public General(String nombre, Long codigo, String especialidad) {
        super(nombre, codigo, especialidad);
        this.especialidad = especialidad;

    }
    @Override
    public String getEspecialidad() {
        return especialidad;
    }
}
