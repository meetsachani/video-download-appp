package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import o.C5459bz1;
import o.InterfaceC11300zs1;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzcvm extends com.google.android.gms.ads.internal.client.zzdw {
    public final String X;
    @InterfaceC11300zs1
    public final String Y;
    @InterfaceC11300zs1
    public final String Y0;
    public final String Z;
    public final List Z0;
    public final long a1;
    public final String b1;
    @InterfaceC11300zs1
    public final zzedk c1;
    public final Bundle d1;
    public final double e1;

    public zzcvm(@InterfaceC11300zs1 zzfbu zzfbuVar, String str, zzedk zzedkVar, @InterfaceC11300zs1 zzfbx zzfbxVar, String str2) {
        String str3;
        String str4;
        double d;
        String str5;
        String str6 = null;
        if (zzfbuVar == null) {
            str3 = null;
        } else {
            str3 = zzfbuVar.b0;
        }
        this.Y = str3;
        this.Z = str2;
        if (zzfbxVar == null) {
            str4 = null;
        } else {
            str4 = zzfbxVar.b;
        }
        this.Y0 = str4;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzfbuVar != null) {
            try {
                str6 = zzfbuVar.v.getString(C5459bz1.j);
            } catch (JSONException unused) {
            }
        }
        this.X = str6 != null ? str6 : str;
        this.Z0 = zzedkVar.c();
        this.c1 = zzedkVar;
        if (zzfbuVar == null) {
            d = 0.0d;
        } else {
            d = zzfbuVar.z0;
        }
        this.e1 = d;
        this.a1 = com.google.android.gms.ads.internal.zzv.d().a() / 1000;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.V6)).booleanValue() && zzfbxVar != null) {
            this.d1 = zzfbxVar.k;
        } else {
            this.d1 = new Bundle();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.A9)).booleanValue() && zzfbxVar != null && !TextUtils.isEmpty(zzfbxVar.i)) {
            str5 = zzfbxVar.i;
        } else {
            str5 = "";
        }
        this.b1 = str5;
    }

    public final double X7() {
        return this.e1;
    }

    public final long Y7() {
        return this.a1;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final Bundle d() {
        return this.d1;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.client.zzv e() {
        zzedk zzedkVar = this.c1;
        if (zzedkVar != null) {
            return zzedkVar.a();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String g() {
        return this.X;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String h() {
        return this.Z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    @InterfaceC11300zs1
    public final String i() {
        return this.Y;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final List j() {
        return this.Z0;
    }

    public final String k() {
        return this.b1;
    }

    @InterfaceC11300zs1
    public final String l() {
        return this.Y0;
    }
}
