/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entities.Episodios;
import entities.RegistroClinico;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Joel
 */
@Stateless
public class EpisodiosFacade extends AbstractFacade<Episodios> implements EpisodiosFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_pingesoBL-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EpisodiosFacade() {
        super(Episodios.class);
    }

    @Override
    public List<Episodios> searchByClinicalRegister(RegistroClinico registroClinico) {
        Query query;
        query = em.createNamedQuery("Episodios.findByRegistroClinico").
                setParameter("registroclinicoid", registroClinico);
        
        return query.getResultList();
    }
    
    
}
