package com.google.android.gms.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public abstract class AbstractAdRequestBuilder<T extends AbstractAdRequestBuilder<T>> {
    public final zzeg a;

    public AbstractAdRequestBuilder() {
        zzeg zzegVar = new zzeg();
        this.a = zzegVar;
        zzegVar.w(AdRequest.k);
    }

    @InterfaceC5670cr1
    @Deprecated
    public T a(@InterfaceC5670cr1 Class<? extends CustomEvent> cls, @InterfaceC5670cr1 Bundle bundle) {
        this.a.s(cls, bundle);
        return f();
    }

    @InterfaceC5670cr1
    public T b(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            zzo.g("Value " + str2 + " contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
        }
        this.a.t(str, str2);
        return f();
    }

    @InterfaceC5670cr1
    public T c(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 List<String> list) {
        if (list != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
                    zzo.g("Value " + str2 + " contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
                }
            }
            this.a.t(str, TextUtils.join(",", list));
        }
        return f();
    }

    @InterfaceC5670cr1
    public T d(@InterfaceC5670cr1 String str) {
        this.a.u(str);
        return f();
    }

    @InterfaceC5670cr1
    public T e(@InterfaceC5670cr1 Class<? extends MediationExtrasReceiver> cls, @InterfaceC5670cr1 Bundle bundle) {
        zzeg zzegVar = this.a;
        zzegVar.v(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            zzegVar.x(AdRequest.k);
        }
        return f();
    }

    @InterfaceC5670cr1
    public abstract T f();

    @InterfaceC5670cr1
    public T g(@InterfaceC5670cr1 String str) {
        this.a.y(str);
        return f();
    }

    @InterfaceC5670cr1
    public T h(@InterfaceC5670cr1 String str) {
        boolean z;
        Preconditions.s(str, "Content URL must be non-null.");
        Preconditions.m(str, "Content URL must be non-empty.");
        int length = str.length();
        Object[] objArr = {512, Integer.valueOf(str.length())};
        if (length <= 512) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.c(z, "Content URL must not exceed %d in length.  Provided length was %d.", objArr);
        this.a.z(str);
        return f();
    }

    @InterfaceC5670cr1
    public T i(int i) {
        this.a.A(i);
        return f();
    }

    @InterfaceC5670cr1
    public T j(@InterfaceC5670cr1 List<String> list) {
        if (list == null) {
            zzo.g("neighboring content URLs list should not be null");
            return f();
        }
        this.a.C(list);
        return f();
    }

    @InterfaceC5670cr1
    public T k(@InterfaceC5670cr1 String str) {
        this.a.b(str);
        return f();
    }

    @InterfaceC5670cr1
    @Deprecated
    public final AbstractAdRequestBuilder l(@InterfaceC5670cr1 String str) {
        this.a.w(str);
        return f();
    }

    @InterfaceC5670cr1
    @Deprecated
    public final AbstractAdRequestBuilder m(boolean z) {
        this.a.B(z);
        return f();
    }

    @InterfaceC5670cr1
    public final AbstractAdRequestBuilder n(@InterfaceC5670cr1 Bundle bundle) {
        this.a.D(bundle);
        return f();
    }

    @InterfaceC5670cr1
    @Deprecated
    public final AbstractAdRequestBuilder o(boolean z) {
        this.a.c(z);
        return f();
    }
}
