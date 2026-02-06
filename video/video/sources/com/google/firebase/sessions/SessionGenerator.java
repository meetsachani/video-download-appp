package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import java.util.Locale;
import java.util.UUID;
import o.C6562gT0;
import o.C7964mB0;
import o.C9516sY;
import o.C9545sf2;
import o.FA0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class SessionGenerator {
    @NotNull
    public static final Companion f = new Companion(null);
    @NotNull
    public final TimeProvider a;
    @NotNull
    public final FA0<UUID> b;
    @NotNull
    public final String c;
    public int d;
    public SessionDetails e;

    /* renamed from: com.google.firebase.sessions.SessionGenerator$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class AnonymousClass1 extends C7964mB0 implements FA0<UUID> {
        public static final AnonymousClass1 e1 = new AnonymousClass1();

        public AnonymousClass1() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // o.FA0
        /* renamed from: u0 */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final SessionGenerator a() {
            Object l = FirebaseKt.c(Firebase.a).l(SessionGenerator.class);
            C6562gT0.o(l, "Firebase.app[SessionGenerator::class.java]");
            return (SessionGenerator) l;
        }

        private Companion() {
        }
    }

    public SessionGenerator(@NotNull TimeProvider timeProvider, @NotNull FA0<UUID> fa0) {
        C6562gT0.p(timeProvider, "timeProvider");
        C6562gT0.p(fa0, "uuidGenerator");
        this.a = timeProvider;
        this.b = fa0;
        this.c = b();
        this.d = -1;
    }

    @NotNull
    public final SessionDetails a() {
        String b;
        int i = this.d + 1;
        this.d = i;
        if (i == 0) {
            b = this.c;
        } else {
            b = b();
        }
        this.e = new SessionDetails(b, this.c, this.d, this.a.b());
        return c();
    }

    public final String b() {
        String uuid = this.b.invoke().toString();
        C6562gT0.o(uuid, "uuidGenerator().toString()");
        String lowerCase = C9545sf2.z2(uuid, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        C6562gT0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @NotNull
    public final SessionDetails c() {
        SessionDetails sessionDetails = this.e;
        if (sessionDetails != null) {
            return sessionDetails;
        }
        C6562gT0.S("currentSession");
        return null;
    }

    public final boolean d() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public /* synthetic */ SessionGenerator(TimeProvider timeProvider, FA0 fa0, int i, C9516sY c9516sY) {
        this(timeProvider, (i & 2) != 0 ? AnonymousClass1.e1 : fa0);
    }
}
