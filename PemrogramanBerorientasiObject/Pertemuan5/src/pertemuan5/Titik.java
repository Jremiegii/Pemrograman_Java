package pertemuan5;

public class Titik {

    // Membuat atribut bersifat private berupa x dan y
    private double x;
    private double y;

    // Membuat constructor pada kelas Pegawai dengan parameter berupa x dan y
    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Membuat setter dan gettter pada method X dan Y
    void setX(double x) {
        this.x = x;
    }

    void setY(double y) {
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }
}
