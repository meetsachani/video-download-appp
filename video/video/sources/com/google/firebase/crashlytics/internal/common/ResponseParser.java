package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes3.dex */
public class ResponseParser {
    public static final int a = 0;
    public static final int b = 1;

    public static int a(int i) {
        if (i < 200 || i > 299) {
            return ((i < 300 || i > 399) && i >= 400 && i <= 499) ? 0 : 1;
        }
        return 0;
    }
}
