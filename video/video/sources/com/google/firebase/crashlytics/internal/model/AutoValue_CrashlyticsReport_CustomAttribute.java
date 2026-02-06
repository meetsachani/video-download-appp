package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_CustomAttribute extends CrashlyticsReport.CustomAttribute {
    public final String a;
    public final String b;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.CustomAttribute.Builder {
        public String a;
        public String b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public CrashlyticsReport.CustomAttribute a() {
            String str = "";
            if (this.a == null) {
                str = " key";
            }
            if (this.b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_CustomAttribute(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public CrashlyticsReport.CustomAttribute.Builder b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public CrashlyticsReport.CustomAttribute.Builder c(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    @InterfaceC5670cr1
    public String b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    @InterfaceC5670cr1
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.CustomAttribute) {
            CrashlyticsReport.CustomAttribute customAttribute = (CrashlyticsReport.CustomAttribute) obj;
            if (this.a.equals(customAttribute.b()) && this.b.equals(customAttribute.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.a + ", value=" + this.b + "}";
    }

    public AutoValue_CrashlyticsReport_CustomAttribute(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
