package by.tms.service;

import by.tms.entity.Operation;
import by.tms.entity.User;
import by.tms.storage.JDBCOperationStorage;
import by.tms.storage.OperationStorage;

import java.util.List;
import java.util.Optional;

public class OperationService {
    private static OperationService operationService;
    private OperationService(){}

    public static synchronized OperationService getInstance(){
        if(operationService == null) {
            operationService = new OperationService();
        }
        return operationService;
    }

    private final OperationStorage storage = new JDBCOperationStorage();

    public Optional<Operation> calculate(Operation operation) {
        switch ( operation.getType()) {
            case SUM: {
                operation.setResult(addition(operation.getNumbers()));
                saveOperation(operation);
                return Optional.of(operation);
            }
            case SUB: {
                operation.setResult(subtraction(operation.getNumbers()));
                saveOperation(operation);
                return Optional.of(operation);
            }
            case MUL: {
                operation.setResult(multiplication(operation.getNumbers()));
                saveOperation(operation);
                return Optional.of(operation);
            }
            case DIV: {
                operation.setResult(division(operation.getNumbers()));
                saveOperation(operation);
                return Optional.of(operation);
            }
        }
        return Optional.empty();
    }

    private double addition(List<Double> numbers) {
        double res = 0;
        for (Double d : numbers) {
            res += d;
        }
        return res;
    }

    private double subtraction(List<Double> numbers) {
        double res = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (i == 0) {
                res = numbers.get(i);
            } else {
                res -= numbers.get(i);
            }
        }
        return res;
    }

    private double multiplication(List<Double> numbers) {
        double res = 1;
        for (Double d : numbers) {
            res *= d;
        }
        return res;
    }

    private double division(List<Double> numbers) {
        double res = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (i == 0) {
                res = numbers.get(i);
            } else {
                res /= numbers.get(i);
            }
        }
        return res;
    }

    private void saveOperation(Operation operation){
        Thread thread = new Thread(() -> {
            storage.save(operation);
        });
        thread.start();
    }

    public List<Operation> findAll(User user) {
        return storage.findAll(user.getId());
    }

    public Optional<Operation> findById(int id) {
        return storage.findById(id);
    }

    public void removeAll(User user) {
        Thread thread = new Thread(() -> {
            storage.removeAll(user.getId());
        });
        thread.start();
    }

    public void removeById(int id) {
        Thread thread = new Thread(() -> {
            storage.removeById(id);
        });
        thread.start();
    }
}