package com.android.installreferrer.api;

import android.os.Bundle;

/* loaded from: classes.dex */
public class ReferrerDetails {
    public static final String b = "install_referrer";
    public static final String c = "referrer_click_timestamp_seconds";
    public static final String d = "install_begin_timestamp_seconds";
    public final Bundle a;

    public ReferrerDetails(Bundle bundle) {
        this.a = bundle;
    }

    public long a() {
        return this.a.getLong(d);
    }

    public String b() {
        return this.a.getString(b);
    }

    public long c() {
        return this.a.getLong(c);
    }
}
