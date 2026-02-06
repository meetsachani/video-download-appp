package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.firebase.messaging.GmsRpc;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzetg implements zzetu {
    @InterfaceC11300zs1
    public final String a;
    @InterfaceC11300zs1
    public final String b;
    @InterfaceC11300zs1
    public final String c;
    @InterfaceC11300zs1
    public final String d;
    @InterfaceC11300zs1
    public final Long e;

    public zzetg(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String str3, @InterfaceC11300zs1 String str4, @InterfaceC11300zs1 Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        zzfdd.c(((zzcuv) obj).b, "fbs_aeid", this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((zzcuv) obj).a;
        zzfdd.c(bundle, GmsRpc.A, this.a);
        zzfdd.c(bundle, "fbs_aiid", this.b);
        zzfdd.c(bundle, "fbs_aeid", this.c);
        zzfdd.c(bundle, "apm_id_origin", this.d);
        Long l = this.e;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
