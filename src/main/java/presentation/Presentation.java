package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        /*
        * injection statique
        * */
        //DaoImplV2 dao=new DaoImplV2();
        DaoImpl dao=new DaoImpl();
        MetierImpl metier=new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("resultat: "+metier.Calcul());
    }
}
