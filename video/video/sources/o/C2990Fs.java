package o;

/* renamed from: o.Fs  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2990Fs extends C2783Ds {
    public float c1;

    public C2990Fs(char[] cArr) {
        super(cArr);
        this.c1 = Float.NaN;
    }

    public static C2783Ds U(char[] cArr) {
        return new C2990Fs(cArr);
    }

    @Override // o.C2783Ds
    public String M(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        d(sb, i);
        float k = k();
        int i3 = (int) k;
        if (i3 == k) {
            sb.append(i3);
        } else {
            sb.append(k);
        }
        return sb.toString();
    }

    @Override // o.C2783Ds
    public String Q() {
        float k = k();
        int i = (int) k;
        if (i == k) {
            return "" + i;
        }
        return "" + k;
    }

    public boolean V() {
        float k = k();
        if (((int) k) == k) {
            return true;
        }
        return false;
    }

    public void X(float f) {
        this.c1 = f;
    }

    @Override // o.C2783Ds
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2990Fs) {
            float k = k();
            float k2 = ((C2990Fs) obj).k();
            if ((Float.isNaN(k) && Float.isNaN(k2)) || k == k2) {
                return true;
            }
        }
        return false;
    }

    @Override // o.C2783Ds
    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        float f = this.c1;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // o.C2783Ds
    public float k() {
        if (Float.isNaN(this.c1) && B()) {
            this.c1 = Float.parseFloat(f());
        }
        return this.c1;
    }

    @Override // o.C2783Ds
    public int l() {
        if (Float.isNaN(this.c1) && B()) {
            this.c1 = Integer.parseInt(f());
        }
        return (int) this.c1;
    }

    public C2990Fs(float f) {
        super(null);
        this.c1 = f;
    }
}
