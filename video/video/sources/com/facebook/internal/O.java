package com.facebook.internal;

import android.net.Uri;
import com.facebook.internal.H;
import com.facebook.internal.V;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import o.C6562gT0;
import o.C9545sf2;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class O {
    @NotNull
    public static final O a = new O();
    public static final String b = O.class.getSimpleName();
    public static H c;

    /* loaded from: classes2.dex */
    public static final class a extends BufferedInputStream {
        @NotNull
        public HttpURLConnection X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@Nullable InputStream inputStream, @NotNull HttpURLConnection httpURLConnection) {
            super(inputStream, 8192);
            C6562gT0.p(httpURLConnection, "connection");
            this.X = httpURLConnection;
        }

        @NotNull
        public final HttpURLConnection a() {
            return this.X;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            l0 l0Var = l0.a;
            l0.r(this.X);
        }

        public final void d(@NotNull HttpURLConnection httpURLConnection) {
            C6562gT0.p(httpURLConnection, "<set-?>");
            this.X = httpURLConnection;
        }
    }

    @InterfaceC9511sW0
    public static final void a() {
        try {
            b().g();
        } catch (IOException e) {
            V.a aVar = V.e;
            com.facebook.b0 b0Var = com.facebook.b0.CACHE;
            String str = b;
            C6562gT0.o(str, "TAG");
            aVar.b(b0Var, 5, str, C6562gT0.C("clearCache failed ", e.getMessage()));
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final synchronized H b() throws IOException {
        H h;
        synchronized (O.class) {
            try {
                if (c == null) {
                    String str = b;
                    C6562gT0.o(str, "TAG");
                    c = new H(str, new H.e());
                }
                h = c;
                if (h == null) {
                    C6562gT0.S("imageCache");
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final InputStream c(@Nullable Uri uri) {
        if (uri != null && a.f(uri)) {
            try {
                H b2 = b();
                String uri2 = uri.toString();
                C6562gT0.o(uri2, "uri.toString()");
                return H.k(b2, uri2, null, 2, null);
            } catch (IOException e) {
                V.a aVar = V.e;
                com.facebook.b0 b0Var = com.facebook.b0.CACHE;
                String str = b;
                C6562gT0.o(str, "TAG");
                aVar.b(b0Var, 5, str, e.toString());
            }
        }
        return null;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final InputStream e(@NotNull HttpURLConnection httpURLConnection) throws IOException {
        C6562gT0.p(httpURLConnection, "connection");
        if (httpURLConnection.getResponseCode() == 200) {
            Uri parse = Uri.parse(httpURLConnection.getURL().toString());
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                if (a.f(parse)) {
                    H b2 = b();
                    String uri = parse.toString();
                    C6562gT0.o(uri, "uri.toString()");
                    return b2.m(uri, new a(inputStream, httpURLConnection));
                }
            } catch (IOException unused) {
            }
            return inputStream;
        }
        return null;
    }

    public final String d() {
        return b;
    }

    public final boolean f(Uri uri) {
        String host;
        if (uri == null || (host = uri.getHost()) == null || (!C6562gT0.g(host, "fbcdn.net") && !C9545sf2.b2(host, ".fbcdn.net", false, 2, null) && (!C9545sf2.J2(host, "fbcdn", false, 2, null) || !C9545sf2.b2(host, ".akamaihd.net", false, 2, null)))) {
            return false;
        }
        return true;
    }
}
