package o;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.InterfaceC7595kk1;
import o.JQ1;
import o.ZV;

/* loaded from: classes.dex */
public final class WV<Transcode> {
    public final List<InterfaceC7595kk1.a<?>> a = new ArrayList();
    public final List<InterfaceC6575gX0> b = new ArrayList();
    public com.bumptech.glide.c c;
    public Object d;
    public int e;
    public int f;
    public Class<?> g;
    public ZV.e h;
    public C5448bw1 i;
    public Map<Class<?>, InterfaceC5675cs2<?>> j;
    public Class<Transcode> k;
    public boolean l;
    public boolean m;
    public InterfaceC6575gX0 n;

    /* renamed from: o  reason: collision with root package name */
    public EnumC10672xH1 f655o;
    public AbstractC4994a40 p;
    public boolean q;
    public boolean r;

    public void a() {
        this.c = null;
        this.d = null;
        this.n = null;
        this.g = null;
        this.k = null;
        this.i = null;
        this.f655o = null;
        this.j = null;
        this.p = null;
        this.a.clear();
        this.l = false;
        this.b.clear();
        this.m = false;
    }

    public InterfaceC2727De b() {
        return this.c.b();
    }

    public List<InterfaceC6575gX0> c() {
        if (!this.m) {
            this.m = true;
            this.b.clear();
            List<InterfaceC7595kk1.a<?>> g = g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                InterfaceC7595kk1.a<?> aVar = g.get(i);
                if (!this.b.contains(aVar.a)) {
                    this.b.add(aVar.a);
                }
                for (int i2 = 0; i2 < aVar.b.size(); i2++) {
                    if (!this.b.contains(aVar.b.get(i2))) {
                        this.b.add(aVar.b.get(i2));
                    }
                }
            }
        }
        return this.b;
    }

    public Y30 d() {
        return this.h.a();
    }

    public AbstractC4994a40 e() {
        return this.p;
    }

    public int f() {
        return this.f;
    }

    public List<InterfaceC7595kk1.a<?>> g() {
        if (!this.l) {
            this.l = true;
            this.a.clear();
            List i = this.c.i().i(this.d);
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC7595kk1.a<?> b = ((InterfaceC7595kk1) i.get(i2)).b(this.d, this.e, this.f, this.i);
                if (b != null) {
                    this.a.add(b);
                }
            }
        }
        return this.a;
    }

    public <Data> O11<Data, ?, Transcode> h(Class<Data> cls) {
        return this.c.i().h(cls, this.g, this.k);
    }

    public Class<?> i() {
        return this.d.getClass();
    }

    public List<InterfaceC7595kk1<File, ?>> j(File file) throws JQ1.c {
        return this.c.i().i(file);
    }

    public C5448bw1 k() {
        return this.i;
    }

    public EnumC10672xH1 l() {
        return this.f655o;
    }

    public List<Class<?>> m() {
        return this.c.i().j(this.d.getClass(), this.g, this.k);
    }

    public <Z> InterfaceC8037mT1<Z> n(InterfaceC5580cT1<Z> interfaceC5580cT1) {
        return this.c.i().k(interfaceC5580cT1);
    }

    public <T> com.bumptech.glide.load.data.a<T> o(T t) {
        return this.c.i().l(t);
    }

    public InterfaceC6575gX0 p() {
        return this.n;
    }

    public <X> InterfaceC2422Ab0<X> q(X x) throws JQ1.e {
        return this.c.i().m(x);
    }

    public Class<?> r() {
        return (Class<Transcode>) this.k;
    }

    public <Z> InterfaceC5675cs2<Z> s(Class<Z> cls) {
        InterfaceC5675cs2<Z> interfaceC5675cs2 = (InterfaceC5675cs2<Z>) this.j.get(cls);
        if (interfaceC5675cs2 == null) {
            Iterator<Map.Entry<Class<?>, InterfaceC5675cs2<?>>> it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, InterfaceC5675cs2<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    interfaceC5675cs2 = (InterfaceC5675cs2<Z>) next.getValue();
                    break;
                }
            }
        }
        if (interfaceC5675cs2 == null) {
            if (this.j.isEmpty() && this.q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return C8692pA2.c();
        }
        return interfaceC5675cs2;
    }

    public int t() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean u(Class<?> cls) {
        if (h(cls) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <R> void v(com.bumptech.glide.c cVar, Object obj, InterfaceC6575gX0 interfaceC6575gX0, int i, int i2, AbstractC4994a40 abstractC4994a40, Class<?> cls, Class<R> cls2, EnumC10672xH1 enumC10672xH1, C5448bw1 c5448bw1, Map<Class<?>, InterfaceC5675cs2<?>> map, boolean z, boolean z2, ZV.e eVar) {
        this.c = cVar;
        this.d = obj;
        this.n = interfaceC6575gX0;
        this.e = i;
        this.f = i2;
        this.p = abstractC4994a40;
        this.g = cls;
        this.h = eVar;
        this.k = cls2;
        this.f655o = enumC10672xH1;
        this.i = c5448bw1;
        this.j = map;
        this.q = z;
        this.r = z2;
    }

    public boolean w(InterfaceC5580cT1<?> interfaceC5580cT1) {
        return this.c.i().n(interfaceC5580cT1);
    }

    public boolean x() {
        return this.r;
    }

    public boolean y(InterfaceC6575gX0 interfaceC6575gX0) {
        List<InterfaceC7595kk1.a<?>> g = g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (g.get(i).a.equals(interfaceC6575gX0)) {
                return true;
            }
        }
        return false;
    }
}
