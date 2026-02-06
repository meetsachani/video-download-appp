package com.google.android.gms.common.internal;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class zzu {
    public static final Uri a;
    public static final Uri b;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        a = parse;
        b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
