package com.facebook.login;

import java.util.Arrays;
import o.C9516sY;

/* renamed from: com.facebook.login.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2385b {
    S256("S256"),
    PLAIN("plain");

    EnumC2385b(String str) {
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC2385b[] valuesCustom() {
        EnumC2385b[] valuesCustom = values();
        return (EnumC2385b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* synthetic */ EnumC2385b(String str, int i, C9516sY c9516sY) {
        this((i & 1) != 0 ? "S256" : str);
    }
}
