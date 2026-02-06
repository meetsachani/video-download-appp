package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C9500sT;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbdx extends C9500sT {
    public final AtomicBoolean n = new AtomicBoolean(false);

    /* renamed from: o  reason: collision with root package name */
    public final List f224o = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ia)).split(","));
    public final zzbea p;
    @InterfaceC11300zs1
    public final C9500sT q;
    public final zzdsi r;

    public zzbdx(@InterfaceC5670cr1 zzbea zzbeaVar, @InterfaceC11300zs1 C9500sT c9500sT, zzdsi zzdsiVar) {
        this.q = c9500sT;
        this.p = zzbeaVar;
        this.r = zzdsiVar;
    }

    @Override // o.C9500sT
    public final void a(String str, @InterfaceC11300zs1 Bundle bundle) {
        C9500sT c9500sT = this.q;
        if (c9500sT != null) {
            c9500sT.a(str, bundle);
        }
    }

    @Override // o.C9500sT
    @InterfaceC11300zs1
    public final Bundle b(String str, @InterfaceC11300zs1 Bundle bundle) {
        C9500sT c9500sT = this.q;
        if (c9500sT != null) {
            return c9500sT.b(str, bundle);
        }
        return null;
    }

    @Override // o.C9500sT
    public final void d(int i, int i2, Bundle bundle) {
        C9500sT c9500sT = this.q;
        if (c9500sT != null) {
            c9500sT.d(i, i2, bundle);
        }
    }

    @Override // o.C9500sT
    public final void e(@InterfaceC11300zs1 Bundle bundle) {
        this.n.set(false);
        C9500sT c9500sT = this.q;
        if (c9500sT != null) {
            c9500sT.e(bundle);
        }
    }

    @Override // o.C9500sT
    public final void g(int i, @InterfaceC11300zs1 Bundle bundle) {
        this.n.set(false);
        C9500sT c9500sT = this.q;
        if (c9500sT != null) {
            c9500sT.g(i, bundle);
        }
        zzbea zzbeaVar = this.p;
        zzbeaVar.i(com.google.android.gms.ads.internal.zzv.d().a());
        List list = this.f224o;
        if (list != null && list.contains(String.valueOf(i))) {
            zzbeaVar.f();
            m("pact_reqpmc");
        }
    }

    @Override // o.C9500sT
    public final void h(String str, @InterfaceC11300zs1 Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.n.set(true);
                m("pact_con");
                this.p.h(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.l("Message is not in JSON format: ", e);
        }
        C9500sT c9500sT = this.q;
        if (c9500sT != null) {
            c9500sT.h(str, bundle);
        }
    }

    @Override // o.C9500sT
    public final void i(int i, Uri uri, boolean z, @InterfaceC11300zs1 Bundle bundle) {
        C9500sT c9500sT = this.q;
        if (c9500sT != null) {
            c9500sT.i(i, uri, z, bundle);
        }
    }

    public final Boolean l() {
        return Boolean.valueOf(this.n.get());
    }

    public final void m(String str) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzaa.d(this.r, null, "pact_action", new Pair("pe", str));
    }
}
