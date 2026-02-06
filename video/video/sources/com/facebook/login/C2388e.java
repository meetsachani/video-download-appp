package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import java.util.concurrent.locks.ReentrantLock;
import o.AbstractServiceConnectionC10961yT;
import o.C6562gT0;
import o.C9516sY;
import o.C9743tT;
import o.CT;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.login.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2388e extends AbstractServiceConnectionC10961yT {
    @Nullable
    public static CT Y0;
    @Nullable
    public static C9743tT Z;
    @NotNull
    public static final a Y = new a(null);
    @NotNull
    public static final ReentrantLock Z0 = new ReentrantLock();

    /* renamed from: com.facebook.login.e$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @Nullable
        public final CT b() {
            C2388e.Z0.lock();
            CT ct = C2388e.Y0;
            C2388e.Y0 = null;
            C2388e.Z0.unlock();
            return ct;
        }

        @InterfaceC9511sW0
        public final void c(@NotNull Uri uri) {
            C6562gT0.p(uri, "url");
            d();
            C2388e.Z0.lock();
            CT ct = C2388e.Y0;
            if (ct != null) {
                ct.k(uri, null, null);
            }
            C2388e.Z0.unlock();
        }

        public final void d() {
            C9743tT c9743tT;
            C2388e.Z0.lock();
            if (C2388e.Y0 == null && (c9743tT = C2388e.Z) != null) {
                a aVar = C2388e.Y;
                C2388e.Y0 = c9743tT.k(null);
            }
            C2388e.Z0.unlock();
        }

        public a() {
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final CT h() {
        return Y.b();
    }

    @InterfaceC9511sW0
    public static final void i(@NotNull Uri uri) {
        Y.c(uri);
    }

    @Override // o.AbstractServiceConnectionC10961yT
    public void b(@NotNull ComponentName componentName, @NotNull C9743tT c9743tT) {
        C6562gT0.p(componentName, "name");
        C6562gT0.p(c9743tT, "newClient");
        c9743tT.n(0L);
        Z = c9743tT;
        Y.d();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@NotNull ComponentName componentName) {
        C6562gT0.p(componentName, "componentName");
    }
}
