package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzapc;
import com.google.android.gms.internal.ads.zzapy;
import com.google.android.gms.internal.ads.zzapz;
import com.google.android.gms.internal.ads.zzaqz;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbj extends zzaqz {
    public final /* synthetic */ byte[] j1;
    public final /* synthetic */ Map k1;
    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl l1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbj(zzbo zzboVar, int i, String str, zzapz zzapzVar, zzapy zzapyVar, byte[] bArr, Map map, com.google.android.gms.ads.internal.util.client.zzl zzlVar) {
        super(i, str, zzapzVar, zzapyVar);
        this.j1 = bArr;
        this.k1 = map;
        this.l1 = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final byte[] C() throws zzapc {
        byte[] bArr = this.j1;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaqz
    public final void E(String str) {
        this.l1.g(str);
        super.t(str);
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final Map q() throws zzapc {
        Map map = this.k1;
        if (map == null) {
            return Collections.EMPTY_MAP;
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzaqz, com.google.android.gms.internal.ads.zzapu
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        t((String) obj);
    }
}
