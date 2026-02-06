package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbac {
    public final long a;
    public final String b;
    public final int c;

    public zzbac(long j, String str, int i) {
        this.a = j;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (obj != null && (obj instanceof zzbac)) {
            zzbac zzbacVar = (zzbac) obj;
            if (zzbacVar.a == this.a && zzbacVar.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.a;
    }
}
