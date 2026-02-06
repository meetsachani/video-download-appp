package com.facebook.internal;

import o.C6562gT0;
import o.C9545sf2;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class S {
    @NotNull
    public static final S a = new S();
    @NotNull
    public static final String b = "Unity.";
    @Nullable
    public static volatile String c;

    @InterfaceC9511sW0
    @Nullable
    public static final String a() {
        return c;
    }

    public static final boolean b() {
        String str = c;
        Boolean bool = null;
        if (str != null) {
            bool = Boolean.valueOf(C9545sf2.J2(str, b, false, 2, null));
        }
        return C6562gT0.g(bool, Boolean.TRUE);
    }

    @InterfaceC9511sW0
    public static /* synthetic */ void c() {
    }

    @InterfaceC9511sW0
    public static final void d(@NotNull String str) {
        C6562gT0.p(str, "value");
        c = str;
    }
}
