package o;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import o.C5722d40;
import o.Y30;

/* renamed from: o.f40  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6207f40 implements Y30 {
    public static final String f = "DiskLruCacheWrapper";
    public static final int g = 1;
    public static final int h = 1;
    public static C6207f40 i;
    public final File b;
    public final long c;
    public C5722d40 e;
    public final C5237b40 d = new C5237b40();
    public final C10733xX1 a = new C10733xX1();

    @Deprecated
    public C6207f40(File file, long j) {
        this.b = file;
        this.c = j;
    }

    public static Y30 d(File file, long j) {
        return new C6207f40(file, j);
    }

    @Deprecated
    public static synchronized Y30 e(File file, long j) {
        C6207f40 c6207f40;
        synchronized (C6207f40.class) {
            try {
                if (i == null) {
                    i = new C6207f40(file, j);
                }
                c6207f40 = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6207f40;
    }

    @Override // o.Y30
    public void a(InterfaceC6575gX0 interfaceC6575gX0, Y30.b bVar) {
        String b = this.a.b(interfaceC6575gX0);
        this.d.a(b);
        try {
            if (Log.isLoggable(f, 2)) {
                Log.v(f, "Put: Obtained: " + b + " for for Key: " + interfaceC6575gX0);
            }
            try {
                C5722d40 f2 = f();
                if (f2.x(b) == null) {
                    C5722d40.c t = f2.t(b);
                    if (t != null) {
                        try {
                            if (bVar.a(t.f(0))) {
                                t.e();
                            }
                            t.b();
                        } catch (Throwable th) {
                            t.b();
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("Had two simultaneous puts for: " + b);
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable(f, 5)) {
                    Log.w(f, "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.d.b(b);
        }
    }

    @Override // o.Y30
    public File b(InterfaceC6575gX0 interfaceC6575gX0) {
        String b = this.a.b(interfaceC6575gX0);
        if (Log.isLoggable(f, 2)) {
            Log.v(f, "Get: Obtained: " + b + " for for Key: " + interfaceC6575gX0);
        }
        try {
            C5722d40.e x = f().x(b);
            if (x != null) {
                return x.b(0);
            }
            return null;
        } catch (IOException e) {
            if (Log.isLoggable(f, 5)) {
                Log.w(f, "Unable to get from disk cache", e);
                return null;
            }
            return null;
        }
    }

    @Override // o.Y30
    public void c(InterfaceC6575gX0 interfaceC6575gX0) {
        try {
            f().M(this.a.b(interfaceC6575gX0));
        } catch (IOException e) {
            if (Log.isLoggable(f, 5)) {
                Log.w(f, "Unable to delete from disk cache", e);
            }
        }
    }

    @Override // o.Y30
    public synchronized void clear() {
        try {
            f().r();
        } catch (IOException e) {
            if (Log.isLoggable(f, 5)) {
                Log.w(f, "Unable to clear disk cache or disk cache cleared externally", e);
            }
        }
        g();
    }

    public final synchronized C5722d40 f() throws IOException {
        try {
            if (this.e == null) {
                this.e = C5722d40.E(this.b, 1, 1, this.c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.e;
    }

    public final synchronized void g() {
        this.e = null;
    }
}
