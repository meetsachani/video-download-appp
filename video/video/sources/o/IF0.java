package o;

import java.util.Map;
import o.AbstractC4284Sz;
import o.C8718pH0;
import o.LK;

/* loaded from: classes.dex */
public class IF0 extends AbstractC4284Sz {
    public a j;
    public a k;
    public a l;
    public a m;

    /* loaded from: classes.dex */
    public class a extends AbstractC4284Sz.a {
        public a(LK.e eVar) {
            super(LK.f.valueOf(eVar.name()));
        }
    }

    public IF0(String str) {
        super(str);
        this.j = new a(LK.e.LEFT);
        this.k = new a(LK.e.RIGHT);
        this.l = new a(LK.e.START);
        this.m = new a(LK.e.END);
        this.b = new C8718pH0.a(C8718pH0.f.get(C8718pH0.b.HORIZONTAL_CHAIN));
    }

    public void A(LK.d dVar, int i, int i2) {
        a aVar = this.l;
        aVar.b = dVar;
        aVar.c = i;
        aVar.d = i2;
        this.d.put("start", aVar.toString());
    }

    public a l() {
        return this.m;
    }

    public a m() {
        return this.j;
    }

    public a n() {
        return this.k;
    }

    public a o() {
        return this.l;
    }

    public void p(LK.d dVar) {
        q(dVar, 0);
    }

    public void q(LK.d dVar, int i) {
        r(dVar, i, Integer.MIN_VALUE);
    }

    public void r(LK.d dVar, int i, int i2) {
        a aVar = this.m;
        aVar.b = dVar;
        aVar.c = i;
        aVar.d = i2;
        this.d.put("end", aVar.toString());
    }

    public void s(LK.d dVar) {
        t(dVar, 0);
    }

    public void t(LK.d dVar, int i) {
        u(dVar, i, Integer.MIN_VALUE);
    }

    public void u(LK.d dVar, int i, int i2) {
        a aVar = this.j;
        aVar.b = dVar;
        aVar.c = i;
        aVar.d = i2;
        this.d.put("left", aVar.toString());
    }

    public void v(LK.d dVar) {
        w(dVar, 0);
    }

    public void w(LK.d dVar, int i) {
        x(dVar, i, Integer.MIN_VALUE);
    }

    public void x(LK.d dVar, int i, int i2) {
        a aVar = this.k;
        aVar.b = dVar;
        aVar.c = i;
        aVar.d = i2;
        this.d.put(C5445bv2.n0, aVar.toString());
    }

    public void y(LK.d dVar) {
        z(dVar, 0);
    }

    public void z(LK.d dVar, int i) {
        A(dVar, i, Integer.MIN_VALUE);
    }

    public IF0(String str, String str2) {
        super(str);
        this.j = new a(LK.e.LEFT);
        this.k = new a(LK.e.RIGHT);
        this.l = new a(LK.e.START);
        this.m = new a(LK.e.END);
        this.c = str2;
        this.b = new C8718pH0.a(C8718pH0.f.get(C8718pH0.b.HORIZONTAL_CHAIN));
        Map<String, String> b = b();
        this.d = b;
        if (b.containsKey("contains")) {
            SP1.a(this.d.get("contains"), this.h);
        }
    }
}
