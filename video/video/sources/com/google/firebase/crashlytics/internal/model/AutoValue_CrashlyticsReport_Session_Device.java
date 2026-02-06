package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Device extends CrashlyticsReport.Session.Device {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Device.Builder {
        public Integer a;
        public String b;
        public Integer c;
        public Long d;
        public Long e;
        public Boolean f;
        public Integer g;
        public String h;
        public String i;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device a() {
            String str = "";
            if (this.a == null) {
                str = " arch";
            }
            if (this.b == null) {
                str = str + " model";
            }
            if (this.c == null) {
                str = str + " cores";
            }
            if (this.d == null) {
                str = str + " ram";
            }
            if (this.e == null) {
                str = str + " diskSpace";
            }
            if (this.f == null) {
                str = str + " simulator";
            }
            if (this.g == null) {
                str = str + " state";
            }
            if (this.h == null) {
                str = str + " manufacturer";
            }
            if (this.i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Device(this.a.intValue(), this.b, this.c.intValue(), this.d.longValue(), this.e.longValue(), this.f.booleanValue(), this.g.intValue(), this.h, this.i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder b(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder c(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder d(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder e(String str) {
            if (str != null) {
                this.h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder g(String str) {
            if (str != null) {
                this.i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder h(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder i(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder j(int i) {
            this.g = Integer.valueOf(i);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    @InterfaceC5670cr1
    public int b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public long d() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    @InterfaceC5670cr1
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Device) {
            CrashlyticsReport.Session.Device device = (CrashlyticsReport.Session.Device) obj;
            if (this.a == device.b() && this.b.equals(device.f()) && this.c == device.c() && this.d == device.h() && this.e == device.d() && this.f == device.j() && this.g == device.i() && this.h.equals(device.e()) && this.i.equals(device.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    @InterfaceC5670cr1
    public String f() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    @InterfaceC5670cr1
    public String g() {
        return this.i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public long h() {
        return this.d;
    }

    public int hashCode() {
        int i;
        long j = this.d;
        long j2 = this.e;
        int hashCode = (((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (this.f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int i() {
        return this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public boolean j() {
        return this.f;
    }

    public String toString() {
        return "Device{arch=" + this.a + ", model=" + this.b + ", cores=" + this.c + ", ram=" + this.d + ", diskSpace=" + this.e + ", simulator=" + this.f + ", state=" + this.g + ", manufacturer=" + this.h + ", modelClass=" + this.i + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Device(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = i3;
        this.h = str2;
        this.i = str3;
    }
}
