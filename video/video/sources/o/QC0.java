package o;

/* loaded from: classes3.dex */
public final class QC0 extends AbstractC3697My1 {
    public final double b;
    public final double c;
    public final double d;
    public final String e;

    public QC0(double d, double d2, double d3, String str) {
        super(EnumC3795Ny1.GEO);
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = str;
    }

    @Override // o.AbstractC3697My1
    public String a() {
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.b);
        sb.append(C6566gU0.h);
        sb.append(this.c);
        if (this.d > 0.0d) {
            sb.append(C6566gU0.h);
            sb.append(this.d);
            sb.append('m');
        }
        if (this.e != null) {
            sb.append(" (");
            sb.append(this.e);
            sb.append(')');
        }
        return sb.toString();
    }

    public double e() {
        return this.d;
    }

    public String f() {
        StringBuilder sb = new StringBuilder();
        sb.append("geo:");
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        if (this.d > 0.0d) {
            sb.append(',');
            sb.append(this.d);
        }
        if (this.e != null) {
            sb.append('?');
            sb.append(this.e);
        }
        return sb.toString();
    }

    public double g() {
        return this.b;
    }

    public double h() {
        return this.c;
    }

    public String i() {
        return this.e;
    }
}
