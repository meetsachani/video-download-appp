package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

@InterfaceC6827ha0
/* renamed from: o.Fg2 */
/* loaded from: classes3.dex */
public class C2945Fg2 {
    @GJ2
    public C2630Ce0 a;
    @InterfaceC5299bJ2
    public final Object b;
    public final Method c;
    public final Executor d;

    @InterfaceC5299bJ2
    /* renamed from: o.Fg2$b */
    /* loaded from: classes3.dex */
    public static final class b extends C2945Fg2 {
        @Override // o.C2945Fg2
        public void e(Object obj) throws InvocationTargetException {
            synchronized (this) {
                super.e(obj);
            }
        }

        public b(C2630Ce0 c2630Ce0, Object obj, Method method) {
            super(c2630Ce0, obj, method);
        }
    }

    public static /* synthetic */ void a(C2945Fg2 c2945Fg2, Object obj) {
        c2945Fg2.getClass();
        try {
            c2945Fg2.e(obj);
        } catch (InvocationTargetException e) {
            c2945Fg2.a.b(e.getCause(), c2945Fg2.b(obj));
        }
    }

    public static C2945Fg2 c(C2630Ce0 c2630Ce0, Object obj, Method method) {
        if (f(method)) {
            return new C2945Fg2(c2630Ce0, obj, method);
        }
        return new b(c2630Ce0, obj, method);
    }

    public static boolean f(Method method) {
        if (method.getAnnotation(InterfaceC11120z8.class) != null) {
            return true;
        }
        return false;
    }

    public final C3043Gg2 b(Object obj) {
        return new C3043Gg2(this.a, obj, this.b, this.c);
    }

    public final void d(final Object obj) {
        this.d.execute(new Runnable() { // from class: o.Eg2
            @Override // java.lang.Runnable
            public final void run() {
                C2945Fg2.a(C2945Fg2.this, obj);
            }
        });
    }

    @InterfaceC5299bJ2
    public void e(Object obj) throws InvocationTargetException {
        try {
            this.c.invoke(this.b, C10664xF1.E(obj));
        } catch (IllegalAccessException e) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 28);
            sb.append("Method became inaccessible: ");
            sb.append(valueOf);
            throw new Error(sb.toString(), e);
        } catch (IllegalArgumentException e2) {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 33);
            sb2.append("Method rejected target/argument: ");
            sb2.append(valueOf2);
            throw new Error(sb2.toString(), e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof Error) {
                throw ((Error) e3.getCause());
            }
            throw e3;
        }
    }

    public final boolean equals(@MB Object obj) {
        if (obj instanceof C2945Fg2) {
            C2945Fg2 c2945Fg2 = (C2945Fg2) obj;
            if (this.b == c2945Fg2.b && this.c.equals(c2945Fg2.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + 31) * 31) + System.identityHashCode(this.b);
    }

    public C2945Fg2(C2630Ce0 c2630Ce0, Object obj, Method method) {
        this.a = c2630Ce0;
        this.b = C10664xF1.E(obj);
        this.c = method;
        method.setAccessible(true);
        this.d = c2630Ce0.a();
    }
}
