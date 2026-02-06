package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcnr implements zzhfv {
    public final zzhge a;
    public final zzhge b;

    public zzcnr(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3) {
        this.a = zzhgeVar;
        this.b = zzhgeVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        Set singleton;
        zzcnk zzcnkVar = (zzcnk) this.a.b();
        zzgdj c = zzffn.c();
        if (((JSONObject) this.b.b()) == null) {
            singleton = Collections.EMPTY_SET;
        } else {
            singleton = Collections.singleton(new zzddq(zzcnkVar, c));
        }
        zzhgd.b(singleton);
        return singleton;
    }
}
