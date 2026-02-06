package com.google.firebase.sessions.settings;

import o.FV;
import o.HM;
import o.KM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FV(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", i = {0}, l = {134, 135}, m = "updateSettings", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class SessionsSettings$updateSettings$1 extends KM {
    public Object Y0;
    public /* synthetic */ Object Z0;
    public final /* synthetic */ SessionsSettings a1;
    public int b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionsSettings$updateSettings$1(SessionsSettings sessionsSettings, HM<? super SessionsSettings$updateSettings$1> hm) {
        super(hm);
        this.a1 = sessionsSettings;
    }

    @Override // o.AbstractC5644cl
    @Nullable
    public final Object F(@NotNull Object obj) {
        this.Z0 = obj;
        this.b1 |= Integer.MIN_VALUE;
        return this.a1.g(this);
    }
}
