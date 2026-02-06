package o;

import android.net.Uri;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class XK {
    public static final XK i = new a().b();
    public EnumC3763Np1 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public C7746lM h;

    public XK() {
        this.a = EnumC3763Np1.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new C7746lM();
    }

    public C7746lM a() {
        return this.h;
    }

    public EnumC3763Np1 b() {
        return this.a;
    }

    public long c() {
        return this.f;
    }

    public long d() {
        return this.g;
    }

    public boolean e() {
        if (this.h.c() > 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 == null || XK.class != o2.getClass()) {
            return false;
        }
        XK xk = (XK) o2;
        if (this.b != xk.b || this.c != xk.c || this.d != xk.d || this.e != xk.e || this.f != xk.f || this.g != xk.g || this.a != xk.a) {
            return false;
        }
        return this.h.equals(xk.h);
    }

    public boolean f() {
        return this.d;
    }

    public boolean g() {
        return this.b;
    }

    public boolean h() {
        return this.c;
    }

    public int hashCode() {
        long j = this.f;
        long j2 = this.g;
        return (((((((((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.h.hashCode();
    }

    public boolean i() {
        return this.e;
    }

    public void j(C7746lM mContentUriTriggers) {
        this.h = mContentUriTriggers;
    }

    public void k(EnumC3763Np1 requiredNetworkType) {
        this.a = requiredNetworkType;
    }

    public void l(boolean requiresBatteryNotLow) {
        this.d = requiresBatteryNotLow;
    }

    public void m(boolean requiresCharging) {
        this.b = requiresCharging;
    }

    public void n(boolean requiresDeviceIdle) {
        this.c = requiresDeviceIdle;
    }

    public void o(boolean requiresStorageNotLow) {
        this.e = requiresStorageNotLow;
    }

    public void p(long triggerContentUpdateDelay) {
        this.f = triggerContentUpdateDelay;
    }

    public void q(long triggerMaxContentDelay) {
        this.g = triggerMaxContentDelay;
    }

    public XK(a builder) {
        this.a = EnumC3763Np1.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new C7746lM();
        this.b = builder.a;
        this.c = builder.b;
        this.a = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.h = builder.h;
        this.f = builder.f;
        this.g = builder.g;
    }

    /* loaded from: classes.dex */
    public static final class a {
        public boolean a;
        public boolean b;
        public EnumC3763Np1 c;
        public boolean d;
        public boolean e;
        public long f;
        public long g;
        public C7746lM h;

        public a() {
            this.a = false;
            this.b = false;
            this.c = EnumC3763Np1.NOT_REQUIRED;
            this.d = false;
            this.e = false;
            this.f = -1L;
            this.g = -1L;
            this.h = new C7746lM();
        }

        public a a(Uri uri, boolean triggerForDescendants) {
            this.h.a(uri, triggerForDescendants);
            return this;
        }

        public XK b() {
            return new XK(this);
        }

        public a c(EnumC3763Np1 networkType) {
            this.c = networkType;
            return this;
        }

        public a d(boolean requiresBatteryNotLow) {
            this.d = requiresBatteryNotLow;
            return this;
        }

        public a e(boolean requiresCharging) {
            this.a = requiresCharging;
            return this;
        }

        public a f(boolean requiresDeviceIdle) {
            this.b = requiresDeviceIdle;
            return this;
        }

        public a g(boolean requiresStorageNotLow) {
            this.e = requiresStorageNotLow;
            return this;
        }

        public a h(long duration, TimeUnit timeUnit) {
            this.g = timeUnit.toMillis(duration);
            return this;
        }

        public a i(Duration duration) {
            long millis;
            millis = duration.toMillis();
            this.g = millis;
            return this;
        }

        public a j(long duration, TimeUnit timeUnit) {
            this.f = timeUnit.toMillis(duration);
            return this;
        }

        public a k(Duration duration) {
            long millis;
            millis = duration.toMillis();
            this.f = millis;
            return this;
        }

        public a(XK constraints) {
            this.a = false;
            this.b = false;
            this.c = EnumC3763Np1.NOT_REQUIRED;
            this.d = false;
            this.e = false;
            this.f = -1L;
            this.g = -1L;
            this.h = new C7746lM();
            this.a = constraints.g();
            this.b = constraints.h();
            this.c = constraints.b();
            this.d = constraints.f();
            this.e = constraints.i();
            this.f = constraints.c();
            this.g = constraints.d();
            this.h = constraints.a();
        }
    }

    public XK(XK other) {
        this.a = EnumC3763Np1.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new C7746lM();
        this.b = other.b;
        this.c = other.c;
        this.a = other.a;
        this.d = other.d;
        this.e = other.e;
        this.h = other.h;
    }
}
