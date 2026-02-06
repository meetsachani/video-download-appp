package o;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import o.C6767hJ2;
import o.DT1;
import o.InterfaceC4747Xs;

/* renamed from: o.aS1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5091aS1<T> implements Comparable<AbstractC5091aS1<T>> {
    public static final String m1 = "UTF-8";
    public final C6767hJ2.a X;
    public final int Y;
    public final int Y0;
    public final String Z;
    public final Object Z0;
    public DT1.a a1;
    public Integer b1;
    public C9006qS1 c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public InterfaceC8528oU1 i1;
    public InterfaceC4747Xs.a j1;
    public Object k1;
    public c l1;

    /* renamed from: o.aS1$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ String X;
        public final /* synthetic */ long Y;

        public a(String str, long j) {
            this.X = str;
            this.Y = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5091aS1.this.X.a(this.X, this.Y);
            AbstractC5091aS1.this.X.b(AbstractC5091aS1.this.toString());
        }
    }

    /* renamed from: o.aS1$b */
    /* loaded from: classes.dex */
    public interface b {
        public static final int a = -1;
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;
        public static final int e = 3;
        public static final int f = 4;
        public static final int g = 5;
        public static final int h = 6;
        public static final int i = 7;
    }

    /* renamed from: o.aS1$c */
    /* loaded from: classes.dex */
    public interface c {
        void a(AbstractC5091aS1<?> abstractC5091aS1, DT1<?> dt1);

        void b(AbstractC5091aS1<?> abstractC5091aS1);
    }

    /* renamed from: o.aS1$d */
    /* loaded from: classes.dex */
    public enum d {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    @Deprecated
    public AbstractC5091aS1(String str, DT1.a aVar) {
        this(-1, str, aVar);
    }

    public static int n(String str) {
        Uri parse;
        String host;
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            return host.hashCode();
        }
        return 0;
    }

    @Deprecated
    public Map<String, String> A() throws C4118Rh {
        return w();
    }

    @Deprecated
    public String B() {
        return x();
    }

    public d C() {
        return d.NORMAL;
    }

    public InterfaceC8528oU1 D() {
        return this.i1;
    }

    public final int E() {
        Integer num = this.b1;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object F() {
        return this.k1;
    }

    public final int G() {
        return D().b();
    }

    public int H() {
        return this.Y0;
    }

    public String I() {
        return this.Z;
    }

    public boolean J() {
        boolean z;
        synchronized (this.Z0) {
            z = this.f1;
        }
        return z;
    }

    public boolean K() {
        boolean z;
        synchronized (this.Z0) {
            z = this.e1;
        }
        return z;
    }

    public void L() {
        synchronized (this.Z0) {
            this.f1 = true;
        }
    }

    public void M() {
        c cVar;
        synchronized (this.Z0) {
            cVar = this.l1;
        }
        if (cVar != null) {
            cVar.b(this);
        }
    }

    public void N(DT1<?> dt1) {
        c cVar;
        synchronized (this.Z0) {
            cVar = this.l1;
        }
        if (cVar != null) {
            cVar.a(this, dt1);
        }
    }

    public abstract DT1<T> P(C3470Kp1 c3470Kp1);

    public void Q(int i) {
        C9006qS1 c9006qS1 = this.c1;
        if (c9006qS1 != null) {
            c9006qS1.m(this, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC5091aS1<?> R(InterfaceC4747Xs.a aVar) {
        this.j1 = aVar;
        return this;
    }

    public void S(c cVar) {
        synchronized (this.Z0) {
            this.l1 = cVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC5091aS1<?> T(C9006qS1 c9006qS1) {
        this.c1 = c9006qS1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC5091aS1<?> U(InterfaceC8528oU1 interfaceC8528oU1) {
        this.i1 = interfaceC8528oU1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC5091aS1<?> V(int i) {
        this.b1 = Integer.valueOf(i);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC5091aS1<?> W(boolean z) {
        this.d1 = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC5091aS1<?> X(boolean z) {
        this.h1 = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC5091aS1<?> Y(boolean z) {
        this.g1 = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC5091aS1<?> Z(Object obj) {
        this.k1 = obj;
        return this;
    }

    public final boolean b0() {
        return this.d1;
    }

    public final boolean c0() {
        return this.h1;
    }

    public final boolean d0() {
        return this.g1;
    }

    public void g(String str) {
        if (C6767hJ2.a.c) {
            this.X.a(str, Thread.currentThread().getId());
        }
    }

    public void h() {
        synchronized (this.Z0) {
            this.e1 = true;
            this.a1 = null;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: i */
    public int compareTo(AbstractC5091aS1<T> abstractC5091aS1) {
        d C = C();
        d C2 = abstractC5091aS1.C();
        if (C == C2) {
            return this.b1.intValue() - abstractC5091aS1.b1.intValue();
        }
        return C2.ordinal() - C.ordinal();
    }

    public void j(C6524gJ2 c6524gJ2) {
        DT1.a aVar;
        synchronized (this.Z0) {
            aVar = this.a1;
        }
        if (aVar != null) {
            aVar.a(c6524gJ2);
        }
    }

    public abstract void l(T t);

    public final byte[] m(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    sb.append(URLEncoder.encode(entry.getKey(), str));
                    sb.append('=');
                    sb.append(URLEncoder.encode(entry.getValue(), str));
                    sb.append('&');
                } else {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    public void o(String str) {
        C9006qS1 c9006qS1 = this.c1;
        if (c9006qS1 != null) {
            c9006qS1.g(this);
        }
        if (C6767hJ2.a.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(str, id));
                return;
            }
            this.X.a(str, id);
            this.X.b(toString());
        }
    }

    public byte[] p() throws C4118Rh {
        Map<String, String> w = w();
        if (w != null && w.size() > 0) {
            return m(w, x());
        }
        return null;
    }

    public String q() {
        return "application/x-www-form-urlencoded; charset=" + x();
    }

    public InterfaceC4747Xs.a r() {
        return this.j1;
    }

    public String s() {
        String I = I();
        int v = v();
        if (v != 0 && v != -1) {
            return Integer.toString(v) + '-' + I;
        }
        return I;
    }

    public DT1.a t() {
        DT1.a aVar;
        synchronized (this.Z0) {
            aVar = this.a1;
        }
        return aVar;
    }

    public String toString() {
        String str;
        String str2 = "0x" + Integer.toHexString(H());
        StringBuilder sb = new StringBuilder();
        if (K()) {
            str = "[X] ";
        } else {
            str = "[ ] ";
        }
        sb.append(str);
        sb.append(I());
        sb.append(C4500Ve2.b);
        sb.append(str2);
        sb.append(C4500Ve2.b);
        sb.append(C());
        sb.append(C4500Ve2.b);
        sb.append(this.b1);
        return sb.toString();
    }

    public Map<String, String> u() throws C4118Rh {
        return Collections.EMPTY_MAP;
    }

    public int v() {
        return this.Y;
    }

    public Map<String, String> w() throws C4118Rh {
        return null;
    }

    public String x() {
        return "UTF-8";
    }

    @Deprecated
    public byte[] y() throws C4118Rh {
        Map<String, String> A = A();
        if (A != null && A.size() > 0) {
            return m(A, B());
        }
        return null;
    }

    @Deprecated
    public String z() {
        return q();
    }

    public AbstractC5091aS1(int i, String str, DT1.a aVar) {
        this.X = C6767hJ2.a.c ? new C6767hJ2.a() : null;
        this.Z0 = new Object();
        this.d1 = true;
        this.e1 = false;
        this.f1 = false;
        this.g1 = false;
        this.h1 = false;
        this.j1 = null;
        this.Y = i;
        this.Z = str;
        this.a1 = aVar;
        U(new C8406o00());
        this.Y0 = n(str);
    }

    public C6524gJ2 O(C6524gJ2 c6524gJ2) {
        return c6524gJ2;
    }
}
