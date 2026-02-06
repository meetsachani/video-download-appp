package com.facebook;

import java.util.Arrays;

/* renamed from: com.facebook.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2354h {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true),
    INSTAGRAM_APPLICATION_WEB(true),
    INSTAGRAM_CUSTOM_CHROME_TAB(true),
    INSTAGRAM_WEB_VIEW(true);
    
    public final boolean X;

    /* renamed from: com.facebook.h$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC2354h.valuesCustom().length];
            iArr[EnumC2354h.INSTAGRAM_APPLICATION_WEB.ordinal()] = 1;
            iArr[EnumC2354h.INSTAGRAM_CUSTOM_CHROME_TAB.ordinal()] = 2;
            iArr[EnumC2354h.INSTAGRAM_WEB_VIEW.ordinal()] = 3;
            a = iArr;
        }
    }

    EnumC2354h(boolean z) {
        this.X = z;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC2354h[] valuesCustom() {
        EnumC2354h[] valuesCustom = values();
        return (EnumC2354h[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final boolean g() {
        return this.X;
    }

    public final boolean h() {
        int i = a.a[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        return false;
    }
}
