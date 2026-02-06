package o;

import android.net.Uri;
import java.util.Map;
import o.C8322nf1;
import o.C8541oZ;
import o.FU;
import o.KY;

@Deprecated
/* loaded from: classes2.dex */
public final class OY implements InterfaceC9656t70 {
    public final Object a = new Object();
    @InterfaceC8710pF0("lock")
    public C8322nf1.f b;
    @InterfaceC8710pF0("lock")
    public InterfaceC9170r70 c;
    @InterfaceC11300zs1
    public FU.a d;
    @InterfaceC11300zs1
    public String e;

    @Override // o.InterfaceC9656t70
    public InterfaceC9170r70 a(C8322nf1 c8322nf1) {
        InterfaceC9170r70 interfaceC9170r70;
        C9542sf.g(c8322nf1.Y);
        C8322nf1.f fVar = c8322nf1.Y.Z;
        if (fVar != null && TD2.a >= 18) {
            synchronized (this.a) {
                try {
                    if (!TD2.g(fVar, this.b)) {
                        this.b = fVar;
                        this.c = b(fVar);
                    }
                    interfaceC9170r70 = (InterfaceC9170r70) C9542sf.g(this.c);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return interfaceC9170r70;
        }
        return InterfaceC9170r70.a;
    }

    @ES1(18)
    public final InterfaceC9170r70 b(C8322nf1.f fVar) {
        String uri;
        FU.a aVar = this.d;
        if (aVar == null) {
            aVar = new C8541oZ.b().k(this.e);
        }
        Uri uri2 = fVar.Z;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        BI0 bi0 = new BI0(uri, fVar.c1, aVar);
        AbstractC6237fB2<Map.Entry<String, String>> it = fVar.Z0.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            bi0.g(next.getKey(), next.getValue());
        }
        KY a = new KY.b().h(fVar.X, C5988eA0.k).d(fVar.a1).e(fVar.b1).g(C7775lT0.B(fVar.e1)).a(bi0);
        a.G(0, fVar.f());
        return a;
    }

    public void c(@InterfaceC11300zs1 FU.a aVar) {
        this.d = aVar;
    }

    @Deprecated
    public void d(@InterfaceC11300zs1 String str) {
        this.e = str;
    }
}
