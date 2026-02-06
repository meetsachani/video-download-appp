package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* loaded from: classes3.dex */
final class AutoValue_StaticSessionData_OsData extends StaticSessionData.OsData {
    public final String a;
    public final String b;
    public final boolean c;

    public AutoValue_StaticSessionData_OsData(String str, String str2, boolean z) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public boolean b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public String c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StaticSessionData.OsData) {
            StaticSessionData.OsData osData = (StaticSessionData.OsData) obj;
            if (this.a.equals(osData.d()) && this.b.equals(osData.c()) && this.c == osData.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        if (this.c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "OsData{osRelease=" + this.a + ", osCodeName=" + this.b + ", isRooted=" + this.c + "}";
    }
}
