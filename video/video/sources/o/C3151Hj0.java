package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.IC0;

/* renamed from: o.Hj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3151Hj0 {
    public static volatile boolean b = false;
    public static boolean c = true;
    public static final String d = "androidx.datastore.preferences.protobuf.Extension";
    public static volatile C3151Hj0 f;
    public final Map<a, IC0.h<?, ?>> a;
    public static final Class<?> e = h();
    public static final C3151Hj0 g = new C3151Hj0(true);

    /* renamed from: o.Hj0$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final Object a;
        public final int b;

        public a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a != aVar.a || this.b != aVar.b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    public C3151Hj0() {
        this.a = new HashMap();
    }

    public static C3151Hj0 d() {
        C3151Hj0 c3151Hj0;
        C3151Hj0 c3151Hj02 = f;
        if (c3151Hj02 == null) {
            synchronized (C3151Hj0.class) {
                try {
                    c3151Hj0 = f;
                    if (c3151Hj0 == null) {
                        if (c) {
                            c3151Hj0 = C3053Gj0.b();
                        } else {
                            c3151Hj0 = g;
                        }
                        f = c3151Hj0;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c3151Hj0;
        }
        return c3151Hj02;
    }

    public static boolean f() {
        return b;
    }

    public static C3151Hj0 g() {
        if (c) {
            return C3053Gj0.a();
        }
        return new C3151Hj0();
    }

    public static Class<?> h() {
        try {
            return Class.forName(d);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void i(boolean z) {
        b = z;
    }

    public final void a(AbstractC2955Fj0<?, ?> abstractC2955Fj0) {
        if (IC0.h.class.isAssignableFrom(abstractC2955Fj0.getClass())) {
            b((IC0.h) abstractC2955Fj0);
        }
        if (c && C3053Gj0.d(this)) {
            try {
                getClass().getMethod("add", e).invoke(this, abstractC2955Fj0);
            } catch (Exception e2) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", abstractC2955Fj0), e2);
            }
        }
    }

    public final void b(IC0.h<?, ?> hVar) {
        this.a.put(new a(hVar.h(), hVar.d()), hVar);
    }

    public <ContainingType extends InterfaceC3540Li1> IC0.h<ContainingType, ?> c(ContainingType containingtype, int i) {
        return (IC0.h<ContainingType, ?>) this.a.get(new a(containingtype, i));
    }

    public C3151Hj0 e() {
        return new C3151Hj0(this);
    }

    public C3151Hj0(C3151Hj0 c3151Hj0) {
        if (c3151Hj0 == g) {
            this.a = Collections.EMPTY_MAP;
        } else {
            this.a = Collections.unmodifiableMap(c3151Hj0.a);
        }
    }

    public C3151Hj0(boolean z) {
        this.a = Collections.EMPTY_MAP;
    }
}
