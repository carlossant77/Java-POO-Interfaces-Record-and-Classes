public class User implements Identifiable {

    private Long id;
    private String name;

    private static Long currentId = 1l;

    public User(String name) {
        this.id = currentId;
        this.name = name;
        currentId += 1;
    }

    public String getName() {
        return name;
    }

    @Override
    public Long getId() {
        return id;
    }

}
