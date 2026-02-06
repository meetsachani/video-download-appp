package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.FirebaseKt;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Collection;
import java.util.Map;
import o.AbstractC4225Si2;
import o.C10217vQ;
import o.C5910dr;
import o.C6562gT0;
import o.C7289jT0;
import o.C7458kA2;
import o.C9516sY;
import o.FV;
import o.HM;
import o.InterfaceC5809dQ;
import o.InterfaceC9974uQ;
import o.RT1;
import o.VA0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class FirebaseSessions {
    @NotNull
    public static final Companion c = new Companion(null);
    @NotNull
    public static final String d = "FirebaseSessions";
    @NotNull
    public final FirebaseApp a;
    @NotNull
    public final SessionsSettings b;

    @FV(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", i = {}, l = {44, 48}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.google.firebase.sessions.FirebaseSessions$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
        public int Z0;
        public final /* synthetic */ InterfaceC5809dQ b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC5809dQ interfaceC5809dQ, HM<? super AnonymousClass1> hm) {
            super(2, hm);
            this.b1 = interfaceC5809dQ;
        }

        public static final void k0(String str, FirebaseOptions firebaseOptions) {
            Log.w(FirebaseSessions.d, "FirebaseApp instance deleted. Sessions library will stop collecting data.");
            SessionsActivityLifecycleCallbacks.X.e(null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
            if (r6 == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
            if (r6.g(r5) == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
            return r0;
         */
        @Override // o.AbstractC5644cl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(@NotNull Object obj) {
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        RT1.n(obj);
                        if (!FirebaseSessions.this.b.d()) {
                            Log.d(FirebaseSessions.d, "Sessions SDK disabled. Not listening to lifecycle events.");
                        } else {
                            SessionLifecycleClient sessionLifecycleClient = new SessionLifecycleClient(this.b1);
                            sessionLifecycleClient.i();
                            SessionsActivityLifecycleCallbacks.X.e(sessionLifecycleClient);
                            FirebaseSessions.this.a.h(new FirebaseAppLifecycleListener() { // from class: com.google.firebase.sessions.a
                                @Override // com.google.firebase.FirebaseAppLifecycleListener
                                public final void a(String str, FirebaseOptions firebaseOptions) {
                                    FirebaseSessions.AnonymousClass1.k0(str, firebaseOptions);
                                }
                            });
                        }
                        return C7458kA2.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RT1.n(obj);
            } else {
                RT1.n(obj);
                FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.a;
                this.Z0 = 1;
                obj = firebaseSessionsDependencies.c(this);
            }
            Collection<SessionSubscriber> values = ((Map) obj).values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                for (SessionSubscriber sessionSubscriber : values) {
                    if (sessionSubscriber.a()) {
                        SessionsSettings sessionsSettings = FirebaseSessions.this.b;
                        this.Z0 = 2;
                    }
                }
            }
            Log.d(FirebaseSessions.d, "No Sessions subscribers. Not listening to lifecycle events.");
            return C7458kA2.a;
        }

        @Override // o.VA0
        @Nullable
        /* renamed from: V */
        public final Object i(@NotNull InterfaceC9974uQ interfaceC9974uQ, @Nullable HM<? super C7458kA2> hm) {
            return ((AnonymousClass1) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        @NotNull
        public final HM<C7458kA2> t(@Nullable Object obj, @NotNull HM<?> hm) {
            return new AnonymousClass1(this.b1, hm);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final FirebaseSessions a() {
            Object l = FirebaseKt.c(Firebase.a).l(FirebaseSessions.class);
            C6562gT0.o(l, "Firebase.app[FirebaseSessions::class.java]");
            return (FirebaseSessions) l;
        }

        private Companion() {
        }
    }

    public FirebaseSessions(@NotNull FirebaseApp firebaseApp, @NotNull SessionsSettings sessionsSettings, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        C6562gT0.p(firebaseApp, "firebaseApp");
        C6562gT0.p(sessionsSettings, RemoteConfigComponent.f388o);
        C6562gT0.p(interfaceC5809dQ, "backgroundDispatcher");
        this.a = firebaseApp;
        this.b = sessionsSettings;
        Log.d(d, "Initializing Firebase Sessions SDK.");
        Context applicationContext = firebaseApp.n().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(SessionsActivityLifecycleCallbacks.X);
            C5910dr.f(C10217vQ.a(interfaceC5809dQ), null, null, new AnonymousClass1(interfaceC5809dQ, null), 3, null);
            return;
        }
        Log.e(d, "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
