package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.emoji2.text.c;
import androidx.emoji2.text.e;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import o.C10831xw2;
import o.C10907yF1;
import o.C4761Xw0;
import o.C5935dx0;
import o.C7139ir2;
import o.C8238nJ;
import o.C9811tl1;

/* loaded from: classes.dex */
public class e extends c.d {
    public static final b k = new b();

    /* loaded from: classes.dex */
    public static class a extends d {
        public final long a;
        public long b;

        public a(long j) {
            this.a = j;
        }

        @Override // androidx.emoji2.text.e.d
        public long a() {
            if (this.b == 0) {
                this.b = SystemClock.uptimeMillis();
                return 0L;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.b;
            if (uptimeMillis > this.a) {
                return -1L;
            }
            return Math.min(Math.max(uptimeMillis, 1000L), this.a - uptimeMillis);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public Typeface a(Context context, C5935dx0.c cVar) throws PackageManager.NameNotFoundException {
            return C5935dx0.a(context, null, new C5935dx0.c[]{cVar});
        }

        public C5935dx0.b b(Context context, C4761Xw0 c4761Xw0) throws PackageManager.NameNotFoundException {
            return C5935dx0.b(context, null, c4761Xw0);
        }

        public void c(Context context, Uri uri, ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        public void d(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements c.j {
        public static final String l = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";
        public final Context a;
        public final C4761Xw0 b;
        public final b c;
        public final Object d = new Object();
        public Handler e;
        public Executor f;
        public ThreadPoolExecutor g;
        public d h;
        public c.k i;
        public ContentObserver j;
        public Runnable k;

        /* loaded from: classes.dex */
        public class a extends ContentObserver {
            public a(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z, Uri uri) {
                c.this.d();
            }
        }

        public c(Context context, C4761Xw0 c4761Xw0, b bVar) {
            C10907yF1.m(context, "Context cannot be null");
            C10907yF1.m(c4761Xw0, "FontRequest cannot be null");
            this.a = context.getApplicationContext();
            this.b = c4761Xw0;
            this.c = bVar;
        }

        @Override // androidx.emoji2.text.c.j
        public void a(c.k kVar) {
            C10907yF1.m(kVar, "LoaderCallback cannot be null");
            synchronized (this.d) {
                this.i = kVar;
            }
            d();
        }

        public final void b() {
            synchronized (this.d) {
                try {
                    this.i = null;
                    ContentObserver contentObserver = this.j;
                    if (contentObserver != null) {
                        this.c.d(this.a, contentObserver);
                        this.j = null;
                    }
                    Handler handler = this.e;
                    if (handler != null) {
                        handler.removeCallbacks(this.k);
                    }
                    this.e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f = null;
                    this.g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void c() {
            synchronized (this.d) {
                try {
                    if (this.i == null) {
                        return;
                    }
                    try {
                        C5935dx0.c e = e();
                        int b = e.b();
                        if (b == 2) {
                            synchronized (this.d) {
                                d dVar = this.h;
                                if (dVar != null) {
                                    long a2 = dVar.a();
                                    if (a2 >= 0) {
                                        f(e.d(), a2);
                                        return;
                                    }
                                }
                            }
                        }
                        if (b == 0) {
                            C7139ir2.b(l);
                            Typeface a3 = this.c.a(this.a, e);
                            ByteBuffer f = C10831xw2.f(this.a, null, e.d());
                            if (f != null && a3 != null) {
                                f e2 = f.e(a3, f);
                                C7139ir2.d();
                                synchronized (this.d) {
                                    c.k kVar = this.i;
                                    if (kVar != null) {
                                        kVar.b(e2);
                                    }
                                }
                                b();
                                return;
                            }
                            throw new RuntimeException("Unable to open file.");
                        }
                        throw new RuntimeException("fetchFonts result is not OK. (" + b + C9811tl1.d);
                    } catch (Throwable th) {
                        synchronized (this.d) {
                            try {
                                c.k kVar2 = this.i;
                                if (kVar2 != null) {
                                    kVar2.a(th);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void d() {
            synchronized (this.d) {
                try {
                    if (this.i == null) {
                        return;
                    }
                    if (this.f == null) {
                        ThreadPoolExecutor c = C8238nJ.c("emojiCompat");
                        this.g = c;
                        this.f = c;
                    }
                    this.f.execute(new Runnable() { // from class: o.Yw0
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.c.this.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final C5935dx0.c e() {
            try {
                C5935dx0.b b = this.c.b(this.a, this.b);
                if (b.e() == 0) {
                    C5935dx0.c[] c = b.c();
                    if (c != null && c.length != 0) {
                        return c[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + b.e() + C9811tl1.d);
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        public final void f(Uri uri, long j) {
            synchronized (this.d) {
                try {
                    Handler handler = this.e;
                    if (handler == null) {
                        handler = C8238nJ.d();
                        this.e = handler;
                    }
                    if (this.j == null) {
                        a aVar = new a(handler);
                        this.j = aVar;
                        this.c.c(this.a, uri, aVar);
                    }
                    if (this.k == null) {
                        this.k = new Runnable() { // from class: o.Zw0
                            @Override // java.lang.Runnable
                            public final void run() {
                                e.c.this.d();
                            }
                        };
                    }
                    handler.postDelayed(this.k, j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void g(Executor executor) {
            synchronized (this.d) {
                this.f = executor;
            }
        }

        public void h(d dVar) {
            synchronized (this.d) {
                this.h = dVar;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        public abstract long a();
    }

    public e(Context context, C4761Xw0 c4761Xw0) {
        super(new c(context, c4761Xw0, k));
    }

    @Deprecated
    public e l(Handler handler) {
        if (handler == null) {
            return this;
        }
        m(C8238nJ.b(handler));
        return this;
    }

    public e m(Executor executor) {
        ((c) a()).g(executor);
        return this;
    }

    public e n(d dVar) {
        ((c) a()).h(dVar);
        return this;
    }

    public e(Context context, C4761Xw0 c4761Xw0, b bVar) {
        super(new c(context, c4761Xw0, bVar));
    }
}
