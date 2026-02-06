package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcti implements zzcyv, zzdek {
    public zzbvf X;
    public final zzfhq Y0;
    public final Context Z;
    public final VersionInfoParcel Z0;
    public final Executor a1;
    public boolean b1 = false;
    public boolean c1 = false;
    public final AtomicBoolean Y = new AtomicBoolean();

    public zzcti(Context context, zzfhq zzfhqVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.Z = context;
        this.Y0 = zzfhqVar;
        this.Z0 = versionInfoParcel;
        this.a1 = executor;
    }

    public static /* synthetic */ void b(zzcti zzctiVar) {
        zzbcf.e(zzctiVar.Z);
        zzctiVar.c1 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void D0(zzbvl zzbvlVar) {
        c();
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void S(@InterfaceC11300zs1 String str) {
        c();
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void a(@InterfaceC11300zs1 com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
        if (android.text.TextUtils.equals(r0, o.C3771Nr1.Q0) != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        zzbvf zzbvfVar;
        int i;
        int i2;
        zzbon a;
        if (!this.Y.getAndSet(true)) {
            if (!((Boolean) zzbev.j.e()).booleanValue()) {
                i = 3;
                if (!((Boolean) zzbev.k.e()).booleanValue()) {
                    if (((Boolean) zzbev.i.e()).booleanValue()) {
                        try {
                            String optString = new JSONObject(com.google.android.gms.ads.internal.zzv.t().j().g().c()).optString("local_flag_write");
                            if (TextUtils.equals(optString, "client")) {
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    i = 1;
                }
                i2 = i - 1;
                if (i2 == 1) {
                    if (i2 == 2) {
                        a = com.google.android.gms.ads.internal.zzv.k().b(this.Z, VersionInfoParcel.m0(), this.Y0);
                    }
                } else {
                    a = com.google.android.gms.ads.internal.zzv.k().a(this.Z, VersionInfoParcel.m0(), this.Y0);
                }
                zzboh zzbohVar = zzbok.b;
                this.X = new zzbvh(this.Z, a.a("google.afma.sdkConstants.getSdkConstants", zzbohVar, zzbohVar), this.Z0);
                this.b1 = true;
            }
            i = 2;
            i2 = i - 1;
            if (i2 == 1) {
            }
            zzboh zzbohVar2 = zzbok.b;
            this.X = new zzbvh(this.Z, a.a("google.afma.sdkConstants.getSdkConstants", zzbohVar2, zzbohVar2), this.Z0);
            this.b1 = true;
        }
        if (this.b1 && (zzbvfVar = this.X) != null) {
            InterfaceFutureC8411o11 a2 = zzbvfVar.a();
            if (!this.c1 && ((Boolean) zzben.i.e()).booleanValue()) {
                a2.h4(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcth
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcti.b(zzcti.this);
                    }
                }, this.a1);
            }
            zzcad.a(a2, "persistFlagsClient");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void f0(zzfcg zzfcgVar) {
    }
}
