/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.com.cormaria.servicios.facades.catalogos;


import sv.com.cormaria.servicios.facades.common.AbstractFacade;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sv.com.cormaria.servicios.entidades.catalogos.CatTipoServicio;
import sv.com.cormaria.servicios.exceptions.ClinicaModelexception;


/**
 *
 * @author Claudia
 */
@Stateless
public class CatTipoServicioFacade extends AbstractFacade<CatTipoServicio> implements CatTipoServicioFacadeLocal {
    @PersistenceContext(unitName = "ClinicaEJBPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public CatTipoServicioFacade() {
        super(CatTipoServicio.class);
    }

    @Override
    public List<CatTipoServicio> findAll() throws ClinicaModelexception {
        try{
            Query q = em.createNamedQuery("CatTipoServicio.findAll");
            return q.getResultList();
        }catch(Exception ex){
            throw new ClinicaModelexception(ex.getMessage(), ex);
        }
    }

    @Override
    public List<CatTipoServicio> findRange(int[] range) throws ClinicaModelexception {
         try{
            Query q = em.createNamedQuery("CatTipoServicio.findAll");
            q.setMaxResults(range[1] - range[0]);
            return q.getResultList();
        }catch(Exception ex){
            throw new ClinicaModelexception(ex.getMessage(), ex);
        }
    }

    @Override
    public int count() throws ClinicaModelexception {
         try{
            Query q = em.createQuery("Select count(*) from CatTipoServicio");
            Long count = (Long)q.getSingleResult();
            if (count!=null){
                return count.intValue();
            }
            return 0;
        }catch(Exception ex){
            throw new ClinicaModelexception(ex.getMessage(), ex);
        }
    }
    public List<CatTipoServicio> findActive() throws ClinicaModelexception {
        try{
            Query q = em.createNamedQuery("CatTipoServicio.findActive");
            return q.getResultList();
        }catch(Exception ex){
            throw new ClinicaModelexception(ex.getMessage(), ex);
        }
    }     
    
}
