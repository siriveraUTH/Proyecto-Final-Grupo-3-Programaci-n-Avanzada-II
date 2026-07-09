/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.usuarios;
/**
 *
 * @author sabas-rivera
 */
public interface DAOUsuarios {
    public void registrar(usuarios usuario) throws Exception;
    public void modificar(usuarios usuario) throws Exception;
    public void eliminar(usuarios usuario) throws Exception;
    public List<usuarios> listar() throws Exception;
}
