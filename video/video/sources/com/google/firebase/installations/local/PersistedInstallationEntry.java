package com.google.firebase.installations.local;

import com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry;
import com.google.firebase.installations.local.PersistedInstallation;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC6615gi;

@InterfaceC6615gi
/* loaded from: classes3.dex */
public abstract class PersistedInstallationEntry {
    @InterfaceC5670cr1
    public static PersistedInstallationEntry a = a().a();

    @InterfaceC6615gi.a
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        @InterfaceC5670cr1
        public abstract PersistedInstallationEntry a();

        @InterfaceC5670cr1
        public abstract Builder b(@InterfaceC11300zs1 String str);

        @InterfaceC5670cr1
        public abstract Builder c(long j);

        @InterfaceC5670cr1
        public abstract Builder d(@InterfaceC5670cr1 String str);

        @InterfaceC5670cr1
        public abstract Builder e(@InterfaceC11300zs1 String str);

        @InterfaceC5670cr1
        public abstract Builder f(@InterfaceC11300zs1 String str);

        @InterfaceC5670cr1
        public abstract Builder g(@InterfaceC5670cr1 PersistedInstallation.RegistrationStatus registrationStatus);

        @InterfaceC5670cr1
        public abstract Builder h(long j);
    }

    @InterfaceC5670cr1
    public static Builder a() {
        return new AutoValue_PersistedInstallationEntry.Builder().h(0L).g(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION).c(0L);
    }

    @InterfaceC11300zs1
    public abstract String b();

    public abstract long c();

    @InterfaceC11300zs1
    public abstract String d();

    @InterfaceC11300zs1
    public abstract String e();

    @InterfaceC11300zs1
    public abstract String f();

    @InterfaceC5670cr1
    public abstract PersistedInstallation.RegistrationStatus g();

    public abstract long h();

    public boolean i() {
        if (g() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (g() != PersistedInstallation.RegistrationStatus.NOT_GENERATED && g() != PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
            return false;
        }
        return true;
    }

    public boolean k() {
        if (g() == PersistedInstallation.RegistrationStatus.REGISTERED) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if (g() == PersistedInstallation.RegistrationStatus.UNREGISTERED) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (g() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    @InterfaceC5670cr1
    public abstract Builder n();

    @InterfaceC5670cr1
    public PersistedInstallationEntry o(@InterfaceC5670cr1 String str, long j, long j2) {
        return n().b(str).c(j).h(j2).a();
    }

    @InterfaceC5670cr1
    public PersistedInstallationEntry p() {
        return n().b(null).a();
    }

    @InterfaceC5670cr1
    public PersistedInstallationEntry q(@InterfaceC5670cr1 String str) {
        return n().e(str).g(PersistedInstallation.RegistrationStatus.REGISTER_ERROR).a();
    }

    @InterfaceC5670cr1
    public PersistedInstallationEntry r() {
        return n().g(PersistedInstallation.RegistrationStatus.NOT_GENERATED).a();
    }

    @InterfaceC5670cr1
    public PersistedInstallationEntry s(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, long j, @InterfaceC11300zs1 String str3, long j2) {
        return n().d(str).g(PersistedInstallation.RegistrationStatus.REGISTERED).b(str3).f(str2).c(j2).h(j).a();
    }

    @InterfaceC5670cr1
    public PersistedInstallationEntry t(@InterfaceC5670cr1 String str) {
        return n().d(str).g(PersistedInstallation.RegistrationStatus.UNREGISTERED).a();
    }
}
