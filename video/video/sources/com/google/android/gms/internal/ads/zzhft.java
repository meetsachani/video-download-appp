package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhft implements zzhfv {
    public zzhge a;

    public static void a(zzhge zzhgeVar, zzhge zzhgeVar2) {
        zzhft zzhftVar = (zzhft) zzhgeVar;
        if (zzhftVar.a == null) {
            zzhftVar.a = zzhgeVar2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final Object b() {
        zzhge zzhgeVar = this.a;
        if (zzhgeVar != null) {
            return zzhgeVar.b();
        }
        throw new IllegalStateException();
    }
}
