package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzn {
    public Bundle a = new Bundle();
    public List b = new ArrayList();
    public boolean c = false;
    public int d = -1;
    public final Bundle e = new Bundle();
    public final Bundle f = new Bundle();
    public final List g = new ArrayList();
    public int h = -1;
    public String i = null;
    public final List j = new ArrayList();
    public int k = 60000;
    public final int l = RequestConfiguration.PublisherPrivacyPersonalizationState.DEFAULT.e();
    public long m = 0;

    public final zzm a() {
        Bundle bundle = this.e;
        Bundle bundle2 = this.a;
        Bundle bundle3 = this.f;
        return new zzm(8, -1L, bundle2, -1, this.b, this.c, this.d, false, null, null, null, null, bundle, bundle3, this.g, null, null, false, null, this.h, this.i, this.j, this.k, null, this.l, this.m);
    }

    public final zzn b(Bundle bundle) {
        this.a = bundle;
        return this;
    }

    public final zzn c(int i) {
        this.k = i;
        return this;
    }

    public final zzn d(boolean z) {
        this.c = z;
        return this;
    }

    public final zzn e(List list) {
        this.b = list;
        return this;
    }

    public final zzn f(String str) {
        this.i = str;
        return this;
    }

    public final zzn g(long j) {
        this.m = j;
        return this;
    }

    public final zzn h(int i) {
        this.d = i;
        return this;
    }

    public final zzn i(int i) {
        this.h = i;
        return this;
    }
}
