package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhap implements zzhaa {
    public final zzhad a;
    public final String b;
    public final Object[] c;
    public final int d;

    public zzhap(zzhad zzhadVar, String str, Object[] objArr) {
        this.a = zzhadVar;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            } else {
                this.d = i | (charAt2 << i3);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaa
    public final zzhad a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhaa
    public final boolean b() {
        return (this.d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.zzhaa
    public final int c() {
        int i = this.d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    public final String d() {
        return this.b;
    }

    public final Object[] e() {
        return this.c;
    }
}
