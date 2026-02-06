package com.google.firebase.sessions;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.settings.SessionsSettings;
import o.C10217vQ;
import o.C10557wp;
import o.C4431Ul2;
import o.C5910dr;
import o.C6562gT0;
import o.C7289jT0;
import o.C9516sY;
import o.HM;
import o.InterfaceC5809dQ;
import o.RT1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class SessionFirelogPublisherImpl implements SessionFirelogPublisher {
    @NotNull
    public static final String h = "SessionFirelogPublisher";
    @NotNull
    public final FirebaseApp b;
    @NotNull
    public final FirebaseInstallationsApi c;
    @NotNull
    public final SessionsSettings d;
    @NotNull
    public final EventGDTLoggerInterface e;
    @NotNull
    public final InterfaceC5809dQ f;
    @NotNull
    public static final Companion g = new Companion(null);
    public static final double i = Math.random();

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    public SessionFirelogPublisherImpl(@NotNull FirebaseApp firebaseApp, @NotNull FirebaseInstallationsApi firebaseInstallationsApi, @NotNull SessionsSettings sessionsSettings, @NotNull EventGDTLoggerInterface eventGDTLoggerInterface, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        C6562gT0.p(firebaseApp, "firebaseApp");
        C6562gT0.p(firebaseInstallationsApi, "firebaseInstallations");
        C6562gT0.p(sessionsSettings, "sessionSettings");
        C6562gT0.p(eventGDTLoggerInterface, "eventGDTLogger");
        C6562gT0.p(interfaceC5809dQ, "backgroundDispatcher");
        this.b = firebaseApp;
        this.c = firebaseInstallationsApi;
        this.d = sessionsSettings;
        this.e = eventGDTLoggerInterface;
        this.f = interfaceC5809dQ;
    }

    @Override // com.google.firebase.sessions.SessionFirelogPublisher
    public void a(@NotNull SessionDetails sessionDetails) {
        C6562gT0.p(sessionDetails, "sessionDetails");
        C5910dr.f(C10217vQ.a(this.f), null, null, new SessionFirelogPublisherImpl$logSession$1(this, sessionDetails, null), 3, null);
    }

    public final void g(SessionEvent sessionEvent) {
        try {
            this.e.a(sessionEvent);
            Log.d(h, "Successfully logged Session Start event: " + sessionEvent.h().m());
        } catch (RuntimeException e) {
            Log.e(h, "Error logging Session Start event to DataTransport: ", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(HM<? super String> hm) {
        SessionFirelogPublisherImpl$getFirebaseInstallationId$1 sessionFirelogPublisherImpl$getFirebaseInstallationId$1;
        int i2;
        try {
            if (hm instanceof SessionFirelogPublisherImpl$getFirebaseInstallationId$1) {
                sessionFirelogPublisherImpl$getFirebaseInstallationId$1 = (SessionFirelogPublisherImpl$getFirebaseInstallationId$1) hm;
                int i3 = sessionFirelogPublisherImpl$getFirebaseInstallationId$1.a1;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    sessionFirelogPublisherImpl$getFirebaseInstallationId$1.a1 = i3 - Integer.MIN_VALUE;
                    Object obj = sessionFirelogPublisherImpl$getFirebaseInstallationId$1.Y0;
                    Object l = C7289jT0.l();
                    i2 = sessionFirelogPublisherImpl$getFirebaseInstallationId$1.a1;
                    if (i2 == 0) {
                        if (i2 == 1) {
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        Task<String> id = this.c.getId();
                        C6562gT0.o(id, "firebaseInstallations.id");
                        sessionFirelogPublisherImpl$getFirebaseInstallationId$1.a1 = 1;
                        obj = C4431Ul2.m(id, sessionFirelogPublisherImpl$getFirebaseInstallationId$1);
                        if (obj == l) {
                            return l;
                        }
                    }
                    return (String) obj;
                }
            }
            if (i2 == 0) {
            }
            return (String) obj;
        } catch (Exception e) {
            Log.e(h, "Error getting Firebase Installation ID. Using an empty ID", e);
            return "";
        }
        sessionFirelogPublisherImpl$getFirebaseInstallationId$1 = new SessionFirelogPublisherImpl$getFirebaseInstallationId$1(this, hm);
        Object obj2 = sessionFirelogPublisherImpl$getFirebaseInstallationId$1.Y0;
        Object l2 = C7289jT0.l();
        i2 = sessionFirelogPublisherImpl$getFirebaseInstallationId$1.a1;
    }

    public final boolean i() {
        if (i <= this.d.b()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(HM<? super Boolean> hm) {
        SessionFirelogPublisherImpl$shouldLogSession$1 sessionFirelogPublisherImpl$shouldLogSession$1;
        int i2;
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
        if (hm instanceof SessionFirelogPublisherImpl$shouldLogSession$1) {
            sessionFirelogPublisherImpl$shouldLogSession$1 = (SessionFirelogPublisherImpl$shouldLogSession$1) hm;
            int i3 = sessionFirelogPublisherImpl$shouldLogSession$1.b1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sessionFirelogPublisherImpl$shouldLogSession$1.b1 = i3 - Integer.MIN_VALUE;
                Object obj = sessionFirelogPublisherImpl$shouldLogSession$1.Z0;
                Object l = C7289jT0.l();
                i2 = sessionFirelogPublisherImpl$shouldLogSession$1.b1;
                if (i2 == 0) {
                    if (i2 == 1) {
                        sessionFirelogPublisherImpl = (SessionFirelogPublisherImpl) sessionFirelogPublisherImpl$shouldLogSession$1.Y0;
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    Log.d(h, "Data Collection is enabled for at least one Subscriber");
                    SessionsSettings sessionsSettings = this.d;
                    sessionFirelogPublisherImpl$shouldLogSession$1.Y0 = this;
                    sessionFirelogPublisherImpl$shouldLogSession$1.b1 = 1;
                    if (sessionsSettings.g(sessionFirelogPublisherImpl$shouldLogSession$1) == l) {
                        return l;
                    }
                    sessionFirelogPublisherImpl = this;
                }
                if (sessionFirelogPublisherImpl.d.d()) {
                    Log.d(h, "Sessions SDK disabled. Events will not be sent.");
                    return C10557wp.a(false);
                } else if (!sessionFirelogPublisherImpl.i()) {
                    Log.d(h, "Sessions SDK has dropped this session due to sampling.");
                    return C10557wp.a(false);
                } else {
                    return C10557wp.a(true);
                }
            }
        }
        sessionFirelogPublisherImpl$shouldLogSession$1 = new SessionFirelogPublisherImpl$shouldLogSession$1(this, hm);
        Object obj2 = sessionFirelogPublisherImpl$shouldLogSession$1.Z0;
        Object l2 = C7289jT0.l();
        i2 = sessionFirelogPublisherImpl$shouldLogSession$1.b1;
        if (i2 == 0) {
        }
        if (sessionFirelogPublisherImpl.d.d()) {
        }
    }
}
