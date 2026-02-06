package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcm;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzfvt;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import java.util.Map;
import o.BU0;
import o.C2638Cg0;
import o.InterfaceC5670cr1;
import o.W12;

/* loaded from: classes2.dex */
public class CsiParamDefaults {
    public final Context a;
    public final String b;
    public final String c;

    public CsiParamDefaults(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 VersionInfoParcel versionInfoParcel) {
        this.a = context;
        this.b = context.getPackageName();
        this.c = versionInfoParcel.X;
    }

    public void a(@InterfaceC5670cr1 Map<String, String> map) {
        String str;
        map.put("s", "gmob_sdk");
        map.put("v", C2638Cg0.Z4);
        map.put(BU0.f, Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzv.v();
        map.put("device", zzs.Y());
        map.put(FirebaseMessaging.r, this.b);
        zzv.v();
        Context context = this.a;
        String str2 = "1";
        if (true == zzs.f(context)) {
            str = "1";
        } else {
            str = "0";
        }
        map.put("is_lite_sdk", str);
        zzbcm zzbcmVar = zzbcv.a;
        List b = zzbd.a().b();
        if (((Boolean) zzbd.c().b(zzbcv.Z6)).booleanValue()) {
            b.addAll(zzv.t().j().g().d());
        }
        map.put(W12.i, TextUtils.join(",", b));
        map.put(RemoteConfigConstants.RequestFieldKey.e0, this.c);
        if (((Boolean) zzbd.c().b(zzbcv.Fb)).booleanValue()) {
            zzv.v();
            if (true != zzs.c(context)) {
                str2 = "0";
            }
            map.put("is_bstar", str2);
        }
        if (((Boolean) zzbd.c().b(zzbcv.J9)).booleanValue()) {
            if (((Boolean) zzbd.c().b(zzbcv.C2)).booleanValue()) {
                map.put("plugin", zzfvt.c(zzv.t().o()));
            }
        }
    }
}
