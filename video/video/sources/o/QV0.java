package o;

import java.io.UnsupportedEncodingException;
import o.DT1;

/* loaded from: classes.dex */
public abstract class QV0<T> extends AbstractC5091aS1<T> {
    public static final String q1 = "utf-8";
    public static final String r1 = String.format("application/json; charset=%s", q1);
    public final Object n1;
    public DT1.b<T> o1;
    public final String p1;

    @Deprecated
    public QV0(String str, String str2, DT1.b<T> bVar, DT1.a aVar) {
        this(-1, str, str2, bVar, aVar);
    }

    @Override // o.AbstractC5091aS1
    public abstract DT1<T> P(C3470Kp1 c3470Kp1);

    @Override // o.AbstractC5091aS1
    public void h() {
        super.h();
        synchronized (this.n1) {
            this.o1 = null;
        }
    }

    @Override // o.AbstractC5091aS1
    public void l(T t) {
        DT1.b<T> bVar;
        synchronized (this.n1) {
            bVar = this.o1;
        }
        if (bVar != null) {
            bVar.b(t);
        }
    }

    @Override // o.AbstractC5091aS1
    public byte[] p() {
        try {
            String str = this.p1;
            if (str == null) {
                return null;
            }
            return str.getBytes(q1);
        } catch (UnsupportedEncodingException unused) {
            C6767hJ2.g("Unsupported Encoding while trying to get the bytes of %s using %s", this.p1, q1);
            return null;
        }
    }

    @Override // o.AbstractC5091aS1
    public String q() {
        return r1;
    }

    @Override // o.AbstractC5091aS1
    @Deprecated
    public byte[] y() {
        return p();
    }

    @Override // o.AbstractC5091aS1
    @Deprecated
    public String z() {
        return q();
    }

    public QV0(int i, String str, String str2, DT1.b<T> bVar, DT1.a aVar) {
        super(i, str, aVar);
        this.n1 = new Object();
        this.o1 = bVar;
        this.p1 = str2;
    }
}
