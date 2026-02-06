package com.google.android.gms.measurement.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;

/* loaded from: classes3.dex */
public final class zzii {
    public static final String[] a = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", FirebaseAnalytics.Event.a, FirebaseAnalytics.Event.A, "ga_extra_parameter", "app_background", "firebase_campaign"};
    public static final String[] b = {FirebaseAnalytics.Event.a};
    public static final String[] c = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", Constants.ScionAnalytics.l, "_err", "_f", "_v", "_iap", Constants.ScionAnalytics.f370o, Constants.ScionAnalytics.p, Constants.ScionAnalytics.n, Constants.ScionAnalytics.m, "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", Constants.ScionAnalytics.l};
    public static final String[] d = {FirebaseAnalytics.Event.D, FirebaseAnalytics.Event.E, FirebaseAnalytics.Event.b, FirebaseAnalytics.Event.C, FirebaseAnalytics.Event.c, FirebaseAnalytics.Event.d, FirebaseAnalytics.Event.f, FirebaseAnalytics.Event.B, FirebaseAnalytics.Event.F, FirebaseAnalytics.Event.G, FirebaseAnalytics.Event.H, FirebaseAnalytics.Event.w, FirebaseAnalytics.Event.x, FirebaseAnalytics.Event.I, "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", FirebaseAnalytics.Event.p, FirebaseAnalytics.Event.y};

    public static String a(String str) {
        return zzkf.b(str, c, a);
    }

    public static String b(String str) {
        return zzkf.b(str, a, c);
    }
}
