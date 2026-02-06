package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzib {
    public final String a;
    public final zzz b;
    public final zzz c;
    public final int d;
    public final int e;

    public zzib(String str, zzz zzzVar, zzz zzzVar2, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        zzdc.d(z);
        zzdc.c(str);
        this.a = str;
        this.b = zzzVar;
        zzzVar2.getClass();
        this.c = zzzVar2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzib.class == obj.getClass()) {
            zzib zzibVar = (zzib) obj;
            if (this.d == zzibVar.d && this.e == zzibVar.e && this.a.equals(zzibVar.a) && this.b.equals(zzibVar.b) && this.c.equals(zzibVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.d + 527) * 31) + this.e) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
