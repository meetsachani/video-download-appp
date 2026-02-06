package com.google.android.gms.measurement.internal;

import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import o.C9755tW1;

/* loaded from: classes3.dex */
public final class zzij {
    public static final String[] a = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "gbraid", "session_number", C9755tW1.p};
    public static final String[] b = {Constants.ScionAnalytics.q, ConfigFetchHandler.m, "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_gbraid", "_sno", "_sid"};

    public static String a(String str) {
        return zzkf.b(str, a, b);
    }
}
