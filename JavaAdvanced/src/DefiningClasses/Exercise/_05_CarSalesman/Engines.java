package DefiningClasses.Exercise._05_CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Engines {
    private List<Engine> engineList = new ArrayList<>();

    public void addEngine(Engine engine) {
        engineList.add(engine);
    }

    public Engine getEngineByModel(String engineModel) {
        return engineList.stream()
                .filter(currentEngine -> currentEngine.getModel().equals(engineModel))
                .collect(Collectors.toList()).get(0);
    }
}
