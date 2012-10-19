
package sv.com.cormaria.servicios.facades.catalogos;

import sv.com.cormaria.servicios.facades.common.AbstractFacade;
import java.util.List;
import javax.persistence.Query;
import sv.com.cormaria.servicios.entidades.catalogos.CatTipoProducto;
import sv.com.cormaria.servicios.exceptions.ClinicaModelexception;

 /* To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.com.cormaria.servicios.entidades.catalogos.CatTipoProducto;

/**
 *
 * @author Claudia
 */
@Stateless
public class CatTipoProductoFacade extends AbstractFacade<CatTipoProducto> implements CatTipoProductoFacadeLocal {
    @PersistenceContext(unitName = "ClinicaEJBPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public CatTipoProductoFacade() {
        super(CatTipoProducto.class);
    }

    @Override
    public List<CatTipoProducto> findAll() throws ClinicaModelexception {
        try{
            Query q = em.createNamedQuery("CatTipoProducto.findAll");
            return q.getResultList();
        }catch(Exception ex){
            throw new ClinicaModelexception(ex.getMessage(), ex);
        }
    }

    @Override
    public List<CatTipoProducto> findActive() throws ClinicaModelexception {
        try{
            Query q = em.createNamedQuery("CatTipoProducto.findActive");
            return q.getResultList();
        }catch(Exception ex){
            throw new ClinicaModelexception(ex.getMessage(), ex);
        }
    }
    
    @Override
    public List<CatTipoProducto> findRange(int[] range) throws ClinicaModelexception {
        try{
            Query q = em.createNamedQuery("CatTipoProducto.findAll");
            q.setMaxResults(range[1] - range[0]);
            return q.getResultList();
        }catch(Exception ex){
            throw new ClinicaModelexception(ex.getMessage(), ex);
        }
    }

    @Override
    public int count() throws ClinicaModelexception {
        try{
            Query q = em.createQuery("Select count(*) from CatTipoProducto");
            Long count = (Long)q.getSingleResult();
            if (count!=null){
                return count.intValue();
            }
            return 0;
        }catch(Exception ex){
            throw new ClinicaModelexception(ex.getMessage(), ex);
        }
    }
    
}
