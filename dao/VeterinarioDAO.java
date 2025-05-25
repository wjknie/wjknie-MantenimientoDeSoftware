package dao;

import config.DatabaseConnection;
import models.Veterinario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VeterinarioDAO {
       public void agregarVeterinario(Veterinario veterinario) {
        String sql = "INSERT INTO veterinarios (nombre, email, telefono, especialidad) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, veterinario.getNombre());
            stmt.setString(2, veterinario.getEmail());
            stmt.setString(3, veterinario.getTelefono());
            stmt.setString(4, veterinario.getEspecialidad());

            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        veterinario.setId(generatedKeys.getInt(1));
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al agregar veterinario: " + e.getMessage());
        }
    }

    public List<Veterinario> obtenerVeterinario() {
        List<Veterinario> veterinarios = new ArrayList<>();
        String sql = "SELECT * FROM veterinarios";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Veterinario veterinario = new Veterinario(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("email"),
                        rs.getString("telefono"),
                        rs.getString("especialidad")
                );
                veterinarios.add(veterinario);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener veterinario: " + e.getMessage());
        }
        return veterinarios;
    }

}