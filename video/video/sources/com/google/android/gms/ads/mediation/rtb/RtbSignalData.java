package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class RtbSignalData {
    public final Context a;
    public final List b;
    public final Bundle c;
    @InterfaceC11300zs1
    public final AdSize d;

    public RtbSignalData(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 List<MediationConfiguration> list, @InterfaceC5670cr1 Bundle bundle, @InterfaceC11300zs1 AdSize adSize) {
        this.a = context;
        this.b = list;
        this.c = bundle;
        this.d = adSize;
    }

    @InterfaceC11300zs1
    public AdSize a() {
        return this.d;
    }

    @InterfaceC11300zs1
    @Deprecated
    public MediationConfiguration b() {
        List list = this.b;
        if (list != null && list.size() > 0) {
            return (MediationConfiguration) list.get(0);
        }
        return null;
    }

    @InterfaceC5670cr1
    public List<MediationConfiguration> c() {
        return this.b;
    }

    @InterfaceC5670cr1
    public Context d() {
        return this.a;
    }

    @InterfaceC5670cr1
    public Bundle e() {
        return this.c;
    }
}
