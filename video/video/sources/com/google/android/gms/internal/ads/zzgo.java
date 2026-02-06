package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzgo implements zzgf {
    @InterfaceC11300zs1
    public zzhg b;
    @InterfaceC11300zs1
    public String c;
    public boolean f;
    public final zzha a = new zzha();
    public int d = 8000;
    public int e = 8000;

    public final zzgo b(boolean z) {
        this.f = true;
        return this;
    }

    public final zzgo c(int i) {
        this.d = i;
        return this;
    }

    public final zzgo d(int i) {
        this.e = i;
        return this;
    }

    public final zzgo e(@InterfaceC11300zs1 zzhg zzhgVar) {
        this.b = zzhgVar;
        return this;
    }

    public final zzgo f(@InterfaceC11300zs1 String str) {
        this.c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgf
    /* renamed from: g */
    public final zzgt a() {
        zzgt zzgtVar = new zzgt(this.c, this.d, this.e, this.f, false, this.a, null, false, null);
        zzhg zzhgVar = this.b;
        if (zzhgVar != null) {
            zzgtVar.b(zzhgVar);
        }
        return zzgtVar;
    }
}
