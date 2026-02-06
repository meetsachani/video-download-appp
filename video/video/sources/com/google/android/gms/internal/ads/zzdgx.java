package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdgx implements zzhfv {
    public final zzhge a;

    public zzdgx(zzhge zzhgeVar) {
        this.a = zzhgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        Set set;
        if (((zzdgu) this.a).a().e() != null) {
            set = Collections.singleton("banner");
        } else {
            set = Collections.EMPTY_SET;
        }
        zzhgd.b(set);
        return set;
    }
}
