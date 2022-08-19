package practicoInterfaces;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

        Coche Auto1 = new Coche("Toyota", "Corolla", 2020, 5000, true);

        System.out.println(Auto1);

        cocheCRUD.FindAll();
        cocheCRUD.Save(new Coche());
        cocheCRUD.Delete(new Coche());

    }
}
