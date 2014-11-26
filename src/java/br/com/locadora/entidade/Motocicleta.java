package br.com.locadora.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="MOTOCICLETA")
@PrimaryKeyJoinColumn(name="id")
public class Motocicleta extends Automovel implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Column
    private String quantidadeCilindradas;

    public String getQuantidadeCilindradas() {
        return quantidadeCilindradas;
    }

    public void setQuantidadeCilindradas(String quantidadeCilindradas) {
        this.quantidadeCilindradas = quantidadeCilindradas;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Motocicleta other = (Motocicleta) obj;
        if ((this.quantidadeCilindradas == null) ? (other.quantidadeCilindradas != null) : !this.quantidadeCilindradas.equals(other.quantidadeCilindradas)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (this.quantidadeCilindradas != null ? this.quantidadeCilindradas.hashCode() : 0);
        return hash;
    }
}
