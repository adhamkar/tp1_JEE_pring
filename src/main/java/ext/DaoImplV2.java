package ext;

import dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public Double getData() {
        System.out.println("Version capteurs");
        double tmp=60;
        return tmp;
    }
}
