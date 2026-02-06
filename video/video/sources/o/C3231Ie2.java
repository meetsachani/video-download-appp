package o;

import java.io.UnsupportedEncodingException;
import o.DT1;

/* renamed from: o.Ie2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3231Ie2 extends AbstractC5091aS1<String> {
    public final Object n1;
    public DT1.b<String> o1;

    public C3231Ie2(int i, String str, DT1.b<String> bVar, DT1.a aVar) {
        super(i, str, aVar);
        this.n1 = new Object();
        this.o1 = bVar;
    }

    @Override // o.AbstractC5091aS1
    public DT1<String> P(C3470Kp1 c3470Kp1) {
        String str;
        try {
            str = new String(c3470Kp1.b, C11161zI0.f(c3470Kp1.c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(c3470Kp1.b);
        }
        return DT1.c(str, C11161zI0.e(c3470Kp1));
    }

    @Override // o.AbstractC5091aS1
    /* renamed from: e0 */
    public void l(String str) {
        DT1.b<String> bVar;
        synchronized (this.n1) {
            bVar = this.o1;
        }
        if (bVar != null) {
            bVar.b(str);
        }
    }

    @Override // o.AbstractC5091aS1
    public void h() {
        super.h();
        synchronized (this.n1) {
            this.o1 = null;
        }
    }

    public C3231Ie2(String str, DT1.b<String> bVar, DT1.a aVar) {
        this(0, str, bVar, aVar);
    }
}
