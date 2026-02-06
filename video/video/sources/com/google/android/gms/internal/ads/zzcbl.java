package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcbl {
    public final Context a;
    public final zzcbw b;
    public final ViewGroup c;
    @InterfaceC11300zs1
    public final zzdsd d;
    public zzcbk e;

    public zzcbl(Context context, ViewGroup viewGroup, zzcfb zzcfbVar, @InterfaceC11300zs1 zzdsd zzdsdVar) {
        this.a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.c = viewGroup;
        this.b = zzcfbVar;
        this.e = null;
        this.d = zzdsdVar;
    }

    public final zzcbk a() {
        return this.e;
    }

    @InterfaceC11300zs1
    public final Integer b() {
        zzcbk zzcbkVar = this.e;
        if (zzcbkVar != null) {
            return zzcbkVar.w();
        }
        return null;
    }

    public final void c(int i, int i2, int i3, int i4) {
        Preconditions.k("The underlay may only be modified from the UI thread.");
        zzcbk zzcbkVar = this.e;
        if (zzcbkVar != null) {
            zzcbkVar.o(i, i2, i3, i4);
        }
    }

    public final void d(int i, int i2, int i3, int i4, int i5, boolean z, zzcbv zzcbvVar) {
        if (this.e != null) {
            return;
        }
        zzcbw zzcbwVar = this.b;
        zzbdc.a(zzcbwVar.l().a(), zzcbwVar.k(), "vpr2");
        zzcbk zzcbkVar = new zzcbk(this.a, zzcbwVar, i5, z, zzcbwVar.l().a(), zzcbvVar, this.d);
        this.e = zzcbkVar;
        this.c.addView(zzcbkVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.e.o(i, i2, i3, i4);
        zzcbwVar.a0(false);
    }

    public final void e() {
        Preconditions.k("onDestroy must be called from the UI thread.");
        zzcbk zzcbkVar = this.e;
        if (zzcbkVar != null) {
            zzcbkVar.B();
            this.c.removeView(this.e);
            this.e = null;
        }
    }

    public final void f() {
        Preconditions.k("onPause must be called from the UI thread.");
        zzcbk zzcbkVar = this.e;
        if (zzcbkVar != null) {
            zzcbkVar.F();
        }
    }

    public final void g(int i) {
        zzcbk zzcbkVar = this.e;
        if (zzcbkVar != null) {
            zzcbkVar.l(i);
        }
    }
}
