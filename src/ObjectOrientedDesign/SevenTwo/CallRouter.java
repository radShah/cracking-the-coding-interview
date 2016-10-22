package ObjectOrientedDesign.SevenTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by radha on 10/15/16.
 */
public class CallRouter {
    ArrayList<Respondant> respondants;
    ArrayList<Manager> managers;
    ArrayList<Director> directors;



    public CallRouter() {
        respondants = new ArrayList();
        managers = new ArrayList();
        directors = new ArrayList();
    }


    public void dispatchCall(Call call) {
        for (Respondant respondant : respondants) {
            if (respondant.isFree()) {
                respondant.answerCall(call);
            }
        }
        for (Manager manager : managers) {
            if (manager.isFree()) {
                manager.answerCall(call);
            }
        }
        for (Director director : directors) {
            if (director.isFree()) {
                director.answerCall(call);
            }
        }
    }
}
