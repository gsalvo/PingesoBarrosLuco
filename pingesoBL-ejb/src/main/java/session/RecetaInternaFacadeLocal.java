/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import entities.Interna;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author camilo
 */
@Local
public interface RecetaInternaFacadeLocal {

    void create(Interna recetaInterna);

    void edit(Interna recetaInterna);

    void remove(Interna recetaInterna);

    Interna find(Object id);

    List<Interna> findAll();

    List<Interna> findRange(int[] range);

    int count();
    
}
