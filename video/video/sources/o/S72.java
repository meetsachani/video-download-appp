package o;

import com.google.firebase.crashlytics.internal.common.CrashlyticsController;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessController;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/* loaded from: classes4.dex */
public class S72 implements J31, Serializable {
    public static final String Y0 = "org.apache.commons.logging.simplelog.";
    public static final Properties Z0;
    public static final String a1 = "yyyy/MM/dd HH:mm:ss:SSS zzz";
    public static volatile boolean b1 = false;
    public static volatile boolean c1 = false;
    public static volatile boolean d1 = false;
    public static volatile String e1 = null;
    public static DateFormat f1 = null;
    public static final int g1 = 1;
    public static final int h1 = 2;
    public static final int i1 = 3;
    public static final int j1 = 4;
    public static final int k1 = 5;
    public static final int l1 = 6;
    public static final int m1 = 0;
    public static final int n1 = 7;
    public static /* synthetic */ Class o1 = null;
    public static /* synthetic */ Class p1 = null;
    private static final long serialVersionUID = 136942970684951178L;
    public volatile String X;
    public volatile int Y;
    public volatile String Z = null;

    static {
        Properties properties = new Properties();
        Z0 = properties;
        b1 = false;
        c1 = true;
        d1 = false;
        e1 = a1;
        f1 = null;
        InputStream x = x("simplelog.properties");
        if (x != null) {
            try {
                properties.load(x);
                x.close();
            } catch (IOException unused) {
            }
        }
        b1 = u("org.apache.commons.logging.simplelog.showlogname", b1);
        c1 = u("org.apache.commons.logging.simplelog.showShortLogname", c1);
        d1 = u("org.apache.commons.logging.simplelog.showdatetime", d1);
        if (d1) {
            e1 = z("org.apache.commons.logging.simplelog.dateTimeFormat", e1);
            try {
                f1 = new SimpleDateFormat(e1);
            } catch (IllegalArgumentException unused2) {
                e1 = a1;
                f1 = new SimpleDateFormat(e1);
            }
        }
    }

    public S72(String str) {
        this.X = null;
        this.X = str;
        C(3);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("org.apache.commons.logging.simplelog.log.");
        stringBuffer.append(this.X);
        String y = y(stringBuffer.toString());
        int lastIndexOf = String.valueOf(str).lastIndexOf(UE.h);
        while (y == null && lastIndexOf > -1) {
            str = str.substring(0, lastIndexOf);
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("org.apache.commons.logging.simplelog.log.");
            stringBuffer2.append(str);
            y = y(stringBuffer2.toString());
            lastIndexOf = String.valueOf(str).lastIndexOf(UE.h);
        }
        y = y == null ? y("org.apache.commons.logging.simplelog.defaultlog") : y;
        if ("all".equalsIgnoreCase(y)) {
            C(0);
        } else if ("trace".equalsIgnoreCase(y)) {
            C(1);
        } else if (com.facebook.S.Q.equalsIgnoreCase(y)) {
            C(2);
        } else if (com.facebook.S.R.equalsIgnoreCase(y)) {
            C(3);
        } else if ("warn".equalsIgnoreCase(y)) {
            C(4);
        } else if ("error".equalsIgnoreCase(y)) {
            C(5);
        } else if (CrashlyticsController.t.equalsIgnoreCase(y)) {
            C(6);
        } else if ("off".equalsIgnoreCase(y)) {
            C(7);
        }
    }

    public static /* synthetic */ Class t(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static boolean u(String str, boolean z) {
        String y = y(str);
        if (y == null) {
            return z;
        }
        return "true".equalsIgnoreCase(y);
    }

    public static ClassLoader v() {
        ClassLoader classLoader = null;
        try {
            Class cls = o1;
            if (cls == null) {
                cls = t("java.lang.Thread");
                o1 = cls;
            }
            try {
                classLoader = (ClassLoader) cls.getMethod("getContextClassLoader", null).invoke(Thread.currentThread(), null);
            } catch (InvocationTargetException e) {
                if (!(e.getTargetException() instanceof SecurityException)) {
                    throw new L31("Unexpected InvocationTargetException", e.getTargetException());
                }
            }
        } catch (IllegalAccessException | NoSuchMethodException unused) {
        }
        if (classLoader == null) {
            Class cls2 = p1;
            if (cls2 == null) {
                cls2 = t(Y31.E);
                p1 = cls2;
            }
            return cls2.getClassLoader();
        }
        return classLoader;
    }

    public static InputStream x(String str) {
        return (InputStream) AccessController.doPrivileged(new R72(str));
    }

    public static String y(String str) {
        String str2;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return Z0.getProperty(str);
        }
        return str2;
    }

