package main;

import br.com.locadora.entidade.Automovel;
import br.com.locadora.entidade.Marca;
import br.com.locadora.persistencia.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class main {
    
    public static void main(String [ ] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Marca marca = new Marca();
        marca.setNome("Chevrolet");
        session.persist(marca);

        Automovel automovel = new Automovel();
        automovel.setAno(2005);
        automovel.setMarca(marca);
        automovel.setPlaca("ABC-2449");
        automovel.setRenavam(12345);
        automovel.setCapacidadePortaMalasInteger(300);

        session.persist(automovel);
        
        Criteria criteria = session.createCriteria(Automovel.class);
        criteria.add(Restrictions.eq("renavam", 12345));
        Automovel automovelResult = (Automovel) criteria.uniqueResult();
        System.out.print(automovelResult);
        
        session.close();
    }
}
