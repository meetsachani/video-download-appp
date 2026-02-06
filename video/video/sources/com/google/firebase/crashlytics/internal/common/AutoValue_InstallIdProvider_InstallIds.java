package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.InstallIdProvider;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_InstallIdProvider_InstallIds extends InstallIdProvider.InstallIds {
    public final String a;
    public final String b;

    public AutoValue_InstallIdProvider_InstallIds(String str, @InterfaceC11300zs1 String str2) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    @InterfaceC5670cr1
    public String c() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    @InterfaceC11300zs1
    public String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallIdProvider.InstallIds) {
            InstallIdProvider.InstallIds installIds = (InstallIdProvider.InstallIds) obj;
            if (this.a.equals(installIds.c()) && ((str = this.b) != null ? str.equals(installIds.d()) : installIds.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.a + ", firebaseInstallationId=" + this.b + "}";
    }
}
