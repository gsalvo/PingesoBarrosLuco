/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import entities.Externa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author camilo
 */
@Local
public interface RecetaExternaFacadeLocal {

    void create(Externa recetaExterna);

    void edit(Externa recetaExterna);

    void remove(Externa recetaExterna);

    Externa find(Object id);

    List<Externa> findAll();

    List<Externa> findRange(int[] range);

    int count();
    
}
