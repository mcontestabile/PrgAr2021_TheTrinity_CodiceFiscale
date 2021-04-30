package it.unibs.fp.codice_fiscale;

import it.unibs.fp.utilities.Parsable;

public class FiscalCode implements Parsable {
    private String fiscalCode;
    public static final String START_STRING = "codice";

    public FiscalCode() {
        methods.put("codice", this::setFiscalCode);
    }

    public String getFiscalCode() {
        return fiscalCode;
    }
    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    @Override
    public String toString() {
        return "FiscalCode{" +
                "fiscalCode='" + fiscalCode + '\'' +
                '}';
    }

    @Override
    public String getStartString() {
        return START_STRING;
    }
}
