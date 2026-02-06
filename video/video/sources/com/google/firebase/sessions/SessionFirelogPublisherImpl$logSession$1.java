package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.List;
import java.util.Map;
import o.AbstractC4225Si2;
import o.C6562gT0;
import o.C7289jT0;
import o.C7458kA2;
import o.FV;
import o.HM;
import o.InterfaceC9974uQ;
import o.RT1;
import o.VA0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FV(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", i = {}, l = {64, 72, 73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class SessionFirelogPublisherImpl$logSession$1 extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
    public Object Z0;
    public Object a1;
    public Object b1;
    public Object c1;
    public Object d1;
    public Object e1;
    public Object f1;
    public Object g1;
    public int h1;
    public final /* synthetic */ SessionFirelogPublisherImpl i1;
    public final /* synthetic */ SessionDetails j1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionFirelogPublisherImpl$logSession$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, SessionDetails sessionDetails, HM<? super SessionFirelogPublisherImpl$logSession$1> hm) {
        super(2, hm);
        this.i1 = sessionFirelogPublisherImpl;
        this.j1 = sessionDetails;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fa  */
    @Override // o.AbstractC5644cl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(@NotNull Object obj) {
        FirebaseApp firebaseApp;
        SessionDetails sessionDetails;
        SessionsSettings sessionsSettings;
        FirebaseApp firebaseApp2;
        FirebaseApp firebaseApp3;
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
        ProcessDetails processDetails;
        SessionEvents sessionEvents;
        List<ProcessDetails> list;
        FirebaseApp firebaseApp4;
        SessionsSettings sessionsSettings2;
        Object h;
        Map<SessionSubscriber.Name, ? extends SessionSubscriber> map;
        SessionDetails sessionDetails2;
        List<ProcessDetails> list2;
        FirebaseApp firebaseApp5;
        ProcessDetails processDetails2;
        SessionsSettings sessionsSettings3;
        SessionEvents sessionEvents2;
        Object l = C7289jT0.l();
        int i = this.h1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        sessionsSettings3 = (SessionsSettings) this.d1;
                        SessionDetails sessionDetails3 = (SessionDetails) this.c1;
                        FirebaseApp firebaseApp6 = (FirebaseApp) this.b1;
                        SessionEvents sessionEvents3 = (SessionEvents) this.a1;
                        RT1.n(obj);
                        map = (Map) this.g1;
                        sessionEvents2 = sessionEvents3;
                        list2 = (List) this.f1;
                        firebaseApp5 = firebaseApp6;
                        processDetails2 = (ProcessDetails) this.e1;
                        sessionDetails2 = sessionDetails3;
                        sessionFirelogPublisherImpl = (SessionFirelogPublisherImpl) this.Z0;
                        C6562gT0.o(obj, "getFirebaseInstallationId()");
                        sessionFirelogPublisherImpl.g(sessionEvents2.a(firebaseApp5, sessionDetails2, sessionsSettings3, processDetails2, list2, map, (String) obj));
                        return C7458kA2.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.f1;
                processDetails = (ProcessDetails) this.e1;
                sessionsSettings2 = (SessionsSettings) this.d1;
                sessionDetails = (SessionDetails) this.c1;
                firebaseApp4 = (FirebaseApp) this.b1;
                sessionEvents = (SessionEvents) this.a1;
                sessionFirelogPublisherImpl = (SessionFirelogPublisherImpl) this.Z0;
                RT1.n(obj);
                Map<SessionSubscriber.Name, ? extends SessionSubscriber> map2 = (Map) obj;
                SessionFirelogPublisherImpl sessionFirelogPublisherImpl2 = this.i1;
                this.Z0 = sessionFirelogPublisherImpl;
                this.a1 = sessionEvents;
                this.b1 = firebaseApp4;
                this.c1 = sessionDetails;
                this.d1 = sessionsSettings2;
                this.e1 = processDetails;
                this.f1 = list;
                this.g1 = map2;
                this.h1 = 3;
                h = sessionFirelogPublisherImpl2.h(this);
                if (h != l) {
                    FirebaseApp firebaseApp7 = firebaseApp4;
                    map = map2;
                    obj = h;
                    sessionDetails2 = sessionDetails;
                    list2 = list;
                    firebaseApp5 = firebaseApp7;
                    SessionsSettings sessionsSettings4 = sessionsSettings2;
                    processDetails2 = processDetails;
                    sessionsSettings3 = sessionsSettings4;
                    sessionEvents2 = sessionEvents;
                    C6562gT0.o(obj, "getFirebaseInstallationId()");
                    sessionFirelogPublisherImpl.g(sessionEvents2.a(firebaseApp5, sessionDetails2, sessionsSettings3, processDetails2, list2, map, (String) obj));
                    return C7458kA2.a;
                }
                return l;
            }
            RT1.n(obj);
        } else {
            RT1.n(obj);
            SessionFirelogPublisherImpl sessionFirelogPublisherImpl3 = this.i1;
            this.h1 = 1;
            obj = sessionFirelogPublisherImpl3.j(this);
        }
        if (((Boolean) obj).booleanValue()) {
            SessionFirelogPublisherImpl sessionFirelogPublisherImpl4 = this.i1;
            SessionEvents sessionEvents4 = SessionEvents.a;
            firebaseApp = sessionFirelogPublisherImpl4.b;
            sessionDetails = this.j1;
            sessionsSettings = this.i1.d;
            ProcessDetailsProvider processDetailsProvider = ProcessDetailsProvider.a;
            firebaseApp2 = this.i1.b;
            Context n = firebaseApp2.n();
            C6562gT0.o(n, "firebaseApp.applicationContext");
            ProcessDetails d = processDetailsProvider.d(n);
            firebaseApp3 = this.i1.b;
            Context n2 = firebaseApp3.n();
            C6562gT0.o(n2, "firebaseApp.applicationContext");
            List<ProcessDetails> c = processDetailsProvider.c(n2);
            FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.a;
            this.Z0 = sessionFirelogPublisherImpl4;
            this.a1 = sessionEvents4;
            this.b1 = firebaseApp;
            this.c1 = sessionDetails;
            this.d1 = sessionsSettings;
            this.e1 = d;
            this.f1 = c;
            this.h1 = 2;
            Object c2 = firebaseSessionsDependencies.c(this);
            if (c2 != l) {
                sessionFirelogPublisherImpl = sessionFirelogPublisherImpl4;
                obj = c2;
                processDetails = d;
                sessionEvents = sessionEvents4;
                list = c;
                firebaseApp4 = firebaseApp;
                sessionsSettings2 = sessionsSettings;
                Map<SessionSubscriber.Name, ? extends SessionSubscriber> map22 = (Map) obj;
                SessionFirelogPublisherImpl sessionFirelogPublisherImpl22 = this.i1;
                this.Z0 = sessionFirelogPublisherImpl;
                this.a1 = sessionEvents;
                this.b1 = firebaseApp4;
                this.c1 = sessionDetails;
                this.d1 = sessionsSettings2;
                this.e1 = processDetails;
                this.f1 = list;
                this.g1 = map22;
                this.h1 = 3;
                h = sessionFirelogPublisherImpl22.h(this);
                if (h != l) {
                }
            }
            return l;
        }
        return C7458kA2.a;
    }

    @Override // o.VA0
    @Nullable
    /* renamed from: U */
    public final Object i(@NotNull InterfaceC9974uQ interfaceC9974uQ, @Nullable HM<? super C7458kA2> hm) {
        return ((SessionFirelogPublisherImpl$logSession$1) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
    }

    @Override // o.AbstractC5644cl
    @NotNull
    public final HM<C7458kA2> t(@Nullable Object obj, @NotNull HM<?> hm) {
        return new SessionFirelogPublisherImpl$logSession$1(this.i1, this.j1, hm);
    }
}
