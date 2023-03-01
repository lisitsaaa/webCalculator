package by.tms.storage;

import by.tms.entity.Operation;

import java.util.List;
import java.util.Optional;

public interface OperationStorage {
    void save(Operation operation);
    List<Operation> findAll(int userId);
    Optional<Operation> findById(int operationId);
    void removeAll(int userId);
    void removeById(int operationId);




}
