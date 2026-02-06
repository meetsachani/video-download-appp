package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkz implements zzkh {
    public final zzkj a;
    public final String b;
    public final Object[] c;
    public final int d;

    public zzkz(zzkj zzkjVar, String str, Object[] objArr) {
        this.a = zzkjVar;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.d = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    public final zzkj a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    public final zzky b() {
        int i = this.d;
        if ((i & 1) != 0) {
            return zzky.PROTO2;
        }
        if ((i & 4) == 4) {
            return zzky.EDITIONS;
        }
        return zzky.PROTO3;
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    public final boolean c() {
        if ((this.d & 2) == 2) {
            return true;
        }
        return false;
    }

    public final String d() {
        return this.b;
    }

    public final Object[] e() {
        return this.c;
    }
}
