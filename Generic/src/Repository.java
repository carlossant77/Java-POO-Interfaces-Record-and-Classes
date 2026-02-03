import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Repository<T extends Identifiable> {

    private Map<Long, T> repository = new HashMap<>();

    public T save(T entity) {
        if (entity == null) {
            throw new IllegalArgumentException("Entity cannot be null");
        }

        if (entity.getId() == null) {
            throw new IllegalStateException("Entity id cannot be null");
        }

        repository.put(entity.getId(), entity);

        return entity;

    }

    public Optional<T> findById(Long id) {
        var response = repository.get(id);

        return Optional.ofNullable(response);

    }

    public List<T> findAll() {
        var copy = repository.values();
        List<T> result = copy.stream()
                .toList();

        return result;
    }

}
