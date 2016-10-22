package ObjectOrientedDesign.SevenTwo;

/**
 * Created by radha on 10/15/16.
 */
public abstract class CallCenterEmployee {
    private boolean isAvailable;
    Rank rank;
    Call currentCall;

    public CallCenterEmployee() {
        isAvailable = true;
        rank = Rank.Unspecified;
        currentCall = null;
    }

    public void answerCall(Call call) {
        this.currentCall = call;
    }

    public void finishCall() {
        currentCall = null;
        isAvailable = true;
    }

    public void escalateCall() {

    }

    public boolean isFree() {
        return isAvailable;
    }




}
