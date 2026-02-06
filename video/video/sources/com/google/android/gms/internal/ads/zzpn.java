package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzpn {
    public static final zzpn d = new zzpl().d();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ zzpn(zzpl zzplVar, zzpm zzpmVar) {
        boolean z;
        boolean z2;
        boolean z3;
        z = zzplVar.a;
        this.a = z;
        z2 = zzplVar.b;
        this.b = z2;
        z3 = zzplVar.c;
        this.c = z3;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzpn.class == obj.getClass()) {
            zzpn zzpnVar = (zzpn) obj;
            if (this.a == zzpnVar.a && this.b == zzpnVar.b && this.c == zzpnVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.a;
        boolean z2 = this.b;
        return ((z ? 1 : 0) << 2) + (z2 ? 1 : 0) + (z2 ? 1 : 0) + (this.c ? 1 : 0);
    }
}
