package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import o.C5459bz1;
import o.InterfaceC5056aJ2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdpt {
    public final zzfdl a;
    public final zzdpq b;

    public zzdpt(zzfdl zzfdlVar, zzdpq zzdpqVar) {
        this.a = zzfdlVar;
        this.b = zzdpqVar;
    }

    @InterfaceC5056aJ2
    public final zzbpl a() throws RemoteException {
        zzbpl b = this.a.b();
        if (b != null) {
            return b;
        }
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbrk b(String str) throws RemoteException {
        zzbrk Q = a().Q(str);
        this.b.d(str, Q);
        return Q;
    }

    public final zzfdn c(String str, JSONObject jSONObject) throws zzfcw {
        zzbpo I;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                I = new zzbqm(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                I = new zzbqm(new zzbsd());
            } else {
                zzbpl a = a();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString(C5459bz1.j);
                        if (a.u(string)) {
                            I = a.I("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else if (a.p0(string)) {
                            I = a.I(string);
                        } else {
                            I = a.I("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.e("Invalid custom event.", e);
                    }
                }
                I = a.I(str);
            }
            zzfdn zzfdnVar = new zzfdn(I);
            this.b.c(str, zzfdnVar);
            return zzfdnVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.G9)).booleanValue()) {
                this.b.c(str, null);
            }
            throw new zzfcw(th);
        }
    }

    public final boolean d() {
        if (this.a.b() != null) {
            return true;
        }
        return false;
    }
}
