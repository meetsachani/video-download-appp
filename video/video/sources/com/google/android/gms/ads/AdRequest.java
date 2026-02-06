package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.List;
import java.util.Set;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class AdRequest {
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 8;
    public static final int g = 10;
    public static final int h = 11;
    public static final int i = 9;
    public static final int j = 512;
    @InterfaceC5670cr1
    public static final String k = "B3EEABB8EE11C2BE770B684D95219ECB";
    public final zzeh a;

    /* loaded from: classes2.dex */
    public static class Builder extends AbstractAdRequestBuilder<Builder> {
        @InterfaceC5670cr1
        public AdRequest p() {
            return new AdRequest(this);
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        @InterfaceC5670cr1
        /* renamed from: q */
        public Builder f() {
            return this;
        }
    }

    public AdRequest(@InterfaceC5670cr1 AbstractAdRequestBuilder abstractAdRequestBuilder) {
        this.a = new zzeh(abstractAdRequestBuilder.a, null);
    }

    @InterfaceC11300zs1
    public String a() {
        return this.a.h();
    }

    @InterfaceC5670cr1
    public String b() {
        return this.a.i();
    }

    @InterfaceC11300zs1
    @Deprecated
    public <T extends CustomEvent> Bundle c(@InterfaceC5670cr1 Class<T> cls) {
        return this.a.d(cls);
    }

    @InterfaceC5670cr1
    public Bundle d() {
        return this.a.e();
    }

    @InterfaceC5670cr1
    public Set<String> e() {
        return this.a.n();
    }

    @InterfaceC5670cr1
    public List<String> f() {
        return this.a.l();
    }

    @InterfaceC11300zs1
    public <T extends MediationExtrasReceiver> Bundle g(@InterfaceC5670cr1 Class<T> cls) {
        return this.a.f(cls);
    }

    @InterfaceC5670cr1
    public String h() {
        return this.a.k();
    }

    public boolean i(@InterfaceC5670cr1 Context context) {
        return this.a.q(context);
    }

    public final zzeh j() {
        return this.a;
    }
}
