import org.menu.MenuPrincipal;


public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.inici();
    }
    private void inici(){
        MenuPrincipal menu = new MenuPrincipal();
        menu.inicia(); 
    }
}
