package com.facebook.login;

import o.C10763xf2;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class O {
    @NotNull
    public static final O a = new O();

    @InterfaceC9511sW0
    public static final boolean a(@Nullable String str) {
        boolean z = false;
        if (str == null || str.length() == 0) {
            return false;
        }
        if (C10763xf2.I3(str, ' ', 0, false, 6, null) >= 0) {
            z = true;
        }
        return !z;
    }
}
