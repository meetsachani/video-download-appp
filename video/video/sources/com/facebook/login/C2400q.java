package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.Z;
import com.facebook.internal.a0;
import com.facebook.login.w;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.facebook.login.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2400q extends a0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2400q(@NotNull Context context, @NotNull w.e eVar) {
        super(context, 65536, Z.W, Z.l, eVar.a(), eVar.q());
        C6562gT0.p(context, "context");
        C6562gT0.p(eVar, "request");
    }

    @Override // com.facebook.internal.a0
    public void f(@NotNull Bundle bundle) {
        C6562gT0.p(bundle, "data");
    }
}
