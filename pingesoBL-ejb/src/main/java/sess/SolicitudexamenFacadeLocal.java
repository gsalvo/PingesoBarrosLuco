/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sess;

import entities.Solicitudexamen;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author camilo
 */
@Local
public interface SolicitudexamenFacadeLocal {

    void create(Solicitudexamen solicitudexamen);

    void edit(Solicitudexamen solicitudexamen);

    void remove(Solicitudexamen solicitudexamen);

    Solicitudexamen find(Object id);

    List<Solicitudexamen> findAll();

    List<Solicitudexamen> findRange(int[] range);

    int count();
    
}
