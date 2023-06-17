import Medicos.Medicos;
import Medicos.General;
import Medicos.Interna;
import Medicos.Deportes;
import Usuarios.Usuario;
import Usuarios.UsuarioEPS;
import Usuarios.UsuarioParticular;
import Usuarios.UsuarioPoliza;

public class Main{
    public static void main(String[] args) {

        Usuario eps = new UsuarioEPS("Juan Pablo", "Gonzalez", 1040870175L, "correo@corre.com");
        Usuario poliza = new UsuarioPoliza("Juan Pablo", "Gonzalez", 1040870175L, "correo@corre.com");
        Usuario particular = new UsuarioParticular("Juan Pablo", "Gonzalez", 1040870175L, "correo@corre.com");

        Medicos general = new General("Felipe", 203102L, "Medico general");
        Medicos interna = new Interna("Wilmer", 3123132L, "Medico medicina interna");
        Medicos deportes = new Deportes("Naniel", 3561232L, "Medico del deporte");


        ProgramadorCitas cita1 = new ProgramadorCitas();
        cita1.precioCita(particular.obtenerTipo());

        System.out.println(cita1.agendarCita(deportes, particular, "12/12/2023"));


    }

}
