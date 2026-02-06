package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzagl implements zzau {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public zzagl(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static zzagl b(zzek zzekVar) {
        int A = zzekVar.A();
        String e = zzay.e(zzekVar.b(zzekVar.A(), StandardCharsets.US_ASCII));
        String b = zzekVar.b(zzekVar.A(), StandardCharsets.UTF_8);
        int A2 = zzekVar.A();
        int A3 = zzekVar.A();
        int A4 = zzekVar.A();
        int A5 = zzekVar.A();
        int A6 = zzekVar.A();
        byte[] bArr = new byte[A6];
        zzekVar.h(bArr, 0, A6);
        return new zzagl(A, e, b, A2, A3, A4, A5, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final void a(zzar zzarVar) {
        zzarVar.x(this.h, this.a);
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagl.class == obj.getClass()) {
            zzagl zzaglVar = (zzagl) obj;
            if (this.a == zzaglVar.a && this.b.equals(zzaglVar.b) && this.c.equals(zzaglVar.c) && this.d == zzaglVar.d && this.e == zzaglVar.e && this.f == zzaglVar.f && this.g == zzaglVar.g && Arrays.equals(this.h, zzaglVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + Arrays.hashCode(this.h);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
