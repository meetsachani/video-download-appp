package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public final class FirebaseOptions {
    public static final String h = "google_api_key";
    public static final String i = "google_app_id";
    public static final String j = "firebase_database_url";
    public static final String k = "ga_trackingId";
    public static final String l = "gcm_defaultSenderId";
    public static final String m = "google_storage_bucket";
    public static final String n = "project_id";
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    /* loaded from: classes3.dex */
    public static final class Builder {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;

        public Builder() {
        }

        @InterfaceC5670cr1
        public FirebaseOptions a() {
            return new FirebaseOptions(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
        }

        @InterfaceC5670cr1
        public Builder b(@InterfaceC5670cr1 String str) {
            this.a = Preconditions.m(str, "ApiKey must be set.");
            return this;
        }

        @InterfaceC5670cr1
        public Builder c(@InterfaceC5670cr1 String str) {
            this.b = Preconditions.m(str, "ApplicationId must be set.");
            return this;
        }

        @InterfaceC5670cr1
        public Builder d(@InterfaceC11300zs1 String str) {
            this.c = str;
            return this;
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public Builder e(@InterfaceC11300zs1 String str) {
            this.d = str;
            return this;
        }

        @InterfaceC5670cr1
        public Builder f(@InterfaceC11300zs1 String str) {
            this.e = str;
            return this;
        }

        @InterfaceC5670cr1
        public Builder g(@InterfaceC11300zs1 String str) {
            this.g = str;
            return this;
        }

        @InterfaceC5670cr1
        public Builder h(@InterfaceC11300zs1 String str) {
            this.f = str;
            return this;
        }

        public Builder(@InterfaceC5670cr1 FirebaseOptions firebaseOptions) {
            this.b = firebaseOptions.b;
            this.a = firebaseOptions.a;
            this.c = firebaseOptions.c;
            this.d = firebaseOptions.d;
            this.e = firebaseOptions.e;
            this.f = firebaseOptions.f;
            this.g = firebaseOptions.g;
        }
    }

    @InterfaceC11300zs1
    public static FirebaseOptions h(@InterfaceC5670cr1 Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String a = stringResourceValueReader.a(i);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new FirebaseOptions(a, stringResourceValueReader.a(h), stringResourceValueReader.a(j), stringResourceValueReader.a(k), stringResourceValueReader.a(l), stringResourceValueReader.a(m), stringResourceValueReader.a(n));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        if (!Objects.b(this.b, firebaseOptions.b) || !Objects.b(this.a, firebaseOptions.a) || !Objects.b(this.c, firebaseOptions.c) || !Objects.b(this.d, firebaseOptions.d) || !Objects.b(this.e, firebaseOptions.e) || !Objects.b(this.f, firebaseOptions.f) || !Objects.b(this.g, firebaseOptions.g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.c(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
    }

    @InterfaceC5670cr1
    public String i() {
        return this.a;
    }

    @InterfaceC5670cr1
    public String j() {
        return this.b;
    }

    @InterfaceC11300zs1
    public String k() {
        return this.c;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public String l() {
        return this.d;
    }

    @InterfaceC11300zs1
    public String m() {
        return this.e;
    }

    @InterfaceC11300zs1
    public String n() {
        return this.g;
    }

    @InterfaceC11300zs1
    public String o() {
        return this.f;
    }

    public String toString() {
        return Objects.d(this).a("applicationId", this.b).a("apiKey", this.a).a("databaseUrl", this.c).a("gcmSenderId", this.e).a("storageBucket", this.f).a("projectId", this.g).toString();
    }

    public FirebaseOptions(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC11300zs1 String str3, @InterfaceC11300zs1 String str4, @InterfaceC11300zs1 String str5, @InterfaceC11300zs1 String str6, @InterfaceC11300zs1 String str7) {
        Preconditions.y(!Strings.b(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }
}
