package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements  IDao{



    @Override
    public double getData() {
        System.out.println("version base de donne :");
        double t = 15;
        return t;
    }
}
