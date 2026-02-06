package com.facebook.login;

import java.util.Arrays;

/* loaded from: classes2.dex */
public enum v {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true, true),
    NATIVE_ONLY(true, true, false, false, false, true, true),
    KATANA_ONLY(false, true, false, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false, false),
    DIALOG_ONLY(false, true, true, false, true, true, true),
    DEVICE_AUTH(false, false, false, true, false, false, false);
    
    public final boolean X;
    public final boolean Y;
    public final boolean Y0;
    public final boolean Z;
    public final boolean Z0;
    public final boolean a1;
    public final boolean b1;

    v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.X = z;
        this.Y = z2;
        this.Z = z3;
        this.Y0 = z4;
        this.Z0 = z5;
        this.a1 = z6;
        this.b1 = z7;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static v[] valuesCustom() {
        v[] valuesCustom = values();
        return (v[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final boolean g() {
        return this.Z0;
    }

    public final boolean h() {
        return this.Y0;
    }

    public final boolean i() {
        return this.a1;
    }

    public final boolean j() {
        return this.X;
    }

    public final boolean l() {
        return this.b1;
    }

    public final boolean m() {
        return this.Y;
    }

    public final boolean n() {
        return this.Z;
    }
}
