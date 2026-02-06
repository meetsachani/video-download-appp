package com.google.firebase.sessions;

import android.os.Message;
import android.util.Log;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import o.AbstractC4225Si2;
import o.C10662xF;
import o.C11156zH;
import o.C7289jT0;
import o.C7458kA2;
import o.C8222nF;
import o.FV;
import o.HM;
import o.InterfaceC9974uQ;
import o.RT1;
import o.VA0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FV(c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", f = "SessionLifecycleClient.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class SessionLifecycleClient$sendLifecycleEvents$1 extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
    public int Z0;
    public final /* synthetic */ SessionLifecycleClient a1;
    public final /* synthetic */ List<Message> b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionLifecycleClient$sendLifecycleEvents$1(SessionLifecycleClient sessionLifecycleClient, List<Message> list, HM<? super SessionLifecycleClient$sendLifecycleEvents$1> hm) {
        super(2, hm);
        this.a1 = sessionLifecycleClient;
        this.b1 = list;
    }

    @Override // o.AbstractC5644cl
    @Nullable
    public final Object F(@NotNull Object obj) {
        Message l;
        Message l2;
        Object l3 = C7289jT0.l();
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
            if (obj == l3) {
                return l3;
            }
        }
        Map map = (Map) obj;
        if (map.isEmpty()) {
            Log.d(SessionLifecycleClient.g, "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
        } else {
            Collection<SessionSubscriber> values = map.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                for (SessionSubscriber sessionSubscriber : values) {
                    if (sessionSubscriber.a()) {
                        l = this.a1.l(this.b1, 2);
                        l2 = this.a1.l(this.b1, 1);
                        SessionLifecycleClient sessionLifecycleClient = this.a1;
                        for (Message message : C10662xF.x5(C10662xF.v2(C8222nF.S(l, l2)), new Comparator() { // from class: com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return C11156zH.l(Long.valueOf(((Message) t).getWhen()), Long.valueOf(((Message) t2).getWhen()));
                            }
                        })) {
                            sessionLifecycleClient.p(message);
                        }
                    }
                }
            }
            Log.d(SessionLifecycleClient.g, "Data Collection is disabled for all subscribers. Skipping this Event");
        }
        return C7458kA2.a;
    }

    @Override // o.VA0
    @Nullable
    /* renamed from: U */
    public final Object i(@NotNull InterfaceC9974uQ interfaceC9974uQ, @Nullable HM<? super C7458kA2> hm) {
        return ((SessionLifecycleClient$sendLifecycleEvents$1) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
    }

    @Override // o.AbstractC5644cl
    @NotNull
    public final HM<C7458kA2> t(@Nullable Object obj, @NotNull HM<?> hm) {
        return new SessionLifecycleClient$sendLifecycleEvents$1(this.a1, this.b1, hm);
    }
}
