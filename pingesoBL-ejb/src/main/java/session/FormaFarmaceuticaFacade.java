/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import entities.Farmaco;
import entities.FfFarmaco;
import entities.FormaFarmaceutica;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author camilo
 */
@Stateless
public class FormaFarmaceuticaFacade extends AbstractFacade<FormaFarmaceutica> implements FormaFarmaceuticaFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_pingesoBL-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FormaFarmaceuticaFacade() {
        super(FormaFarmaceutica.class);
    }
    
    @Override
    public List<FormaFarmaceutica> findFormId(int remedio) {
    Query q=em.createNamedQuery("FormaFarmaceutica.findByFormafarmaceuticaid").setParameter("formafarmaceuticaid", remedio);
    return q.getResultList();
    }
     @Override
        public List<FormaFarmaceutica> findNombreFF(String entrada) {
        Query q=em.createNamedQuery("FormaFarmaceutica.findByNombreFf").setParameter("nombreFf", entrada);
        return q.getResultList();
        
    }
}
