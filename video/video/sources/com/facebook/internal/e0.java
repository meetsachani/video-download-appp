package com.facebook.internal;

import android.net.Uri;
import com.facebook.internal.H;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashSet;
import o.C6551gQ1;
import o.C6562gT0;
import o.HB;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class e0 {
    @NotNull
    public static final e0 a = new e0();
    @NotNull
    public static final String b;
    @NotNull
    public static final String c;
    @Nullable
    public static H d;

    static {
        String V = C6551gQ1.d(e0.class).V();
        if (V == null) {
            V = "UrlRedirectCache";
        }
        b = V;
        c = C6562gT0.C(V, "_Redirect");
    }

    @InterfaceC9511sW0
    public static final void a(@Nullable Uri uri, @Nullable Uri uri2) {
        if (uri != null && uri2 != null) {
            OutputStream outputStream = null;
            try {
                try {
                    H c2 = c();
                    String uri3 = uri.toString();
                    C6562gT0.o(uri3, "fromUri.toString()");
                    outputStream = c2.o(uri3, c);
                    String uri4 = uri2.toString();
                    C6562gT0.o(uri4, "toUri.toString()");
                    byte[] bytes = uri4.getBytes(HB.b);
                    C6562gT0.o(bytes, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                } catch (IOException e) {
                    V.e.b(com.facebook.b0.CACHE, 4, b, C6562gT0.C("IOException when accessing cache: ", e.getMessage()));
                }
            } finally {
                l0 l0Var = l0.a;
                l0.j(outputStream);
            }
        }
    }

    @InterfaceC9511sW0
    public static final void b() {
        try {
            c().g();
        } catch (IOException e) {
            V.e.b(com.facebook.b0.CACHE, 5, b, C6562gT0.C("clearCache failed ", e.getMessage()));
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final synchronized H c() throws IOException {
        H h;
        synchronized (e0.class) {
            try {
                h = d;
                if (h == null) {
                    h = new H(b, new H.e());
                }
                d = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (o.C6562gT0.g(r3, r9) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        r5 = r6;
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
        com.facebook.internal.V.e.b(com.facebook.b0.CACHE, 6, com.facebook.internal.e0.b, "A loop detected in UrlRedirectCache");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
        com.facebook.internal.l0.j(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
        return null;
     */
    @InterfaceC9511sW0
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Uri d(@Nullable Uri uri) {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2 = null;
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        C6562gT0.o(uri2, "uri.toString()");
        HashSet hashSet = new HashSet();
        hashSet.add(uri2);
        try {
            H c2 = c();
            InputStream j = c2.j(uri2, c);
            inputStreamReader = null;
            boolean z = false;
            while (true) {
                if (j == null) {
                    break;
                }
                try {
                    try {
                        InputStreamReader inputStreamReader3 = new InputStreamReader(j);
                        try {
                            char[] cArr = new char[128];
                            StringBuilder sb = new StringBuilder();
                            for (int read = inputStreamReader3.read(cArr, 0, 128); read > 0; read = inputStreamReader3.read(cArr, 0, 128)) {
                                sb.append(cArr, 0, read);
                            }
                            l0 l0Var = l0.a;
                            l0.j(inputStreamReader3);
                            String sb2 = sb.toString();
                            C6562gT0.o(sb2, "urlBuilder.toString()");
                            if (hashSet.contains(sb2)) {
                                break;
                            }
                            hashSet.add(sb2);
                            j = c2.j(sb2, c);
                            uri2 = sb2;
                            inputStreamReader = inputStreamReader3;
                            z = true;
                        } catch (IOException e) {
                            e = e;
                            inputStreamReader = inputStreamReader3;
                            V.e.b(com.facebook.b0.CACHE, 4, b, C6562gT0.C("IOException when accessing cache: ", e.getMessage()));
                            l0 l0Var2 = l0.a;
                            l0.j(inputStreamReader);
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            inputStreamReader2 = inputStreamReader3;
                            l0 l0Var3 = l0.a;
                            l0.j(inputStreamReader2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStreamReader2 = inputStreamReader;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            if (z) {
                Uri parse = Uri.parse(uri2);
                l0 l0Var4 = l0.a;
                l0.j(inputStreamReader);
                return parse;
            }
        } catch (IOException e3) {
            e = e3;
            inputStreamReader = null;
        } catch (Throwable th3) {
            th = th3;
        }
        l0 l0Var22 = l0.a;
        l0.j(inputStreamReader);
        return null;
    }
}
