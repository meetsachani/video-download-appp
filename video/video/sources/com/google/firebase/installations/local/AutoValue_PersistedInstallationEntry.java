package com.google.firebase.installations.local;

import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_PersistedInstallationEntry extends PersistedInstallationEntry {
    public final String b;
    public final PersistedInstallation.RegistrationStatus c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;

    /* loaded from: classes3.dex */
    public static final class Builder extends PersistedInstallationEntry.Builder {
        public String a;
        public PersistedInstallation.RegistrationStatus b;
        public String c;
        public String d;
        public Long e;
        public Long f;
        public String g;

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry a() {
            String str = "";
            if (this.b == null) {
                str = " registrationStatus";
            }
            if (this.e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new AutoValue_PersistedInstallationEntry(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder b(@InterfaceC11300zs1 String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder c(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder d(String str) {
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder e(@InterfaceC11300zs1 String str) {
            this.g = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder f(@InterfaceC11300zs1 String str) {
            this.d = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder g(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus != null) {
                this.b = registrationStatus;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        public Builder() {
        }

        public Builder(PersistedInstallationEntry persistedInstallationEntry) {
            this.a = persistedInstallationEntry.d();
            this.b = persistedInstallationEntry.g();
            this.c = persistedInstallationEntry.b();
            this.d = persistedInstallationEntry.f();
            this.e = Long.valueOf(persistedInstallationEntry.c());
            this.f = Long.valueOf(persistedInstallationEntry.h());
            this.g = persistedInstallationEntry.e();
        }
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @InterfaceC11300zs1
    public String b() {
        return this.d;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public long c() {
        return this.f;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @InterfaceC11300zs1
    public String d() {
        return this.b;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @InterfaceC11300zs1
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PersistedInstallationEntry) {
            PersistedInstallationEntry persistedInstallationEntry = (PersistedInstallationEntry) obj;
            String str4 = this.b;
            if (str4 != null ? str4.equals(persistedInstallationEntry.d()) : persistedInstallationEntry.d() == null) {
                if (this.c.equals(persistedInstallationEntry.g()) && ((str = this.d) != null ? str.equals(persistedInstallationEntry.b()) : persistedInstallationEntry.b() == null) && ((str2 = this.e) != null ? str2.equals(persistedInstallationEntry.f()) : persistedInstallationEntry.f() == null) && this.f == persistedInstallationEntry.c() && this.g == persistedInstallationEntry.h() && ((str3 = this.h) != null ? str3.equals(persistedInstallationEntry.e()) : persistedInstallationEntry.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @InterfaceC11300zs1
    public String f() {
        return this.e;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @InterfaceC5670cr1
    public PersistedInstallation.RegistrationStatus g() {
        return this.c;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public long h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j = this.f;
        long j2 = this.g;
        int i3 = (((((i2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i3 ^ i;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public PersistedInstallationEntry.Builder n() {
        return new Builder(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.b + ", registrationStatus=" + this.c + ", authToken=" + this.d + ", refreshToken=" + this.e + ", expiresInSecs=" + this.f + ", tokenCreationEpochInSecs=" + this.g + ", fisError=" + this.h + "}";
    }

    public AutoValue_PersistedInstallationEntry(@InterfaceC11300zs1 String str, PersistedInstallation.RegistrationStatus registrationStatus, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String str3, long j, long j2, @InterfaceC11300zs1 String str4) {
        this.b = str;
        this.c = registrationStatus;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = str4;
    }
}
