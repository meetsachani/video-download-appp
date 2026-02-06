package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzbxw implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final Context a;
    public final SharedPreferences b;
    public final com.google.android.gms.ads.internal.util.zzg c;
    public String d = "-1";
    public int e = -1;

    public zzbxw(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.b = PreferenceManager.getDefaultSharedPreferences(context);
        this.c = zzgVar;
        this.a = context;
    }

    public final void a() {
        SharedPreferences sharedPreferences = this.b;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.P0)).booleanValue()) {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
        }
    }

    public final void b() {
        this.c.U(true);
        com.google.android.gms.ads.internal.util.zzad.c(this.a);
    }

    public final void c(String str, int i) {
        Context context;
        boolean z = true;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.N0)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z = false;
        }
        this.c.U(z);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s6)).booleanValue() && z && (context = this.a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        boolean z;
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.P0)).booleanValue()) {
                if (Objects.equals(str, "gad_has_consent_for_cookies")) {
                    int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    com.google.android.gms.ads.internal.util.zzg zzgVar = this.c;
                    if (i != zzgVar.b()) {
                        b();
                    }
                    zzgVar.Q(i);
                    return;
                } else if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    com.google.android.gms.ads.internal.util.zzg zzgVar2 = this.c;
                    if (!Objects.equals(string, zzgVar2.m())) {
                        b();
                    }
                    zzgVar2.X(string);
                    return;
                } else {
                    return;
                }
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i2 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String valueOf = String.valueOf(str);
            int hashCode = valueOf.hashCode();
            if (hashCode != -2004976699) {
                if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                    z = true;
                }
                z = true;
            } else {
                if (valueOf.equals("IABTCF_PurposeConsents")) {
                    z = false;
                }
                z = true;
            }
            if (z) {
                if (z) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.N0)).booleanValue() && i2 != -1 && this.e != i2) {
                        this.e = i2;
                        c(string2, i2);
                    }
                }
            } else if (!string2.equals("-1") && !this.d.equals(string2)) {
                this.d = string2;
                c(string2, i2);
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.t().x(th, "AdMobPlusIdlessListener.onSharedPreferenceChanged");
            com.google.android.gms.ads.internal.util.zze.l("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }
}
