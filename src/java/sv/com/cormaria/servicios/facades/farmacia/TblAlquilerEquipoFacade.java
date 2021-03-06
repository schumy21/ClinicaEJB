/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.com.cormaria.servicios.facades.farmacia;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.com.cormaria.servicios.entidades.farmacia.TblAlquilerEquipo;
import sv.com.cormaria.servicios.enums.EstadoAlquiler;
import sv.com.cormaria.servicios.exceptions.ClinicaModelexception;
import sv.com.cormaria.servicios.facades.common.AbstractFacade;

/**
 *
 * @author Mackk
 */
@Stateless
public class TblAlquilerEquipoFacade extends AbstractFacade<TblAlquilerEquipo> implements TblAlquilerEquipoFacadeLocal {
    @PersistenceContext(unitName = "ClinicaEJBPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public TblAlquilerEquipoFacade() {
        super(TblAlquilerEquipo.class);
    }

    public void remove(TblAlquilerEquipo entity) throws ClinicaModelexception {
        try{
            TblAlquilerEquipo entity1 = em.find(TblAlquilerEquipo.class, entity.getNumSolAlquiler());
            entity1.setEstAlquiler(EstadoAlquiler.ELIMINADO);
        }catch(Exception ex){
            throw new ClinicaModelexception(ex.getMessage(), ex);
        }        
    }    
    
    @Override
    public List<TblAlquilerEquipo> findAll() throws ClinicaModelexception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<TblAlquilerEquipo> findRange(int[] range) throws ClinicaModelexception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int count() throws ClinicaModelexception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
