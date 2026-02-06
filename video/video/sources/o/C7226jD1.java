package o;

import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

@InterfaceC10420wF0(emulated = true)
@InterfaceC8301na0
/* renamed from: o.jD1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7226jD1 {
    public static final Logger a = Logger.getLogger(C7226jD1.class.getName());
    public static final InterfaceC6738hC1 b = f();

    /* renamed from: o.jD1$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC6738hC1 {
        public b() {
        }

        @Override // o.InterfaceC6738hC1
        public boolean a() {
            return true;
        }

        @Override // o.InterfaceC6738hC1
        public OG compile(String str) {
            return new QU0(Pattern.compile(str));
        }
    }

    public static OG b(String str) {
        C10664xF1.E(str);
        return b.compile(str);
    }

    @MB
    public static String c(@MB String str) {
        if (k(str)) {
            return null;
        }
        return str;
    }

    public static String d(double d) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d));
    }

    public static <T extends Enum<T>> AbstractC4468Uv1<T> e(Class<T> cls, String str) {
        WeakReference<? extends Enum<?>> weakReference = C4785Yd0.a(cls).get(str);
        if (weakReference == null) {
            return AbstractC4468Uv1.a();
        }
        return AbstractC4468Uv1.f(cls.cast(weakReference.get()));
    }

    public static InterfaceC6738hC1 f() {
        return new b();
    }

    public static void g(ServiceConfigurationError serviceConfigurationError) {
        a.log(Level.WARNING, "Error loading regex compiler, falling back to next option", (Throwable) serviceConfigurationError);
    }

    public static String h(@MB String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    public static boolean i() {
        return b.a();
    }

    public static SA j(SA sa) {
        return sa.K();
    }

    public static boolean k(@MB String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

    public static long l() {
        return System.nanoTime();
    }

    public static void a() {
    }
}
