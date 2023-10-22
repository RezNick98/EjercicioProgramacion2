public class Usuario extends Persona{
    private String nombreUsuario;
    private String password;

    public Usuario(String cargo,String nombre,String apellido,int edad,String
		   nombreUsuario,String password){
	super(cargo,nombre,apellido,edad);
	this.nombreUsuario = nombreUsuario;
	this.password = password;
    }

    public void setNombreUsuario(String nombreUsuario){
	this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario(){
	return this.nombreUsuario;
    }

    public void setPassword(String password){
	this.password=password;
    }

    public String getPassword(){
	return this.password;
    }
}

