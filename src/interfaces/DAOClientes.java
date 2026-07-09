/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import models.clientes;
import java.util.List;

/**
 *
 * @author sabas-rivera
 */
public interface DAOClientes {
    public void registrar(clientes cliente) throws Exception;
    public void modificar(clientes cliente) throws Exception;
    public void eliminar(clientes cliente) throws Exception;
    public List<clientes> listar() throws Exception;
}
