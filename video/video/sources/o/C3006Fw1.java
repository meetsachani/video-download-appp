package o;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import java.util.List;
import o.C3016Ga;

/* renamed from: o.Fw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3006Fw1 {
    public static final int b = -1;
    public static final int c = -1;
    public final a a;

    /* renamed from: o.Fw1$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(long j);

        void b(Surface surface);

        void c(long j);

        void d(Surface surface);

        void e(String str);

        int f();

        List<Surface> g();

        Surface getSurface();

        int h();

        String i();

        void j();

        long k();

        long l();

        Object m();
    }

    public C3006Fw1(Surface surface) {
        this(-1, surface);
    }

    public static C3006Fw1 o(Object obj) {
        a o2;
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            o2 = C3398Jw1.t((OutputConfiguration) obj);
        } else if (i >= 28) {
            o2 = C3300Iw1.s((OutputConfiguration) obj);
        } else if (i >= 26) {
            o2 = C3202Hw1.r((OutputConfiguration) obj);
        } else {
            o2 = C3104Gw1.o((OutputConfiguration) obj);
        }
        if (o2 == null) {
            return null;
        }
        return new C3006Fw1(o2);
    }

    public void a(Surface surface) {
        this.a.b(surface);
    }

    public void b() {
        this.a.j();
    }

    public long c() {
        return this.a.l();
    }

    public int d() {
        return this.a.f();
    }

    public String e() {
        return this.a.i();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3006Fw1)) {
            return false;
        }
        return this.a.equals(((C3006Fw1) obj).a);
    }

    public long f() {
        return this.a.k();
    }

    public Surface g() {
        return this.a.getSurface();
    }

    public int h() {
        return this.a.h();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public List<Surface> i() {
        return this.a.g();
    }

    public void j(Surface surface) {
        this.a.d(surface);
    }

    public void k(long j) {
        this.a.c(j);
    }

    public void l(String str) {
        this.a.e(str);
    }

    public void m(long j) {
        this.a.a(j);
    }

    public Object n() {
        return this.a.m();
    }

    public C3006Fw1(int i, Surface surface) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.a = new C3398Jw1(i, surface);
        } else if (i2 >= 28) {
            this.a = new C3300Iw1(i, surface);
        } else if (i2 >= 26) {
            this.a = new C3202Hw1(i, surface);
        } else {
            this.a = new C3104Gw1(i, surface);
        }
    }

    public <T> C3006Fw1(Size size, Class<T> cls) {
        OutputConfiguration a2 = C3016Ga.d.a(size, cls);
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.a = C3398Jw1.t(a2);
        } else if (i >= 28) {
            this.a = C3300Iw1.s(a2);
        } else {
            this.a = C3202Hw1.r(a2);
        }
    }

    public C3006Fw1(a aVar) {
        this.a = aVar;
    }
}
