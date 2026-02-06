package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class zzit {
    public final Context a;
    public zzdg b;
    public zzfvu c;
    public zzfvu d;
    public zzfvu e;
    public zzfvu f;
    public zzfvu g;
    public zzfur h;
    public Looper i;
    public int j;
    public zze k;
    public int l;
    public boolean m;
    public zzmd n;

    /* renamed from: o */
    public long f286o;
    public long p;
    public boolean q;
    public boolean r;
    public String s;
    public zzid t;

    public zzit(final Context context, zzceh zzcehVar) {
        zzim zzimVar = new zzim(zzcehVar);
        zzin zzinVar = new zzin(context);
        zzfvu zzfvuVar = new zzfvu() { // from class: com.google.android.gms.internal.ads.zzio
            @Override // com.google.android.gms.internal.ads.zzfvu
            public final Object a() {
                return new zzyo(context);
            }
        };
        zzfvu zzfvuVar2 = new zzfvu() { // from class: com.google.android.gms.internal.ads.zzip
            @Override // com.google.android.gms.internal.ads.zzfvu
            public final Object a() {
                return new zzig();
            }
        };
        zziq zziqVar = new zziq(context);
        zzfur zzfurVar = new zzfur() { // from class: com.google.android.gms.internal.ads.zzir
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                return new zzoo((zzdg) obj);
            }
        };
        context.getClass();
        this.a = context;
        this.c = zzimVar;
        this.d = zzinVar;
        this.e = zzfvuVar;
        this.f = zzfvuVar2;
        this.g = zziqVar;
        this.h = zzfurVar;
        this.i = zzeu.U();
        this.k = zze.b;
        this.l = 1;
        this.m = true;
        this.n = zzmd.d;
        int i = zzmc.a;
        this.t = new zzid(0.97f, 1.03f, 1000L, 1.0E-7f, zzeu.N(20L), zzeu.N(500L), 0.999f, null);
        this.b = zzdg.a;
        this.f286o = 500L;
        this.p = 2000L;
        this.q = true;
        this.s = "";
        this.j = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i2 = zzij.a;
        }
    }

    public static /* synthetic */ zzva a(Context context) {
        return new zzuo(context, new zzadi());
    }
}
