package practicoInterfaces;

import java.util.List;

public interface CocheCRUD {

    void Save(Coche coche);

    List<Coche> FindAll();

    void Delete(Coche coche);
}
