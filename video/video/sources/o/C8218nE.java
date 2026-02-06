package o;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

@InterfaceC7797la0
@InterfaceC11149zF0
@InterfaceC4238Sm
/* renamed from: o.nE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8218nE implements Closeable {
    public static final c Y0;
    @InterfaceC5299bJ2
    public final c X;
    public final Deque<Closeable> Y = new ArrayDeque(4);
    @MB
    public Throwable Z;

    @InterfaceC5299bJ2
    /* renamed from: o.nE$a */
    /* loaded from: classes3.dex */
    public static final class a implements c {
        public static final a a = new a();

        @Override // o.C8218nE.c
        public void a(Closeable closeable, Throwable th, Throwable th2) {
            Logger logger = C5518cE.a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(closeable);
            StringBuilder sb = new StringBuilder(valueOf.length() + 42);
            sb.append("Suppressing exception thrown when closing ");
            sb.append(valueOf);
            logger.log(level, sb.toString(), th2);
        }
    }

    @InterfaceC5299bJ2
    /* renamed from: o.nE$b */
    /* loaded from: classes3.dex */
    public static final class b implements c {
        public final Method a;

        public b(Method method) {
            this.a = method;
        }

        @MB
        public static b b() {
            try {
                return new b(Throwable.class.getMethod("addSuppressed", Throwable.class));
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // o.C8218nE.c
        public void a(Closeable closeable, Throwable th, Throwable th2) {
            if (th == th2) {
                return;
            }
            try {
                this.a.invoke(th, th2);
            } catch (Throwable unused) {
                a.a.a(closeable, th, th2);
            }
        }
    }

    @InterfaceC5299bJ2
    /* renamed from: o.nE$c */
    /* loaded from: classes3.dex */
    public interface c {
        void a(Closeable closeable, Throwable th, Throwable th2);
    }

    static {
        c b2 = b.b();
        if (b2 == null) {
            b2 = a.a;
        }
        Y0 = b2;
    }

    @InterfaceC5299bJ2
    public C8218nE(c cVar) {
        this.X = (c) C10664xF1.E(cVar);
    }

    public static C8218nE a() {
        return new C8218nE(Y0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Throwable th = this.Z;
        while (!this.Y.isEmpty()) {
            Closeable removeFirst = this.Y.removeFirst();
            try {
                removeFirst.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.X.a(removeFirst, th, th2);
                }
            }
        }
        if (this.Z == null && th != null) {
            C7855lo2.t(th, IOException.class);
            throw new AssertionError(th);
        }
    }

    @InterfaceC6181ey
    @InterfaceC9377ry1
    public <C extends Closeable> C d(@InterfaceC9377ry1 C c2) {
        if (c2 != null) {
            this.Y.addFirst(c2);
        }
        return c2;
    }

    public RuntimeException f(Throwable th) throws IOException {
        C10664xF1.E(th);
        this.Z = th;
        C7855lo2.t(th, IOException.class);
        throw new RuntimeException(th);
    }

    public <X extends Exception> RuntimeException h(Throwable th, Class<X> cls) throws IOException, Exception {
        C10664xF1.E(th);
        this.Z = th;
        C7855lo2.t(th, IOException.class);
        C7855lo2.t(th, cls);
        throw new RuntimeException(th);
    }

    public <X1 extends Exception, X2 extends Exception> RuntimeException i(Throwable th, Class<X1> cls, Class<X2> cls2) throws IOException, Exception, Exception {
        C10664xF1.E(th);
        this.Z = th;
        C7855lo2.t(th, IOException.class);
        C7855lo2.u(th, cls, cls2);
        throw new RuntimeException(th);
    }
}
