package br.com.locadora.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="AUTOMOVEL")
@PrimaryKeyJoinColumn(name="id")
public class Automovel extends Veiculo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column
    private Integer capacidadePortaMalasInteger;

    public Integer getCapacidadePortaMalasInteger() {
        return capacidadePortaMalasInteger;
    }

    public void setCapacidadePortaMalasInteger(Integer capacidadePortaMalasInteger) {
        this.capacidadePortaMalasInteger = capacidadePortaMalasInteger;
    }

    @Override
    public String toString() {
        return "Automovel{" + "capacidadePortaMalasInteger=" + capacidadePortaMalasInteger + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Automovel other = (Automovel) obj;
        if (this.capacidadePortaMalasInteger != other.capacidadePortaMalasInteger && (this.capacidadePortaMalasInteger == null || !this.capacidadePortaMalasInteger.equals(other.capacidadePortaMalasInteger))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.capacidadePortaMalasInteger != null ? this.capacidadePortaMalasInteger.hashCode() : 0);
        return hash;
    }
}
