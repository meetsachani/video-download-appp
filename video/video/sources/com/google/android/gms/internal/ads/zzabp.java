package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;
import o.C10323vs;
import o.C6755hG2;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzabp {
    public final zzaan a = new zzaan();
    @InterfaceC11300zs1
    public final zzabn b;
    @InterfaceC11300zs1
    public final zzabo c;
    public boolean d;
    @InterfaceC11300zs1
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public long f197o;
    public long p;
    public long q;

    public zzabp(@InterfaceC11300zs1 Context context) {
        DisplayManager displayManager;
        zzabn zzabnVar;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            zzabnVar = null;
        } else {
            zzabnVar = new zzabn(this, displayManager);
        }
        this.b = zzabnVar;
        this.c = zzabnVar != null ? zzabo.a() : null;
        this.k = C10323vs.b;
        this.l = C10323vs.b;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public static /* bridge */ /* synthetic */ void b(zzabp zzabpVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            zzabpVar.k = refreshRate;
            zzabpVar.l = (refreshRate * 80) / 100;
            return;
        }
        zzdx.f(C6755hG2.r, "Unable to query display refresh rate");
        zzabpVar.k = C10323vs.b;
        zzabpVar.l = C10323vs.b;
    }

    public final long a(long j) {
        long j2;
        if (this.p != -1) {
            zzaan zzaanVar = this.a;
            if (zzaanVar.g()) {
                long c = zzaanVar.c();
                long j3 = this.q + (((float) (c * (this.m - this.p))) / this.i);
                if (Math.abs(j - j3) > C6755hG2.x) {
                    l();
                } else {
                    j = j3;
                }
            }
        }
        this.n = this.m;
        this.f197o = j;
        zzabo zzaboVar = this.c;
        if (zzaboVar != null && this.k != C10323vs.b) {
            long j4 = zzaboVar.X;
            if (j4 != C10323vs.b) {
                long j5 = this.k;
                long j6 = j4 + (((j - j4) / j5) * j5);
                if (j <= j6) {
                    j2 = j6 - j5;
                } else {
                    long j7 = j5 + j6;
                    j2 = j6;
                    j6 = j7;
                }
                long j8 = this.l;
                if (j6 - j >= j - j2) {
                    j6 = j2;
                }
                return j6 - j8;
            }
        }
        return j;
    }

    public final void c(float f) {
        this.f = f;
        this.a.f();
        m();
    }

    public final void d(long j) {
        long j2 = this.n;
        if (j2 != -1) {
            this.p = j2;
            this.q = this.f197o;
        }
        this.m++;
        this.a.e(j * 1000);
        m();
    }

    public final void e(float f) {
        this.i = f;
        l();
        n(false);
    }

    public final void f() {
        l();
    }

    public final void g() {
        this.d = true;
        l();
        zzabn zzabnVar = this.b;
        if (zzabnVar != null) {
            zzabo zzaboVar = this.c;
            zzaboVar.getClass();
            zzaboVar.b();
            zzabnVar.a();
        }
        n(false);
    }

    public final void h() {
        this.d = false;
        zzabn zzabnVar = this.b;
        if (zzabnVar != null) {
            zzabnVar.b();
            zzabo zzaboVar = this.c;
            zzaboVar.getClass();
            zzaboVar.c();
        }
        k();
    }

    public final void i(@InterfaceC11300zs1 Surface surface) {
        if (this.e == surface) {
            return;
        }
        k();
        this.e = surface;
        n(true);
    }

    public final void j(int i) {
        if (this.j == i) {
            return;
        }
        this.j = i;
        n(true);
    }

    public final void k() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.e) != null && this.j != Integer.MIN_VALUE && this.h != 0.0f) {
            this.h = 0.0f;
            zzabm.a(surface, 0.0f);
        }
    }

    public final void l() {
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
    }

    public final void m() {
        float f;
        if (Build.VERSION.SDK_INT >= 30 && this.e != null) {
            zzaan zzaanVar = this.a;
            if (zzaanVar.g()) {
                f = zzaanVar.a();
            } else {
                f = this.f;
            }
            float f2 = this.g;
            if (f != f2) {
                int i = (f > (-1.0f) ? 1 : (f == (-1.0f) ? 0 : -1));
                if (i != 0 && f2 != -1.0f) {
                    float f3 = 1.0f;
                    if (zzaanVar.g() && zzaanVar.d() >= C6755hG2.s) {
                        f3 = 0.02f;
                    }
                    if (Math.abs(f - this.g) < f3) {
                        return;
                    }
                } else if (i == 0 && zzaanVar.b() < 30) {
                    return;
                }
                this.g = f;
                n(false);
            }
        }
    }

    public final void n(boolean z) {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.e) != null && this.j != Integer.MIN_VALUE) {
            float f = 0.0f;
            if (this.d) {
                float f2 = this.g;
                if (f2 != -1.0f) {
                    f = this.i * f2;
                }
            }
            if (z || this.h != f) {
                this.h = f;
                zzabm.a(surface, f);
            }
        }
    }
}
