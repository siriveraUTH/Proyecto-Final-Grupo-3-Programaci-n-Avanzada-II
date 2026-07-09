/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.tecnicos;
/**
 *
 * @author sabas-rivera
 */
public interface DAOTecnicos {
    public void registrar(tecnicos tecnico) throws Exception;
    public void modificar(tecnicos tecnico) throws Exception;
    public void eliminar(tecnicos tecnico) throws Exception;
    public List<tecnicos> listar() throws Exception;
}
