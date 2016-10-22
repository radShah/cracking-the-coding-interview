package ObjectOrientedDesign.SevenTwo;

/**
 * Created by radha on 10/15/16.
 */
public class Call {
    Caller caller;
    int number;
    CallCenterEmployee employee = null;

    public Call(Caller caller) {
        this.caller = caller;
    }
}
