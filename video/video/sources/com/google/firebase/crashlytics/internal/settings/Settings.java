package com.google.firebase.crashlytics.internal.settings;

/* loaded from: classes3.dex */
public class Settings {
    public final SessionData a;
    public final FeatureFlagData b;
    public final long c;
    public final int d;
    public final int e;
    public final double f;
    public final double g;
    public final int h;

    /* loaded from: classes3.dex */
    public static class FeatureFlagData {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public FeatureFlagData(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }
    }

    /* loaded from: classes3.dex */
    public static class SessionData {
        public final int a;
        public final int b;

        public SessionData(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public Settings(long j, SessionData sessionData, FeatureFlagData featureFlagData, int i, int i2, double d, double d2, int i3) {
        this.c = j;
        this.a = sessionData;
        this.b = featureFlagData;
        this.d = i;
        this.e = i2;
        this.f = d;
        this.g = d2;
        this.h = i3;
    }

    public boolean a(long j) {
        if (this.c < j) {
            return true;
        }
        return false;
    }
}
