package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import o.C10323vs;
import o.HT1;
import o.InterfaceC11300zs1;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public final class zzabh implements zzcb {
    public final Context a;
    public final zzca b;
    public final SparseArray c;
    public final List d;
    public final zzbv e;
    public final boolean f;
    public final zzach g;
    public final zzdg h;
    public final CopyOnWriteArraySet i;
    public zzeq j;
    public final zzz k;
    public zzdq l;
    @InterfaceC11300zs1
    public Pair m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f196o;
    public long p;
    public long q;
    public int r;

    public /* synthetic */ zzabh(zzaba zzabaVar, zzabg zzabgVar) {
        Context context;
        zzca zzcaVar;
        List list;
        zzbv zzbvVar;
        boolean z;
        zzdg zzdgVar;
        zzabl zzablVar;
        context = zzabaVar.a;
        this.a = context;
        this.j = new zzeq(10);
        zzcaVar = zzabaVar.d;
        zzdc.b(zzcaVar);
        this.b = zzcaVar;
        this.c = new SparseArray();
        list = zzabaVar.e;
        this.d = list;
        zzbvVar = zzabaVar.f;
        this.e = zzbvVar;
        z = zzabaVar.g;
        this.f = z;
        zzdgVar = zzabaVar.h;
        this.h = zzdgVar;
        zzablVar = zzabaVar.b;
        this.g = new zzaal(zzablVar, zzdgVar);
        this.i = new CopyOnWriteArraySet();
        this.k = new zzx().K();
        this.p = C10323vs.b;
        this.q = C10323vs.b;
        this.r = -1;
        this.f196o = 0;
    }

    public static /* bridge */ /* synthetic */ boolean B(zzabh zzabhVar, zzz zzzVar, int i) {
        boolean z;
        if (zzabhVar.f196o == 0) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        zzk b = b(zzzVar.C);
        int i2 = b.c;
        try {
            if (i2 == 7) {
                if (Build.VERSION.SDK_INT >= 34 || !zzdo.b()) {
                    i2 = 7;
                } else {
                    zzi c = b.c();
                    c.d(6);
                    b = c.g();
                    zzk zzkVar = b;
                    zzdg zzdgVar = zzabhVar.h;
                    Looper myLooper = Looper.myLooper();
                    zzdc.b(myLooper);
                    final zzdq d = zzdgVar.d(myLooper, null);
                    zzabhVar.l = d;
                    zzca zzcaVar = zzabhVar.b;
                    Context context = zzabhVar.a;
                    zzn zznVar = zzn.a;
                    Objects.requireNonNull(d);
                    zzcaVar.a(context, zzkVar, zznVar, zzabhVar, new Executor() { // from class: com.google.android.gms.internal.ads.zzaaz
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            zzdq.this.h(runnable);
                        }
                    }, zzabhVar.e, zzabhVar.d, 0L, false);
                    throw null;
                }
            }
            zzca zzcaVar2 = zzabhVar.b;
            Context context2 = zzabhVar.a;
            zzn zznVar2 = zzn.a;
            Objects.requireNonNull(d);
            zzcaVar2.a(context2, zzkVar, zznVar2, zzabhVar, new Executor() { // from class: com.google.android.gms.internal.ads.zzaaz
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    zzdq.this.h(runnable);
                }
            }, zzabhVar.e, zzabhVar.d, 0L, false);
            throw null;
        } catch (zzbw e) {
            throw new zzacg(e, zzzVar);
        }
        if (!zzdo.c(i2) && Build.VERSION.SDK_INT >= 29) {
            String str = zzeu.a;
            zzdx.f("PlaybackVidGraphWrapper", String.format(Locale.US, "Color transfer %d is not supported. Falling back to OpenGl tone mapping.", Integer.valueOf(i2)));
            b = zzk.h;
        }
        zzk zzkVar2 = b;
        zzdg zzdgVar2 = zzabhVar.h;
        Looper myLooper2 = Looper.myLooper();
        zzdc.b(myLooper2);
        final zzdq d2 = zzdgVar2.d(myLooper2, null);
        zzabhVar.l = d2;
    }

    public static /* bridge */ /* synthetic */ boolean a(zzabh zzabhVar) {
        int i = zzabhVar.r;
        return i != -1 && i == 0;
    }

    public static zzk b(@InterfaceC11300zs1 zzk zzkVar) {
        if (zzkVar != null && zzkVar.f()) {
            return zzkVar;
        }
        return zzk.h;
    }

    public static /* synthetic */ void h(zzabh zzabhVar) {
        zzabhVar.n--;
    }

    public static /* bridge */ /* synthetic */ void l(final zzabh zzabhVar, boolean z) {
        if (zzabhVar.f196o == 1) {
            zzabhVar.n++;
            zzach zzachVar = zzabhVar.g;
            zzachVar.n0(z);
            while (zzabhVar.j.a() > 1) {
                zzabhVar.j.b();
            }
            if (zzabhVar.j.a() == 1) {
                zzabf zzabfVar = (zzabf) zzabhVar.j.b();
                zzabfVar.getClass();
                zzachVar.b0(1, zzabhVar.k, zzabfVar.a, zzabfVar.b, zzfyc.F());
            }
            zzabhVar.p = C10323vs.b;
            zzabhVar.q = C10323vs.b;
            zzdq zzdqVar = zzabhVar.l;
            zzdc.b(zzdqVar);
            zzdqVar.h(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaay
                @Override // java.lang.Runnable
                public final void run() {
                    zzabh.h(zzabh.this);
                }
            });
        }
    }

    public final zzach g(int i) {
        SparseArray sparseArray = this.c;
        if (zzeu.h(sparseArray, 0)) {
            return (zzach) sparseArray.get(0);
        }
        zzabb zzabbVar = new zzabb(this, this.a, 0);
        this.i.add(zzabbVar);
        sparseArray.put(0, zzabbVar);
        return zzabbVar;
    }

    public final void t() {
        zzel zzelVar = zzel.c;
        zzelVar.b();
        zzelVar.a();
        this.m = null;
    }

    public final void u() {
        if (this.f196o == 2) {
            return;
        }
        zzdq zzdqVar = this.l;
        if (zzdqVar != null) {
            zzdqVar.e(null);
        }
        this.m = null;
        this.f196o = 2;
    }

    public final void v(Surface surface, zzel zzelVar) {
        Pair pair = this.m;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzel) this.m.second).equals(zzelVar)) {
            return;
        }
        this.m = Pair.create(surface, zzelVar);
        zzelVar.b();
        zzelVar.a();
    }

    public final void w(int i) {
        this.r = 1;
    }

    public final void x() {
        this.g.y();
    }

    public final void y() {
        this.g.w();
    }
}
