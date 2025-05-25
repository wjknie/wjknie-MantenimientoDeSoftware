package controllers;

import dao.VeterinarioDAO;
import java.util.List;
import models.Veterinario;

public class VeterinarioController {

    private VeterinarioDAO veterinarioDAO;

    public VeterinarioController() {
        this.veterinarioDAO = new VeterinarioDAO();
    }

    public void agregarVeterinario(String nombre, String email, String telefono, String especialidad) {
        Veterinario veterinario = new Veterinario(nombre, email, telefono, especialidad);
        veterinarioDAO.agregarVeterinario(veterinario);
        System.out.println("Veterinario agregado correctamente" + veterinario);
    }

    public List<Veterinario> obtenerVeterinario() {
        return veterinarioDAO.obtenerVeterinario();
    }
}
