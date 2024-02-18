package pres;
import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.IllformedLocaleException;
import java.util.Scanner;

public class PresAvecConfigTXT {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException,
            NoSuchMethodException, InvocationTargetException {

        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName= scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
      IDao dao=(IDao) cDao.getConstructor().newInstance();
//        System.out.println(dao.getData());
String metierClassName=scanner.nextLine();
Class cMetier=Class.forName(metierClassName);
        IMetier metier= (IMetier) cMetier.getConstructor().newInstance();
    Method method=cMetier.getMethod("setDao",IDao.class);
    method.invoke(metier,dao);
        System.out.println("Résultat : "+metier.calcul());
    }
}
