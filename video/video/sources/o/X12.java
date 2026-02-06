package o;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class X12 {
    @NotNull
    public static final a g = new a(null);
    @NotNull
    public static final String h = "com.facebook.appevents.SessionInfo.sessionStartTime";
    @NotNull
    public static final String i = "com.facebook.appevents.SessionInfo.sessionEndTime";
    @NotNull
    public static final String j = "com.facebook.appevents.SessionInfo.interruptionCount";
    @NotNull
    public static final String k = "com.facebook.appevents.SessionInfo.sessionId";
    @Nullable
    public final Long a;
    @Nullable
    public Long b;
    @NotNull
    public UUID c;
    public int d;
    @Nullable
    public Long e;
    @Nullable
    public C7313ja2 f;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final void a() {
            com.facebook.M m = com.facebook.M.a;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(com.facebook.M.n()).edit();
            edit.remove(X12.h);
            edit.remove(X12.i);
            edit.remove(X12.j);
            edit.remove(X12.k);
            edit.apply();
            C7313ja2.c.a();
        }

        @InterfaceC9511sW0
        @Nullable
        public final X12 b() {
            com.facebook.M m = com.facebook.M.a;
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.facebook.M.n());
            long j = defaultSharedPreferences.getLong(X12.h, 0L);
            long j2 = defaultSharedPreferences.getLong(X12.i, 0L);
            String string = defaultSharedPreferences.getString(X12.k, null);
            if (j == 0 || j2 == 0 || string == null) {
                return null;
            }
            X12 x12 = new X12(Long.valueOf(j), Long.valueOf(j2), null, 4, null);
            x12.d = defaultSharedPreferences.getInt(X12.j, 0);
            x12.o(C7313ja2.c.b());
            x12.l(Long.valueOf(System.currentTimeMillis()));
            UUID fromString = UUID.fromString(string);
            C6562gT0.o(fromString, "fromString(sessionIDStr)");
            x12.m(fromString);
            return x12;
        }

        public a() {
        }
    }

    @InterfaceC8289nW0
    public X12(@Nullable Long l, @Nullable Long l2) {
        this(l, l2, null, 4, null);
    }

    @InterfaceC9511sW0
    public static final void b() {
        g.a();
    }

    @InterfaceC9511sW0
    @Nullable
    public static final X12 j() {
        return g.b();
    }

    @Nullable
    public final Long c() {
        Long l = this.e;
        if (l == null) {
            return 0L;
        }
        return l;
    }

    public final int d() {
        return this.d;
    }

    @NotNull
    public final UUID e() {
        return this.c;
    }

    @Nullable
    public final Long f() {
        return this.b;
    }

    public final long g() {
        Long l;
        if (this.a != null && (l = this.b) != null) {
            if (l != null) {
                return l.longValue() - this.a.longValue();
            }
            throw new IllegalStateException("Required value was null.");
        }
        return 0L;
    }

    @Nullable
    public final Long h() {
        return this.a;
    }

    @Nullable
    public final C7313ja2 i() {
        return this.f;
    }

    public final void k() {
        this.d++;
    }

    public final void l(@Nullable Long l) {
        this.e = l;
    }

    public final void m(@NotNull UUID uuid) {
        C6562gT0.p(uuid, "<set-?>");
        this.c = uuid;
    }

    public final void n(@Nullable Long l) {
        this.b = l;
    }

    public final void o(@Nullable C7313ja2 c7313ja2) {
        this.f = c7313ja2;
    }

    public final void p() {
        long longValue;
        com.facebook.M m = com.facebook.M.a;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(com.facebook.M.n()).edit();
        Long l = this.a;
        long j2 = 0;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        edit.putLong(h, longValue);
        Long l2 = this.b;
        if (l2 != null) {
            j2 = l2.longValue();
        }
        edit.putLong(i, j2);
        edit.putInt(j, this.d);
        edit.putString(k, this.c.toString());
        edit.apply();
        C7313ja2 c7313ja2 = this.f;
        if (c7313ja2 != null && c7313ja2 != null) {
            c7313ja2.e();
        }
    }

    @InterfaceC8289nW0
    public X12(@Nullable Long l, @Nullable Long l2, @NotNull UUID uuid) {
        C6562gT0.p(uuid, "sessionId");
        this.a = l;
        this.b = l2;
        this.c = uuid;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ X12(Long l, Long l2, UUID uuid, int i2, C9516sY c9516sY) {
        this(l, l2, uuid);
        if ((i2 & 4) != 0) {
            uuid = UUID.randomUUID();
            C6562gT0.o(uuid, "randomUUID()");
        }
    }
}
