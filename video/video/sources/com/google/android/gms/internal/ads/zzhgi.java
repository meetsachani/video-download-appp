package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhgi implements zzhge {
    public static final Object c = new Object();
    public volatile zzhge a;
    public volatile Object b = c;

    public zzhgi(zzhge zzhgeVar) {
        this.a = zzhgeVar;
    }

    public static zzhge a(zzhge zzhgeVar) {
        if (!(zzhgeVar instanceof zzhgi)) {
            if (zzhgeVar instanceof zzhfu) {
                return zzhgeVar;
            }
            return new zzhgi(zzhgeVar);
        }
        return zzhgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final Object b() {
        Object obj = this.b;
        if (obj == c) {
            zzhge zzhgeVar = this.a;
            if (zzhgeVar == null) {
                return this.b;
            }
            Object b = zzhgeVar.b();
            this.b = b;
            this.a = null;
            return b;
        }
        return obj;
    }
}
