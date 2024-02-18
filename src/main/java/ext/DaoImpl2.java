package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("version web service :");
        double t = 25;
        return t;
    }
}
