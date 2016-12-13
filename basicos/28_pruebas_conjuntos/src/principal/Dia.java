
package principal;

import java.util.Objects;


public class Dia {
    int num;
    String dia;

    public Dia(int num, String dia) {
        this.num = num;
        this.dia = dia;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.num;//Si coincide el numero
        hash = 73 * hash + Objects.hashCode(this.dia);//si coincide el texto
        return hash;
        //return 10; //Se podría poner el mismo, siempre, así siempre coincidiría.
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
        final Dia other = (Dia) obj;
        if (this.num != other.num) {
            return false;
        }
        if (!Objects.equals(this.dia, other.dia)) {
            return false;
        }
        return true;
    }


    
    
}
