
public class Main {
    public static void main(String[] args) throws Exception {

        Repository<User> userRepo = new Repository<>();
        Repository<Product> productRepo = new Repository<>();

        // ===== CRIAÇÃO DE USUÁRIOS =====
        User u1 = new User("José");
        User u2 = new User("Ana");
        User u3 = new User("Carlos");

        userRepo.save(u1);
        userRepo.save(u2);
        userRepo.save(u3);

        // ===== CRIAÇÃO DE PRODUTOS =====
        Product p1 = new Product("Notebook");
        Product p2 = new Product("Mouse Gamer");
        Product p3 = new Product("Teclado Mecânico");

        productRepo.save(p1);
        productRepo.save(p2);
        productRepo.save(p3);

        // ===== TESTE findAll USERS =====
        System.out.println("=== USUÁRIOS ===");
        userRepo.findAll().forEach(user -> System.out.println("ID: " + user.getId() + " | Nome: " + user.getName()));

        // ===== TESTE findAll PRODUCTS =====
        System.out.println("\n=== PRODUTOS ===");
        productRepo.findAll().forEach(
                product -> System.out.println("ID: " + product.getId() + " | Desc: " + product.getDescription()));

        // ===== TESTE findById =====
        System.out.println("\n=== BUSCA POR ID ===");
        userRepo.findById(2L).ifPresentOrElse(
                user -> System.out.println("Usuário encontrado: (ID: 2) " + user.getName()),
                () -> System.out.println("Usuário não encontrado"));

        productRepo.findById(1L).ifPresentOrElse(
                product -> System.out.println("Produto encontrado: (ID: 1) " + product.getDescription()),
                () -> System.out.println("Produto não encontrado"));

        // ===== TESTE DE ERRO CONTROLADO =====
        System.out.println("\n=== TESTE DE ERRO ===");
        try {
            userRepo.save(null);
        } catch (Exception e) {
            System.out.println("Erro esperado: (Cadastro Vazio) " + e.getMessage());
        }

    }
}
