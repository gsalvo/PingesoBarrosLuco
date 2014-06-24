/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sess;

import entities.Indicaciones;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author camilo
 */
@Local
public interface IndicacionesFacadeLocal {

    void create(Indicaciones indicaciones);

    void edit(Indicaciones indicaciones);

    void remove(Indicaciones indicaciones);

    Indicaciones find(Object id);

    List<Indicaciones> findAll();

    List<Indicaciones> findRange(int[] range);

    int count();
    
}
