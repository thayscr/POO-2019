package br.com.edu.ifg.atividade1.vo;

import java.util.Objects;


public class Funcionario extends Pessoa{

    
    private String setor;
    public Funcionario(String setor){
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.setor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.setor, other.setor)) {
            return false;
        }
        return true;
    }
    
    

    
    
    
    
    
}
