package com.google.android.gms.internal.ads;

import com.google.firebase.ktx.BuildConfig;

/* loaded from: classes2.dex */
public enum zzecx {
    BEGIN_TO_RENDER("beginToRender"),
    DEFINED_BY_JAVASCRIPT("definedByJavascript"),
    ONE_PIXEL("onePixel"),
    UNSPECIFIED(BuildConfig.d);
    
    public final String X;

    zzecx(String str) {
        this.X = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.X;
    }
}
