package o;

import android.net.Uri;

@Deprecated
/* loaded from: classes2.dex */
public final class XN1 {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public XN1(@InterfaceC11300zs1 String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    @InterfaceC11300zs1
    public XN1 a(@InterfaceC11300zs1 XN1 xn1, String str) {
        String c = c(str);
        XN1 xn12 = null;
        if (xn1 != null && c.equals(xn1.c(str))) {
            long j = this.b;
            long j2 = -1;
            if (j != -1) {
                long j3 = this.a;
                if (j3 + j == xn1.a) {
                    long j4 = xn1.b;
                    if (j4 != -1) {
                        j2 = j + j4;
                    }
                    return new XN1(c, j3, j2);
                }
            }
            long j5 = xn1.b;
            if (j5 != -1) {
                long j6 = xn1.a;
                if (j6 + j5 == this.a) {
                    if (j != -1) {
                        j2 = j5 + j;
                    }
                    xn12 = new XN1(c, j6, j2);
                }
            }
        }
        return xn12;
    }

    public Uri b(String str) {
        return RC2.f(str, this.c);
    }

    public String c(String str) {
        return RC2.e(str, this.c);
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && XN1.class == obj.getClass()) {
            XN1 xn1 = (XN1) obj;
            if (this.a == xn1.a && this.b == xn1.b && this.c.equals(xn1.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.d == 0) {
            this.d = ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31) + this.c.hashCode();
        }
        return this.d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.c + ", start=" + this.a + ", length=" + this.b + C9811tl1.d;
    }
}
