package o;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public class JU0 implements J31, Serializable {
    public static final Level a1 = Level.FINE;
    private static final long serialVersionUID = -8649807923527610591L;
    public transient Logger X;
    public String Y;
    public String Z = "unknown";
    public String Y0 = "unknown";
    public boolean Z0 = false;

    public JU0(String str) {
        this.X = null;
        this.Y = str;
        this.X = t();
    }

    private void u(Level level, String str, Throwable th) {
        if (t().isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, str);
            if (!this.Z0) {
                s();
            }
            logRecord.setSourceClassName(this.Z);
            logRecord.setSourceMethodName(this.Y0);
            if (th != null) {
                logRecord.setThrown(th);
            }
            t().log(logRecord);
        }
    }

    @Override // o.J31
    public void a(Object obj) {
        u(Level.FINE, String.valueOf(obj), null);
    }

    @Override // o.J31
    public boolean b() {
        return t().isLoggable(Level.WARNING);
    }

    @Override // o.J31
    public boolean c() {
        return t().isLoggable(Level.FINE);
    }

    @Override // o.J31
    public boolean d() {
        return t().isLoggable(Level.INFO);
    }

    @Override // o.J31
    public void e(Object obj) {
        u(Level.INFO, String.valueOf(obj), null);
    }

    @Override // o.J31
    public boolean f() {
        return t().isLoggable(Level.FINEST);
    }

    @Override // o.J31
    public void g(Object obj, Throwable th) {
        u(Level.SEVERE, String.valueOf(obj), th);
    }

    @Override // o.J31
    public void h(Object obj, Throwable th) {
        u(Level.SEVERE, String.valueOf(obj), th);
    }

    @Override // o.J31
    public void i(Object obj) {
        u(Level.SEVERE, String.valueOf(obj), null);
    }

    @Override // o.J31
    public boolean j() {
        return t().isLoggable(Level.SEVERE);
    }

    @Override // o.J31
    public void k(Object obj, Throwable th) {
        u(Level.INFO, String.valueOf(obj), th);
    }

    @Override // o.J31
    public void l(Object obj, Throwable th) {
        u(Level.FINE, String.valueOf(obj), th);
    }

    @Override // o.J31
    public void m(Object obj, Throwable th) {
        u(Level.FINEST, String.valueOf(obj), th);
    }

    @Override // o.J31
    public boolean n() {
        return t().isLoggable(Level.SEVERE);
    }

    @Override // o.J31
    public void o(Object obj, Throwable th) {
        u(Level.WARNING, String.valueOf(obj), th);
    }

    @Override // o.J31
    public void p(Object obj) {
        u(Level.SEVERE, String.valueOf(obj), null);
    }

    @Override // o.J31
    public void q(Object obj) {
        u(Level.WARNING, String.valueOf(obj), null);
    }

    @Override // o.J31
    public void r(Object obj) {
        u(Level.FINEST, String.valueOf(obj), null);
    }

    public final void s() {
        try {
            Throwable th = new Throwable();
            th.fillInStackTrace();
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            StringTokenizer stringTokenizer = new StringTokenizer(stringWriter.getBuffer().toString(), "\n");
            stringTokenizer.nextToken();
            String nextToken = stringTokenizer.nextToken();
            while (nextToken.indexOf(getClass().getName()) == -1) {
                nextToken = stringTokenizer.nextToken();
            }
            while (nextToken.indexOf(getClass().getName()) >= 0) {
                nextToken = stringTokenizer.nextToken();
            }
            String substring = nextToken.substring(nextToken.indexOf("at ") + 3, nextToken.indexOf(40));
            int lastIndexOf = substring.lastIndexOf(46);
            this.Z = substring.substring(0, lastIndexOf);
            this.Y0 = substring.substring(lastIndexOf + 1);
        } catch (Exception unused) {
        }
        this.Z0 = true;
    }

    public Logger t() {
        if (this.X == null) {
            this.X = Logger.getLogger(this.Y);
        }
        return this.X;
    }
}
