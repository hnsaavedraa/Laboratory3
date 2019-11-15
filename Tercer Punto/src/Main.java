public class Main {

    public static void main(String[] args) {
        ProductBuilder builder = new ProductBuilder(3316605);

        Product product = builder.withProductDescription("Suavizante Downy ultra infusions serena lavanda x 3.06l")
                .withDistributor("Downy")
                .withPrice(18893)
                .withProductSection("Cuidado de ropa y calzado")
                .build();

        System.out.println(product);
    }
}