    public static String z(String str, String str2) {
        String y = y(str);
        if (y == null) {
            return str2;
        }
        return y;
    }

    public boolean A(int i) {
        if (i >= this.Y) {
            return true;
        }
        return false;
    }

    public void B(int i, Object obj, Throwable th) {
        String format;
        StringBuffer stringBuffer = new StringBuffer();
        if (d1) {
            Date date = new Date();
            synchronized (f1) {
                format = f1.format(date);
            }
            stringBuffer.append(format);
            stringBuffer.append(C4500Ve2.b);
        }
        switch (i) {
            case 1:
                stringBuffer.append("[TRACE] ");
                break;
            case 2:
                stringBuffer.append("[DEBUG] ");
                break;
            case 3:
                stringBuffer.append("[INFO] ");
                break;
            case 4:
                stringBuffer.append("[WARN] ");
                break;
            case 5:
                stringBuffer.append("[ERROR] ");
                break;
            case 6:
                stringBuffer.append("[FATAL] ");
                break;
        }
        if (c1) {
            if (this.Z == null) {
                String substring = this.X.substring(this.X.lastIndexOf(UE.h) + 1);
                this.Z = substring.substring(substring.lastIndexOf(RemoteSettings.i) + 1);
            }
            stringBuffer.append(String.valueOf(this.Z));
            stringBuffer.append(" - ");
        } else if (b1) {
            stringBuffer.append(String.valueOf(this.X));
            stringBuffer.append(" - ");
        }
        stringBuffer.append(String.valueOf(obj));
        if (th != null) {
            stringBuffer.append(" <");
            stringBuffer.append(th.toString());
            stringBuffer.append(">");
            StringWriter stringWriter = new StringWriter(1024);
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.close();
            stringBuffer.append(stringWriter.toString());
        }
        D(stringBuffer);
    }

    public void C(int i) {
        this.Y = i;
    }

    public void D(StringBuffer stringBuffer) {
        System.err.println(stringBuffer.toString());
    }

    @Override // o.J31
    public final void a(Object obj) {
        if (A(2)) {
            B(2, obj, null);
        }
    }

    @Override // o.J31
    public final boolean b() {
        return A(4);
    }

    @Override // o.J31
    public final boolean c() {
        return A(2);
    }

    @Override // o.J31
    public final boolean d() {
        return A(3);
    }

    @Override // o.J31
    public final void e(Object obj) {
        if (A(3)) {
            B(3, obj, null);
        }
    }

    @Override // o.J31
    public final boolean f() {
        return A(1);
    }

    @Override // o.J31
    public final void g(Object obj, Throwable th) {
        if (A(5)) {
            B(5, obj, th);
        }
    }

    @Override // o.J31
    public final void h(Object obj, Throwable th) {
        if (A(6)) {
            B(6, obj, th);
        }
    }

    @Override // o.J31
    public final void i(Object obj) {
        if (A(5)) {
            B(5, obj, null);
        }
    }

    @Override // o.J31
    public final boolean j() {
        return A(6);
    }

    @Override // o.J31
    public final void k(Object obj, Throwable th) {
        if (A(3)) {
            B(3, obj, th);
        }
    }

    @Override // o.J31
    public final void l(Object obj, Throwable th) {
        if (A(2)) {
            B(2, obj, th);
        }
    }

    @Override // o.J31
    public final void m(Object obj, Throwable th) {
        if (A(1)) {
            B(1, obj, th);
        }
    }

    @Override // o.J31
    public final boolean n() {
        return A(5);
    }

    @Override // o.J31
    public final void o(Object obj, Throwable th) {
        if (A(4)) {
            B(4, obj, th);
        }
    }

    @Override // o.J31
    public final void p(Object obj) {
        if (A(6)) {
            B(6, obj, null);
        }
    }

    @Override // o.J31
    public final void q(Object obj) {
        if (A(4)) {
            B(4, obj, null);
        }
    }

    @Override // o.J31
    public final void r(Object obj) {
        if (A(1)) {
            B(1, obj, null);
        }
    }

    public int w() {
        return this.Y;
    }
}
