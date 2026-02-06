package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import o.C2531Be;

/* loaded from: classes3.dex */
public final class Constants {
    public static final String a = "FirebaseMessaging";
    public static final String b = "wake:com.google.firebase.messaging";
    public static final long c = TimeUnit.MINUTES.toMillis(3);
    public static final String d = "error";

    /* loaded from: classes3.dex */
    public static final class AnalyticsKeys {
        public static final String a = "google.c.a.";
        public static final String b = "google.c.a.e";
        public static final String c = "google.c.a.c_id";
        public static final String d = "google.c.a.c_l";
        public static final String e = "google.c.a.ts";
        public static final String f = "google.c.a.udt";
        public static final String g = "google.c.a.tc";
        public static final String h = "google.c.a.abt";
        public static final String i = "google.c.a.m_l";
        public static final String j = "google.c.a.m_c";

        private AnalyticsKeys() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class FirelogAnalytics {
        public static final String a = "FCM_CLIENT_EVENT_LOGGING";

        private FirelogAnalytics() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class MessageNotificationKeys {
        public static final String A = "gcm.n.click_action";
        public static final String B = "gcm.n.link";
        public static final String C = "gcm.n.link_android";
        public static final String D = "gcm.n.android_channel_id";
        public static final String E = "gcm.n.analytics_data";
        public static final String F = "_loc_key";
        public static final String G = "_loc_args";
        public static final String a = "gcm.";
        public static final String b = "gcm.n.";
        public static final String c = "gcm.notification.";
        public static final String d = "gcm.n.e";
        public static final String e = "gcm.n.dnp";
        public static final String f = "gcm.n.noui";
        public static final String g = "gcm.n.title";
        public static final String h = "gcm.n.body";
        public static final String i = "gcm.n.icon";
        public static final String j = "gcm.n.image";
        public static final String k = "gcm.n.tag";
        public static final String l = "gcm.n.color";
        public static final String m = "gcm.n.ticker";
        public static final String n = "gcm.n.local_only";

        /* renamed from: o  reason: collision with root package name */
        public static final String f368o = "gcm.n.sticky";
        public static final String p = "gcm.n.notification_priority";
        public static final String q = "gcm.n.default_sound";
        public static final String r = "gcm.n.default_vibrate_timings";
        public static final String s = "gcm.n.default_light_settings";
        public static final String t = "gcm.n.notification_count";
        public static final String u = "gcm.n.visibility";
        public static final String v = "gcm.n.vibrate_timings";
        public static final String w = "gcm.n.light_settings";
        public static final String x = "gcm.n.event_time";
        public static final String y = "gcm.n.sound2";
        public static final String z = "gcm.n.sound";

        private MessageNotificationKeys() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class MessagePayloadKeys {
        public static final String a = "google.";
        public static final String b = "from";
        public static final String c = "rawData";
        public static final String d = "message_type";
        public static final String e = "collapse_key";
        public static final String f = "message_id";
        public static final String g = "google.to";
        public static final String h = "google.message_id";
        public static final String i = "google.ttl";
        public static final String j = "google.sent_time";
        public static final String k = "google.original_priority";
        public static final String l = "google.delivered_priority";
        public static final String m = "google.priority";
        public static final String n = "google.priority_reduced";

        /* renamed from: o  reason: collision with root package name */
        public static final String f369o = "google.product_id";
        public static final String p = "google.c.";
        public static final String q = "google.c.sender.id";

        private MessagePayloadKeys() {
        }

        public static C2531Be<String, String> a(Bundle bundle) {
            C2531Be<String, String> c2531Be = new C2531Be<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith(a) && !str.startsWith(MessageNotificationKeys.a) && !str.equals("from") && !str.equals(d) && !str.equals(e)) {
                        c2531Be.put(str, str2);
                    }
                }
            }
            return c2531Be;
        }
    }

    /* loaded from: classes3.dex */
    public static final class MessageTypes {
        public static final String a = "gcm";
        public static final String b = "deleted_messages";
        public static final String c = "send_event";
        public static final String d = "send_error";

        private MessageTypes() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class ScionAnalytics {
        public static final String a = "fcm";
        public static final String b = "source";
        public static final String c = "medium";
        public static final String d = "label";
        public static final String e = "_nt";
        public static final String f = "campaign";
        public static final String g = "_nmn";
        public static final String h = "_nmt";
        public static final String i = "_ndt";
        public static final String j = "message_channel";
        public static final String k = "_nmc";
        public static final String l = "_cmp";
        public static final String m = "_nr";
        public static final String n = "_no";

        /* renamed from: o  reason: collision with root package name */
        public static final String f370o = "_nd";
        public static final String p = "_nf";
        public static final String q = "_ln";
        public static final String r = "_nmid";

        /* loaded from: classes3.dex */
        public @interface MessageType {
            public static final String Q = "data";
            public static final String R = "display";
        }

        private ScionAnalytics() {
        }
    }

    private Constants() {
    }
}
