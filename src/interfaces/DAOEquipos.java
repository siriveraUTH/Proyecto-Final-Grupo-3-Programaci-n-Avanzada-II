/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.equipos;

/**
 *
 * @author sabas-rivera
 */
public interface DAOEquipos {
    public void registrar(equipos equipo) throws Exception;
    public void modificar(equipos equipo) throws Exception;
    public void eliminar(equipos equipo) throws Exception;
    public List<equipos> listar() throws Exception;
}
