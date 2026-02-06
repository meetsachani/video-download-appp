package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzel {
    public static final zzel c = new zzel(-1, -1);
    public final int a;
    public final int b;

    static {
        new zzel(0, 0);
    }

    public zzel(int i, int i2) {
        boolean z = false;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        }
        zzdc.d(z);
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzel) {
            zzel zzelVar = (zzel) obj;
            if (this.a == zzelVar.a && this.b == zzelVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return ((i >>> 16) | (i << 16)) ^ this.b;
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
