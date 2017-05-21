/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yafen
 */
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("edu.mum.TemperatureConverter")
public class TemperatureConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        char first=value.charAt(0);
        String tempreture = first=='F'?"Fahrenheit":"Celsius";
        double  number =0;
        try{
           number = Double.parseDouble(value.substring(1));
        }catch(Exception ex){
            FacesMessage msg = new FacesMessage("Error converting Template",
            "Invalid Template format");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ConverterException(msg);
            
        }
        return "The Tempreture was "+number +" "+tempreture;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object value) {
       return value.toString();
        
    }
    
}
