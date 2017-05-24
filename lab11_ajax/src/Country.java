import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIOutput;
import javax.faces.event.AjaxBehaviorEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * Created by dewei.xiang on 5/21/17.
 */

@ManagedBean(name = "Country", eager = true)
@SessionScoped
public class Country {

    private List<String> countries;
    private String filterCountry;
    private List<String> filteredCountries;
    public Country(){

        this.setCountries(getCountries());
        this.filteredCountries = this.getCountries();
    }
    public List<String> getFilteredCountries() {
        return filteredCountries;
    }

    public void setFilteredCountries(List<String> filteredCountries) {
        this.filteredCountries = filteredCountries;
    }

    /**
     * Ajax Listener
     * @param event
     */
    public void countryChanged(AjaxBehaviorEvent event) {
        String inputFilter = (String) ((UIOutput)event.getSource()).getValue();
        if(inputFilter.equals("")) {
            this.setFilteredCountries(this.getCountries());
        };
        List<String> newCountries = this.getCountries().stream().filter(c -> c.startsWith(inputFilter)).collect(Collectors.toList());
        this.setFilteredCountries(newCountries);

    }

    public List<String> getCountries() {

        String[] locales = Locale.getISOCountries();
        List<String> countries = new ArrayList<String>();

        for (String countryCode : locales) {

            Locale obj = new Locale("", countryCode);

//            System.out.println("Country Code = " + obj.getCountry()
//                    + ", Country Name = " + obj.getDisplayCountry());
                countries.add(obj.getDisplayCountry());
        }
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public String getFilterCountry() {
        return filterCountry;
    }

    public void setFilterCountry(String filterCountry) {
        this.filterCountry = filterCountry;
    }


}
