package com.google.android.gms.measurement.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import com.google.firebase.messaging.Constants;
import o.C9755tW1;

/* loaded from: classes3.dex */
public final class zzik {
    public static final String[] a = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", Constants.MessagePayloadKeys.f, "message_name", "message_time", "message_tracking_id", Constants.MessagePayloadKeys.d, "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", C9755tW1.p};
    public static final String[] b = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", CrashlyticsAnalyticsListener.c, "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", Constants.ScionAnalytics.i, Constants.ScionAnalytics.r, Constants.ScionAnalytics.g, Constants.ScionAnalytics.h, "_nmtid", Constants.ScionAnalytics.k, "_pv", "_po", Constants.ScionAnalytics.e, "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_c", "_err", "_ev", "_el", CrashlyticsAnalyticsListener.c, "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
    public static final String[] c = {FirebaseAnalytics.Param.j0};
    public static final String[] d = {FirebaseAnalytics.Param.a0, FirebaseAnalytics.Param.j, FirebaseAnalytics.Param.Y, FirebaseAnalytics.Param.Z, FirebaseAnalytics.Param.i, FirebaseAnalytics.Param.c0, "index", FirebaseAnalytics.Param.q, FirebaseAnalytics.Param.W, FirebaseAnalytics.Param.p, FirebaseAnalytics.Param.d0, FirebaseAnalytics.Param.e0, FirebaseAnalytics.Param.f0, FirebaseAnalytics.Param.g0, FirebaseAnalytics.Param.i0, FirebaseAnalytics.Param.h0, FirebaseAnalytics.Param.r, FirebaseAnalytics.Param.X, FirebaseAnalytics.Param.k0, FirebaseAnalytics.Param.l0, FirebaseAnalytics.Param.B, FirebaseAnalytics.Param.m0, FirebaseAnalytics.Param.n0, FirebaseAnalytics.Param.C, FirebaseAnalytics.Param.E, FirebaseAnalytics.Param.q0, FirebaseAnalytics.Param.I, FirebaseAnalytics.Param.F, "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    public static String a(String str) {
        return zzkf.b(str, a, b);
    }
}
