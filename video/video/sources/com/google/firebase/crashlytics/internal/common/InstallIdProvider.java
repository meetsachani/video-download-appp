package com.google.firebase.crashlytics.internal.common;

import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC6615gi;

/* loaded from: classes3.dex */
public interface InstallIdProvider {

    @InterfaceC6615gi
    /* loaded from: classes3.dex */
    public static abstract class InstallIds {
        public static InstallIds a(String str, @InterfaceC11300zs1 String str2) {
            return new AutoValue_InstallIdProvider_InstallIds(str, str2);
        }

        @InterfaceC5056aJ2(otherwise = 3)
        public static InstallIds b(String str) {
            return a(str, null);
        }

        @InterfaceC5670cr1
        public abstract String c();

        @InterfaceC11300zs1
        public abstract String d();
    }

    InstallIds a();
}
