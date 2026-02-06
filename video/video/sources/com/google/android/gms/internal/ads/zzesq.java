package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzesq implements zzetu {
    public zzfrp a;
    public zzfrp b;
    public boolean c;
    public boolean d;
    public final boolean e = false;
    public final boolean f;

    public zzesq(zzfrp zzfrpVar, zzfrp zzfrpVar2, boolean z, boolean z2, boolean z3) {
        this.a = zzfrpVar;
        this.b = zzfrpVar2;
        this.c = z;
        this.d = z2;
        this.f = z3;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.q3)).booleanValue() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r6.a.c() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        r1.putString("paidv1_id_android", r6.a.b());
        r1.putLong("paidv1_creation_time_android", r6.a.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.p3)).booleanValue() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.r3)).booleanValue() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        if (r6.b.c() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
        r1.putString("paidv2_id_android", r6.b.b());
        r1.putLong("paidv2_creation_time_android", r6.b.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
        r1.putBoolean("paidv2_pub_option_android", r6.c);
        r1.putBoolean("paidv2_user_option_android", r6.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.o3)).booleanValue() == false) goto L26;
     */
    @Override // com.google.android.gms.internal.ads.zzetu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((zzcuv) obj).a;
        if (!this.e) {
            Bundle a = zzfdd.a(bundle, "pii");
            boolean z = this.f;
            if (!z) {
            }
            if (z) {
            }
            if (!z) {
            }
            if (z) {
            }
            if (!a.isEmpty()) {
                bundle.putBundle("pii", a);
            }
        }
    }

    public zzesq(boolean z) {
        this.f = z;
    }
}
