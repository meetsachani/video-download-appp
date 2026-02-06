package o;

import java.io.Serializable;
import org.apache.log.Hierarchy;
import org.apache.log.Logger;

/* loaded from: classes4.dex */
public class Z31 implements J31, Serializable {
    private static final long serialVersionUID = 3768538055836059519L;
    public volatile transient Logger X;
    public String Y;

    public Z31(String str) {
        this.X = null;
        this.Y = str;
        this.X = s();
    }

    @Override // o.J31
    public void a(Object obj) {
        if (obj != null) {
            s().debug(String.valueOf(obj));
        }
    }

    @Override // o.J31
    public boolean b() {
        return s().isWarnEnabled();
    }

    @Override // o.J31
    public boolean c() {
        return s().isDebugEnabled();
    }

    @Override // o.J31
    public boolean d() {
        return s().isInfoEnabled();
    }

    @Override // o.J31
    public void e(Object obj) {
        if (obj != null) {
            s().info(String.valueOf(obj));
        }
    }

    @Override // o.J31
    public boolean f() {
        return s().isDebugEnabled();
    }

    @Override // o.J31
    public void g(Object obj, Throwable th) {
        if (obj != null) {
            s().error(String.valueOf(obj), th);
        }
    }

    @Override // o.J31
    public void h(Object obj, Throwable th) {
        if (obj != null) {
            s().fatalError(String.valueOf(obj), th);
        }
    }

    @Override // o.J31
    public void i(Object obj) {
        if (obj != null) {
            s().error(String.valueOf(obj));
        }
    }

    @Override // o.J31
    public boolean j() {
        return s().isFatalErrorEnabled();
    }

    @Override // o.J31
    public void k(Object obj, Throwable th) {
        if (obj != null) {
            s().info(String.valueOf(obj), th);
        }
    }

    @Override // o.J31
    public void l(Object obj, Throwable th) {
        if (obj != null) {
            s().debug(String.valueOf(obj), th);
        }
    }

    @Override // o.J31
    public void m(Object obj, Throwable th) {
        l(obj, th);
    }

    @Override // o.J31
    public boolean n() {
        return s().isErrorEnabled();
    }

    @Override // o.J31
    public void o(Object obj, Throwable th) {
        if (obj != null) {
            s().warn(String.valueOf(obj), th);
        }
    }

    @Override // o.J31
    public void p(Object obj) {
        if (obj != null) {
            s().fatalError(String.valueOf(obj));
        }
    }

    @Override // o.J31
    public void q(Object obj) {
        if (obj != null) {
            s().warn(String.valueOf(obj));
        }
    }

    @Override // o.J31
    public void r(Object obj) {
        a(obj);
    }

    public Logger s() {
        Logger logger;
        Logger logger2 = this.X;
        if (logger2 == null) {
            synchronized (this) {
                try {
                    logger = this.X;
                    if (logger == null) {
                        logger = Hierarchy.getDefaultHierarchy().getLoggerFor(this.Y);
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
}
