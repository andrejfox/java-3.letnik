package cetrtiLetnik.Exercise_1;

import java.util.ArrayList;
import java.util.List;

public class Ulomek {
    private double stevec;
    private double imenovalec;

    public Ulomek () {
        this.stevec = 0;
        this.imenovalec = 1;
    }

    public Ulomek (double stevec, double imenovalec) {
        this.stevec = stevec;
        this.imenovalec = imenovalec;
    }

    public String toString() {
        return "Števec: " + stevec + " | Imenovalec: " + imenovalec;
    }

    public void setStevec(double input) {
        this.stevec = input;
    }

    public void primnozi(Ulomek input) {
        stevec = stevec * input.stevec;
        imenovalec = imenovalec * input.imenovalec;
        okrajsaj();
    }

    public void zdeli(Ulomek input) {
        stevec = stevec * input.imenovalec;
        imenovalec = imenovalec * input.stevec;
        okrajsaj();
    }

    public void pristej(Ulomek input) {
        stevec = input.stevec * imenovalec + stevec * input.imenovalec;
        imenovalec *= input.imenovalec;
        okrajsaj();
    }

    public void odstej(Ulomek input) {
        stevec = input.stevec * imenovalec - stevec * input.imenovalec;
        imenovalec *= input.imenovalec;
        okrajsaj();
    }

    public double skupniImenovalec(Ulomek input) {
        List<Double> imenovalecDividers1 = findDividers(imenovalec);
        List<Double> imenovalecDividers2 = findDividers(input.imenovalec);

        double skupniImenovalec = 0;

        if (Math.max(imenovalecDividers1.size(), imenovalecDividers2.size()) == imenovalecDividers1.size()) {
            outer : for(int i = imenovalecDividers1.size() - 1; i >= 0; i--) {
                for (int z = imenovalecDividers2.size() - 1; z >= 0; z--) {
                    if (imenovalecDividers1.get(i) % imenovalecDividers2.get(z) == 0) {
                        skupniImenovalec = imenovalecDividers1.get(i);
                        break outer;
                    }
                }
            }
        } else {
            outer : for(int i = imenovalecDividers2.size() - 1; i >= 0; i--) {
                for (int z = imenovalecDividers1.size() - 1; z >= 0; z--) {
                    if (imenovalecDividers2.get(i) % imenovalecDividers1.get(z) == 0) {
                        skupniImenovalec = imenovalecDividers2.get(i);
                        break outer;
                    }
                }
            }
        }

        if (skupniImenovalec == 0) {
            skupniImenovalec = imenovalec * input.imenovalec;
        }

        return skupniImenovalec;
    }

    public void okrajsaj() {
        List<Double> stevecDividers = findDividers(stevec);
        List<Double> imenovalecDividers = findDividers(imenovalec);

        for (int i = stevecDividers.size() - 1; i >= 0; i--) {
            if (imenovalecDividers.contains(stevecDividers.get(i))) {
                stevec /= stevecDividers.get(i);
                imenovalec /= stevecDividers.get(i);
                break;
            }
        }
    }

    private List<Double> findDividers(double input) {
        List<Double> out = new ArrayList<>();
        for (int i = 2; i <= input; i++) {
            if (input % i == 0) {
                out.add((double) i);
            }
        }
        System.out.println(out);
        return out;
    }
}