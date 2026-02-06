package com.facebook.bolts;

import android.content.Intent;
import android.os.Bundle;
import o.C6562gT0;
import o.C9998uW1;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.bolts.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2333e {
    @NotNull
    public static final C2333e a = new C2333e();
    @NotNull
    public static final String b = "al_applink_data";
    @NotNull
    public static final String c = "extras";

    @InterfaceC9511sW0
    @Nullable
    public static final Bundle a(@NotNull Intent intent) {
        C6562gT0.p(intent, C9998uW1.R);
        return intent.getBundleExtra("al_applink_data");
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Bundle b(@NotNull Intent intent) {
        C6562gT0.p(intent, C9998uW1.R);
        Bundle a2 = a(intent);
        if (a2 == null) {
            return null;
        }
        return a2.getBundle("extras");
    }
}
