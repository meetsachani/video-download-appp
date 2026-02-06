package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import o.C6562gT0;
import o.C8319ne2;
import o.C9516sY;
import o.InterfaceC5056aJ2;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public class W extends AsyncTask<Void, Void, List<? extends Y>> {
    @NotNull
    public static final a d = new a(null);
    public static final String e = W.class.getCanonicalName();
    @Nullable
    public final HttpURLConnection a;
    @NotNull
    public final X b;
    @Nullable
    public Exception c;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public W(@Nullable HttpURLConnection httpURLConnection, @NotNull X x) {
        C6562gT0.p(x, "requests");
        this.a = httpURLConnection;
        this.b = x;
    }

    @InterfaceC5056aJ2(otherwise = 4)
    @Nullable
    public List<Y> a(@NotNull Void... voidArr) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            if (SQ.e(this) || SQ.e(this)) {
                return null;
            }
            C6562gT0.p(voidArr, "params");
            try {
                HttpURLConnection httpURLConnection = this.a;
                if (httpURLConnection == null) {
                    return this.b.i();
                }
                return S.n.p(httpURLConnection, this.b);
            } catch (Exception e2) {
                this.c = e2;
                return null;
            }
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    @Nullable
    public final Exception b() {
        return this.c;
    }

    @NotNull
    public final X c() {
        return this.b;
    }

    public void d(@NotNull List<Y> list) {
        if (!SQ.e(this)) {
            try {
                if (!SQ.e(this) && !SQ.e(this)) {
                    C6562gT0.p(list, "result");
                    super.onPostExecute(list);
                    Exception exc = this.c;
                    if (exc != null) {
                        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                        String str = e;
                        C8319ne2 c8319ne2 = C8319ne2.a;
                        String format = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                        C6562gT0.o(format, "java.lang.String.format(format, *args)");
                        com.facebook.internal.l0.m0(str, format);
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ List<? extends Y> doInBackground(Void[] voidArr) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            if (SQ.e(this) || SQ.e(this)) {
                return null;
            }
            return a(voidArr);
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(List<? extends Y> list) {
        if (!SQ.e(this)) {
            try {
                if (!SQ.e(this) && !SQ.e(this)) {
                    d(list);
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @Override // android.os.AsyncTask
    @InterfaceC5056aJ2(otherwise = 4)
    public void onPreExecute() {
        Handler handler;
        if (!SQ.e(this)) {
            try {
                if (!SQ.e(this) && !SQ.e(this)) {
                    super.onPreExecute();
                    M m = M.a;
                    if (M.K()) {
                        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                        String str = e;
                        C8319ne2 c8319ne2 = C8319ne2.a;
                        String format = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                        C6562gT0.o(format, "java.lang.String.format(format, *args)");
                        com.facebook.internal.l0.m0(str, format);
                    }
                    if (this.b.w() == null) {
                        if (Thread.currentThread() instanceof HandlerThread) {
                            handler = new Handler();
                        } else {
                            handler = new Handler(Looper.getMainLooper());
                        }
                        this.b.Y(handler);
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @NotNull
    public String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.a + ", requests: " + this.b + "}";
        C6562gT0.o(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W(@NotNull S... sArr) {
        this((HttpURLConnection) null, new X((S[]) Arrays.copyOf(sArr, sArr.length)));
        C6562gT0.p(sArr, "requests");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W(@NotNull Collection<S> collection) {
        this((HttpURLConnection) null, new X(collection));
        C6562gT0.p(collection, "requests");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W(@NotNull X x) {
        this((HttpURLConnection) null, x);
        C6562gT0.p(x, "requests");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W(@Nullable HttpURLConnection httpURLConnection, @NotNull S... sArr) {
        this(httpURLConnection, new X((S[]) Arrays.copyOf(sArr, sArr.length)));
        C6562gT0.p(sArr, "requests");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W(@Nullable HttpURLConnection httpURLConnection, @NotNull Collection<S> collection) {
        this(httpURLConnection, new X(collection));
        C6562gT0.p(collection, "requests");
    }
}
