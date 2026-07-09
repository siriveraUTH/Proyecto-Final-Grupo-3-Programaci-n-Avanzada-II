/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.ordenes_trabajo;
/**
 *
 * @author sabas-rivera
 */
public interface DAOOrdenes_trabajo {
    public void registrar(ordenes_trabajo orden_trabajo) throws Exception;
    public void modificar(ordenes_trabajo orden_trabajo) throws Exception;
    public void eliminar(ordenes_trabajo orden_trabajo) throws Exception;
    public List<ordenes_trabajo> listar() throws Exception;
}
