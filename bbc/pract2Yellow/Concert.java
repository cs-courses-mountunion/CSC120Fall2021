

public class Concert {

    private String venue;
    private String leadAct;
    private String month;
    private Integer day;

    public Concert(String v, String a, String m, Integer d) {
        setVenue(v);
        setLeadAct(a);
        setMonth(m);
        setDay(d);
    } // end of constructor

    public String getVenue() {
        return venue;
    } // end of getVenue()

    public String getLeadAct() {
        return leadAct;
    } // end of getLeadAct()

    public String getMonth() {
        return month;
    } // end of getMonth()

    public Integer getDay() {
        return day;
    } // end of getDay()

    public void setVenue (String v) {
        venue = v;
    } // end of setVenue()

    public void setLeadAct (String a) {
        leadAct = a;
    } // end of setLeadAct()

    public void setMonth (String m) {
        month = m;
    } // end of setMonth()

    public void setDay (Integer d) {
        day = d;
    } // end of setDay()

    public String toString() {
        String answer;		
        answer = leadAct + " will perform on " + month + " " + day + " at " + venue;
        return answer;		
    } // end of toString()

} // end of class Concert
