/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sess;

import entities.Solicitudexamen;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author camilo
 */
@Stateless
public class SolicitudexamenFacade extends AbstractFacade<Solicitudexamen> implements SolicitudexamenFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_pingesoBL-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SolicitudexamenFacade() {
        super(Solicitudexamen.class);
    }
    
}
