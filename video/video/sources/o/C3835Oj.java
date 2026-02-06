package o;

import org.apache.avalon.framework.logger.Logger;

/* renamed from: o.Oj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3835Oj implements J31 {
    public static volatile Logger Y;
    public final transient Logger X;

    public C3835Oj(Logger logger) {
        this.X = logger;
    }

    public static void t(Logger logger) {
        Y = logger;
    }

    @Override // o.J31
    public void a(Object obj) {
        if (s().isDebugEnabled()) {
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
        if (s().isInfoEnabled()) {
            s().info(String.valueOf(obj));
        }
    }

    @Override // o.J31
    public boolean f() {
        return s().isDebugEnabled();
    }

    @Override // o.J31
    public void g(Object obj, Throwable th) {
        if (s().isErrorEnabled()) {
            s().error(String.valueOf(obj), th);
        }
    }

    @Override // o.J31
    public void h(Object obj, Throwable th) {
        if (s().isFatalErrorEnabled()) {
            s().fatalError(String.valueOf(obj), th);
        }
    }

    @Override // o.J31
    public void i(Object obj) {
        if (s().isErrorEnabled()) {
            s().error(String.valueOf(obj));
        }
    }

    @Override // o.J31
    public boolean j() {
        return s().isFatalErrorEnabled();
    }

    @Override // o.J31
    public void k(Object obj, Throwable th) {
        if (s().isInfoEnabled()) {
            s().info(String.valueOf(obj), th);
        }
    }

    @Override // o.J31
    public void l(Object obj, Throwable th) {
        if (s().isDebugEnabled()) {
            s().debug(String.valueOf(obj), th);
        }
    }

    @Override // o.J31
    public void m(Object obj, Throwable th) {
        if (s().isDebugEnabled()) {
            s().debug(String.valueOf(obj), th);
        }
    }

    @Override // o.J31
    public boolean n() {
        return s().isErrorEnabled();
    }

    @Override // o.J31
    public void o(Object obj, Throwable th) {
        if (s().isWarnEnabled()) {
            s().warn(String.valueOf(obj), th);
        }
    }

    @Override // o.J31
    public void p(Object obj) {
        if (s().isFatalErrorEnabled()) {
            s().fatalError(String.valueOf(obj));
        }
    }

    @Override // o.J31
    public void q(Object obj) {
        if (s().isWarnEnabled()) {
            s().warn(String.valueOf(obj));
        }
    }

    @Override // o.J31
    public void r(Object obj) {
        if (s().isDebugEnabled()) {
            s().debug(String.valueOf(obj));
        }
    }

    public Logger s() {
        return this.X;
    }

    public C3835Oj(String str) {
        if (Y != null) {
            this.X = Y.getChildLogger(str);
            return;
        }
        throw new NullPointerException("default logger has to be specified if this constructor is used!");
    }
}
