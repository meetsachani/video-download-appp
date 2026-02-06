package com.google.firebase.sessions.api;

import o.FV;
import o.HM;
import o.KM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FV(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", i = {0, 0, 0}, l = {123}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions", n = {"destination$iv$iv", "subscriberName", "$this$withLock_u24default$iv"}, s = {"L$0", "L$2", "L$3"})
/* loaded from: classes3.dex */
public final class FirebaseSessionsDependencies$getRegisteredSubscribers$1 extends KM {
    public Object Y0;
    public Object Z0;
    public Object a1;
    public Object b1;
    public Object c1;
    public Object d1;
    public /* synthetic */ Object e1;
    public final /* synthetic */ FirebaseSessionsDependencies f1;
    public int g1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseSessionsDependencies$getRegisteredSubscribers$1(FirebaseSessionsDependencies firebaseSessionsDependencies, HM<? super FirebaseSessionsDependencies$getRegisteredSubscribers$1> hm) {
        super(hm);
        this.f1 = firebaseSessionsDependencies;
    }

    @Override // o.AbstractC5644cl
    @Nullable
    public final Object F(@NotNull Object obj) {
        this.e1 = obj;
        this.g1 |= Integer.MIN_VALUE;
        return this.f1.c(this);
    }
}
