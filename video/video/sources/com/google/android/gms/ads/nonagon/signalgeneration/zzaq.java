package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbeo;
import com.google.android.gms.internal.ads.zzbys;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzfhc;
import com.google.android.gms.internal.ads.zzfhn;
import com.google.android.gms.internal.ads.zzgcu;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.C9755tW1;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaq implements zzgcu {
    public final /* synthetic */ InterfaceFutureC8411o11 a;
    public final /* synthetic */ zzbyz b;
    public final /* synthetic */ zzbys c;
    public final /* synthetic */ zzfhc d;
    public final /* synthetic */ zzau e;

    public zzaq(zzau zzauVar, InterfaceFutureC8411o11 interfaceFutureC8411o11, zzbyz zzbyzVar, zzbys zzbysVar, zzfhc zzfhcVar) {
        this.a = interfaceFutureC8411o11;
        this.b = zzbyzVar;
        this.c = zzbysVar;
        this.d = zzfhcVar;
        this.e = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.W7)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.t().w(th, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzv.t().x(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfhn E8 = zzau.E8(this.a, this.b);
        if (((Boolean) zzbeo.e.e()).booleanValue() && E8 != null) {
            zzfhc zzfhcVar = this.d;
            zzfhcVar.f(th);
            zzfhcVar.c(false);
            E8.a(zzfhcVar);
            E8.h();
        }
        zzbys zzbysVar = this.c;
        if (zzbysVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            zzbysVar.I(message);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(@InterfaceC11300zs1 Object obj) {
        AtomicBoolean atomicBoolean;
        JSONObject jSONObject;
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        VersionInfoParcel versionInfoParcel;
        String str5;
        String str6;
        AtomicInteger atomicInteger;
        zzbk zzbkVar = (zzbk) obj;
        zzfhn E8 = zzau.E8(this.a, this.b);
        atomicBoolean = this.e.w1;
        atomicBoolean.set(true);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Q7)).booleanValue()) {
            try {
                zzbys zzbysVar = this.c;
                if (zzbysVar != null) {
                    zzbysVar.I("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e) {
                String concat = "QueryInfo generation has been disabled.".concat(e.toString());
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.d(concat);
            }
            if (((Boolean) zzbeo.e.e()).booleanValue() && E8 != null) {
                zzfhc zzfhcVar = this.d;
                zzfhcVar.Q("QueryInfo generation has been disabled.");
                zzfhcVar.c(false);
                E8.a(zzfhcVar);
                E8.h();
                return;
            }
            return;
        }
        try {
            try {
                if (zzbkVar == null) {
                    zzbys zzbysVar2 = this.c;
                    if (zzbysVar2 != null) {
                        zzbysVar2.h2(null, null, null);
                    }
                    zzfhc zzfhcVar2 = this.d;
                    zzfhcVar2.c(true);
                    if (((Boolean) zzbeo.e.e()).booleanValue() && E8 != null) {
                        E8.a(zzfhcVar2);
                        E8.h();
                        return;
                    }
                    return;
                }
                try {
                    if (!TextUtils.isEmpty(zzbkVar.c)) {
                        jSONObject = new JSONObject(zzbkVar.c);
                    } else {
                        jSONObject = new JSONObject(zzbkVar.b);
                    }
                    if (TextUtils.isEmpty(jSONObject.optString(C9755tW1.f875o, ""))) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.g("The request ID is empty in request JSON.");
                        zzbys zzbysVar3 = this.c;
                        if (zzbysVar3 != null) {
                            zzbysVar3.I("Internal error: request ID is empty in request JSON.");
                        }
                        zzfhc zzfhcVar3 = this.d;
                        zzfhcVar3.Q("Request ID empty");
                        zzfhcVar3.c(false);
                        if (((Boolean) zzbeo.e.e()).booleanValue() && E8 != null) {
                            E8.a(zzfhcVar3);
                            E8.h();
                            return;
                        }
                        return;
                    }
                    Bundle bundle = zzbkVar.f;
                    zzau zzauVar = this.e;
                    z = zzauVar.k1;
                    if (z && bundle != null) {
                        str5 = zzauVar.m1;
                        if (bundle.getInt(str5, -1) == -1) {
                            str6 = zzauVar.m1;
                            atomicInteger = zzauVar.n1;
                            bundle.putInt(str6, atomicInteger.get());
                        }
                    }
                    z2 = zzauVar.j1;
                    if (z2 && bundle != null) {
                        str = zzauVar.l1;
                        if (TextUtils.isEmpty(bundle.getString(str))) {
                            str2 = zzauVar.p1;
                            if (TextUtils.isEmpty(str2)) {
                                com.google.android.gms.ads.internal.util.zzs v = com.google.android.gms.ads.internal.zzv.v();
                                context = zzauVar.Y;
                                versionInfoParcel = zzauVar.o1;
                                zzauVar.p1 = v.I(context, versionInfoParcel.X);
                            }
                            str3 = zzauVar.l1;
                            str4 = zzauVar.p1;
                            bundle.putString(str3, str4);
                        }
                    }
                    zzbys zzbysVar4 = this.c;
                    if (zzbysVar4 != null) {
                        if (!TextUtils.isEmpty(zzbkVar.c)) {
                            zzbysVar4.h2(zzbkVar.a, zzbkVar.c, bundle);
                        } else {
                            zzbysVar4.h2(zzbkVar.a, zzbkVar.b, bundle);
                        }
                    }
                    this.d.c(true);
                    if (((Boolean) zzbeo.e.e()).booleanValue() && E8 != null) {
                        E8.a(this.d);
                        E8.h();
                    }
                } catch (JSONException e2) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.g("Failed to create JSON object from the request string.");
                    zzbys zzbysVar5 = this.c;
                    if (zzbysVar5 != null) {
                        String obj2 = e2.toString();
                        zzbysVar5.I("Internal error for request JSON: " + obj2);
                    }
                    zzfhc zzfhcVar4 = this.d;
                    zzfhcVar4.f(e2);
                    zzfhcVar4.c(false);
                    com.google.android.gms.ads.internal.zzv.t().x(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (((Boolean) zzbeo.e.e()).booleanValue() && E8 != null) {
                        E8.a(zzfhcVar4);
                        E8.h();
                    }
                }
            } catch (RemoteException e3) {
                zzfhc zzfhcVar5 = this.d;
                zzfhcVar5.f(e3);
                zzfhcVar5.c(false);
                int i4 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("", e3);
                com.google.android.gms.ads.internal.zzv.t().x(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (((Boolean) zzbeo.e.e()).booleanValue() && E8 != null) {
                    E8.a(this.d);
                    E8.h();
                }
            }
        } catch (Throwable th) {
            if (((Boolean) zzbeo.e.e()).booleanValue() && E8 != null) {
                E8.a(this.d);
                E8.h();
            }
            throw th;
        }
    }
}
