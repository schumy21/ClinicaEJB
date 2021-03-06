/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.com.cormaria.servicios.facades.administracion;

import java.util.List;
import javax.ejb.Local;
import sv.com.cormaria.servicios.entidades.administracion.TblBeneficiarios;
import sv.com.cormaria.servicios.exceptions.ClinicaModelexception;

/**
 *
 * @author Mackk
 */
@Local
public interface TblBeneficiariosFacadeLocal {

    TblBeneficiarios create(TblBeneficiarios tblBeneficiarios) throws ClinicaModelexception;

    TblBeneficiarios edit(TblBeneficiarios tblBeneficiarios) throws ClinicaModelexception;

    void remove(TblBeneficiarios tblBeneficiarios) throws ClinicaModelexception;

    TblBeneficiarios find(Object id) throws ClinicaModelexception;

    List<TblBeneficiarios> findAll() throws ClinicaModelexception;
    
    public List<TblBeneficiarios> findActive() throws ClinicaModelexception;

    List<TblBeneficiarios> findRange(int[] range) throws ClinicaModelexception;
    
    public void desactivar(Integer numBeneficiario) throws ClinicaModelexception;    

    int count() throws ClinicaModelexception;
    
}
