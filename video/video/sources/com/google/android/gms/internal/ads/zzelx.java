package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.a0;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzelx implements zzetu {
    public final zzfcp a;
    public final long b;

    public zzelx(zzfcp zzfcpVar, long j) {
        this.a = zzfcpVar;
        this.b = j;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        boolean z;
        Bundle bundle = ((zzcuv) obj).b;
        zzfcp zzfcpVar = this.a;
        bundle.putString("slotname", zzfcpVar.f);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfcpVar.d;
        boolean z2 = true;
        if (zzmVar.a1) {
            bundle.putBoolean("test_request", true);
        }
        int i = zzmVar.b1;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        zzfdd.e(bundle, "tag_for_child_directed_treatment", i, z);
        if (zzmVar.X >= 8) {
            int i2 = zzmVar.o1;
            if (i2 == -1) {
                z2 = false;
            }
            zzfdd.e(bundle, "tag_for_under_age_of_consent", i2, z2);
        }
        zzfdd.c(bundle, "url", zzmVar.g1);
        zzfdd.d(bundle, "neighboring_content_urls", zzmVar.q1);
        Bundle bundle2 = zzmVar.Z;
        Bundle bundle3 = (Bundle) bundle2.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.L7)).split(",", -1)));
        for (String str : bundle2.keySet()) {
            if (!hashSet.contains(str)) {
                bundle3.remove(str);
            }
        }
        zzfdd.b(bundle, "extras", bundle3);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Bundle bundle = ((zzcuv) obj).a;
        zzfcp zzfcpVar = this.a;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfcpVar.d;
        bundle.putInt("http_timeout_millis", zzmVar.r1);
        bundle.putString("slotname", zzfcpVar.f);
        int i = zzfcpVar.f280o.a;
        if (i != 0) {
            int i2 = i - 1;
            boolean z7 = true;
            if (i2 != 1) {
                if (i2 == 2) {
                    bundle.putBoolean("is_rewarded_interstitial", true);
                }
            } else {
                bundle.putBoolean("is_new_rewarded", true);
            }
            bundle.putLong("start_signals_timestamp", this.b);
            zzfdd.g(bundle, "is_sdk_preload", true, zzmVar.B0());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
            long j = zzmVar.Y;
            String format = simpleDateFormat.format(new Date(j));
            if (j != -1) {
                z = true;
            } else {
                z = false;
            }
            zzfdd.f(bundle, "cust_age", format, z);
            zzfdd.b(bundle, "extras", zzmVar.Z);
            int i3 = zzmVar.Y0;
            if (i3 != -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            zzfdd.e(bundle, "cust_gender", i3, z2);
            zzfdd.d(bundle, "kw", zzmVar.Z0);
            int i4 = zzmVar.b1;
            if (i4 != -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            zzfdd.e(bundle, "tag_for_child_directed_treatment", i4, z3);
            if (zzmVar.a1) {
                bundle.putBoolean("test_request", true);
            }
            bundle.putInt("ppt_p13n", zzmVar.t1);
            int i5 = zzmVar.X;
            if (i5 >= 2 && zzmVar.c1) {
                z4 = true;
            } else {
                z4 = false;
            }
            zzfdd.e(bundle, "d_imp_hdr", 1, z4);
            String str = zzmVar.d1;
            if (i5 >= 2 && !TextUtils.isEmpty(str)) {
                z5 = true;
            } else {
                z5 = false;
            }
            zzfdd.f(bundle, "ppid", str, z5);
            Location location = zzmVar.f1;
            if (location != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", location.getAccuracy() * 1000.0f);
                bundle2.putLong("lat", (long) (location.getLatitude() * 1.0E7d));
                bundle2.putLong(a0.A, (long) (1.0E7d * location.getLongitude()));
                bundle2.putLong("time", location.getTime() * 1000);
                bundle.putBundle("uule", bundle2);
            }
            zzfdd.c(bundle, "url", zzmVar.g1);
            zzfdd.d(bundle, "neighboring_content_urls", zzmVar.q1);
            zzfdd.b(bundle, "custom_targeting", zzmVar.i1);
            zzfdd.d(bundle, "category_exclusions", zzmVar.j1);
            zzfdd.c(bundle, "request_agent", zzmVar.k1);
            zzfdd.c(bundle, "request_pkg", zzmVar.l1);
            boolean z8 = zzmVar.m1;
            if (i5 >= 7) {
                z6 = true;
            } else {
                z6 = false;
            }
            zzfdd.g(bundle, "is_designed_for_families", z8, z6);
            if (i5 >= 8) {
                int i6 = zzmVar.o1;
                if (i6 == -1) {
                    z7 = false;
                }
                zzfdd.e(bundle, "tag_for_under_age_of_consent", i6, z7);
                zzfdd.c(bundle, "max_ad_content_rating", zzmVar.p1);
                return;
            }
            return;
        }
        throw null;
    }
}
