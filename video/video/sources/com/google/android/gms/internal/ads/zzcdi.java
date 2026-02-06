package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public abstract class zzcdi implements Releasable {
    public final Context X;
    public final String Y;
    public final WeakReference Z;

    public zzcdi(zzcbw zzcbwVar) {
        Context context = zzcbwVar.getContext();
        this.X = context;
        this.Y = com.google.android.gms.ads.internal.zzv.v().I(context, zzcbwVar.m().X);
        this.Z = new WeakReference(zzcbwVar);
    }

    public static /* bridge */ /* synthetic */ void k(zzcdi zzcdiVar, String str, Map map) {
        zzcbw zzcbwVar = (zzcbw) zzcdiVar.Z.get();
        if (zzcbwVar != null) {
            zzcbwVar.q("onPrecacheEvent", map);
        }
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void g() {
    }

    public abstract void l();

    public final void m(String str, @InterfaceC11300zs1 String str2, String str3, @InterfaceC11300zs1 String str4) {
        com.google.android.gms.ads.internal.util.client.zzf.b.post(new zzcdh(this, str, str2, str3, str4));
    }

    public final void n(String str, String str2, int i) {
        com.google.android.gms.ads.internal.util.client.zzf.b.post(new zzcdf(this, str, str2, i));
    }

    public final void o(String str, String str2, long j) {
        com.google.android.gms.ads.internal.util.client.zzf.b.post(new zzcdg(this, str, str2, j));
    }

    public final void p(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        com.google.android.gms.ads.internal.util.client.zzf.b.post(new zzcde(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    public final void r(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        com.google.android.gms.ads.internal.util.client.zzf.b.post(new zzcdd(this, str, str2, j, j2, j3, j4, j5, z, i, i2));
    }

    public void s(int i) {
    }

    public void t(int i) {
    }

    public void u(int i) {
    }

    public void v(int i) {
    }

    public abstract boolean w(String str);

    public boolean x(String str, String[] strArr) {
        return w(str);
    }

    public boolean y(String str, String[] strArr, zzcda zzcdaVar) {
        return w(str);
    }
}
