package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import o.InterfaceFutureC8411o11;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class zzegj implements zzedf {
    public static Bundle d(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        return new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzedf
    public final boolean a(zzfcg zzfcgVar, zzfbu zzfbuVar) {
        if (!TextUtils.isEmpty(zzfbuVar.v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""))) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzedf
    public final InterfaceFutureC8411o11 b(zzfcg zzfcgVar, zzfbu zzfbuVar) {
        JSONObject jSONObject = zzfbuVar.v;
        String optString = jSONObject.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzfcp zzfcpVar = zzfcgVar.a.a;
        zzfcn zzfcnVar = new zzfcn();
        zzfcnVar.M(zzfcpVar);
        zzfcnVar.P(optString);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfcpVar.d;
        Bundle d = d(zzmVar.h1);
        Bundle d2 = d(d.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        d2.putInt("gw", 1);
        String optString2 = jSONObject.optString("mad_hac", null);
        if (optString2 != null) {
            d2.putString("mad_hac", optString2);
        }
        String optString3 = jSONObject.optString("adJson", null);
        if (optString3 != null) {
            d2.putString("_ad", optString3);
        }
        d2.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = zzfbuVar.D;
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = jSONObject2.optString(next, null);
            if (next != null) {
                d2.putString(next, optString4);
            }
        }
        d.putBundle("com.google.ads.mediation.admob.AdMobAdapter", d2);
        zzfcnVar.h(new com.google.android.gms.ads.internal.client.zzm(zzmVar.X, zzmVar.Y, d2, zzmVar.Y0, zzmVar.Z0, zzmVar.a1, zzmVar.b1, zzmVar.c1, zzmVar.d1, zzmVar.e1, zzmVar.f1, zzmVar.g1, d, zzmVar.i1, zzmVar.j1, zzmVar.k1, zzmVar.l1, zzmVar.m1, zzmVar.n1, zzmVar.o1, zzmVar.p1, zzmVar.q1, zzmVar.r1, zzmVar.s1, zzmVar.t1, zzmVar.u1));
        zzfcp j = zzfcnVar.j();
        Bundle bundle = new Bundle();
        zzfbx zzfbxVar = zzfcgVar.b.b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzfbxVar.a));
        bundle2.putInt("refresh_interval", zzfbxVar.c);
        bundle2.putString("gws_query_id", zzfbxVar.b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzfcpVar.f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzfbuVar.w);
        bundle3.putString("ad_source_name", zzfbuVar.F);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzfbuVar.c));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzfbuVar.d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfbuVar.p));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzfbuVar.m));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzfbuVar.g));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzfbuVar.h));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzfbuVar.i));
        bundle3.putString(FirebaseAnalytics.Param.F, zzfbuVar.j);
        bundle3.putString("valid_from_timestamp", zzfbuVar.k);
        bundle3.putBoolean("is_closable_area_disabled", zzfbuVar.P);
        bundle3.putString("recursive_server_response_data", zzfbuVar.o0);
        bundle3.putBoolean("is_analytics_logging_enabled", zzfbuVar.W);
        zzbwj zzbwjVar = zzfbuVar.l;
        if (zzbwjVar != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzbwjVar.Y);
            bundle4.putString("rb_type", zzbwjVar.X);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return c(j, bundle, zzfbuVar, zzfcgVar);
    }

    public abstract InterfaceFutureC8411o11 c(zzfcp zzfcpVar, Bundle bundle, zzfbu zzfbuVar, zzfcg zzfcgVar);
}
