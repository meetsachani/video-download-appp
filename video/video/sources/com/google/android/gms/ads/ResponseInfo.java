package com.google.android.gms.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ResponseInfo {
    @InterfaceC11300zs1
    public final zzdx a;
    public final List b = new ArrayList();
    @InterfaceC11300zs1
    public AdapterResponseInfo c;

    public ResponseInfo(@InterfaceC11300zs1 zzdx zzdxVar) {
        this.a = zzdxVar;
        if (zzdxVar != null) {
            try {
                List<zzv> j = zzdxVar.j();
                if (j != null) {
                    for (zzv zzvVar : j) {
                        AdapterResponseInfo i = AdapterResponseInfo.i(zzvVar);
                        if (i != null) {
                            this.b.add(i);
                        }
                    }
                }
            } catch (RemoteException e) {
                zzo.e("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        zzdx zzdxVar2 = this.a;
        if (zzdxVar2 != null) {
            try {
                zzv e2 = zzdxVar2.e();
                if (e2 != null) {
                    this.c = AdapterResponseInfo.i(e2);
                }
            } catch (RemoteException e3) {
                zzo.e("Could not forward getLoadedAdapterResponse to ResponseInfo.", e3);
            }
        }
    }

    @InterfaceC11300zs1
    public static ResponseInfo f(@InterfaceC11300zs1 zzdx zzdxVar) {
        if (zzdxVar != null) {
            return new ResponseInfo(zzdxVar);
        }
        return null;
    }

    @InterfaceC5670cr1
    public static ResponseInfo g(@InterfaceC11300zs1 zzdx zzdxVar) {
        return new ResponseInfo(zzdxVar);
    }

    @InterfaceC5670cr1
    public List<AdapterResponseInfo> a() {
        return this.b;
    }

    @InterfaceC11300zs1
    public AdapterResponseInfo b() {
        return this.c;
    }

    @InterfaceC11300zs1
    public String c() {
        try {
            zzdx zzdxVar = this.a;
            if (zzdxVar != null) {
                return zzdxVar.g();
            }
            return null;
        } catch (RemoteException e) {
            zzo.e("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    @InterfaceC5670cr1
    public Bundle d() {
        try {
            zzdx zzdxVar = this.a;
            if (zzdxVar != null) {
                return zzdxVar.d();
            }
        } catch (RemoteException e) {
            zzo.e("Could not forward getResponseExtras to ResponseInfo.", e);
        }
        return new Bundle();
    }

    @InterfaceC11300zs1
    public String e() {
        try {
            zzdx zzdxVar = this.a;
            if (zzdxVar != null) {
                return zzdxVar.i();
            }
            return null;
        } catch (RemoteException e) {
            zzo.e("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public final zzdx h() {
        return this.a;
    }

    @InterfaceC5670cr1
    public final JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String e = e();
        if (e == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", e);
        }
        String c = c();
        if (c == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", c);
        }
        JSONArray jSONArray = new JSONArray();
        for (AdapterResponseInfo adapterResponseInfo : this.b) {
            jSONArray.put(adapterResponseInfo.j());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        AdapterResponseInfo adapterResponseInfo2 = this.c;
        if (adapterResponseInfo2 != null) {
            jSONObject.put("Loaded Adapter Response", adapterResponseInfo2.j());
        }
        Bundle d = d();
        if (d != null) {
            jSONObject.put("Response Extras", zzbb.b().o(d));
        }
        return jSONObject;
    }

    @InterfaceC5670cr1
    public String toString() {
        try {
            return i().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
