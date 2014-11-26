package br.com.locadora.entidade;

import br.com.locadora.entidade.Marca;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2014-11-25T19:10:14")
@StaticMetamodel(Veiculo.class)
public class Veiculo_ { 

    public static volatile SingularAttribute<Veiculo, Long> id;
    public static volatile SingularAttribute<Veiculo, Integer> renavam;
    public static volatile SingularAttribute<Veiculo, String> placa;
    public static volatile SingularAttribute<Veiculo, Integer> ano;
    public static volatile SingularAttribute<Veiculo, Marca> marca;
    public static volatile SingularAttribute<Veiculo, String> modelo;

}