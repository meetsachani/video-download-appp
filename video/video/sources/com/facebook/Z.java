package com.facebook;

import java.util.Arrays;

/* loaded from: classes2.dex */
public enum Z {
    GET,
    POST,
    DELETE;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static Z[] valuesCustom() {
        Z[] valuesCustom = values();
        return (Z[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
