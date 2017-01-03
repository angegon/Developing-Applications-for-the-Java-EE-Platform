package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javabeans.Contacto;


public class GestionContactos {
	private String url = "jdbc:mysql://localhost:3306/agenda";
	private String user = "root";
	private String pwd = "root";
	private String driver = "com.mysql.jdbc.Driver";

	// aprovechamos el constructor para realizar la carga del
	// driver
	public GestionContactos() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<Contacto> ListarContactos() {
		
		boolean res = false;
		Contacto c ;
		ArrayList<Contacto> Contactos = new ArrayList<>();
		
 		try (Connection cn = DriverManager.getConnection(url, user, pwd)) {
			String sql = "select * from contactos";
			PreparedStatement ps = cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			// next devuelve true si hay al menos uno.
			while (rs.next()){
				c = new Contacto();
				c.setIdContacto(rs.getInt("idContacto"));
				c.setNombre(rs.getString("nombre"));
				c.setEmail(rs.getString("email"));
				c.setTelefono(rs.getInt("telefono"));
				Contactos.add(c);
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return Contactos;
	}

	public boolean GuardarContacto(String nombre, String email, Integer telefono) {
		boolean res = false;
		try (Connection cn = DriverManager.getConnection(url, user, pwd)) {
			String sql = "Insert into contactos (nombre,email,telefono) ";
			sql += "values(?,?,?)";
			// creamos consulta preparada:
			PreparedStatement ps = cn.prepareStatement(sql);

			// Sustituimos parametros por valores
			ps.setString(1, nombre);
			ps.setString(2, email);
			ps.setInt(3, telefono);
			// ejecutamos
			ps.execute();
			res = true;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return res;
	}
	
	public boolean BorrarContacto(Integer id) {
		boolean res = false;
		try (Connection cn = DriverManager.getConnection(url, user, pwd)) {
			String sql = "Delete from contactos where idContacto=? ";
			
			// creamos consulta preparada:
			PreparedStatement ps = cn.prepareStatement(sql);

			// Sustituimos parametros por valores
			ps.setInt(1, id);
			// ejecutamos
			ps.executeUpdate();
			res = true;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return res;
	}
}
