package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfcn {
    public com.google.android.gms.ads.internal.client.zzm a;
    public com.google.android.gms.ads.internal.client.zzr b;
    public String c;
    @InterfaceC11300zs1
    public com.google.android.gms.ads.internal.client.zzfw d;
    public boolean e;
    public ArrayList f;
    public ArrayList g;
    @InterfaceC11300zs1
    public zzbfv h;
    public com.google.android.gms.ads.internal.client.zzx i;
    public AdManagerAdViewOptions j;
    public PublisherAdViewOptions k;
    @InterfaceC11300zs1
    public com.google.android.gms.ads.internal.client.zzcl l;
    @InterfaceC11300zs1
    public zzbmg n;
    @InterfaceC11300zs1
    public zzekr r;
    public Bundle t;
    @InterfaceC11300zs1
    public com.google.android.gms.ads.internal.client.zzcp u;
    public int m = 1;

    /* renamed from: o */
    public final zzfca f279o = new zzfca();
    public boolean p = false;
    public boolean q = false;
    public boolean s = false;

    public final com.google.android.gms.ads.internal.client.zzm B() {
        return this.a;
    }

    public final com.google.android.gms.ads.internal.client.zzr D() {
        return this.b;
    }

    public final zzfca L() {
        return this.f279o;
    }

    public final zzfcn M(zzfcp zzfcpVar) {
        this.f279o.a(zzfcpVar.f280o.a);
        this.a = zzfcpVar.d;
        this.b = zzfcpVar.e;
        this.u = zzfcpVar.t;
        this.c = zzfcpVar.f;
        this.d = zzfcpVar.a;
        this.f = zzfcpVar.g;
        this.g = zzfcpVar.h;
        this.h = zzfcpVar.i;
        this.i = zzfcpVar.j;
        N(zzfcpVar.l);
        g(zzfcpVar.m);
        this.p = zzfcpVar.p;
        this.q = zzfcpVar.q;
        this.r = zzfcpVar.c;
        this.s = zzfcpVar.r;
        this.t = zzfcpVar.s;
        return this;
    }

    public final zzfcn N(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.e = adManagerAdViewOptions.m0();
        }
        return this;
    }

    public final zzfcn O(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.b = zzrVar;
        return this;
    }

    public final zzfcn P(String str) {
        this.c = str;
        return this;
    }

    public final zzfcn Q(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.i = zzxVar;
        return this;
    }

    public final zzfcn R(@InterfaceC11300zs1 zzekr zzekrVar) {
        this.r = zzekrVar;
        return this;
    }

    public final zzfcn S(@InterfaceC11300zs1 zzbmg zzbmgVar) {
        this.n = zzbmgVar;
        this.d = new com.google.android.gms.ads.internal.client.zzfw(false, true, false);
        return this;
    }

    public final zzfcn T(boolean z) {
        this.p = z;
        return this;
    }

    public final zzfcn U(boolean z) {
        this.q = z;
        return this;
    }

    public final zzfcn V(boolean z) {
        this.s = true;
        return this;
    }

    public final zzfcn a(Bundle bundle) {
        this.t = bundle;
        return this;
    }

    public final zzfcn b(boolean z) {
        this.e = z;
        return this;
    }

    public final zzfcn c(int i) {
        this.m = i;
        return this;
    }

    public final zzfcn d(@InterfaceC11300zs1 zzbfv zzbfvVar) {
        this.h = zzbfvVar;
        return this;
    }

    public final zzfcn e(ArrayList arrayList) {
        this.f = arrayList;
        return this;
    }

    public final zzfcn f(ArrayList arrayList) {
        this.g = arrayList;
        return this;
    }

    public final zzfcn g(PublisherAdViewOptions publisherAdViewOptions) {
        this.k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.e = publisherAdViewOptions.B0();
            this.l = publisherAdViewOptions.m0();
        }
        return this;
    }

    public final zzfcn h(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.a = zzmVar;
        return this;
    }

    public final zzfcn i(@InterfaceC11300zs1 com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        this.d = zzfwVar;
        return this;
    }

    public final zzfcp j() {
        Preconditions.s(this.c, "ad unit must not be null");
        Preconditions.s(this.b, "ad size must not be null");
        Preconditions.s(this.a, "ad request must not be null");
        return new zzfcp(this, null);
    }

    public final String l() {
        return this.c;
    }

    public final boolean s() {
        return this.p;
    }

    public final boolean t() {
        return this.q;
    }

    public final zzfcn v(@InterfaceC11300zs1 com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        this.u = zzcpVar;
        return this;
    }
}
