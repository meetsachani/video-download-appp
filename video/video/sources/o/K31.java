package o;

import java.io.Serializable;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

/* loaded from: classes4.dex */
public class K31 implements J31, Serializable {
    public static final Priority Y0 = null;
    public static final String Z = null;
    public static /* synthetic */ Class Z0 = null;
    public static /* synthetic */ Class a1 = null;
    public static /* synthetic */ Class b1 = null;
    private static final long serialVersionUID = 5160705895411730424L;
    public volatile transient Logger X;
    public final String Y;

    static {
        throw null;
    }

    public K31() {
        this.X = null;
        this.Y = null;
    }

    public static /* synthetic */ Class s(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    @Override // o.J31
    public void a(Object obj) {
        t().log(Z, Level.DEBUG, obj, (Throwable) null);
    }

    @Override // o.J31
    public boolean b() {
        return t().isEnabledFor(Level.WARN);
    }

    @Override // o.J31
    public boolean c() {
        return t().isDebugEnabled();
    }

    @Override // o.J31
    public boolean d() {
        return t().isInfoEnabled();
    }

    @Override // o.J31
    public void e(Object obj) {
        t().log(Z, Level.INFO, obj, (Throwable) null);
    }

    @Override // o.J31
    public boolean f() {
        return t().isEnabledFor(Y0);
    }

    @Override // o.J31
    public void g(Object obj, Throwable th) {
        t().log(Z, Level.ERROR, obj, th);
    }

    @Override // o.J31
    public void h(Object obj, Throwable th) {
        t().log(Z, Level.FATAL, obj, th);
    }

    @Override // o.J31
    public void i(Object obj) {
        t().log(Z, Level.ERROR, obj, (Throwable) null);
    }

    @Override // o.J31
    public boolean j() {
        return t().isEnabledFor(Level.FATAL);
    }

    @Override // o.J31
    public void k(Object obj, Throwable th) {
        t().log(Z, Level.INFO, obj, th);
    }

    @Override // o.J31
    public void l(Object obj, Throwable th) {
        t().log(Z, Level.DEBUG, obj, th);
    }

    @Override // o.J31
    public void m(Object obj, Throwable th) {
        t().log(Z, Y0, obj, th);
    }

    @Override // o.J31
    public boolean n() {
        return t().isEnabledFor(Level.ERROR);
    }

    @Override // o.J31
    public void o(Object obj, Throwable th) {
        t().log(Z, Level.WARN, obj, th);
    }

    @Override // o.J31
    public void p(Object obj) {
        t().log(Z, Level.FATAL, obj, (Throwable) null);
    }

    @Override // o.J31
    public void q(Object obj) {
        t().log(Z, Level.WARN, obj, (Throwable) null);
    }

    @Override // o.J31
    public void r(Object obj) {
        t().log(Z, Y0, obj, (Throwable) null);
    }

    public Logger t() {
        Logger logger;
        Logger logger2 = this.X;
        if (logger2 == null) {
            synchronized (this) {
                try {
                    logger = this.X;
                    if (logger == null) {
                        logger = Logger.getLogger(this.Y);
                        this.X = logger;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return logger;
        }
        return logger2;
    }

    public K31(String str) {
        this.X = null;
        this.Y = str;
        this.X = t();
    }

    public K31(Logger logger) {
        this.X = null;
        if (logger != null) {
            this.Y = logger.getName();
            this.X = logger;
            return;
        }
        throw new IllegalArgumentException("Warning - null logger in constructor; possible log4j misconfiguration.");
    }
}
