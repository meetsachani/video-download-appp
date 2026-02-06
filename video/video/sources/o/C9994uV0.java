package o;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: o.uV0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9994uV0 implements InterfaceC8631ov2 {
    public final C9954uL X;
    public final ConcurrentMap<Class<?>, InterfaceC8631ov2> Y = new ConcurrentHashMap();
    public static final InterfaceC8631ov2 Z = new b();
    public static final InterfaceC8631ov2 Y0 = new b();

    /* renamed from: o.uV0$b */
    /* loaded from: classes3.dex */
    public static class b implements InterfaceC8631ov2 {
        private b() {
        }

        @Override // o.InterfaceC8631ov2
        public <T> AbstractC8387nv2<T> b(C5523cF0 c5523cF0, Rv2<T> rv2) {
            throw new AssertionError("Factory should not be used");
        }
    }

    public C9994uV0(C9954uL c9954uL) {
        this.X = c9954uL;
    }

    public static Object a(C9954uL c9954uL, Class<?> cls) {
        return c9954uL.x(Rv2.b(cls), true).a();
    }

    public static InterfaceC9751tV0 c(Class<?> cls) {
        return (InterfaceC9751tV0) cls.getAnnotation(InterfaceC9751tV0.class);
    }

    @Override // o.InterfaceC8631ov2
    public <T> AbstractC8387nv2<T> b(C5523cF0 c5523cF0, Rv2<T> rv2) {
        InterfaceC9751tV0 c = c(rv2.f());
        if (c == null) {
            return null;
        }
        return (AbstractC8387nv2<T>) d(this.X, c5523cF0, rv2, c, true);
    }

    public AbstractC8387nv2<?> d(C9954uL c9954uL, C5523cF0 c5523cF0, Rv2<?> rv2, InterfaceC9751tV0 interfaceC9751tV0, boolean z) {
        UV0 uv0;
        InterfaceC8631ov2 interfaceC8631ov2;
        AbstractC8387nv2<?> abstractC8387nv2;
        Object a2 = a(c9954uL, interfaceC9751tV0.value());
        boolean nullSafe = interfaceC9751tV0.nullSafe();
        if (a2 instanceof AbstractC8387nv2) {
            abstractC8387nv2 = (AbstractC8387nv2) a2;
        } else if (a2 instanceof InterfaceC8631ov2) {
            InterfaceC8631ov2 interfaceC8631ov22 = (InterfaceC8631ov2) a2;
            if (z) {
                interfaceC8631ov22 = f(rv2.f(), interfaceC8631ov22);
            }
            abstractC8387nv2 = interfaceC8631ov22.b(c5523cF0, rv2);
        } else {
            boolean z2 = a2 instanceof UV0;
            if (!z2 && !(a2 instanceof CV0)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a2.getClass().getName() + " as a @JsonAdapter for " + rv2.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            CV0 cv0 = null;
            if (z2) {
                uv0 = (UV0) a2;
            } else {
                uv0 = null;
            }
            if (a2 instanceof CV0) {
                cv0 = (CV0) a2;
            }
            CV0 cv02 = cv0;
            if (z) {
                interfaceC8631ov2 = Z;
            } else {
                interfaceC8631ov2 = Y0;
            }
            C9113qu2 c9113qu2 = new C9113qu2(uv0, cv02, c5523cF0, rv2, interfaceC8631ov2, nullSafe);
            nullSafe = false;
            abstractC8387nv2 = c9113qu2;
        }
        if (abstractC8387nv2 != null && nullSafe) {
            return abstractC8387nv2.d();
        }
        return abstractC8387nv2;
    }

    public boolean e(Rv2<?> rv2, InterfaceC8631ov2 interfaceC8631ov2) {
        Objects.requireNonNull(rv2);
        Objects.requireNonNull(interfaceC8631ov2);
        if (interfaceC8631ov2 == Z) {
            return true;
        }
        Class<? super Object> f = rv2.f();
        InterfaceC8631ov2 interfaceC8631ov22 = this.Y.get(f);
        if (interfaceC8631ov22 != null) {
            if (interfaceC8631ov22 == interfaceC8631ov2) {
                return true;
            }
            return false;
        }
        InterfaceC9751tV0 c = c(f);
        if (c == null) {
            return false;
        }
        Class<?> value = c.value();
        if (InterfaceC8631ov2.class.isAssignableFrom(value) && f(f, (InterfaceC8631ov2) a(this.X, value)) == interfaceC8631ov2) {
            return true;
        }
        return false;
    }

    public final InterfaceC8631ov2 f(Class<?> cls, InterfaceC8631ov2 interfaceC8631ov2) {
        InterfaceC8631ov2 putIfAbsent = this.Y.putIfAbsent(cls, interfaceC8631ov2);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        return interfaceC8631ov2;
    }
}
