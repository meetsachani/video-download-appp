package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class T51 {
    public static final Map<String, J61<C10624x51>> a = new HashMap();
    public static final Set<K61> b = new HashSet();
    public static final byte[] c = {80, 75, 3, 4};
    public static final byte[] d = {31, -117, 8};

    public static H61<C10624x51> A(Context context, String str) {
        return B(context, str, "asset_" + str);
    }

    public static H61<C10624x51> B(Context context, String str, String str2) {
        C10624x51 b2;
        if (str2 == null) {
            b2 = null;
        } else {
            b2 = C10867y51.c().b(str2);
        }
        if (b2 != null) {
            return new H61<>(b2);
        }
        try {
            return D(context, context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new H61<>(e);
        }
    }

    public static J61<C10624x51> C(Context context, final InputStream inputStream, final String str) {
        final Context applicationContext;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        return u(str, new Callable() { // from class: o.O51
            @Override // java.util.concurrent.Callable
            public final Object call() {
                H61 D;
                D = T51.D(applicationContext, inputStream, str);
                return D;
            }
        }, null);
    }

    public static H61<C10624x51> D(Context context, InputStream inputStream, String str) {
        C10624x51 b2;
        if (str == null) {
            b2 = null;
        } else {
            b2 = C10867y51.c().b(str);
        }
        if (b2 != null) {
            return new H61<>(b2);
        }
        try {
            InterfaceC2677Cq e = C9604su1.e(C9604su1.u(inputStream));
            if (m0(e).booleanValue()) {
                return f0(context, new ZipInputStream(e.s0()), str);
            }
            if (k0(e).booleanValue()) {
                return H(new GZIPInputStream(e.s0()), str);
            }
            return K(NV0.p(e), str);
        } catch (IOException e2) {
            return new H61<>(e2);
        }
    }

    @Deprecated
    public static J61<C10624x51> E(final JSONObject jSONObject, final String str) {
        return u(str, new Callable() { // from class: o.R51
            @Override // java.util.concurrent.Callable
            public final Object call() {
                H61 S;
                S = T51.S(jSONObject, str);
                return S;
            }
        }, null);
    }

    public static J61<C10624x51> F(final InputStream inputStream, final String str) {
        return u(str, new Callable() { // from class: o.P51
            @Override // java.util.concurrent.Callable
            public final Object call() {
                H61 H;
                H = T51.H(inputStream, str);
                return H;
            }
        }, new Runnable() { // from class: o.Q51
            @Override // java.lang.Runnable
            public final void run() {
                C6006eE2.c(inputStream);
            }
        });
    }

    public static J61<C10624x51> G(final InputStream inputStream, final String str, final boolean z) {
        return u(str, new Callable() { // from class: o.S51
            @Override // java.util.concurrent.Callable
            public final Object call() {
                H61 I;
                I = T51.I(inputStream, str, z);
                return I;
            }
        }, new Runnable() { // from class: o.A51
            @Override // java.lang.Runnable
            public final void run() {
                T51.k(z, inputStream);
            }
        });
    }

    public static H61<C10624x51> H(InputStream inputStream, String str) {
        return I(inputStream, str, true);
    }

    public static H61<C10624x51> I(InputStream inputStream, String str, boolean z) {
        return P(C9604su1.u(inputStream), str, z);
    }

    public static J61<C10624x51> J(final NV0 nv0, final String str) {
        return u(str, new Callable() { // from class: o.C51
            @Override // java.util.concurrent.Callable
            public final Object call() {
                H61 K;
                K = T51.K(NV0.this, str);
                return K;
            }
        }, new Runnable() { // from class: o.D51
            @Override // java.lang.Runnable
            public final void run() {
                C6006eE2.c(NV0.this);
            }
        });
    }

    public static H61<C10624x51> K(NV0 nv0, String str) {
        return L(nv0, str, true);
    }

    public static H61<C10624x51> L(NV0 nv0, String str, boolean z) {
        return M(nv0, str, z);
    }

    public static H61<C10624x51> M(NV0 nv0, String str, boolean z) {
        C10624x51 b2;
        try {
            if (str == null) {
                b2 = null;
            } else {
                try {
                    b2 = C10867y51.c().b(str);
                } catch (Exception e) {
                    H61<C10624x51> h61 = new H61<>(e);
                    if (z) {
                        C6006eE2.c(nv0);
                    }
                    return h61;
                }
            }
            if (b2 != null) {
                H61<C10624x51> h612 = new H61<>(b2);
                if (z) {
                    C6006eE2.c(nv0);
                }
                return h612;
            }
            C10624x51 a2 = U51.a(nv0);
            if (str != null) {
                C10867y51.c().d(str, a2);
            }
            H61<C10624x51> h613 = new H61<>(a2);
            if (z) {
                C6006eE2.c(nv0);
            }
            return h613;
        } catch (Throwable th) {
            if (z) {
                C6006eE2.c(nv0);
            }
            throw th;
        }
    }

    public static J61<C10624x51> N(final InterfaceC7072ia2 interfaceC7072ia2, final String str) {
        return u(str, new Callable() { // from class: o.z51
            @Override // java.util.concurrent.Callable
            public final Object call() {
                H61 O;
                O = T51.O(InterfaceC7072ia2.this, str);
                return O;
            }
        }, new Runnable() { // from class: o.K51
            @Override // java.lang.Runnable
            public final void run() {
                C6006eE2.c(InterfaceC7072ia2.this);
            }
        });
    }

    public static H61<C10624x51> O(InterfaceC7072ia2 interfaceC7072ia2, String str) {
        return P(interfaceC7072ia2, str, true);
    }

    public static H61<C10624x51> P(InterfaceC7072ia2 interfaceC7072ia2, String str, boolean z) {
        return M(NV0.p(C9604su1.e(interfaceC7072ia2)), str, z);
    }

    public static J61<C10624x51> Q(final String str, final String str2) {
        return u(str2, new Callable() { // from class: o.B51
            @Override // java.util.concurrent.Callable
            public final Object call() {
                H61 R;
                R = T51.R(str, str2);
                return R;
            }
        }, null);
    }

    public static H61<C10624x51> R(String str, String str2) {
        return O(C9604su1.u(new ByteArrayInputStream(str.getBytes())), str2);
    }

    @Deprecated
    public static H61<C10624x51> S(JSONObject jSONObject, String str) {
        return R(jSONObject.toString(), str);
    }

    public static J61<C10624x51> T(Context context, int i) {
        return U(context, i, p0(context, i));
    }

    public static J61<C10624x51> U(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return u(str, new Callable() { // from class: o.J51
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return T51.e(weakReference, applicationContext, i, str);
            }
        }, null);
    }

    public static H61<C10624x51> V(Context context, int i) {
        return W(context, i, p0(context, i));
    }

    public static H61<C10624x51> W(Context context, int i, String str) {
        C10624x51 b2;
        if (str == null) {
            b2 = null;
        } else {
            b2 = C10867y51.c().b(str);
        }
        if (b2 != null) {
            return new H61<>(b2);
        }
        try {
            InterfaceC2677Cq e = C9604su1.e(C9604su1.u(context.getResources().openRawResource(i)));
            if (m0(e).booleanValue()) {
                return f0(context, new ZipInputStream(e.s0()), str);
            }
            if (k0(e).booleanValue()) {
                try {
                    return H(new GZIPInputStream(e.s0()), str);
                } catch (IOException e2) {
                    return new H61<>(e2);
                }
            }
            return K(NV0.p(e), str);
        } catch (Resources.NotFoundException e3) {
            return new H61<>(e3);
        }
    }

    public static J61<C10624x51> X(Context context, String str) {
        return Y(context, str, "url_" + str);
    }

    public static J61<C10624x51> Y(final Context context, final String str, final String str2) {
        return u(str2, new Callable() { // from class: o.N51
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return T51.d(context, str, str2);
            }
        }, null);
    }

    public static H61<C10624x51> Z(Context context, String str) {
        return a0(context, str, str);
    }

    public static H61<C10624x51> a0(Context context, String str, String str2) {
        C10624x51 b2;
        if (str2 == null) {
            b2 = null;
        } else {
            b2 = C10867y51.c().b(str2);
        }
        if (b2 != null) {
            return new H61<>(b2);
        }
        H61<C10624x51> c2 = ZX0.j(context).c(context, str, str2);
        if (str2 != null && c2.b() != null) {
            C10867y51.c().d(str2, c2.b());
        }
        return c2;
    }

    public static J61<C10624x51> b0(final Context context, final ZipInputStream zipInputStream, final String str) {
        return u(str, new Callable() { // from class: o.F51
            @Override // java.util.concurrent.Callable
            public final Object call() {
                H61 f0;
                f0 = T51.f0(context, zipInputStream, str);
                return f0;
            }
        }, new Runnable() { // from class: o.G51
            @Override // java.lang.Runnable
            public final void run() {
                C6006eE2.c(zipInputStream);
            }
        });
    }

    public static /* synthetic */ void c(String str, AtomicBoolean atomicBoolean, Throwable th) {
        Map<String, J61<C10624x51>> map = a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            o0(true);
        }
    }

    public static J61<C10624x51> c0(final Context context, final ZipInputStream zipInputStream, final String str, boolean z) {
        Runnable runnable;
        Callable callable = new Callable() { // from class: o.L51
            @Override // java.util.concurrent.Callable
            public final Object call() {
                H61 f0;
                f0 = T51.f0(context, zipInputStream, str);
                return f0;
            }
        };
        if (z) {
            runnable = new Runnable() { // from class: o.M51
                @Override // java.lang.Runnable
                public final void run() {
                    C6006eE2.c(zipInputStream);
                }
            };
        } else {
            runnable = null;
        }
        return u(str, callable, runnable);
    }

    public static /* synthetic */ H61 d(Context context, String str, String str2) {
        H61<C10624x51> c2 = ZX0.j(context).c(context, str, str2);
        if (str2 != null && c2.b() != null) {
            C10867y51.c().d(str2, c2.b());
        }
        return c2;
    }

    public static J61<C10624x51> d0(ZipInputStream zipInputStream, String str) {
        return b0(null, zipInputStream, str);
    }

    public static /* synthetic */ H61 e(WeakReference weakReference, Context context, int i, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return W(context, i, str);
    }

    public static J61<C10624x51> e0(ZipInputStream zipInputStream, String str, boolean z) {
        return c0(null, zipInputStream, str, z);
    }

    public static H61<C10624x51> f0(Context context, ZipInputStream zipInputStream, String str) {
        return g0(context, zipInputStream, str, true);
    }

    public static H61<C10624x51> g0(Context context, ZipInputStream zipInputStream, String str, boolean z) {
        try {
            return j0(context, zipInputStream, str);
        } finally {
            if (z) {
                C6006eE2.c(zipInputStream);
            }
        }
    }

    public static H61<C10624x51> h0(ZipInputStream zipInputStream, String str) {
        return i0(zipInputStream, str, true);
    }

    public static H61<C10624x51> i0(ZipInputStream zipInputStream, String str, boolean z) {
        return g0(null, zipInputStream, str, z);
    }

    public static H61<C10624x51> j0(Context context, ZipInputStream zipInputStream, String str) {
        C10624x51 b2;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            b2 = null;
        } else {
            try {
                b2 = C10867y51.c().b(str);
            } catch (IOException e) {
                return new H61<>(e);
            }
        }
        if (b2 != null) {
            return new H61<>(b2);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        C10624x51 c10624x51 = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                c10624x51 = M(NV0.p(C9604su1.e(C9604su1.u(zipInputStream))), null, false).b();
            } else {
                if (!name.contains(C5179aq.s1) && !name.contains(".webp") && !name.contains(C4940Zp0.X) && !name.contains(C4940Zp0.Y)) {
                    if (!name.contains(".ttf") && !name.contains(".otf")) {
                        zipInputStream.closeEntry();
                    }
                    String[] split = name.split(RemoteSettings.i);
                    String str2 = split[split.length - 1];
                    String str3 = str2.split("\\.")[0];
                    if (context == null) {
                        return new H61<>(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                    }
                    File file = new File(context.getCacheDir(), str2);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        }
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        fileOutputStream.close();
                        Typeface createFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            C7190j41.e("Failed to delete temp font file " + file.getAbsolutePath() + UE.h);
                        }
                        hashMap2.put(str3, createFromFile);
                    } finally {
                        try {
                            fileOutputStream2.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                }
                String[] split2 = name.split(RemoteSettings.i);
                hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (c10624x51 == null) {
            return new H61<>(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            C9653t61 x = x(c10624x51, (String) entry.getKey());
            if (x != null) {
                x.i(C6006eE2.n((Bitmap) entry.getValue(), x.g(), x.e()));
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z = false;
            for (C3982Pw0 c3982Pw0 : c10624x51.g().values()) {
                if (c3982Pw0.b().equals(entry2.getKey())) {
                    c3982Pw0.f((Typeface) entry2.getValue());
                    z = true;
                }
            }
            if (!z) {
                C7190j41.e("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            for (Map.Entry<String, C9653t61> entry3 : c10624x51.j().entrySet()) {
                C9653t61 value = entry3.getValue();
                if (value == null) {
                    return null;
                }
                String d2 = value.d();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (d2.startsWith("data:") && d2.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(d2.substring(d2.indexOf(44) + 1), 0);
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                        if (decodeByteArray != null) {
                            value.i(C6006eE2.n(decodeByteArray, value.g(), value.e()));
                        }
                    } catch (IllegalArgumentException e2) {
                        C7190j41.f("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            C10867y51.c().d(str, c10624x51);
        }
        return new H61<>(c10624x51);
    }

    public static /* synthetic */ void k(boolean z, InputStream inputStream) {
        if (z) {
            C6006eE2.c(inputStream);
        }
    }

    public static Boolean k0(InterfaceC2677Cq interfaceC2677Cq) {
        return n0(interfaceC2677Cq, d);
    }

    public static boolean l0(Context context) {
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    public static Boolean m0(InterfaceC2677Cq interfaceC2677Cq) {
        return n0(interfaceC2677Cq, c);
    }

    public static Boolean n0(InterfaceC2677Cq interfaceC2677Cq, byte[] bArr) {
        try {
            InterfaceC2677Cq peek = interfaceC2677Cq.peek();
            for (byte b2 : bArr) {
                if (peek.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            C7190j41.c("Failed to check zip file header", e);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static void o0(boolean z) {
        ArrayList arrayList = new ArrayList(b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((K61) arrayList.get(i)).a(z);
        }
    }

    public static String p0(Context context, int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        if (l0(context)) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static void q0(K61 k61) {
        boolean z;
        b.add(k61);
        if (a.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        k61.a(z);
    }

    public static void r0(int i) {
        C10867y51.c().e(i);
    }

    public static /* synthetic */ void s(String str, AtomicBoolean atomicBoolean, C10624x51 c10624x51) {
        Map<String, J61<C10624x51>> map = a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            o0(true);
        }
    }

    public static void s0(K61 k61) {
        b.remove(k61);
    }

    public static J61<C10624x51> u(final String str, Callable<H61<C10624x51>> callable, Runnable runnable) {
        C10624x51 b2;
        J61<C10624x51> j61 = null;
        if (str == null) {
            b2 = null;
        } else {
            b2 = C10867y51.c().b(str);
        }
        if (b2 != null) {
            j61 = new J61<>(b2);
        }
        if (str != null) {
            Map<String, J61<C10624x51>> map = a;
            if (map.containsKey(str)) {
                j61 = map.get(str);
            }
        }
        if (j61 != null) {
            if (runnable != null) {
                runnable.run();
            }
            return j61;
        }
        J61<C10624x51> j612 = new J61<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            j612.d(new InterfaceC10871y61() { // from class: o.H51
                @Override // o.InterfaceC10871y61
                public final void onResult(Object obj) {
                    T51.s(str, atomicBoolean, (C10624x51) obj);
                }
            });
            j612.c(new InterfaceC10871y61() { // from class: o.I51
                @Override // o.InterfaceC10871y61
                public final void onResult(Object obj) {
                    T51.c(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, J61<C10624x51>> map2 = a;
                map2.put(str, j612);
                if (map2.size() == 1) {
                    o0(false);
                }
            }
        }
        return j612;
    }

    public static void v(Context context) {
        w(context, true);
    }

    public static void w(Context context, boolean z) {
        C2479Ap1 i;
        a.clear();
        C10867y51.c().a();
        if (z && (i = ZX0.i(context)) != null) {
            i.a();
        }
    }

    public static C9653t61 x(C10624x51 c10624x51, String str) {
        for (C9653t61 c9653t61 : c10624x51.j().values()) {
            if (c9653t61.d().equals(str)) {
                return c9653t61;
            }
        }
        return null;
    }

    public static J61<C10624x51> y(Context context, String str) {
        return z(context, str, "asset_" + str);
    }

    public static J61<C10624x51> z(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return u(str2, new Callable() { // from class: o.E51
            @Override // java.util.concurrent.Callable
            public final Object call() {
                H61 B;
                B = T51.B(applicationContext, str, str2);
                return B;
            }
        }, null);
    }
}
