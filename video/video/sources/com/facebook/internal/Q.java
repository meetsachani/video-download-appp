package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.C0376a;
import o.C10763xf2;
import o.C6562gT0;
import o.InterfaceC9511sW0;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class Q {
    @NotNull
    public static final Q a = new Q();
    @NotNull
    public static final String b = "is_referrer_updated";

    /* loaded from: classes2.dex */
    public interface a {
        void a(@Nullable String str);
    }

    /* loaded from: classes2.dex */
    public static final class b implements InstallReferrerStateListener {
        public final /* synthetic */ InstallReferrerClient a;
        public final /* synthetic */ a b;

        public b(InstallReferrerClient installReferrerClient, a aVar) {
            this.a = installReferrerClient;
            this.b = aVar;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void a(int i) {
            if (!SQ.e(this)) {
                try {
                    if (i != 0) {
                        if (i == 2) {
                            Q.a.e();
                        }
                    } else {
                        try {
                            ReferrerDetails b = this.a.b();
                            C6562gT0.o(b, "{\n                      referrerClient.installReferrer\n                    }");
                            String b2 = b.b();
                            if (b2 != null && (C10763xf2.n3(b2, "fb", false, 2, null) || C10763xf2.n3(b2, C0376a.m1, false, 2, null))) {
                                this.b.a(b2);
                            }
                            Q.a.e();
                        } catch (RemoteException | Exception unused) {
                            return;
                        }
                    }
                    this.a.a();
                } catch (Throwable th) {
                    SQ.c(th, this);
                }
            }
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void b() {
        }
    }

    @InterfaceC9511sW0
    public static final void d(@NotNull a aVar) {
        C6562gT0.p(aVar, "callback");
        Q q = a;
        if (!q.b()) {
            q.c(aVar);
        }
    }

    public final boolean b() {
        com.facebook.M m = com.facebook.M.a;
        return com.facebook.M.n().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean(b, false);
    }

    public final void c(a aVar) {
        com.facebook.M m = com.facebook.M.a;
        InstallReferrerClient a2 = InstallReferrerClient.d(com.facebook.M.n()).a();
        try {
            a2.e(new b(a2, aVar));
        } catch (Exception unused) {
        }
    }

    public final void e() {
        com.facebook.M m = com.facebook.M.a;
        com.facebook.M.n().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean(b, true).apply();
    }
}
