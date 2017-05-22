import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;
import javax.faces.view.facelets.FaceletContext;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by dewei.xiang on 5/21/17.
 */
public class SearchListener implements ValueChangeListener {
    @Override
    public void processValueChange(ValueChangeEvent event) throws AbortProcessingException {
        Country country= (Country) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("Country");
        String filter= event.getNewValue().toString();
        if(filter.equals("")) return;
        List<String> newCountries = country.getCountries().stream().filter(c -> c.startsWith(filter)).collect(Collectors.toList());
        country.setCountries(newCountries);

    }
}
