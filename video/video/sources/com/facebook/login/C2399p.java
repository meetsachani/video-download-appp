package com.facebook.login;

import android.net.Uri;
import com.facebook.login.w;
import java.util.Collection;
import o.AbstractC8052mY0;
import o.C6551gQ1;
import o.C9516sY;
import o.EY0;
import o.FA0;
import o.HJ1;
import o.SQ;
import o.TW0;
import o.WY0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.login.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2399p extends G {
    @NotNull
    public static final b t = new b(null);
    @NotNull
    public static final EY0<C2399p> u = WY0.b(a.X);
    @Nullable
    public Uri r;
    @Nullable
    public String s;

    /* renamed from: com.facebook.login.p$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC8052mY0 implements FA0<C2399p> {
        public static final a X = new a();

        public a() {
            super(0);
        }

        @Override // o.FA0
        @NotNull
        /* renamed from: c */
        public final C2399p invoke() {
            return new C2399p();
        }
    }

    /* renamed from: com.facebook.login.p$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public static final /* synthetic */ TW0<Object>[] a = {C6551gQ1.u(new HJ1(C6551gQ1.d(b.class), "instance", "getInstance()Lcom/facebook/login/DeviceLoginManager;"))};

        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final C2399p a() {
            return (C2399p) C2399p.R0().getValue();
        }

        public b() {
        }
    }

    public static final /* synthetic */ EY0 R0() {
        if (SQ.e(C2399p.class)) {
            return null;
        }
        try {
            return u;
        } catch (Throwable th) {
            SQ.c(th, C2399p.class);
            return null;
        }
    }

    @Nullable
    public final String S0() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return this.s;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    @Nullable
    public final Uri T0() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return this.r;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final void U0(@Nullable String str) {
        if (SQ.e(this)) {
            return;
        }
        try {
            this.s = str;
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void V0(@Nullable Uri uri) {
        if (SQ.e(this)) {
            return;
        }
        try {
            this.r = uri;
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    @Override // com.facebook.login.G
    @NotNull
    public w.e o(@Nullable Collection<String> collection) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            w.e o2 = super.o(collection);
            Uri uri = this.r;
            if (uri != null) {
                o2.B(uri.toString());
            }
            String str = this.s;
            if (str == null) {
                return o2;
            }
            o2.A(str);
            return o2;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }
}
