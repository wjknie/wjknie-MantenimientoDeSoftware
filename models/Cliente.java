
package models;

public class Cliente extends BaseModel {
    
    private String direccion;

    public Cliente(int id, String nombre, String email, String telefono, String direccion) {
        super(id, nombre, email, telefono);
        this.direccion = direccion;
    }

    public Cliente(String nombre, String email, String telefono, String direccion) {
        super(nombre, email, telefono);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("direccion=").append(direccion);
        sb.append('}');
        return sb.toString();
    }

 
}
