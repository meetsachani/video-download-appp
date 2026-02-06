package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes3.dex */
public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    
    public final int X;

    DeliveryMechanism(int i) {
        this.X = i;
    }

    public static DeliveryMechanism e(String str) {
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }

    public int g() {
        return this.X;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.X);
    }
}
