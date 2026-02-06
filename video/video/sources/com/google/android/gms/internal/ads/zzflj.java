package com.google.android.gms.internal.ads;

import com.google.firebase.ktx.BuildConfig;

/* loaded from: classes2.dex */
public enum zzflj {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED(BuildConfig.d),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");
    
    public final String X;

    zzflj(String str) {
        this.X = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.X;
    }
}
