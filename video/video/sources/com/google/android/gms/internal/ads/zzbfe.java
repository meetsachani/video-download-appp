package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbfe {
    public static final zzbef a = zzbef.b("gads:dynamite_load:fail:sample_rate", 10000);
    public static final zzbef b = zzbef.d("gads:report_dynamite_crash_in_background_thread", false);
    public static final zzbef c = new zzbef("gads:public_beta:traffic_multiplier", "1.0", 4);
    public static final zzbef d = new zzbef("gads:sdk_crash_report_class_prefix", "com.google.", 4);
    public static final zzbef e;
    public static final zzbef f;

    static {
        zzbef.d("gads:sdk_crash_report_enabled", false);
        e = zzbef.d("gads:sdk_crash_report_full_stacktrace", false);
        f = zzbef.a("gads:trapped_exception_sample_rate", 0.01d);
    }
}
