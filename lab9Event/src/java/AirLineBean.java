/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author yafen
 */
@ManagedBean(name = "AirLineBean", eager = true)
@RequestScoped
public class AirLineBean {

    private List<String> airLines;
    private List<AirLine> selected;
    private List<AirLine> allAirlines;
    private String selectedAirLine;

    /**
     * Creates a new instance of AirLineBean
     */
    public AirLineBean() {
        selected = new ArrayList<AirLine>();
        airLines = new ArrayList<String>();
        airLines.add("ALL");
        airLines.add("KLM");
        airLines.add("North West");
        airLines.add("United Lines");
        allAirlines = new ArrayList<AirLine>();
        allAirlines.add(new AirLine("Amsterdam", "New York", "4/30/2017", "KLM", 790.80));
        allAirlines.add(new AirLine("Amsterdam", "New York", "4/30/2017", "North West", 780.80));
        allAirlines.add(new AirLine("Amsterdam", "New York", "4/30/2017", "KLM", 770.80));
        allAirlines.add(new AirLine("Amsterdam", "New York", "4/30/2017", "United Lines", 760.80));
        allAirlines.add(new AirLine("Amsterdam", "New York", "4/30/2017", "North West", 750.80));
        allAirlines.add(new AirLine("Amsterdam", "New York", "4/30/2017", "KLM", 740.80));
        allAirlines.add(new AirLine("Amsterdam", "New York", "4/30/2017", "United Lnes", 730.80));
        selected = allAirlines;

    }

    public void localeChanged(ValueChangeEvent e) {
        //assign new value to country
        String airLine = e.getNewValue().toString();
        if ("ALL".equals(airLine)) {
            selected = allAirlines;
        } else {
            selected = allAirlines.stream().filter(a -> a.getAirLineName().equals(airLine)).collect(Collectors.toList());
        }
    }

    /**
     * @return the airLines
     */
    public List<String> getAirLines() {
        return airLines;
    }

    /**
     * @param airLines the airLines to set
     */
    public void setAirLines(List<String> airLines) {
        this.airLines = airLines;
    }

    /**
     * @return the selected
     */
    public List<AirLine> getSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(List<AirLine> selected) {
        this.selected = selected;
    }

    /**
     * @return the allAirlines
     */
    public List<AirLine> getAllAirlines() {
        return allAirlines;
    }

    /**
     * @param allAirlines the allAirlines to set
     */
    public void setAllAirlines(List<AirLine> allAirlines) {
        this.allAirlines = allAirlines;
    }

    /**
     * @return the selectedAirLine
     */
    public String getSelectedAirLine() {
        return selectedAirLine;
    }

    /**
     * @param selectedAirLine the selectedAirLine to set
     */
    public void setSelectedAirLine(String selectedAirLine) {
        this.selectedAirLine = selectedAirLine;
    }

}
