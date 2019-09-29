package Model;

import java.util.ArrayList;
import java.util.Date;

public class Caixa {
    
    private String CNPJ;
    private float saldo;
    public ArrayList<Instrutor> instrutores = new ArrayList<Instrutor>();
    public Secretaria secretaria;
    private Date dataCaixa;

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }

    public Date getDataCaixa() {
        return dataCaixa;
    }

    public void setDataCaixa(Date dataCaixa) {
        this.dataCaixa = dataCaixa;
    }
    
    
    
    
    
}
