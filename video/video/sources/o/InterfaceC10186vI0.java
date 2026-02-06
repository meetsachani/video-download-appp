package o;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.FU;

@Deprecated
/* renamed from: o.vI0 */
/* loaded from: classes2.dex */
public interface InterfaceC10186vI0 extends FU {
    public static final IF1<String> a = new IF1() { // from class: o.uI0
        @Override // o.IF1
        public final boolean apply(Object obj) {
            return InterfaceC10186vI0.k((String) obj);
        }
    };

    /* renamed from: o.vI0$a */
    /* loaded from: classes2.dex */
    public static abstract class a implements c {
        public final g a = new g();

        @Override // o.InterfaceC10186vI0.c
        @InterfaceC6181ey
        public final c b(Map<String, String> map) {
            this.a.b(map);
            return this;
        }

        public abstract InterfaceC10186vI0 c(g gVar);

        @Override // o.InterfaceC10186vI0.c, o.FU.a
        public final InterfaceC10186vI0 a() {
            return c(this.a);
        }
    }

    /* renamed from: o.vI0$b */
    /* loaded from: classes2.dex */
    public static final class b extends d {
        public b(IOException iOException, OU ou) {
            super("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, ou, AD1.j1, 1);
        }
    }

    /* renamed from: o.vI0$c */
    /* loaded from: classes2.dex */
    public interface c extends FU.a {
        @Override // o.FU.a
        InterfaceC10186vI0 a();

        c b(Map<String, String> map);
    }

    /* renamed from: o.vI0$d */
    /* loaded from: classes2.dex */
    public static class d extends LU {
        public static final int Z0 = 1;
        public static final int a1 = 2;
        public static final int b1 = 3;
        public final int Y0;
        public final OU Z;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: o.vI0$d$a */
        /* loaded from: classes2.dex */
        public @interface a {
        }

        @Deprecated
        public d(OU ou, int i) {
            this(ou, 2000, i);
        }

        public static int b(int i, int i2) {
            if (i == 2000 && i2 == 1) {
                return 2001;
            }
            return i;
        }

        public static d c(IOException iOException, OU ou, int i) {
            int i2;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i2 = 2002;
            } else if (iOException instanceof InterruptedIOException) {
                i2 = 1004;
            } else if (message != null && C8077mf.g(message).matches("cleartext.*not permitted.*")) {
                i2 = 2007;
            } else {
                i2 = 2001;
            }
            if (i2 == 2007) {
                return new b(iOException, ou);
            }
            return new d(iOException, ou, i2, i);
        }

        public d(OU ou, int i, int i2) {
            super(b(i, i2));
            this.Z = ou;
            this.Y0 = i2;
        }

        @Deprecated
        public d(String str, OU ou, int i) {
            this(str, ou, 2000, i);
        }

        public d(String str, OU ou, int i, int i2) {
            super(str, b(i, i2));
            this.Z = ou;
            this.Y0 = i2;
        }

        @Deprecated
        public d(IOException iOException, OU ou, int i) {
            this(iOException, ou, 2000, i);
        }

        public d(IOException iOException, OU ou, int i, int i2) {
            super(iOException, b(i, i2));
            this.Z = ou;
            this.Y0 = i2;
        }

        @Deprecated
        public d(String str, IOException iOException, OU ou, int i) {
            this(str, iOException, ou, 2000, i);
        }

        public d(String str, @InterfaceC11300zs1 IOException iOException, OU ou, int i, int i2) {
            super(str, iOException, b(i, i2));
            this.Z = ou;
            this.Y0 = i2;
        }
    }

    /* renamed from: o.vI0$e */
    /* loaded from: classes2.dex */
    public static final class e extends d {
        public final String c1;

        public e(String str, OU ou) {
            super("Invalid content type: " + str, ou, 2003, 1);
            this.c1 = str;
        }
    }

    /* renamed from: o.vI0$f */
    /* loaded from: classes2.dex */
    public static final class f extends d {
        public final int c1;
        @InterfaceC11300zs1
        public final String d1;
        public final Map<String, List<String>> e1;
        public final byte[] f1;

        public f(int i, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 IOException iOException, Map<String, List<String>> map, OU ou, byte[] bArr) {
            super("Response code: " + i, iOException, ou, 2004, 1);
            this.c1 = i;
            this.d1 = str;
            this.e1 = map;
            this.f1 = bArr;
        }
    }

    /* renamed from: o.vI0$g */
    /* loaded from: classes2.dex */
    public static final class g {
        public final Map<String, String> a = new HashMap();
        @InterfaceC11300zs1
        public Map<String, String> b;

        public synchronized void a() {
            this.b = null;
            this.a.clear();
        }

        public synchronized void b(Map<String, String> map) {
            this.b = null;
            this.a.clear();
            this.a.putAll(map);
        }

        public synchronized Map<String, String> c() {
            try {
                if (this.b == null) {
                    this.b = Collections.unmodifiableMap(new HashMap(this.a));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.b;
        }

        public synchronized void d(String str) {
            this.b = null;
            this.a.remove(str);
        }

        public synchronized void e(String str, String str2) {
            this.b = null;
            this.a.put(str, str2);
        }

        public synchronized void f(Map<String, String> map) {
            this.b = null;
            this.a.putAll(map);
        }
    }

    static /* synthetic */ boolean k(String str) {
        if (str != null) {
            String g2 = C8077mf.g(str);
            if (!TextUtils.isEmpty(g2)) {
                if ((!g2.contains("text") || g2.contains(C4128Rj1.m0)) && !g2.contains("html") && !g2.contains(C2730De2.w)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    int E0();

    @Override // o.FU
    long a(OU ou) throws d;

    @Override // o.FU
    Map<String, List<String>> b();

    @Override // o.FU
    void close() throws d;

    void f(String str, String str2);

    @Override // o.CU
    int read(byte[] bArr, int i, int i2) throws d;

    void u();

    void w(String str);
}
