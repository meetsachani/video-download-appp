package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.google.firebase.sessions.SessionDatastore;
import com.google.firebase.sessions.SessionFirelogPublisher;
import com.google.firebase.sessions.SessionGenerator;
import com.google.firebase.sessions.SessionLifecycleServiceBinder;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.List;
import o.AbstractC7762lQ;
import o.C6562gT0;
import o.C8222nF;
import o.C9516sY;
import o.InterfaceC5809dQ;
import o.Ot2;
import org.jetbrains.annotations.NotNull;

@Keep
/* loaded from: classes3.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    @Deprecated
    @NotNull
    private static final String LIBRARY_NAME = "fire-sessions";
    @NotNull
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final Qualified<FirebaseApp> firebaseApp = Qualified.b(FirebaseApp.class);
    @Deprecated
    private static final Qualified<FirebaseInstallationsApi> firebaseInstallationsApi = Qualified.b(FirebaseInstallationsApi.class);
    @Deprecated
    private static final Qualified<AbstractC7762lQ> backgroundDispatcher = Qualified.a(Background.class, AbstractC7762lQ.class);
    @Deprecated
    private static final Qualified<AbstractC7762lQ> blockingDispatcher = Qualified.a(Blocking.class, AbstractC7762lQ.class);
    @Deprecated
    private static final Qualified<Ot2> transportFactory = Qualified.b(Ot2.class);
    @Deprecated
    private static final Qualified<SessionFirelogPublisher> sessionFirelogPublisher = Qualified.b(SessionFirelogPublisher.class);
    @Deprecated
    private static final Qualified<SessionGenerator> sessionGenerator = Qualified.b(SessionGenerator.class);
    @Deprecated
    private static final Qualified<SessionsSettings> sessionsSettings = Qualified.b(SessionsSettings.class);

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-0  reason: not valid java name */
    public static final FirebaseSessions m0getComponents$lambda0(ComponentContainer componentContainer) {
        Object g = componentContainer.g(firebaseApp);
        C6562gT0.o(g, "container[firebaseApp]");
        Object g2 = componentContainer.g(sessionsSettings);
        C6562gT0.o(g2, "container[sessionsSettings]");
        Object g3 = componentContainer.g(backgroundDispatcher);
        C6562gT0.o(g3, "container[backgroundDispatcher]");
        return new FirebaseSessions((FirebaseApp) g, (SessionsSettings) g2, (InterfaceC5809dQ) g3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-1  reason: not valid java name */
    public static final SessionGenerator m1getComponents$lambda1(ComponentContainer componentContainer) {
        return new SessionGenerator(WallClock.a, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-2  reason: not valid java name */
    public static final SessionFirelogPublisher m2getComponents$lambda2(ComponentContainer componentContainer) {
        Object g = componentContainer.g(firebaseApp);
        C6562gT0.o(g, "container[firebaseApp]");
        Object g2 = componentContainer.g(firebaseInstallationsApi);
        C6562gT0.o(g2, "container[firebaseInstallationsApi]");
        Object g3 = componentContainer.g(sessionsSettings);
        C6562gT0.o(g3, "container[sessionsSettings]");
        Provider b = componentContainer.b(transportFactory);
        C6562gT0.o(b, "container.getProvider(transportFactory)");
        EventGDTLogger eventGDTLogger = new EventGDTLogger(b);
        Object g4 = componentContainer.g(backgroundDispatcher);
        C6562gT0.o(g4, "container[backgroundDispatcher]");
        return new SessionFirelogPublisherImpl((FirebaseApp) g, (FirebaseInstallationsApi) g2, (SessionsSettings) g3, eventGDTLogger, (InterfaceC5809dQ) g4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-3  reason: not valid java name */
    public static final SessionsSettings m3getComponents$lambda3(ComponentContainer componentContainer) {
        Object g = componentContainer.g(firebaseApp);
        C6562gT0.o(g, "container[firebaseApp]");
        Object g2 = componentContainer.g(blockingDispatcher);
        C6562gT0.o(g2, "container[blockingDispatcher]");
        Object g3 = componentContainer.g(backgroundDispatcher);
        C6562gT0.o(g3, "container[backgroundDispatcher]");
        Object g4 = componentContainer.g(firebaseInstallationsApi);
        C6562gT0.o(g4, "container[firebaseInstallationsApi]");
        return new SessionsSettings((FirebaseApp) g, (InterfaceC5809dQ) g2, (InterfaceC5809dQ) g3, (FirebaseInstallationsApi) g4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-4  reason: not valid java name */
    public static final SessionDatastore m4getComponents$lambda4(ComponentContainer componentContainer) {
        Context n = ((FirebaseApp) componentContainer.g(firebaseApp)).n();
        C6562gT0.o(n, "container[firebaseApp].applicationContext");
        Object g = componentContainer.g(backgroundDispatcher);
        C6562gT0.o(g, "container[backgroundDispatcher]");
        return new SessionDatastoreImpl(n, (InterfaceC5809dQ) g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-5  reason: not valid java name */
    public static final SessionLifecycleServiceBinder m5getComponents$lambda5(ComponentContainer componentContainer) {
        Object g = componentContainer.g(firebaseApp);
        C6562gT0.o(g, "container[firebaseApp]");
        return new SessionLifecycleServiceBinderImpl((FirebaseApp) g);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<? extends Object>> getComponents() {
        Component.Builder h = Component.h(FirebaseSessions.class).h(LIBRARY_NAME);
        Qualified<FirebaseApp> qualified = firebaseApp;
        Component.Builder b = h.b(Dependency.l(qualified));
        Qualified<SessionsSettings> qualified2 = sessionsSettings;
        Component.Builder b2 = b.b(Dependency.l(qualified2));
        Qualified<AbstractC7762lQ> qualified3 = backgroundDispatcher;
        Component d = b2.b(Dependency.l(qualified3)).f(new ComponentFactory() { // from class: o.du0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                FirebaseSessions m0getComponents$lambda0;
                m0getComponents$lambda0 = FirebaseSessionsRegistrar.m0getComponents$lambda0(componentContainer);
                return m0getComponents$lambda0;
            }
        }).e().d();
        Component d2 = Component.h(SessionGenerator.class).h("session-generator").f(new ComponentFactory() { // from class: o.eu0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                SessionGenerator m1getComponents$lambda1;
                m1getComponents$lambda1 = FirebaseSessionsRegistrar.m1getComponents$lambda1(componentContainer);
                return m1getComponents$lambda1;
            }
        }).d();
        Component.Builder b3 = Component.h(SessionFirelogPublisher.class).h("session-publisher").b(Dependency.l(qualified));
        Qualified<FirebaseInstallationsApi> qualified4 = firebaseInstallationsApi;
        return C8222nF.O(d, d2, b3.b(Dependency.l(qualified4)).b(Dependency.l(qualified2)).b(Dependency.n(transportFactory)).b(Dependency.l(qualified3)).f(new ComponentFactory() { // from class: o.fu0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                SessionFirelogPublisher m2getComponents$lambda2;
                m2getComponents$lambda2 = FirebaseSessionsRegistrar.m2getComponents$lambda2(componentContainer);
                return m2getComponents$lambda2;
            }
        }).d(), Component.h(SessionsSettings.class).h("sessions-settings").b(Dependency.l(qualified)).b(Dependency.l(blockingDispatcher)).b(Dependency.l(qualified3)).b(Dependency.l(qualified4)).f(new ComponentFactory() { // from class: o.gu0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                SessionsSettings m3getComponents$lambda3;
                m3getComponents$lambda3 = FirebaseSessionsRegistrar.m3getComponents$lambda3(componentContainer);
                return m3getComponents$lambda3;
            }
        }).d(), Component.h(SessionDatastore.class).h("sessions-datastore").b(Dependency.l(qualified)).b(Dependency.l(qualified3)).f(new ComponentFactory() { // from class: o.hu0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                SessionDatastore m4getComponents$lambda4;
                m4getComponents$lambda4 = FirebaseSessionsRegistrar.m4getComponents$lambda4(componentContainer);
                return m4getComponents$lambda4;
            }
        }).d(), Component.h(SessionLifecycleServiceBinder.class).h("sessions-service-binder").b(Dependency.l(qualified)).f(new ComponentFactory() { // from class: o.iu0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                SessionLifecycleServiceBinder m5getComponents$lambda5;
                m5getComponents$lambda5 = FirebaseSessionsRegistrar.m5getComponents$lambda5(componentContainer);
                return m5getComponents$lambda5;
            }
        }).d(), LibraryVersionComponent.b(LIBRARY_NAME, BuildConfig.d));
    }
}
