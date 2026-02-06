package o;

import android.content.Context;
import android.util.Pair;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* renamed from: o.Gp1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3078Gp1 {
    public final C2479Ap1 a;
    public final B61 b;

    /* renamed from: o.Gp1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC7614kp0.values().length];
            a = iArr;
            try {
                iArr[EnumC7614kp0.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC7614kp0.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C3078Gp1(C2479Ap1 c2479Ap1, B61 b61) {
        this.a = c2479Ap1;
        this.b = b61;
    }

    public final C10624x51 a(Context context, String str, String str2) {
        C2479Ap1 c2479Ap1;
        Pair<EnumC7614kp0, InputStream> b;
        H61<C10624x51> f0;
        if (str2 == null || (c2479Ap1 = this.a) == null || (b = c2479Ap1.b(str)) == null) {
            return null;
        }
        InputStream inputStream = (InputStream) b.second;
        int i = a.a[((EnumC7614kp0) b.first).ordinal()];
        if (i != 1) {
            if (i != 2) {
                f0 = T51.H(inputStream, str2);
            } else {
                try {
                    f0 = T51.H(new GZIPInputStream(inputStream), str2);
                } catch (IOException e) {
                    f0 = new H61<>(e);
                }
            }
        } else {
            f0 = T51.f0(context, new ZipInputStream(inputStream), str2);
        }
        if (f0.b() != null) {
            return f0.b();
        }
        return null;
    }

    public final H61<C10624x51> b(Context context, String str, String str2) {
        H61<C10624x51> h61;
        boolean z;
        C7190j41.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                InterfaceC9167r61 a2 = this.b.a(str);
                if (a2.isSuccessful()) {
                    h61 = e(context, str, a2.Y1(), a2.D(), str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Completed fetch from network. Success: ");
                    if (h61.b() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(z);
                    C7190j41.a(sb.toString());
                } else {
                    h61 = new H61<>(new IllegalArgumentException(a2.s4()));
                }
                try {
                    a2.close();
                    return h61;
                } catch (IOException e) {
                    C7190j41.f("LottieFetchResult close failed ", e);
                    return h61;
                }
            } catch (Exception e2) {
                H61<C10624x51> h612 = new H61<>(e2);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e3) {
                        C7190j41.f("LottieFetchResult close failed ", e3);
                    }
                }
                return h612;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e4) {
                    C7190j41.f("LottieFetchResult close failed ", e4);
                }
            }
            throw th;
        }
    }

    public H61<C10624x51> c(Context context, String str, String str2) {
        C10624x51 a2 = a(context, str, str2);
        if (a2 != null) {
            return new H61<>(a2);
        }
        C7190j41.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(context, str, str2);
    }

    public final H61<C10624x51> d(String str, InputStream inputStream, String str2) throws IOException {
        C2479Ap1 c2479Ap1;
        if (str2 != null && (c2479Ap1 = this.a) != null) {
            return T51.H(new GZIPInputStream(new FileInputStream(c2479Ap1.h(str, inputStream, EnumC7614kp0.GZIP))), str);
        }
        return T51.H(new GZIPInputStream(inputStream), null);
    }

    public final H61<C10624x51> e(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        H61<C10624x51> g;
        EnumC7614kp0 enumC7614kp0;
        C2479Ap1 c2479Ap1;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            if (!str2.contains("application/gzip") && !str2.contains("application/x-gzip") && !str.split("\\?")[0].endsWith(".tgs")) {
                C7190j41.a("Received json response.");
                enumC7614kp0 = EnumC7614kp0.JSON;
                g = f(str, inputStream, str3);
            } else {
                C7190j41.a("Handling gzip response.");
                enumC7614kp0 = EnumC7614kp0.GZIP;
                g = d(str, inputStream, str3);
            }
        } else {
            C7190j41.a("Handling zip response.");
            EnumC7614kp0 enumC7614kp02 = EnumC7614kp0.ZIP;
            g = g(context, str, inputStream, str3);
            enumC7614kp0 = enumC7614kp02;
        }
        if (str3 != null && g.b() != null && (c2479Ap1 = this.a) != null) {
            c2479Ap1.g(str, enumC7614kp0);
        }
        return g;
    }

    public final H61<C10624x51> f(String str, InputStream inputStream, String str2) throws IOException {
        C2479Ap1 c2479Ap1;
        if (str2 != null && (c2479Ap1 = this.a) != null) {
            return T51.H(new FileInputStream(c2479Ap1.h(str, inputStream, EnumC7614kp0.JSON).getAbsolutePath()), str);
        }
        return T51.H(inputStream, null);
    }

    public final H61<C10624x51> g(Context context, String str, InputStream inputStream, String str2) throws IOException {
        C2479Ap1 c2479Ap1;
        if (str2 != null && (c2479Ap1 = this.a) != null) {
            return T51.f0(context, new ZipInputStream(new FileInputStream(c2479Ap1.h(str, inputStream, EnumC7614kp0.ZIP))), str);
        }
        return T51.f0(context, new ZipInputStream(inputStream), null);
    }
}
