package o;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC7840ll;
import o.C6460g32;

/* loaded from: classes.dex */
public class Q22 implements InterfaceC5702cz1, AbstractC7840ll.b, CX0 {
    public final String b;
    public final boolean c;
    public final C8431o61 d;
    public final X22 e;
    public List<Z22> f;
    public boolean g;
    public final Path a = new Path();
    public final C5296bJ h = new C5296bJ();

    public Q22(C8431o61 c8431o61, AbstractC8588ol abstractC8588ol, C5235b32 c5235b32) {
        this.b = c5235b32.b();
        this.c = c5235b32.d();
        this.d = c8431o61;
        X22 a = c5235b32.c().a();
        this.e = a;
        abstractC8588ol.j(a);
        a.a(this);
    }

    private void i() {
        this.g = false;
        this.d.invalidateSelf();
    }

    @Override // o.InterfaceC5702cz1
    public Path Y() {
        if (this.g && !this.e.k()) {
            return this.a;
        }
        this.a.reset();
        if (this.c) {
            this.g = true;
            return this.a;
        }
        Path h = this.e.h();
        if (h == null) {
            return this.a;
        }
        this.a.set(h);
        this.a.setFillType(Path.FillType.EVEN_ODD);
        this.h.b(this.a);
        this.g = true;
        return this.a;
    }

    @Override // o.AbstractC7840ll.b
    public void a() {
        i();
    }

    @Override // o.DL
    public void b(List<DL> list, List<DL> list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            DL dl = list.get(i);
            if (dl instanceof C10823xu2) {
                C10823xu2 c10823xu2 = (C10823xu2) dl;
                if (c10823xu2.k() == C6460g32.a.SIMULTANEOUSLY) {
                    this.h.a(c10823xu2);
                    c10823xu2.c(this);
                }
            }
            if (dl instanceof Z22) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Z22 z22 = (Z22) dl;
                z22.g(this);
                arrayList.add(z22);
            }
        }
        this.e.s(arrayList);
    }

    @Override // o.BX0
    public void c(AX0 ax0, int i, List<AX0> list, AX0 ax02) {
        C4713Xj1.m(ax0, i, list, ax02, this);
    }

    @Override // o.BX0
    public <T> void d(T t, O61<T> o61) {
        if (t == D61.S) {
            this.e.o(o61);
        }
    }

    @Override // o.DL
    public String getName() {
        return this.b;
    }
}
