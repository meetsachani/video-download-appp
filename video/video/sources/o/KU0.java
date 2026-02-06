package o;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public class KU0 implements J31, Serializable {
    public static final Level Z = Level.FINE;
    private static final long serialVersionUID = 4784713551416303804L;
    public transient Logger X;
    public String Y;

    public KU0(String str) {
        this.X = null;
        this.Y = str;
        this.X = s();
    }

    @Override // o.J31
    public void a(Object obj) {
        t(Level.FINE, String.valueOf(obj), null);
    }

    @Override // o.J31
    public boolean b() {
        return s().isLoggable(Level.WARNING);
    }

    @Override // o.J31
    public boolean c() {
        return s().isLoggable(Level.FINE);
    }

    @Override // o.J31
    public boolean d() {
        return s().isLoggable(Level.INFO);
    }

    @Override // o.J31
    public void e(Object obj) {
        t(Level.INFO, String.valueOf(obj), null);
    }

    @Override // o.J31
    public boolean f() {
        return s().isLoggable(Level.FINEST);
    }

    @Override // o.J31
    public void g(Object obj, Throwable th) {
        t(Level.SEVERE, String.valueOf(obj), th);
    }

    @Override // o.J31
    public void h(Object obj, Throwable th) {
        t(Level.SEVERE, String.valueOf(obj), th);
    }

    @Override // o.J31
    public void i(Object obj) {
        t(Level.SEVERE, String.valueOf(obj), null);
    }

    @Override // o.J31
    public boolean j() {
        return s().isLoggable(Level.SEVERE);
    }

    @Override // o.J31
    public void k(Object obj, Throwable th) {
        t(Level.INFO, String.valueOf(obj), th);
    }

    @Override // o.J31
    public void l(Object obj, Throwable th) {
        t(Level.FINE, String.valueOf(obj), th);
    }

    @Override // o.J31
    public void m(Object obj, Throwable th) {
        t(Level.FINEST, String.valueOf(obj), th);
    }

    @Override // o.J31
    public boolean n() {
        return s().isLoggable(Level.SEVERE);
    }

    @Override // o.J31
    public void o(Object obj, Throwable th) {
        t(Level.WARNING, String.valueOf(obj), th);
    }

    @Override // o.J31
    public void p(Object obj) {
        t(Level.SEVERE, String.valueOf(obj), null);
    }

    @Override // o.J31
    public void q(Object obj) {
        t(Level.WARNING, String.valueOf(obj), null);
    }

    @Override // o.J31
    public void r(Object obj) {
        t(Level.FINEST, String.valueOf(obj), null);
    }

    public Logger s() {
        if (this.X == null) {
            this.X = Logger.getLogger(this.Y);
        }
        return this.X;
    }

    public void t(Level level, String str, Throwable th) {
        String str2;
        Logger s = s();
        if (s.isLoggable(level)) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            String str3 = this.Y;
            if (stackTrace != null && stackTrace.length > 2) {
                str2 = stackTrace[2].getMethodName();
            } else {
                str2 = "unknown";
            }
            String str4 = str2;
            if (th == null) {
                s.logp(level, str3, str4, str);
            } else {
                s.logp(level, str3, str4, str, th);
            }
        }
    }
}
