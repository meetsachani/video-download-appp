package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdon implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;

    public zzdon(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* synthetic */ Object b() {
        int i = ((zzcvk) this.c).a().f280o.a;
        if (i != 0) {
            if (i - 1 != 0) {
                return ((zzein) this.b).b();
            }
            return ((zzein) this.a).b();
        }
        throw null;
    }
}
