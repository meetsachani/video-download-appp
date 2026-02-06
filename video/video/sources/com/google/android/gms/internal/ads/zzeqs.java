package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeqs implements zzetv {
    public final Context a;
    public final zzgdj b;

    public zzeqs(Context context, zzgdj zzgdjVar) {
        this.a = context;
        this.b = zzgdjVar;
    }

    public static /* synthetic */ zzeqq c(zzeqs zzeqsVar) {
        String string;
        Bundle bundle;
        com.google.android.gms.ads.internal.zzv.v();
        String str = "";
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.l6)).booleanValue()) {
            string = "";
        } else {
            string = zzeqsVar.a.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.n6)).booleanValue()) {
            str = zzeqsVar.a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "");
        }
        com.google.android.gms.ads.internal.zzv.v();
        Context context = zzeqsVar.a;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.m6)).booleanValue()) {
            bundle = null;
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str2 = strArr[i];
                if (defaultSharedPreferences.contains(str2)) {
                    bundle.putString(str2, defaultSharedPreferences.getString(str2, null));
                }
            }
        }
        return new zzeqq(string, str, bundle, null);
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 18;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.b.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqs.c(zzeqs.this);
            }
        });
    }
}
