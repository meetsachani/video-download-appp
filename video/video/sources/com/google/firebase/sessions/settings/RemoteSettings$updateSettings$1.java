package com.google.firebase.sessions.settings;

import o.C7193j50;
import o.FV;
import o.HM;
import o.KM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FV(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", i = {0, 0, 1, 1, 2}, l = {C7193j50.f, 76, 94}, m = "updateSettings", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
/* loaded from: classes3.dex */
public final class RemoteSettings$updateSettings$1 extends KM {
    public Object Y0;
    public Object Z0;
    public /* synthetic */ Object a1;
    public final /* synthetic */ RemoteSettings b1;
    public int c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$updateSettings$1(RemoteSettings remoteSettings, HM<? super RemoteSettings$updateSettings$1> hm) {
        super(hm);
        this.b1 = remoteSettings;
    }

    @Override // o.AbstractC5644cl
    @Nullable
    public final Object F(@NotNull Object obj) {
        this.a1 = obj;
        this.c1 |= Integer.MIN_VALUE;
        return this.b1.d(this);
    }
}
