package com.facebook.internal;

import android.content.Intent;
import java.util.UUID;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC8289nW0;
import o.InterfaceC9511sW0;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.internal.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2357b {
    @NotNull
    public static final a d = new a(null);
    @Nullable
    public static C2357b e;
    public int a;
    @NotNull
    public final UUID b;
    @Nullable
    public Intent c;

    /* renamed from: com.facebook.internal.b$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @Nullable
        public final synchronized C2357b b(@NotNull UUID uuid, int i) {
            C6562gT0.p(uuid, "callId");
            C2357b c = c();
            if (c != null && C6562gT0.g(c.d(), uuid) && c.e() == i) {
                d(null);
                return c;
            }
            return null;
        }

        @Nullable
        public final C2357b c() {
            return C2357b.a();
        }

        public final synchronized boolean d(C2357b c2357b) {
            boolean z;
            C2357b c = c();
            C2357b.b(c2357b);
            if (c != null) {
                z = true;
            } else {
                z = false;
            }
            return z;
        }

        public a() {
        }
    }

    @InterfaceC8289nW0
    public C2357b(int i) {
        this(i, null, 2, null);
    }

    public static final /* synthetic */ C2357b a() {
        if (SQ.e(C2357b.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            SQ.c(th, C2357b.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(C2357b c2357b) {
        if (SQ.e(C2357b.class)) {
            return;
        }
        try {
            e = c2357b;
        } catch (Throwable th) {
            SQ.c(th, C2357b.class);
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final synchronized C2357b c(@NotNull UUID uuid, int i) {
        synchronized (C2357b.class) {
            if (SQ.e(C2357b.class)) {
                return null;
            }
            return d.b(uuid, i);
        }
    }

    @NotNull
    public final UUID d() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return this.b;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final int e() {
        if (SQ.e(this)) {
            return 0;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            SQ.c(th, this);
            return 0;
        }
    }

    @Nullable
    public final Intent f() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return this.c;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final boolean g() {
        if (!SQ.e(this)) {
            try {
                return d.d(this);
            } catch (Throwable th) {
                SQ.c(th, this);
                return false;
            }
        }
        return false;
    }

    public final void h(int i) {
        if (SQ.e(this)) {
            return;
        }
        try {
            this.a = i;
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void i(@Nullable Intent intent) {
        if (SQ.e(this)) {
            return;
        }
        try {
            this.c = intent;
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    @InterfaceC8289nW0
    public C2357b(int i, @NotNull UUID uuid) {
        C6562gT0.p(uuid, "callId");
        this.a = i;
        this.b = uuid;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C2357b(int i, UUID uuid, int i2, C9516sY c9516sY) {
        this(i, uuid);
        if ((i2 & 2) != 0) {
            uuid = UUID.randomUUID();
            C6562gT0.o(uuid, "randomUUID()");
        }
    }
}
