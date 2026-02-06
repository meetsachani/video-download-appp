package o;

import java.util.ArrayList;
import java.util.List;
import o.AbstractC7840ll;
import o.C6460g32;

/* renamed from: o.xu2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10823xu2 implements DL, AbstractC7840ll.b {
    public final String a;
    public final boolean b;
    public final List<AbstractC7840ll.b> c = new ArrayList();
    public final C6460g32.a d;
    public final AbstractC7840ll<?, Float> e;
    public final AbstractC7840ll<?, Float> f;
    public final AbstractC7840ll<?, Float> g;

    public C10823xu2(AbstractC8588ol abstractC8588ol, C6460g32 c6460g32) {
        this.a = c6460g32.c();
        this.b = c6460g32.g();
        this.d = c6460g32.f();
        C8629ov0 a = c6460g32.e().a();
        this.e = a;
        C8629ov0 a2 = c6460g32.b().a();
        this.f = a2;
        C8629ov0 a3 = c6460g32.d().a();
        this.g = a3;
        abstractC8588ol.j(a);
        abstractC8588ol.j(a2);
        abstractC8588ol.j(a3);
        a.a(this);
        a2.a(this);
        a3.a(this);
    }

    @Override // o.AbstractC7840ll.b
    public void a() {
        for (int i = 0; i < this.c.size(); i++) {
            this.c.get(i).a();
        }
    }

    public void c(AbstractC7840ll.b bVar) {
        this.c.add(bVar);
    }

    public AbstractC7840ll<?, Float> d() {
        return this.f;
    }

    @Override // o.DL
    public String getName() {
        return this.a;
    }

    public AbstractC7840ll<?, Float> i() {
        return this.g;
    }

    public AbstractC7840ll<?, Float> j() {
        return this.e;
    }

    public C6460g32.a k() {
        return this.d;
    }

    public boolean l() {
        return this.b;
    }

    @Override // o.DL
    public void b(List<DL> list, List<DL> list2) {
    }
}
