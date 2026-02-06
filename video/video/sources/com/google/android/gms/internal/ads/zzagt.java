package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import o.InterfaceC11300zs1;
import o.SC0;

/* loaded from: classes2.dex */
public final class zzagt extends zzagx {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public zzagt(String str, String str2, String str3, byte[] bArr) {
        super(SC0.a1);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagt.class == obj.getClass()) {
            zzagt zzagtVar = (zzagt) obj;
            if (Objects.equals(this.b, zzagtVar.b) && Objects.equals(this.c, zzagtVar.c) && Objects.equals(this.d, zzagtVar.d) && Arrays.equals(this.e, zzagtVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((((((i + 527) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Arrays.hashCode(this.e);
    }

    @Override // com.google.android.gms.internal.ads.zzagx
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
