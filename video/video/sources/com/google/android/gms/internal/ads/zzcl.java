package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.C6566gU0;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcl {
    public static final zzcl e = new zzcl(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public zzcl(int i, int i2, int i3) {
        int i4;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (zzeu.k(i3)) {
            i4 = zzeu.F(i3) * i2;
        } else {
            i4 = -1;
        }
        this.d = i4;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcl)) {
            return false;
        }
        zzcl zzclVar = (zzcl) obj;
        if (this.a == zzclVar.a && this.b == zzclVar.b && this.c == zzclVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.a + ", channelCount=" + this.b + ", encoding=" + this.c + C6566gU0.g;
    }
}
