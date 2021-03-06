/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.com.cormaria.servicios.facades.farmacia;

import java.util.List;
import javax.ejb.Local;
import sv.com.cormaria.servicios.criteria.ISearchable;
import sv.com.cormaria.servicios.entidades.farmacia.TblAlquilerEquipo;
import sv.com.cormaria.servicios.exceptions.ClinicaModelexception;

/**
 *
 * @author Mackk
 */
@Local
public interface TblAlquilerEquipoFacadeLocal extends ISearchable<TblAlquilerEquipo> {

    TblAlquilerEquipo create(TblAlquilerEquipo tblAlquilerEquipo) throws ClinicaModelexception;

    TblAlquilerEquipo edit(TblAlquilerEquipo tblAlquilerEquipo) throws ClinicaModelexception;

    void remove(TblAlquilerEquipo tblAlquilerEquipo) throws ClinicaModelexception;

    TblAlquilerEquipo find(Object id) throws ClinicaModelexception;

    List<TblAlquilerEquipo> findAll() throws ClinicaModelexception;

    List<TblAlquilerEquipo> findRange(int[] range) throws ClinicaModelexception;

    int count() throws ClinicaModelexception;
    
}
