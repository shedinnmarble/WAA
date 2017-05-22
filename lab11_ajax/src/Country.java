import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by dewei.xiang on 5/21/17.
 */

@ManagedBean(name = "Country", eager = true)
@SessionScoped
public class Country {

    private List<String> countries;
    private String filterCountry;
    public Country(){
        this.setCountries(getCountries());
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
