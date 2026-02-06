package com.facebook.login;

import com.facebook.internal.Z;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.login.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2389f {
    NONE(null),
    ONLY_ME(Z.f1),
    FRIENDS(Z.g1),
    EVERYONE(Z.h1);
    
    @Nullable
    public final String X;

    EnumC2389f(String str) {
        this.X = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC2389f[] valuesCustom() {
        EnumC2389f[] valuesCustom = values();
        return (EnumC2389f[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @Nullable
    public final String g() {
        return this.X;
    }
}
