/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.com.cormaria.servicios.facades.administracion;

import java.util.List;
import javax.ejb.Local;
import sv.com.cormaria.servicios.entidades.administracion.TblMovimientosExpediente;
import sv.com.cormaria.servicios.entidades.archivo.TblExpedientePacientes;
import sv.com.cormaria.servicios.exceptions.ClinicaModelexception;

/**
 *
 * @author Mackk
 */
@Local
public interface TblMovimientosExpedienteFacadeLocal {

    TblMovimientosExpediente create(TblMovimientosExpediente tblMovimientosExpediente) throws ClinicaModelexception;

    TblMovimientosExpediente edit(TblMovimientosExpediente tblMovimientosExpediente) throws ClinicaModelexception;

    void remove(TblMovimientosExpediente tblMovimientosExpediente) throws ClinicaModelexception;

    TblMovimientosExpediente find(Object id) throws ClinicaModelexception;

    List<TblMovimientosExpediente> findAll() throws ClinicaModelexception;

    List<TblMovimientosExpediente> findRange(int[] range) throws ClinicaModelexception;

    int count() throws ClinicaModelexception;
    
    public TblMovimientosExpediente generarMovimiento(TblExpedientePacientes tblExpediente, TblMovimientosExpediente movimientoExp, Integer numEmpleado) throws ClinicaModelexception;
    public List<TblMovimientosExpediente> findByNumExpediente(Integer numExpediente) throws ClinicaModelexception;    
}
