package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.facebook.internal.C2378x;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzejq extends zzbrm {
    public final String X;
    public final zzbrk Y;
    public final JSONObject Y0;
    public final zzcaf Z;
    public final long Z0;
    public boolean a1;

    public zzejq(String str, zzbrk zzbrkVar, zzcaf zzcafVar, long j) {
        JSONObject jSONObject = new JSONObject();
        this.Y0 = jSONObject;
        this.a1 = false;
        this.Z = zzcafVar;
        this.X = str;
        this.Y = zzbrkVar;
        this.Z0 = j;
        try {
            jSONObject.put("adapter_version", zzbrkVar.e().toString());
            jSONObject.put(C2378x.k, zzbrkVar.g().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void W7(String str, zzcaf zzcafVar) {
        synchronized (zzejq.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", str);
                    jSONObject.put("signal_error", "Adapter failed to instantiate");
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.M1)).booleanValue()) {
                        jSONObject.put("signal_error_code", 1);
                    }
                    zzcafVar.c(jSONObject);
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final synchronized void D1(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        X7(zzeVar.Y, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final synchronized void S(String str) throws RemoteException {
        X7(str, 2);
    }

    public final synchronized void X7(String str, int i) {
        try {
            if (this.a1) {
                return;
            }
            try {
                JSONObject jSONObject = this.Y0;
                jSONObject.put("signal_error", str);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.N1)).booleanValue()) {
                    jSONObject.put("latency", com.google.android.gms.ads.internal.zzv.d().b() - this.Z0);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.M1)).booleanValue()) {
                    jSONObject.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.Z.c(this.Y0);
            this.a1 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        X7("Signal collection timeout.", 3);
    }

    public final synchronized void f() {
        if (this.a1) {
            return;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.M1)).booleanValue()) {
                this.Y0.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.Z.c(this.Y0);
        this.a1 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final synchronized void u(String str) throws RemoteException {
        if (this.a1) {
            return;
        }
        if (str == null) {
            S("Adapter returned null signals");
            return;
        }
        try {
            JSONObject jSONObject = this.Y0;
            jSONObject.put("signals", str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.N1)).booleanValue()) {
                jSONObject.put("latency", com.google.android.gms.ads.internal.zzv.d().b() - this.Z0);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.M1)).booleanValue()) {
                jSONObject.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.Z.c(this.Y0);
        this.a1 = true;
    }
}
