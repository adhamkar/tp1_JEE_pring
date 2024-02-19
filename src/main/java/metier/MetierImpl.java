package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")

public class MetierImpl implements IMetier {
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    private IDao dao;
    @Override
    public Double Calcul() {
        double tmp=dao.getData();
        double r=tmp*10/Math.cos(tmp*Math.PI);
        return r;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
