
public class Impuesto {
    private int imp1, imp2, imp3, imp4, imp5;

    public Impuesto(int imp1, int imp2, int imp3, int imp4, int imp5) {
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        this.imp5 = imp5;
    }

    public int getImp1() {
        return imp1;
    }

    public int getImp2() {
        return imp2;
    }

    public int getImp3() {
        return imp3;
    }

    public int getImp4() {
        return imp4;
    }

    public int getImp5() {
        return imp5;
    }

    public int montoTotal() {
        int montoTotal = 0;
        montoTotal = this.getImp1() + this.getImp2() + this.getImp3() + this.getImp4() + this.getImp5();
        return montoTotal;
    }
}
