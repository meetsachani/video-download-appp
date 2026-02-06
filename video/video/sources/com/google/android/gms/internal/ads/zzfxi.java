package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzfxi extends zzfww {
    public final Object X;
    public int Y;
    public final /* synthetic */ zzfxl Z;

    public zzfxi(zzfxl zzfxlVar, int i) {
        this.Z = zzfxlVar;
        this.X = zzfxl.k(zzfxlVar, i);
        this.Y = i;
    }

    public final void a() {
        int D;
        int i = this.Y;
        if (i != -1) {
            zzfxl zzfxlVar = this.Z;
            if (i < zzfxlVar.size() && zzfuz.a(this.X, zzfxl.k(zzfxlVar, this.Y))) {
                return;
            }
        }
        D = this.Z.D(this.X);
        this.Y = D;
    }

    @Override // com.google.android.gms.internal.ads.zzfww, java.util.Map.Entry
    public final Object getKey() {
        return this.X;
    }

    @Override // com.google.android.gms.internal.ads.zzfww, java.util.Map.Entry
    public final Object getValue() {
        zzfxl zzfxlVar = this.Z;
        Map r = zzfxlVar.r();
        if (r != null) {
            return r.get(this.X);
        }
        a();
        int i = this.Y;
        if (i == -1) {
            return null;
        }
        return zzfxl.n(zzfxlVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfww, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzfxl zzfxlVar = this.Z;
        Map r = zzfxlVar.r();
        if (r != null) {
            return r.put(this.X, obj);
        }
        a();
        int i = this.Y;
        if (i == -1) {
            zzfxlVar.put(this.X, obj);
            return null;
        }
        Object n = zzfxl.n(zzfxlVar, i);
        zzfxl.u(zzfxlVar, this.Y, obj);
        return n;
    }
}
