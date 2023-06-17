package Usuarios;

public abstract class Usuario {

    public Usuario(String nomb, String apellido, Long cedula, String correo){
        this.nombre = nomb;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
    }
    private String nombre;
    private  String apellido;
    private Long cedula;
    private String correo;
    private String tipo_usuario;

    public abstract String obtenerTipo();

    public abstract String getNombre();
}
