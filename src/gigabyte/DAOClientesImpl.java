/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gigabyte;

import db.Database;
import interfaces.DAOClientes;
import java.util.List;
import models.clientes;
import java.sql.PreparedStatement;

/**
 *
 * @author sabas-rivera
 */
public class DAOClientesImpl extends Database implements DAOClientes {

    @Override
    public void registrar(clientes cliente) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO clientes(nombres, apellido_p, apellido_m, tipo_persona, identidad, rtn, fecha_nac, correo, telefono, direccion) VALUES (?,?,?,?,?,?,?,?,?,?);");
            st.setString(1, cliente.getNombres());
            st.setString(2, cliente.getApellido_p());
            st.setString(3, cliente.getApellido_m());
            st.setString(4, cliente.getTipo_persona());
            st.setString(5, cliente.getIdentidad());
            st.setString(6, cliente.getRtn());
            st.setString(7, cliente.getFecha_nac());
            st.setString(8, cliente.getCorreo());
            st.setString(9, cliente.getTelefono());
            st.setString(10, cliente.getDireccion());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        }finally{
            this.Cerrar();
        }
    }

    @Override
    public void modificar(clientes cliente) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(clientes cliente) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<clientes> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
