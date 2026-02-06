package o;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@InterfaceC10420wF0(emulated = true)
@InterfaceC8301na0
/* renamed from: o.lo2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7855lo2 {
    @InterfaceC11149zF0
    public static final String a = "sun.misc.JavaLangAccess";
    @InterfaceC11149zF0
    @InterfaceC5299bJ2
    public static final String b = "sun.misc.SharedSecrets";
    @MB
    @InterfaceC11149zF0
    public static final Object c;
    @MB
    @InterfaceC11149zF0
    public static final Method d;
    @MB
    @InterfaceC11149zF0
    public static final Method e;

    /* renamed from: o.lo2$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractList<StackTraceElement> {
        public final /* synthetic */ Throwable X;

        public a(Throwable th) {
            this.X = th;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public StackTraceElement get(int i) {
            Method method = C7855lo2.d;
            Objects.requireNonNull(method);
            Object obj = C7855lo2.c;
            Objects.requireNonNull(obj);
            return (StackTraceElement) C7855lo2.m(method, obj, this.X, Integer.valueOf(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            Method method = C7855lo2.e;
            Objects.requireNonNull(method);
            Object obj = C7855lo2.c;
            Objects.requireNonNull(obj);
            return ((Integer) C7855lo2.m(method, obj, this.X)).intValue();
        }
    }

    static {
        Method g;
        Object h = h();
        c = h;
        Method method = null;
        if (h == null) {
            g = null;
        } else {
            g = g();
        }
        d = g;
        if (h != null) {
            method = k(h);
        }
        e = method;
    }

    public static List<Throwable> e(Throwable th) {
        C10664xF1.E(th);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th);
        boolean z = false;
        Throwable th2 = th;
        while (true) {
            th = th.getCause();
            if (th != null) {
                arrayList.add(th);
                if (th != th2) {
                    if (z) {
                        th2 = th2.getCause();
                    }
                    z = !z;
                } else {
                    throw new IllegalArgumentException("Loop in causal chain detected.", th);
                }
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }

    @MB
    @InterfaceC11149zF0
    public static <X extends Throwable> X f(Throwable th, Class<X> cls) {
        try {
            return cls.cast(th.getCause());
        } catch (ClassCastException e2) {
            e2.initCause(th);
            throw e2;
        }
    }

    @MB
    @InterfaceC11149zF0
    public static Method g() {
        return i("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    @MB
    @InterfaceC11149zF0
    public static Object h() {
        try {
            return Class.forName(b, false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    @MB
    @InterfaceC11149zF0
    public static Method i(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName(a, false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Throwable j(Throwable th) {
        boolean z = false;
        Throwable th2 = th;
        while (true) {
            Throwable cause = th.getCause();
            if (cause != null) {
                if (cause != th2) {
                    if (z) {
                        th2 = th2.getCause();
                    }
                    z = !z;
                    th = cause;
                } else {
                    throw new IllegalArgumentException("Loop in causal chain detected.", cause);
                }
            } else {
                return th;
            }
        }
    }

    @MB
    @InterfaceC11149zF0
    public static Method k(Object obj) {
        try {
            Method i = i("getStackTraceDepth", Throwable.class);
            if (i == null) {
                return null;
            }
            i.invoke(obj, new Throwable());
            return i;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @InterfaceC11149zF0
    public static String l(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @InterfaceC11149zF0
    public static Object m(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw q(e3.getCause());
        }
    }

    @InterfaceC11149zF0
    public static List<StackTraceElement> n(Throwable th) {
        C10664xF1.E(th);
        return new a(th);
    }

    @InterfaceC11149zF0
    @Deprecated
    public static List<StackTraceElement> o(Throwable th) {
        if (p()) {
            return n(th);
        }
        return Collections.unmodifiableList(Arrays.asList(th.getStackTrace()));
    }

    @InterfaceC11149zF0
    @Deprecated
    public static boolean p() {
        if (d != null && e != null) {
            return true;
        }
        return false;
    }

    @InterfaceC6181ey
    @InterfaceC11149zF0
    @Deprecated
    public static RuntimeException q(Throwable th) {
        w(th);
        throw new RuntimeException(th);
    }

    @InterfaceC11149zF0
    @Deprecated
    public static <X extends Throwable> void r(@MB Throwable th, Class<X> cls) throws Throwable {
        if (th != null) {
            v(th, cls);
        }
    }

    @InterfaceC11149zF0
    @Deprecated
    public static void s(@MB Throwable th) {
        if (th != null) {
            w(th);
        }
    }

    @InterfaceC11149zF0
    public static <X extends Throwable> void t(@MB Throwable th, Class<X> cls) throws Throwable {
        r(th, cls);
        s(th);
    }

    @InterfaceC11149zF0
    public static <X1 extends Throwable, X2 extends Throwable> void u(@MB Throwable th, Class<X1> cls, Class<X2> cls2) throws Throwable, Throwable {
        C10664xF1.E(cls2);
        r(th, cls);
        t(th, cls2);
    }

    @InterfaceC11149zF0
    public static <X extends Throwable> void v(Throwable th, Class<X> cls) throws Throwable {
        C10664xF1.E(th);
        if (!cls.isInstance(th)) {
            return;
        }
        throw cls.cast(th);
    }

    public static void w(Throwable th) {
        C10664xF1.E(th);
        if (!(th instanceof RuntimeException)) {
            if (!(th instanceof Error)) {
                return;
            }
            throw ((Error) th);
        }
        throw ((RuntimeException) th);
    }
}
