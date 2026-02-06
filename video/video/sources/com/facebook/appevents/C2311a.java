package com.facebook.appevents;

import com.facebook.C0376a;
import com.facebook.internal.l0;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.ObjectStreamException;
import java.io.Serializable;
import o.C6562gT0;
import o.C9516sY;
import o.C9998uW1;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HT1({HT1.a.Y})
/* renamed from: com.facebook.appevents.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2311a implements Serializable {
    @NotNull
    public static final C0069a Z = new C0069a(null);
    private static final long serialVersionUID = 1;
    @NotNull
    public final String X;
    @Nullable
    public final String Y;

    /* renamed from: com.facebook.appevents.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0069a {
        public /* synthetic */ C0069a(C9516sY c9516sY) {
            this();
        }

        public C0069a() {
        }
    }

    /* renamed from: com.facebook.appevents.a$b */
    /* loaded from: classes2.dex */
    public static final class b implements Serializable {
        @NotNull
        public static final C0070a Z = new C0070a(null);
        private static final long serialVersionUID = -2488473066578201069L;
        @Nullable
        public final String X;
        @NotNull
        public final String Y;

        /* renamed from: com.facebook.appevents.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0070a {
            public /* synthetic */ C0070a(C9516sY c9516sY) {
                this();
            }

            public C0070a() {
            }
        }

        public b(@Nullable String str, @NotNull String str2) {
            C6562gT0.p(str2, RemoteConfigConstants.RequestFieldKey.W);
            this.X = str;
            this.Y = str2;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new C2311a(this.X, this.Y);
        }
    }

    public C2311a(@Nullable String str, @NotNull String str2) {
        C6562gT0.p(str2, "applicationId");
        this.X = str2;
        l0 l0Var = l0.a;
        this.Y = l0.f0(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new b(this.Y, this.X);
    }

    @Nullable
    public final String a() {
        return this.Y;
    }

    @NotNull
    public final String b() {
        return this.X;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C2311a)) {
            return false;
        }
        l0 l0Var = l0.a;
        C2311a c2311a = (C2311a) obj;
        if (!l0.e(c2311a.Y, this.Y) || !l0.e(c2311a.X, this.X)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        String str = this.Y;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ this.X.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2311a(@NotNull C0376a c0376a) {
        this(r2, com.facebook.M.o());
        C6562gT0.p(c0376a, C9998uW1.m);
        String x = c0376a.x();
        com.facebook.M m = com.facebook.M.a;
    }
}
