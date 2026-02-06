package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* loaded from: classes3.dex */
final class AutoValue_StaticSessionData_DeviceData extends StaticSessionData.DeviceData {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public AutoValue_StaticSessionData_DeviceData(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.a = i;
        if (str != null) {
            this.b = str;
            this.c = i2;
            this.d = j;
            this.e = j2;
            this.f = z;
            this.g = i3;
            if (str2 != null) {
                this.h = str2;
                if (str3 != null) {
                    this.i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int a() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long d() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StaticSessionData.DeviceData) {
            StaticSessionData.DeviceData deviceData = (StaticSessionData.DeviceData) obj;
            if (this.a == deviceData.a() && this.b.equals(deviceData.g()) && this.c == deviceData.b() && this.d == deviceData.j() && this.e == deviceData.d() && this.f == deviceData.e() && this.g == deviceData.i() && this.h.equals(deviceData.f()) && this.i.equals(deviceData.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String f() {
        return this.h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String g() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String h() {
        return this.i;
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

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int i() {
        return this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long j() {
        return this.d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.a + ", model=" + this.b + ", availableProcessors=" + this.c + ", totalRam=" + this.d + ", diskSpace=" + this.e + ", isEmulator=" + this.f + ", state=" + this.g + ", manufacturer=" + this.h + ", modelClass=" + this.i + "}";
    }
}
