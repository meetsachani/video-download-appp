package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.dG0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5770dG0 {
    public static final String e = "HardwareConfig";
    public static final boolean f;
    public static final boolean g;
    public static final File h;
    public static final int i = 50;
    public static final int j = 20000;
    public static final int k = 500;
    @Deprecated
    public static final int l = -1;
    public static volatile C5770dG0 m;
    public int b;
    public boolean c = true;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final int a = 20000;

    static {
        boolean z;
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (i2 < 29) {
            z = true;
        } else {
            z = false;
        }
        f = z;
        if (i2 >= 28) {
            z2 = true;
        }
        g = z2;
        h = new File("/proc/self/fd");
    }

    public static C5770dG0 c() {
        if (m == null) {
            synchronized (C5770dG0.class) {
                try {
                    if (m == null) {
                        m = new C5770dG0();
                    }
                } finally {
                }
            }
        }
        return m;
    }

    public static boolean f() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        for (String str : Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013")) {
            if (Build.MODEL.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        if (f && !this.d.get()) {
            return true;
        }
        return false;
    }

    public void b() {
        SD2.b();
        this.d.set(false);
    }

    public final int d() {
        if (f()) {
            return 500;
        }
        return this.a;
    }

    public final synchronized boolean e() {
        try {
            boolean z = true;
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 >= 50) {
                this.b = 0;
                int length = h.list().length;
                long d = d();
                if (length >= d) {
                    z = false;
                }
                this.c = z;
                if (!z && Log.isLoggable(C10138v60.f, 5)) {
                    Log.w(C10138v60.f, "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + d);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public boolean g(int i2, int i3, boolean z, boolean z2) {
        if (!z) {
            if (Log.isLoggable(e, 2)) {
                Log.v(e, "Hardware config disallowed by caller");
            }
            return false;
        } else if (!g) {
            if (Log.isLoggable(e, 2)) {
                Log.v(e, "Hardware config disallowed by sdk");
            }
            return false;
        } else if (a()) {
            if (Log.isLoggable(e, 2)) {
                Log.v(e, "Hardware config disallowed by app state");
            }
            return false;
        } else if (z2) {
            if (Log.isLoggable(e, 2)) {
                Log.v(e, "Hardware config disallowed because exif orientation is required");
            }
            return false;
        } else if (i2 >= 0 && i3 >= 0) {
            if (!e()) {
                if (Log.isLoggable(e, 2)) {
                    Log.v(e, "Hardware config disallowed because there are insufficient FDs");
                }
                return false;
            }
            return true;
        } else {
            if (Log.isLoggable(e, 2)) {
                Log.v(e, "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
    }

    public boolean h(int i2, int i3, BitmapFactory.Options options, boolean z, boolean z2) {
        Bitmap.Config config;
        boolean g2 = g(i2, i3, z, z2);
        if (g2) {
            config = Bitmap.Config.HARDWARE;
            options.inPreferredConfig = config;
            options.inMutable = false;
        }
        return g2;
    }

    public void i() {
        SD2.b();
        this.d.set(true);
    }
}
