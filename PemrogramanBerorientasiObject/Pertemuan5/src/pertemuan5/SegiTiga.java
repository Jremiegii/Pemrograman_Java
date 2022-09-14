package pertemuan5;

public class SegiTiga {

    // Membuat atribut berisifat private berupa K, L, M
    private final Titik K;
    private final Titik L;
    private final Titik M;

    //Membuat Constructor pada kelas segitiga denagan parameter Titik k, Titik l dan Titik m 
    public SegiTiga(Titik k, Titik l, Titik m) {
        this.K = k;
        this.L = l;
        this.M = m;
    }
    
    // Membuat gettter pada method TitikK, TitikL, TitikM
    public Titik getTitikK() {
        return K;
    }

    public Titik getTitikL() {
        return L;
    }

    public Titik getTitikM() {
        return M;
    }

    // Membuat method untuk memperoleh nilai hitungSisi
    public double hitungSisi(double xa, double ya, double xb, double yb) {
        return Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2));
    }

    // Membuat method untuk memperoleh nilai hitungkeliling
    public double hitungKeliling() {
        return hitungSisi(getTitikK().getX(), getTitikK().getY(), getTitikL().getX(), getTitikL().getY())
                + hitungSisi(getTitikL().getX(), getTitikL().getY(), getTitikM().getX(), getTitikM().getY())
                + hitungSisi(getTitikM().getX(),getTitikM().getY(), getTitikK().getX(), getTitikK().getY());
    }

    // Membuat method untuk memperoleh nilai hitungLuas
    public double hitungLuas() {
        double s = hitungKeliling() / 2;
        return Math.sqrt(s * (s - hitungSisi(getTitikK().getX(), getTitikK().getY(), getTitikL().getX(), 
                getTitikL().getY()))* (s - hitungSisi(getTitikL().getX(), getTitikL().getY(), getTitikM().getX(), 
                getTitikM().getY())) * (s - hitungSisi(getTitikM().getX(), getTitikM().getY(), getTitikK().getX(), 
                getTitikK().getY())));
    }
}
