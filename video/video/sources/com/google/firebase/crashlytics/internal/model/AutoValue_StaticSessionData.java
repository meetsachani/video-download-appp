package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* loaded from: classes3.dex */
final class AutoValue_StaticSessionData extends StaticSessionData {
    public final StaticSessionData.AppData a;
    public final StaticSessionData.OsData b;
    public final StaticSessionData.DeviceData c;

    public AutoValue_StaticSessionData(StaticSessionData.AppData appData, StaticSessionData.OsData osData, StaticSessionData.DeviceData deviceData) {
        if (appData != null) {
            this.a = appData;
            if (osData != null) {
                this.b = osData;
                if (deviceData != null) {
                    this.c = deviceData;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.AppData a() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.DeviceData c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.OsData d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StaticSessionData) {
            StaticSessionData staticSessionData = (StaticSessionData) obj;
            if (this.a.equals(staticSessionData.a()) && this.b.equals(staticSessionData.d()) && this.c.equals(staticSessionData.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
