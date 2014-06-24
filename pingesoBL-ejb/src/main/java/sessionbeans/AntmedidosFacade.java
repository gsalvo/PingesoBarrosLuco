/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entities.Antmedidos;
import entities.Episodios;
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
public class AntmedidosFacade extends AbstractFacade<Antmedidos> implements AntmedidosFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_pingesoBL-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AntmedidosFacade() {
        super(Antmedidos.class);
    }

    @Override
    public List<Antmedidos> searchByEpisodioGrupo(Episodios episodio, int grupo) {
        Query query;
        query = em.createNamedQuery("Antmedidos.findByEpisodioGrupo").
                setParameter("episodioid", episodio).
                setParameter("grupo", grupo);
        
        return query.getResultList();
    }
    
    
    
}
