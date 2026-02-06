package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbet {
    public static final zzbef a = zzbef.d("gads:init:init_on_bg_thread", true);
    public static final zzbef b = zzbef.d("gads:init:init_on_single_bg_thread", false);
    public static final zzbef c = zzbef.d("gads:adloader_load_bg_thread", true);
    public static final zzbef d = zzbef.d("gads:appopen_load_on_bg_thread", true);
    public static final zzbef e = zzbef.d("gads:banner_destroy_bg_thread", false);
    public static final zzbef f = zzbef.d("gads:banner_load_bg_thread", true);
    public static final zzbef g = zzbef.d("gads:banner_pause_bg_thread", false);
    public static final zzbef h = zzbef.d("gads:banner_resume_bg_thread", false);
    public static final zzbef i = zzbef.d("gads:interstitial_load_on_bg_thread", true);
    public static final zzbef j;
    public static final zzbef k;

    static {
        zzbef.d("gads:persist_flags_on_bg_thread", true);
        j = zzbef.d("gads:query_info_bg_thread", true);
        k = zzbef.d("gads:rewarded_load_bg_thread", true);
    }
}
