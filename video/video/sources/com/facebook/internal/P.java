package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import o.C6562gT0;
import o.C9516sY;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class P extends C2363h {
    @NotNull
    public static final a c = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final Uri a(@NotNull String str, @Nullable Bundle bundle) {
            C6562gT0.p(str, "action");
            if (C6562gT0.g(str, "oauth")) {
                l0 l0Var = l0.a;
                c0 c0Var = c0.a;
                return l0.g(c0.k(), c0.a0, bundle);
            }
            l0 l0Var2 = l0.a;
            c0 c0Var2 = c0.a;
            String k = c0.k();
            StringBuilder sb = new StringBuilder();
            com.facebook.M m = com.facebook.M.a;
            sb.append(com.facebook.M.B());
            sb.append("/dialog/");
            sb.append(str);
            return l0.g(k, sb.toString(), bundle);
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(@NotNull String str, @Nullable Bundle bundle) {
        super(str, bundle);
        C6562gT0.p(str, "action");
        d(c.a(str, bundle == null ? new Bundle() : bundle));
    }
}
