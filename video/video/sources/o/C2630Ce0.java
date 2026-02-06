package o;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

@InterfaceC6827ha0
/* renamed from: o.Ce0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2630Ce0 {
    public static final Logger f = Logger.getLogger(C2630Ce0.class.getName());
    public final String a;
    public final Executor b;
    public final InterfaceC3141Hg2 c;
    public final C3239Ig2 d;
    public final AbstractC8422o40 e;

    /* renamed from: o.Ce0$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC3141Hg2 {
        public static final a a = new a();

        public static Logger b(C3043Gg2 c3043Gg2) {
            String name = C2630Ce0.class.getName();
            String c = c3043Gg2.b().c();
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(c).length());
            sb.append(name);
            sb.append(UE.h);
            sb.append(c);
            return Logger.getLogger(sb.toString());
        }

        public static String c(C3043Gg2 c3043Gg2) {
            Method d = c3043Gg2.d();
            String name = d.getName();
            String name2 = d.getParameterTypes()[0].getName();
            String valueOf = String.valueOf(c3043Gg2.c());
            String valueOf2 = String.valueOf(c3043Gg2.a());
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 80 + name2.length() + valueOf.length() + valueOf2.length());
            sb.append("Exception thrown by subscriber method ");
            sb.append(name);
            sb.append('(');
            sb.append(name2);
            sb.append(')');
            sb.append(" on subscriber ");
            sb.append(valueOf);
            sb.append(" when dispatching event: ");
            sb.append(valueOf2);
            return sb.toString();
        }

        @Override // o.InterfaceC3141Hg2
        public void a(Throwable th, C3043Gg2 c3043Gg2) {
            Logger b = b(c3043Gg2);
            Level level = Level.SEVERE;
            if (b.isLoggable(level)) {
                b.log(level, c(c3043Gg2), th);
            }
        }
    }

    public C2630Ce0() {
        this(JT.d);
    }

    public final Executor a() {
        return this.b;
    }

    public void b(Throwable th, C3043Gg2 c3043Gg2) {
        C10664xF1.E(th);
        C10664xF1.E(c3043Gg2);
        try {
            this.c.a(th, c3043Gg2);
        } catch (Throwable th2) {
            f.log(Level.SEVERE, String.format(Locale.ROOT, "Exception %s thrown while handling exception: %s", th2, th), th2);
        }
    }

    public final String c() {
        return this.a;
    }

    public void d(Object obj) {
        Iterator<C2945Fg2> f2 = this.d.f(obj);
        if (f2.hasNext()) {
            this.e.a(obj, f2);
        } else if (!(obj instanceof C11211zV)) {
            d(new C11211zV(this, obj));
        }
    }

    public void e(Object obj) {
        this.d.h(obj);
    }

    public void f(Object obj) {
        this.d.i(obj);
    }

    public String toString() {
        return C3743Nk1.c(this).s(this.a).toString();
    }

    public C2630Ce0(String str) {
        this(str, C3645Mk1.c(), AbstractC8422o40.d(), a.a);
    }

    public C2630Ce0(InterfaceC3141Hg2 interfaceC3141Hg2) {
        this(JT.d, C3645Mk1.c(), AbstractC8422o40.d(), interfaceC3141Hg2);
    }

    public C2630Ce0(String str, Executor executor, AbstractC8422o40 abstractC8422o40, InterfaceC3141Hg2 interfaceC3141Hg2) {
        this.d = new C3239Ig2(this);
        this.a = (String) C10664xF1.E(str);
        this.b = (Executor) C10664xF1.E(executor);
        this.e = (AbstractC8422o40) C10664xF1.E(abstractC8422o40);
        this.c = (InterfaceC3141Hg2) C10664xF1.E(interfaceC3141Hg2);
    }
}
