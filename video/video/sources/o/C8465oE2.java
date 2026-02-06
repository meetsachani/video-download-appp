package o;

import java.util.Map;
import o.AbstractC4284Sz;
import o.C8718pH0;
import o.LK;

/* renamed from: o.oE2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8465oE2 extends AbstractC4284Sz {
    public a j;
    public a k;
    public a l;

    /* renamed from: o.oE2$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC4284Sz.a {
        public a(LK.h hVar) {
            super(LK.f.valueOf(hVar.name()));
        }
    }

    public C8465oE2(String str) {
        super(str);
        this.j = new a(LK.h.TOP);
        this.k = new a(LK.h.BOTTOM);
        this.l = new a(LK.h.BASELINE);
        this.b = new C8718pH0.a(C8718pH0.f.get(C8718pH0.b.VERTICAL_CHAIN));
    }

    public a l() {
        return this.l;
    }

    public a m() {
        return this.k;
    }

    public a n() {
        return this.j;
    }

    public void o(LK.g gVar) {
        p(gVar, 0);
    }

    public void p(LK.g gVar, int i) {
        q(gVar, i, Integer.MIN_VALUE);
    }

    public void q(LK.g gVar, int i, int i2) {
        a aVar = this.l;
        aVar.b = gVar;
        aVar.c = i;
        aVar.d = i2;
        this.d.put("baseline", aVar.toString());
    }

    public void r(LK.g gVar) {
        s(gVar, 0);
    }

    public void s(LK.g gVar, int i) {
        t(gVar, i, Integer.MIN_VALUE);
    }

    public void t(LK.g gVar, int i, int i2) {
        a aVar = this.k;
        aVar.b = gVar;
        aVar.c = i;
        aVar.d = i2;
        this.d.put("bottom", aVar.toString());
    }

    public void u(LK.g gVar) {
        v(gVar, 0);
    }

    public void v(LK.g gVar, int i) {
        w(gVar, i, Integer.MIN_VALUE);
    }

    public void w(LK.g gVar, int i, int i2) {
        a aVar = this.j;
        aVar.b = gVar;
        aVar.c = i;
        aVar.d = i2;
        this.d.put(C9698tH2.l, aVar.toString());
    }

    public C8465oE2(String str, String str2) {
        super(str);
        this.j = new a(LK.h.TOP);
        this.k = new a(LK.h.BOTTOM);
        this.l = new a(LK.h.BASELINE);
        this.c = str2;
        this.b = new C8718pH0.a(C8718pH0.f.get(C8718pH0.b.VERTICAL_CHAIN));
        Map<String, String> b = b();
        this.d = b;
        if (b.containsKey("contains")) {
            SP1.a(this.d.get("contains"), this.h);
        }
    }
}
