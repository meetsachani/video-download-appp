package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import o.C4128Rj1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzagj implements zzau {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        zzx zzxVar = new zzx();
        zzxVar.E(C4128Rj1.w0);
        zzxVar.K();
        zzx zzxVar2 = new zzx();
        zzxVar2.E(C4128Rj1.H0);
        zzxVar2.K();
    }

    public zzagj(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void a(zzar zzarVar) {
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagj.class == obj.getClass()) {
            zzagj zzagjVar = (zzagj) obj;
            if (this.c == zzagjVar.c && this.d == zzagjVar.d && Objects.equals(this.a, zzagjVar.a) && Objects.equals(this.b, zzagjVar.b) && Arrays.equals(this.e, zzagjVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f;
        if (i == 0) {
            int hashCode = ((this.a.hashCode() + 527) * 31) + this.b.hashCode();
            long j = this.c;
            int hashCode2 = (((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) this.d)) * 31) + Arrays.hashCode(this.e);
            this.f = hashCode2;
            return hashCode2;
        }
        return i;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }
}
