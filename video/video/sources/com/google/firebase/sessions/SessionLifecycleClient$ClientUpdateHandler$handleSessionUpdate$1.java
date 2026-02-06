package com.google.firebase.sessions;

import android.util.Log;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Map;
import o.AbstractC4225Si2;
import o.C7289jT0;
import o.C7458kA2;
import o.FV;
import o.HM;
import o.InterfaceC9974uQ;
import o.RT1;
import o.VA0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FV(c = "com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1", f = "SessionLifecycleClient.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1 extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
    public int Z0;
    public final /* synthetic */ String a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(String str, HM<? super SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1> hm) {
        super(2, hm);
        this.a1 = str;
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
            FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.a;
            this.Z0 = 1;
            obj = firebaseSessionsDependencies.c(this);
            if (obj == l) {
                return l;
            }
        }
        String str = this.a1;
        for (SessionSubscriber sessionSubscriber : ((Map) obj).values()) {
            sessionSubscriber.c(new SessionSubscriber.SessionDetails(str));
            Log.d(SessionLifecycleClient.g, "Notified " + sessionSubscriber.b() + " of new session " + str);
        }
        return C7458kA2.a;
    }

    @Override // o.VA0
    @Nullable
    /* renamed from: U */
    public final Object i(@NotNull InterfaceC9974uQ interfaceC9974uQ, @Nullable HM<? super C7458kA2> hm) {
        return ((SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
    }

    @Override // o.AbstractC5644cl
    @NotNull
    public final HM<C7458kA2> t(@Nullable Object obj, @NotNull HM<?> hm) {
        return new SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(this.a1, hm);
    }
}
