package parkingLot.repositories;

import parkingLot.models.Gate;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {

    private Map<Long, Gate> gates = new HashMap<>();

    public Optional<Gate> findGateById(Long gateId) {
        if(gates.containsKey(gateId)) {
            return Optional.of(gates.get(gateId));
        }
        return Optional.empty();
    }
}
