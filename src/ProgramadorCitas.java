import Medicos.Medicos;
import Usuarios.Usuario;

public class ProgramadorCitas implements Hospital{
    private int precio;

    public ProgramadorCitas(){

    }
    @Override
    public int precioCita(String tipo_paciente) {
        if(tipo_paciente.equalsIgnoreCase("EPS")){
            precio = 30000;
        } else if (tipo_paciente.equalsIgnoreCase("poliza")) {
            precio = 40000;
        }else {
            precio = 70000;
        }
        return precio;
    }


    public String agendarCita(Medicos medico, Usuario usuario, String fecha){

        return "Su cita con el " + medico.getEspecialidad() + " para el usuario " + usuario.getNombre() +
                " para el día " + fecha +
                " tiene un costo de " + precio + "$";
    }

}
