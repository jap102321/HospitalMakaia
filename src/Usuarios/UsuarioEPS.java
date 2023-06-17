package Usuarios;

public class UsuarioEPS extends Usuario{

    private String nombre;
    private String apellido;
    private Long cedula;
    private String correo;


    public UsuarioEPS(String nomb, String apellido, Long cedula, String correo) {
        super(nomb, apellido, cedula, correo);
        this.nombre = nomb;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;

    }

    @Override
    public String obtenerTipo() {
        return "EPS";
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
}
