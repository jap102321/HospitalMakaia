package Usuarios;

public class UsuarioPoliza extends Usuario{

    private String nombre;
    private String apellido;
    private Long cedula;
    private String correo;

    public UsuarioPoliza(String nomb, String apellido, Long cedula, String correo) {
        super(nomb, apellido, cedula, correo);
        this.nombre = nomb;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
    }

    @Override
    public String obtenerTipo() {
        return "Poliza";
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
}
