package models;

public class Veterinario extends BaseModel {
        private String especialidad;

    public Veterinario(int id, String nombre, String email, String telefono, String especialidad) {
        super(id, nombre, email, telefono);
        this.especialidad = especialidad;
    }

    public Veterinario(String nombre, String email, String telefono, String especialidad) {
        super(nombre, email, telefono);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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
        sb.append("Veterinario{");
        sb.append("especialidad=").append(especialidad);
        sb.append('}');
        return sb.toString();
    }
        
}
