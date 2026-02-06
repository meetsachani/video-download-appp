package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* loaded from: classes3.dex */
final class AutoValue_StaticSessionData_AppData extends StaticSessionData.AppData {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final DevelopmentPlatformProvider f;

    public AutoValue_StaticSessionData_AppData(String str, String str2, String str3, String str4, int i, DevelopmentPlatformProvider developmentPlatformProvider) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i;
                        if (developmentPlatformProvider != null) {
                            this.f = developmentPlatformProvider;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String a() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public int c() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public DevelopmentPlatformProvider d() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StaticSessionData.AppData) {
            StaticSessionData.AppData appData = (StaticSessionData.AppData) obj;
            if (this.a.equals(appData.a()) && this.b.equals(appData.f()) && this.c.equals(appData.g()) && this.d.equals(appData.e()) && this.e == appData.c() && this.f.equals(appData.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String f() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String g() {
        return this.c;
    }

    public int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
