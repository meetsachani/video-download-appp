package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.Ww  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4663Ww extends AbstractC7603km1<AbstractC4566Vw> {

    /* renamed from: o.Ww$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final List<AbstractC4566Vw> a = new ArrayList();

        public a(List<AbstractC4566Vw> list) {
            for (AbstractC4566Vw abstractC4566Vw : list) {
                this.a.add(abstractC4566Vw);
            }
        }

        public List<AbstractC4566Vw> a() {
            return this.a;
        }

        public void b() {
            for (AbstractC4566Vw abstractC4566Vw : this.a) {
                abstractC4566Vw.a();
            }
        }

        public List<C3597Ly> c() {
            ArrayList arrayList = new ArrayList();
            for (AbstractC4566Vw abstractC4566Vw : this.a) {
                C3597Ly b = abstractC4566Vw.b();
                if (b != null) {
                    arrayList.add(b);
                }
            }
            return arrayList;
        }

        public List<C3597Ly> d() {
            ArrayList arrayList = new ArrayList();
            for (AbstractC4566Vw abstractC4566Vw : this.a) {
                C3597Ly c = abstractC4566Vw.c();
                if (c != null) {
                    arrayList.add(c);
                }
            }
            return arrayList;
        }

        public List<C3597Ly> e() {
            ArrayList arrayList = new ArrayList();
            for (AbstractC4566Vw abstractC4566Vw : this.a) {
                C3597Ly d = abstractC4566Vw.d();
                if (d != null) {
                    arrayList.add(d);
                }
            }
            return arrayList;
        }

        public List<C3597Ly> f() {
            ArrayList arrayList = new ArrayList();
            for (AbstractC4566Vw abstractC4566Vw : this.a) {
                C3597Ly e = abstractC4566Vw.e();
                if (e != null) {
                    arrayList.add(e);
                }
            }
            return arrayList;
        }
    }

    public C4663Ww(AbstractC4566Vw... abstractC4566VwArr) {
        a(Arrays.asList(abstractC4566VwArr));
    }

    public static C4663Ww e() {
        return new C4663Ww(new AbstractC4566Vw[0]);
    }

    @Override // o.AbstractC7603km1
    /* renamed from: b */
    public AbstractC7603km1<AbstractC4566Vw> clone() {
        C4663Ww e = e();
        e.a(c());
        return e;
    }

    public a d() {
        return new a(c());
    }
}
