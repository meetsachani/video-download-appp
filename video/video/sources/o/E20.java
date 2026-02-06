package o;

import java.util.Formatter;

/* loaded from: classes3.dex */
public class E20 {
    public static final int c = 5;
    public final C10311vp a;
    public final VE[] b;

    public E20(C10311vp c10311vp) {
        this.a = new C10311vp(c10311vp);
        this.b = new VE[(c10311vp.e() - c10311vp.g()) + 1];
    }

    public final C10311vp a() {
        return this.a;
    }

    public final VE b(int i) {
        return this.b[e(i)];
    }

    public final VE c(int i) {
        VE ve;
        VE ve2;
        VE b = b(i);
        if (b != null) {
            return b;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int e = e(i) - i2;
            if (e >= 0 && (ve2 = this.b[e]) != null) {
                return ve2;
            }
            int e2 = e(i) + i2;
            VE[] veArr = this.b;
            if (e2 < veArr.length && (ve = veArr[e2]) != null) {
                return ve;
            }
        }
        return null;
    }

    public final VE[] d() {
        return this.b;
    }

    public final int e(int i) {
        return i - this.a.g();
    }

    public final void f(int i, VE ve) {
        this.b[e(i)] = ve;
    }

    public String toString() {
        VE[] veArr;
        Formatter formatter = new Formatter();
        try {
            int i = 0;
            for (VE ve : this.b) {
                if (ve == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i));
                    i++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(ve.c()), Integer.valueOf(ve.e()));
                    i++;
                }
            }
            String formatter2 = formatter.toString();
            formatter.close();
            return formatter2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    formatter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
