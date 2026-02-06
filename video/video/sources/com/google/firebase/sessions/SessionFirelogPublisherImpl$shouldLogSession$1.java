package com.google.firebase.sessions;

import o.FV;
import o.HM;
import o.KM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FV(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", i = {0}, l = {95}, m = "shouldLogSession", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class SessionFirelogPublisherImpl$shouldLogSession$1 extends KM {
    public Object Y0;
    public /* synthetic */ Object Z0;
    public final /* synthetic */ SessionFirelogPublisherImpl a1;
    public int b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionFirelogPublisherImpl$shouldLogSession$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, HM<? super SessionFirelogPublisherImpl$shouldLogSession$1> hm) {
        super(hm);
        this.a1 = sessionFirelogPublisherImpl;
    }

    @Override // o.AbstractC5644cl
    @Nullable
    public final Object F(@NotNull Object obj) {
        Object j;
        this.Z0 = obj;
        this.b1 |= Integer.MIN_VALUE;
        j = this.a1.j(this);
        return j;
    }
}
