package o;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.FE1;

/* loaded from: classes.dex */
public class JQ1 {
    public static final String k = "Animation";
    @Deprecated
    public static final String l = "Animation";
    public static final String m = "Bitmap";
    public static final String n = "BitmapDrawable";

    /* renamed from: o  reason: collision with root package name */
    public static final String f502o = "legacy_prepend_all";
    public static final String p = "legacy_append";
    public final C8099mk1 a;
    public final C3025Gc0 b;
    public final C7533kT1 c;
    public final C8280nT1 d;
    public final com.bumptech.glide.load.data.b e;
    public final C4161Rr2 f;
    public final XM0 g;
    public final C9807tk1 h = new C9807tk1();
    public final P11 i = new P11();
    public final FE1.a<List<Throwable>> j;

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes.dex */
    public static class c extends a {
        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> c(M m, List<InterfaceC7595kk1<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public JQ1() {
        FE1.a<List<Throwable>> g = C6126ek0.g();
        this.j = g;
        this.a = new C8099mk1(g);
        this.b = new C3025Gc0();
        this.c = new C7533kT1();
        this.d = new C8280nT1();
        this.e = new com.bumptech.glide.load.data.b();
        this.f = new C4161Rr2();
        this.g = new XM0();
        z(Arrays.asList("Animation", m, n));
    }

    public <Model, Data> JQ1 a(Class<Model> cls, Class<Data> cls2, InterfaceC7838lk1<Model, Data> interfaceC7838lk1) {
        this.a.a(cls, cls2, interfaceC7838lk1);
        return this;
    }

    public <Data, TResource> JQ1 b(Class<Data> cls, Class<TResource> cls2, InterfaceC7290jT1<Data, TResource> interfaceC7290jT1) {
        e(p, cls, cls2, interfaceC7290jT1);
        return this;
    }

    public <Data> JQ1 c(Class<Data> cls, InterfaceC2422Ab0<Data> interfaceC2422Ab0) {
        this.b.a(cls, interfaceC2422Ab0);
        return this;
    }

    public <TResource> JQ1 d(Class<TResource> cls, InterfaceC8037mT1<TResource> interfaceC8037mT1) {
        this.d.a(cls, interfaceC8037mT1);
        return this;
    }

    public <Data, TResource> JQ1 e(String str, Class<Data> cls, Class<TResource> cls2, InterfaceC7290jT1<Data, TResource> interfaceC7290jT1) {
        this.c.a(str, interfaceC7290jT1, cls, cls2);
        return this;
    }

    public final <Data, TResource, Transcode> List<C5103aW<Data, TResource, Transcode>> f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.c.d(cls, cls2)) {
            for (Class cls5 : this.f.b(cls4, cls3)) {
                arrayList.add(new C5103aW(cls, cls4, cls5, this.c.b(cls, cls4), this.f.a(cls4, cls5), this.j));
            }
        }
        return arrayList;
    }

    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> b2 = this.g.b();
        if (!b2.isEmpty()) {
            return b2;
        }
        throw new b();
    }

    public <Data, TResource, Transcode> O11<Data, TResource, Transcode> h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        Class<Data> cls4;
        Class<TResource> cls5;
        Class<Transcode> cls6;
        O11<Data, TResource, Transcode> a2 = this.i.a(cls, cls2, cls3);
        O11<Data, TResource, Transcode> o11 = null;
        if (this.i.c(a2)) {
            return null;
        }
        if (a2 == null) {
            List<C5103aW<Data, TResource, Transcode>> f = f(cls, cls2, cls3);
            if (f.isEmpty()) {
                cls4 = cls;
                cls5 = cls2;
                cls6 = cls3;
            } else {
                cls4 = cls;
                cls5 = cls2;
                cls6 = cls3;
                o11 = new O11<>(cls4, cls5, cls6, f, this.j);
            }
            this.i.d(cls4, cls5, cls6, o11);
            return o11;
        }
        return a2;
    }

    public <Model> List<InterfaceC7595kk1<Model, ?>> i(Model model) {
        return this.a.e(model);
    }

    public <Model, TResource, Transcode> List<Class<?>> j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> b2 = this.h.b(cls, cls2, cls3);
        if (b2 == null) {
            b2 = new ArrayList<>();
            for (Class<?> cls4 : this.a.d(cls)) {
                for (Class<?> cls5 : this.c.d(cls4, cls2)) {
                    if (!this.f.b(cls5, cls3).isEmpty() && !b2.contains(cls5)) {
                        b2.add(cls5);
                    }
                }
            }
            this.h.c(cls, cls2, cls3, Collections.unmodifiableList(b2));
        }
        return b2;
    }

    public <X> InterfaceC8037mT1<X> k(InterfaceC5580cT1<X> interfaceC5580cT1) throws d {
        InterfaceC8037mT1<X> b2 = this.d.b(interfaceC5580cT1.i0());
        if (b2 != null) {
            return b2;
        }
        throw new d(interfaceC5580cT1.i0());
    }

    public <X> com.bumptech.glide.load.data.a<X> l(X x) {
        return this.e.a(x);
    }

    public <X> InterfaceC2422Ab0<X> m(X x) throws e {
        InterfaceC2422Ab0<X> b2 = this.b.b(x.getClass());
        if (b2 != null) {
            return b2;
        }
        throw new e(x.getClass());
    }

    public boolean n(InterfaceC5580cT1<?> interfaceC5580cT1) {
        if (this.d.b(interfaceC5580cT1.i0()) != null) {
            return true;
        }
        return false;
    }

    public <Model, Data> JQ1 o(Class<Model> cls, Class<Data> cls2, InterfaceC7838lk1<Model, Data> interfaceC7838lk1) {
        this.a.g(cls, cls2, interfaceC7838lk1);
        return this;
    }

    public <Data, TResource> JQ1 p(Class<Data> cls, Class<TResource> cls2, InterfaceC7290jT1<Data, TResource> interfaceC7290jT1) {
        s(f502o, cls, cls2, interfaceC7290jT1);
        return this;
    }

    public <Data> JQ1 q(Class<Data> cls, InterfaceC2422Ab0<Data> interfaceC2422Ab0) {
        this.b.c(cls, interfaceC2422Ab0);
        return this;
    }

    public <TResource> JQ1 r(Class<TResource> cls, InterfaceC8037mT1<TResource> interfaceC8037mT1) {
        this.d.c(cls, interfaceC8037mT1);
        return this;
    }

    public <Data, TResource> JQ1 s(String str, Class<Data> cls, Class<TResource> cls2, InterfaceC7290jT1<Data, TResource> interfaceC7290jT1) {
        this.c.e(str, interfaceC7290jT1, cls, cls2);
        return this;
    }

    public JQ1 t(ImageHeaderParser imageHeaderParser) {
        this.g.a(imageHeaderParser);
        return this;
    }

    public JQ1 u(a.InterfaceC0063a<?> interfaceC0063a) {
        this.e.b(interfaceC0063a);
        return this;
    }

    public <TResource, Transcode> JQ1 v(Class<TResource> cls, Class<Transcode> cls2, InterfaceC9502sT1<TResource, Transcode> interfaceC9502sT1) {
        this.f.c(cls, cls2, interfaceC9502sT1);
        return this;
    }

    @Deprecated
    public <Data> JQ1 w(Class<Data> cls, InterfaceC2422Ab0<Data> interfaceC2422Ab0) {
        return c(cls, interfaceC2422Ab0);
    }

    @Deprecated
    public <TResource> JQ1 x(Class<TResource> cls, InterfaceC8037mT1<TResource> interfaceC8037mT1) {
        return d(cls, interfaceC8037mT1);
    }

    public <Model, Data> JQ1 y(Class<Model> cls, Class<Data> cls2, InterfaceC7838lk1<? extends Model, ? extends Data> interfaceC7838lk1) {
        this.a.i(cls, cls2, interfaceC7838lk1);
        return this;
    }

    public final JQ1 z(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add(f502o);
        for (String str : list) {
            arrayList.add(str);
        }
        arrayList.add(p);
        this.c.f(arrayList);
        return this;
    }
}
