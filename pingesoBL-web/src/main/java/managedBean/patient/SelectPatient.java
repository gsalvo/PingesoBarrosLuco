/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedBean.patient;

import entities.Episodios;
import entities.Paciente;
import entities.Patologia;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import managedBean.Episodes.Episodes;
import managedBean.consultation.NewConsultation;
import sessionbeans.PacienteFacadeLocal;

/**
 *
 * @author Martín
 */
@Named(value = "selectPatient")
@ViewScoped
public class SelectPatient {
    @EJB
    private PacienteFacadeLocal patientFacade;
    
    @ManagedProperty("#{episodes}")
    private Episodes episodesBean;

    
    private List<Paciente> patients;
    
    private Integer rut = 6972769;
    /**
     * Creates a new instance of patient
     */
    public SelectPatient() {
    }
    
    public void start(){
        System.out.println(rut);
        episodesBean.startEpisodes(rut);
    }
    
    public List<String> completeTextPatient(String query) {
        patients = patientFacade.findAll();
        List<String> results = new ArrayList<String>();
        
        for(Paciente patient: patients){
            if(patient.getPersona().getPersRut().toString().startsWith(query)){
                results.add(patient.getPersona().getPersRut().toString());
                rut = patient.getPersona().getPersRut();
            }
        }
        
        return results;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        this.rut = rut;
    }

    public Episodes getEpisodesBean() {
        return episodesBean;
    }

    public void setEpisodesBean(Episodes episodesBean) {
        this.episodesBean = episodesBean;
    }
    
}
