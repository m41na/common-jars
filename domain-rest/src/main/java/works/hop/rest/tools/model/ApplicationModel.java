package works.hop.rest.tools.model;

import java.util.HashMap;
import java.util.Map;

public class ApplicationModel {

    private final static ApplicationModel INSTANCE = new ApplicationModel();

    private ApplicationModel() {
    }

    public static ApplicationModel getInstance() {
        return INSTANCE;
    }

    public Map<String, Object> startViewModel() {
        Map<String, Object> model = new HashMap<>();
        model.put("title", "Rest Tools");
        model.put("username", "Admin");
        return model;
    }
}
