/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entities.Consulta;
import entities.Episodios;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Joel
 */
@Local
public interface ConsultaFacadeLocal {

    void create(Consulta consulta);

    void edit(Consulta consulta);

    void remove(Consulta consulta);

    Consulta find(Object id);

    List<Consulta> findAll();

    List<Consulta> findRange(int[] range);

    int count();

    List<Consulta> searchByEpisodio(Episodios episodio);
    
}
