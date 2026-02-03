public class Product implements Identifiable {

    private Long id;
    private String description;

    private static Long currentId = 1l;

    public Product(String description) {
        this.id = currentId;
        this.description = description;
        currentId += 1;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public Long getId() {
        return id;
    }

}
