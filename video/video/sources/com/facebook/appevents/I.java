package com.facebook.appevents;

import java.util.Arrays;

/* loaded from: classes2.dex */
public enum I {
    SUCCESS,
    SERVER_ERROR,
    NO_CONNECTIVITY,
    UNKNOWN_ERROR;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static I[] valuesCustom() {
        I[] valuesCustom = values();
        return (I[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
