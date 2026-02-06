package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import o.InterfaceC11300zs1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Device extends CrashlyticsReport.Session.Event.Device {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Device.Builder {
        public Double a;
        public Integer b;
        public Boolean c;
        public Integer d;
        public Long e;
        public Long f;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device a() {
            String str = "";
            if (this.b == null) {
                str = " batteryVelocity";
            }
            if (this.c == null) {
                str = str + " proximityOn";
            }
            if (this.d == null) {
                str = str + " orientation";
            }
            if (this.e == null) {
                str = str + " ramUsed";
            }
            if (this.f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Device(this.a, this.b.intValue(), this.c.booleanValue(), this.d.intValue(), this.e.longValue(), this.f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder b(Double d) {
            this.a = d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder d(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder e(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder f(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder g(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    @InterfaceC11300zs1
    public Double b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public int c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public long d() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Device) {
            CrashlyticsReport.Session.Event.Device device = (CrashlyticsReport.Session.Event.Device) obj;
            Double d = this.a;
            if (d != null ? d.equals(device.b()) : device.b() == null) {
                if (this.b == device.c() && this.c == device.g() && this.d == device.e() && this.e == device.f() && this.f == device.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public long f() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public boolean g() {
        return this.c;
    }

    public int hashCode() {
        int hashCode;
        int i;
        Double d = this.a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ this.b) * 1000003;
        if (this.c) {
            i = 1231;
        } else {
            i = 1237;
        }
        long j = this.e;
        long j2 = this.f;
        return ((((((i2 ^ i) * 1000003) ^ this.d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.a + ", batteryVelocity=" + this.b + ", proximityOn=" + this.c + ", orientation=" + this.d + ", ramUsed=" + this.e + ", diskUsed=" + this.f + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_Device(@InterfaceC11300zs1 Double d, int i, boolean z, int i2, long j, long j2) {
        this.a = d;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = j;
        this.f = j2;
    }
}
