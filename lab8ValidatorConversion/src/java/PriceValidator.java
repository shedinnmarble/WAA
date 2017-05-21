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
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("edu.mum.PriceValidator")
public class PriceValidator implements Validator {

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object value) throws ValidatorException {
        int price = Integer.parseInt(value.toString());
        if (price <= 0) {
            FacesMessage msg
                    = new FacesMessage("Price validation failed", String.format("the Value \"%d\" is smaller than the minimum value of 1", price));
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
        if (price > 100000) {
 FacesMessage msg
                    = new FacesMessage("Price validation failed", String.format("the Value \"%d\" is bigger than the maximum value of 100000", price));
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }

    }

}
