package com.google.android.gms.internal.ads;

import android.os.Bundle;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzesj implements zzetu {
    @InterfaceC11300zs1
    public final String a;
    @InterfaceC11300zs1
    public final Integer b;
    @InterfaceC11300zs1
    public final String c;
    @InterfaceC11300zs1
    public final String d;
    @InterfaceC11300zs1
    public final String e;
    @InterfaceC11300zs1
    public final String f;

    public zzesj(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 Integer num, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String str3, @InterfaceC11300zs1 String str4, @InterfaceC11300zs1 String str5) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = ((zzcuv) obj).b;
        zzfdd.c(bundle, "pn", this.a);
        zzfdd.c(bundle, "dl", this.d);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((zzcuv) obj).a;
        zzfdd.c(bundle, "pn", this.a);
        Integer num = this.b;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        zzfdd.c(bundle, "vnm", this.c);
        zzfdd.c(bundle, "dl", this.d);
        zzfdd.c(bundle, "ins_pn", this.e);
        zzfdd.c(bundle, "ini_pn", this.f);
    }
}
