package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder {
        public Long a;
        public Long b;
        public String c;
        public String d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage a() {
            String str = "";
            if (this.a == null) {
                str = " baseAddress";
            }
            if (this.b == null) {
                str = str + " size";
            }
            if (this.c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(this.a.longValue(), this.b.longValue(), this.c, this.d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder b(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder e(@InterfaceC11300zs1 String str) {
            this.d = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    @InterfaceC5670cr1
    public long b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    @InterfaceC5670cr1
    public String c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public long d() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    @Encodable.Ignore
    @InterfaceC11300zs1
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) {
            CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) obj;
            if (this.a == binaryImage.b() && this.b == binaryImage.d() && this.c.equals(binaryImage.c()) && ((str = this.d) != null ? str.equals(binaryImage.e()) : binaryImage.e() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        long j = this.a;
        long j2 = this.b;
        int hashCode2 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.a + ", size=" + this.b + ", name=" + this.c + ", uuid=" + this.d + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(long j, long j2, String str, @InterfaceC11300zs1 String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }
}
