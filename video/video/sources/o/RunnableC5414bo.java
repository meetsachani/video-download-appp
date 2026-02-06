package o;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: o.bo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5414bo implements Runnable {
    public static final String d1 = "PreFillRunner";
    public static final long f1 = 32;
    public static final long g1 = 40;
    public static final int h1 = 4;
    public final InterfaceC4931Zn X;
    public final InterfaceC5877di1 Y;
    public final a Y0;
    public final VE1 Z;
    public final Set<WE1> Z0;
    public final Handler a1;
    public long b1;
    public boolean c1;
    public static final a e1 = new a();
    public static final long i1 = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: o.bo$a */
    /* loaded from: classes.dex */
    public static class a {
        public long a() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    /* renamed from: o.bo$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC6575gX0 {
        @Override // o.InterfaceC6575gX0
        public void b(MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public RunnableC5414bo(InterfaceC4931Zn interfaceC4931Zn, InterfaceC5877di1 interfaceC5877di1, VE1 ve1) {
        this(interfaceC4931Zn, interfaceC5877di1, ve1, e1, new Handler(Looper.getMainLooper()));
    }

    public boolean a() {
        Bitmap createBitmap;
        long a2 = this.Y0.a();
        while (!this.Z.b() && !e(a2)) {
            WE1 c = this.Z.c();
            if (!this.Z0.contains(c)) {
                this.Z0.add(c);
                createBitmap = this.X.g(c.d(), c.b(), c.a());
            } else {
                createBitmap = Bitmap.createBitmap(c.d(), c.b(), c.a());
            }
            int i = SD2.i(createBitmap);
            if (c() >= i) {
                this.Y.f(new b(), C6141eo.c(createBitmap, this.X));
            } else {
                this.X.d(createBitmap);
            }
            if (Log.isLoggable(d1, 3)) {
                Log.d(d1, "allocated [" + c.d() + "x" + c.b() + "] " + c.a() + " size: " + i);
            }
        }
        if (!this.c1 && !this.Z.b()) {
            return true;
        }
        return false;
    }

    public void b() {
        this.c1 = true;
    }

    public final long c() {
        return this.Y.e() - this.Y.d();
    }

    public final long d() {
        long j = this.b1;
        this.b1 = Math.min(4 * j, i1);
        return j;
    }

    public final boolean e(long j) {
        if (this.Y0.a() - j >= 32) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (a()) {
            this.a1.postDelayed(this, d());
        }
    }

    public RunnableC5414bo(InterfaceC4931Zn interfaceC4931Zn, InterfaceC5877di1 interfaceC5877di1, VE1 ve1, a aVar, Handler handler) {
        this.Z0 = new HashSet();
        this.b1 = 40L;
        this.X = interfaceC4931Zn;
        this.Y = interfaceC5877di1;
        this.Z = ve1;
        this.Y0 = aVar;
        this.a1 = handler;
    }
}
