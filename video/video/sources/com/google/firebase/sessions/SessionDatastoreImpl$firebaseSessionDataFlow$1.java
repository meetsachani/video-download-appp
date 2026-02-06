package com.google.firebase.sessions;

import android.util.Log;
import o.AbstractC10668xG1;
import o.AbstractC4225Si2;
import o.C10911yG1;
import o.C7289jT0;
import o.C7458kA2;
import o.FV;
import o.HM;
import o.InterfaceC4076Qv0;
import o.RT1;
import o.XA0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FV(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class SessionDatastoreImpl$firebaseSessionDataFlow$1 extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super AbstractC10668xG1>, Throwable, HM<? super C7458kA2>, Object> {
    public int Z0;
    public /* synthetic */ Object a1;
    public /* synthetic */ Object b1;

    public SessionDatastoreImpl$firebaseSessionDataFlow$1(HM<? super SessionDatastoreImpl$firebaseSessionDataFlow$1> hm) {
        super(3, hm);
    }

    @Override // o.AbstractC5644cl
    @Nullable
    public final Object F(@NotNull Object obj) {
        Object l = C7289jT0.l();
        int i = this.Z0;
        if (i != 0) {
            if (i == 1) {
                RT1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            RT1.n(obj);
            Log.e(SessionDatastoreImpl.g, "Error reading stored session data.", (Throwable) this.b1);
            AbstractC10668xG1 b = C10911yG1.b();
            this.a1 = null;
            this.Z0 = 1;
            if (((InterfaceC4076Qv0) this.a1).c(b, this) == l) {
                return l;
            }
        }
        return C7458kA2.a;
    }

    @Override // o.XA0
    @Nullable
    /* renamed from: U */
    public final Object P(@NotNull InterfaceC4076Qv0<? super AbstractC10668xG1> interfaceC4076Qv0, @NotNull Throwable th, @Nullable HM<? super C7458kA2> hm) {
        SessionDatastoreImpl$firebaseSessionDataFlow$1 sessionDatastoreImpl$firebaseSessionDataFlow$1 = new SessionDatastoreImpl$firebaseSessionDataFlow$1(hm);
        sessionDatastoreImpl$firebaseSessionDataFlow$1.a1 = interfaceC4076Qv0;
        sessionDatastoreImpl$firebaseSessionDataFlow$1.b1 = th;
        return sessionDatastoreImpl$firebaseSessionDataFlow$1.F(C7458kA2.a);
    }
}
