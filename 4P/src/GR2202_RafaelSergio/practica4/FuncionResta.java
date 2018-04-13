package GR2202_RafaelSergio.practica4;

public class FuncionResta extends Funcion {
    public FuncionResta(String simbolo, int maxDesc) {
        super(simbolo, maxDesc);
    }

    @Override
    public double calcular() {
        double total = this.getDescendientes().get(0).calcular();
        for (INodo n : this.getDescendientes().subList(1, this.getDescendientes().size())) {
            total -= n.calcular();
        }
        return total;
    }

    @Override
    public FuncionResta clone() throws  CloneNotSupportedException{
        FuncionResta func = new FuncionResta(this.getRaiz(), this.getMaxDesc());
        if(this.getDescendientes().size()==0){
            return func;
        }
        for (INodo n: this.getDescendientes()) {
            func.incluirDescendiente(n.copy());
        }
        return func;
    }
}
