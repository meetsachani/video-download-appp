package o;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Objects;

/* renamed from: o.qu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9113qu2<T> extends AbstractC9877u12<T> {
    public final UV0<T> a;
    public final CV0<T> b;
    public final C5523cF0 c;
    public final Rv2<T> d;
    public final InterfaceC8631ov2 e;
    public final C9113qu2<T>.b f;
    public final boolean g;
    public volatile AbstractC8387nv2<T> h;

    /* renamed from: o.qu2$b */
    /* loaded from: classes3.dex */
    public final class b implements TV0, BV0 {
        public b() {
        }

        @Override // o.TV0
        public DV0 a(Object obj, Type type) {
            return C9113qu2.this.c.L(obj, type);
        }

        @Override // o.BV0
        public <R> R b(DV0 dv0, Type type) throws KV0 {
            return (R) C9113qu2.this.c.p(dv0, type);
        }

        @Override // o.TV0
        public DV0 c(Object obj) {
            return C9113qu2.this.c.K(obj);
        }
    }

    /* renamed from: o.qu2$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8631ov2 {
        public final Rv2<?> X;
        public final boolean Y;
        public final UV0<?> Y0;
        public final Class<?> Z;
        public final CV0<?> Z0;

        public c(Object obj, Rv2<?> rv2, boolean z, Class<?> cls) {
            UV0<?> uv0;
            if (obj instanceof UV0) {
                uv0 = (UV0) obj;
            } else {
                uv0 = null;
            }
            this.Y0 = uv0;
            CV0<?> cv0 = obj instanceof CV0 ? (CV0) obj : null;
            this.Z0 = cv0;
            if (uv0 == null && cv0 == null) {
                Objects.requireNonNull(obj);
                throw new IllegalArgumentException("Type adapter " + obj.getClass().getName() + " must implement JsonSerializer or JsonDeserializer");
            }
            this.X = rv2;
            this.Y = z;
            this.Z = cls;
        }

        @Override // o.InterfaceC8631ov2
        public <T> AbstractC8387nv2<T> b(C5523cF0 c5523cF0, Rv2<T> rv2) {
            boolean isAssignableFrom;
            Rv2<?> rv22 = this.X;
            if (rv22 != null) {
                if (!rv22.equals(rv2) && (!this.Y || this.X.g() != rv2.f())) {
                    isAssignableFrom = false;
                } else {
                    isAssignableFrom = true;
                }
            } else {
                isAssignableFrom = this.Z.isAssignableFrom(rv2.f());
            }
            if (isAssignableFrom) {
                return new C9113qu2(this.Y0, this.Z0, c5523cF0, rv2, this);
            }
            return null;
        }
    }

    public C9113qu2(UV0<T> uv0, CV0<T> cv0, C5523cF0 c5523cF0, Rv2<T> rv2, InterfaceC8631ov2 interfaceC8631ov2, boolean z) {
        this.f = new b();
        this.a = uv0;
        this.b = cv0;
        this.c = c5523cF0;
        this.d = rv2;
        this.e = interfaceC8631ov2;
        this.g = z;
    }

    private AbstractC8387nv2<T> k() {
        AbstractC8387nv2<T> abstractC8387nv2 = this.h;
        if (abstractC8387nv2 == null) {
            AbstractC8387nv2<T> v = this.c.v(this.e, this.d);
            this.h = v;
            return v;
        }
        return abstractC8387nv2;
    }

    public static InterfaceC8631ov2 l(Rv2<?> rv2, Object obj) {
        return new c(obj, rv2, false, null);
    }

    public static InterfaceC8631ov2 m(Rv2<?> rv2, Object obj) {
        boolean z;
        if (rv2.g() == rv2.f()) {
            z = true;
        } else {
            z = false;
        }
        return new c(obj, rv2, z, null);
    }

    public static InterfaceC8631ov2 n(Class<?> cls, Object obj) {
        return new c(obj, null, false, cls);
    }

    @Override // o.AbstractC8387nv2
    public T e(OV0 ov0) throws IOException {
        if (this.b == null) {
            return k().e(ov0);
        }
        DV0 a2 = C4690Xd2.a(ov0);
        if (this.g && a2.L()) {
            return null;
        }
        return this.b.a(a2, this.d.g(), this.f);
    }

    @Override // o.AbstractC8387nv2
    public void i(C5589cW0 c5589cW0, T t) throws IOException {
        UV0<T> uv0 = this.a;
        if (uv0 == null) {
            k().i(c5589cW0, t);
        } else if (this.g && t == null) {
            c5589cW0.u();
        } else {
            C4690Xd2.b(uv0.a(t, this.d.g(), this.f), c5589cW0);
        }
    }

    @Override // o.AbstractC9877u12
    public AbstractC8387nv2<T> j() {
        if (this.a != null) {
            return this;
        }
        return k();
    }

    public C9113qu2(UV0<T> uv0, CV0<T> cv0, C5523cF0 c5523cF0, Rv2<T> rv2, InterfaceC8631ov2 interfaceC8631ov2) {
        this(uv0, cv0, c5523cF0, rv2, interfaceC8631ov2, true);
    }
}
