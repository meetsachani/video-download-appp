package o;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class W61 implements InterfaceC4931Zn {
    public static final String k = "LruBitmapPool";
    public static final Bitmap.Config l = Bitmap.Config.ARGB_8888;
    public final InterfaceC5492c71 a;
    public final Set<Bitmap.Config> b;
    public final long c;
    public final a d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* loaded from: classes.dex */
    public interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    /* loaded from: classes.dex */
    public static class c implements a {
        public final Set<Bitmap> a = Collections.synchronizedSet(new HashSet());

        @Override // o.W61.a
        public void a(Bitmap bitmap) {
            if (this.a.contains(bitmap)) {
                this.a.remove(bitmap);
                return;
            }
            throw new IllegalStateException("Cannot remove bitmap not in tracker");
        }

        @Override // o.W61.a
        public void b(Bitmap bitmap) {
            if (!this.a.contains(bitmap)) {
                this.a.add(bitmap);
                return;
            }
            throw new IllegalStateException("Can't add already added bitmap: " + bitmap + " [" + bitmap.getWidth() + "x" + bitmap.getHeight() + C6566gU0.g);
        }
    }

    public W61(long j, InterfaceC5492c71 interfaceC5492c71, Set<Bitmap.Config> set) {
        this.c = j;
        this.e = j;
        this.a = interfaceC5492c71;
        this.b = set;
        this.d = new b();
    }

    public static void h(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config != config2) {
                return;
            }
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    public static Bitmap i(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = l;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public static Set<Bitmap.Config> o() {
        Bitmap.Config config;
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static InterfaceC5492c71 p() {
        return new O82();
    }

    public static void s(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    public static void u(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        s(bitmap);
    }

    @Override // o.InterfaceC4931Zn
    public void a(int i) {
        if (Log.isLoggable(k, 3)) {
            Log.d(k, "trimMemory, level=" + i);
        }
        if (i < 40 && i < 20) {
            if (i < 20 && i != 15) {
                return;
            }
            v(e() / 2);
            return;
        }
        b();
    }

    @Override // o.InterfaceC4931Zn
    public void b() {
        if (Log.isLoggable(k, 3)) {
            Log.d(k, "clearMemory");
        }
        v(0L);
    }

    @Override // o.InterfaceC4931Zn
    public synchronized void c(float f) {
        this.e = Math.round(((float) this.c) * f);
        l();
    }

    @Override // o.InterfaceC4931Zn
    public synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && this.a.c(bitmap) <= this.e && this.b.contains(bitmap.getConfig())) {
                        int c2 = this.a.c(bitmap);
                        this.a.d(bitmap);
                        this.d.b(bitmap);
                        this.i++;
                        this.f += c2;
                        if (Log.isLoggable(k, 2)) {
                            Log.v(k, "Put bitmap in pool=" + this.a.a(bitmap));
                        }
                        j();
                        l();
                        return;
                    }
                    if (Log.isLoggable(k, 2)) {
                        Log.v(k, "Reject bitmap from pool, bitmap: " + this.a.a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o.InterfaceC4931Zn
    public long e() {
        return this.e;
    }

    @Override // o.InterfaceC4931Zn
    public Bitmap f(int i, int i2, Bitmap.Config config) {
        Bitmap q = q(i, i2, config);
        if (q != null) {
            q.eraseColor(0);
            return q;
        }
        return i(i, i2, config);
    }

    @Override // o.InterfaceC4931Zn
    public Bitmap g(int i, int i2, Bitmap.Config config) {
        Bitmap q = q(i, i2, config);
        if (q == null) {
            return i(i, i2, config);
        }
        return q;
    }

    public final void j() {
        if (Log.isLoggable(k, 2)) {
            k();
        }
    }

    public final void k() {
        Log.v(k, "Hits=" + this.g + ", misses=" + this.h + ", puts=" + this.i + ", evictions=" + this.j + ", currentSize=" + this.f + ", maxSize=" + this.e + "\nStrategy=" + this.a);
    }

    public final void l() {
        v(this.e);
    }

    public long m() {
        return this.j;
    }

    public long n() {
        return this.f;
    }

    public final synchronized Bitmap q(int i, int i2, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap f;
        try {
            h(config);
            InterfaceC5492c71 interfaceC5492c71 = this.a;
            if (config != null) {
                config2 = config;
            } else {
                config2 = l;
            }
            f = interfaceC5492c71.f(i, i2, config2);
            if (f == null) {
                if (Log.isLoggable(k, 3)) {
                    Log.d(k, "Missing bitmap=" + this.a.b(i, i2, config));
                }
                this.h++;
            } else {
                this.g++;
                this.f -= this.a.c(f);
                this.d.a(f);
                u(f);
            }
            if (Log.isLoggable(k, 2)) {
                Log.v(k, "Get bitmap=" + this.a.b(i, i2, config));
            }
            j();
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public long r() {
        return this.g;
    }

    public long t() {
        return this.h;
    }

    public final synchronized void v(long j) {
        while (this.f > j) {
            try {
                Bitmap removeLast = this.a.removeLast();
                if (removeLast == null) {
                    if (Log.isLoggable(k, 5)) {
                        Log.w(k, "Size mismatch, resetting");
                        k();
                    }
                    this.f = 0L;
                    return;
                }
                this.d.a(removeLast);
                this.f -= this.a.c(removeLast);
                this.j++;
                if (Log.isLoggable(k, 3)) {
                    Log.d(k, "Evicting bitmap=" + this.a.a(removeLast));
                }
                j();
                removeLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public W61(long j) {
        this(j, p(), o());
    }

    public W61(long j, Set<Bitmap.Config> set) {
        this(j, p(), set);
    }

    /* loaded from: classes.dex */
    public static final class b implements a {
        @Override // o.W61.a
        public void a(Bitmap bitmap) {
        }

        @Override // o.W61.a
        public void b(Bitmap bitmap) {
        }
    }
}
