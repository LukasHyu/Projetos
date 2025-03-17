public class Ex31 {
    public static void main(String[] args) {
        System.out.println("Java Version: " + System.getProperty("java.version"));               // Mostra a versão do Java instalada
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));  // Mostra a versão do Java em execução
        System.out.println("Java Home: " + System.getProperty("java.home"));                        // Mostra o diretório de instalação do Java
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));                    // Mostra o fornecedor do Java
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));            // Mostra a URL do fornecedor do Java
        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");     // Mostra o caminho da classe Java
    }
}
