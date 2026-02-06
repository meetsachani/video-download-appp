package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_OperatingSystem extends CrashlyticsReport.Session.OperatingSystem {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.OperatingSystem.Builder {
        public Integer a;
        public String b;
        public String c;
        public Boolean d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem a() {
            String str = "";
            if (this.a == null) {
                str = " platform";
            }
            if (this.b == null) {
                str = str + " version";
            }
            if (this.c == null) {
                str = str + " buildVersion";
            }
            if (this.d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_OperatingSystem(this.a.intValue(), this.b, this.c, this.d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem.Builder b(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem.Builder c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem.Builder d(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem.Builder e(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    @InterfaceC5670cr1
    public String b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public int c() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    @InterfaceC5670cr1
    public String d() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.OperatingSystem) {
            CrashlyticsReport.Session.OperatingSystem operatingSystem = (CrashlyticsReport.Session.OperatingSystem) obj;
            if (this.a == operatingSystem.c() && this.b.equals(operatingSystem.d()) && this.c.equals(operatingSystem.b()) && this.d == operatingSystem.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.b + ", buildVersion=" + this.c + ", jailbroken=" + this.d + "}";
    }

    public AutoValue_CrashlyticsReport_Session_OperatingSystem(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }
}
