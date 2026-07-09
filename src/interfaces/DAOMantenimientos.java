/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.mantenimientos;
/**
 *
 * @author sabas-rivera
 */
public interface DAOMantenimientos {
    public void registrar(mantenimientos mantenimiento) throws Exception;
    public void modificar(mantenimientos mantenimiento) throws Exception;
    public void eliminar(mantenimientos mantenimiento) throws Exception;
    public List<mantenimientos> listar() throws Exception;
}
