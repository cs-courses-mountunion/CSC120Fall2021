

public class University {

    private String name;
    private String state;
    private Integer yearFounded;
    private Boolean offersPhDs;

    public University(String n, String s, Integer y, Boolean p) {
        name = n;
        state = s;
        yearFounded = y;
        offersPhDs = p;
    } // end of constructor

    public String getName() {
        return name;
    } // end of getName()

    public String getState() {
        return state;
    } // end of getState()

    public Integer getYearFounded() {
        return yearFounded;
    } // end of getYearFounded()

    public Boolean getOffersPhDs() {
        return offersPhDs;
    } // end of getOffersPhDs()

    public void setName (String n) {
        name = n;
    } // end of setName()

    public void setState (String s) {
        state = s;
    } // end of setState()

    public void setYearFounded (Integer y) {
        yearFounded = y;
    } // end of setYearFounded()

    public void setOffersPhDs (Boolean p) {
        offersPhDs = p;
    } // end of setOffersPhDs()

    public String toString() {
        String answer;		
        answer = name + " is a university in " + state
                    + " that was founded in " + yearFounded + " and does ";
        if (offersPhDs == false) {
            answer = answer + "NOT ";
        }
        answer = answer + "offer PhD degrees";		
        return answer;		
    } // end of toString()

} // end of class University
