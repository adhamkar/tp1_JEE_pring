package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public Double getData() {
        System.out.println("Version BD");
        Double temp=Math.random()*40;
        return temp;
    }
}
