
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yafen
 */
@ManagedBean(name = "UIData", eager = true)
@RequestScoped
public class UIData {

    private List<String> fromList;
    private List<String> toList;

    public String getSelectedFrom() {
        return selectedFrom;
    }

    public void setSelectedFrom(String selectedFrom) {
        this.selectedFrom = selectedFrom;
    }

    public String getSelectedTo() {
        return selectedTo;
    }

    public void setSelectedTo(String selectedTo) {
        this.selectedTo = selectedTo;
    }
    private String selectedFrom;
    private String selectedTo;
    private String departureDate;
    private String returnDate;
    private boolean isRoundTripe;
    private boolean isFirstClass;
    private boolean isExactTheseDays;
    private boolean isNoStop;

    public List<String> getFromList() {
        return fromList;
    }

    public void setFromList(List<String> fromList) {
        this.fromList = fromList;
    }

    public List<String> getToList() {
        return toList;
    }

    public void setToList(List<String> toList) {
        this.toList = toList;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isIsRoundTripe() {
        return isRoundTripe;
    }

    public void setIsRoundTripe(boolean isRoundTripe) {
        this.isRoundTripe = isRoundTripe;
    }

    public boolean isIsFirstClass() {
        return isFirstClass;
    }

    public void setIsFirstClass(boolean isFirstClass) {
        this.isFirstClass = isFirstClass;
    }

    public boolean isIsExactTheseDays() {
        return isExactTheseDays;
    }

    public void setIsExactTheseDays(boolean isExactTheseDays) {
        this.isExactTheseDays = isExactTheseDays;
    }

    public boolean isIsNoStop() {
        return isNoStop;
    }

    public void setIsNoStop(boolean isNoStop) {
        this.isNoStop = isNoStop;
    }

    public UIData() {
        this.fromList = new ArrayList<String>();
        fromList.add("Amsterdam");
        fromList.add("Paris");
        fromList.add("Lissabon");
        this.toList = new ArrayList<String>();
        toList.add("New York");
        toList.add("Boston");
        toList.add("Chicago");
    }

    public void submit() {
        System.out.println(this.selectedFrom);
        System.out.println(this.selectedTo);
        System.out.println(this.departureDate);
        System.out.println(this.returnDate);        
        System.out.println(this.isRoundTripe==true? "Round Trip":"One Way");
        System.out.println(this.isFirstClass?"First Class": "Non First Class");
        System.out.println(this.isExactTheseDays?"Except These Days":"No Except These Days");
        System.out.println(this.isNoStop?"No Stop":"Yes Stop");
        
        
    }

}
