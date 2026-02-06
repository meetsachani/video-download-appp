package com.google.firebase.sessions;

import o.FV;
import o.HM;
import o.KM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FV(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", i = {}, l = {113}, m = "getFirebaseInstallationId", n = {}, s = {})
/* loaded from: classes3.dex */
public final class SessionFirelogPublisherImpl$getFirebaseInstallationId$1 extends KM {
    public /* synthetic */ Object Y0;
    public final /* synthetic */ SessionFirelogPublisherImpl Z0;
    public int a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionFirelogPublisherImpl$getFirebaseInstallationId$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, HM<? super SessionFirelogPublisherImpl$getFirebaseInstallationId$1> hm) {
        super(hm);
        this.Z0 = sessionFirelogPublisherImpl;
    }

    @Override // o.AbstractC5644cl
    @Nullable
    public final Object F(@NotNull Object obj) {
        Object h;
        this.Y0 = obj;
        this.a1 |= Integer.MIN_VALUE;
        h = this.Z0.h(this);
        return h;
    }
}
