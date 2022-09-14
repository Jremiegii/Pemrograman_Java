package Pegawai;

public class Marketing extends Pegawai {

    private int Bonus;

    public int getBonus() {
        return Bonus;
    }

    public void setBonus(int bonus) {
        this.Bonus = bonus;
    }
    
    @Override
    protected double Total() {
        return getGajipokok() + getGajilembur() + getTunjKelu() + getBonus();
    }
}
