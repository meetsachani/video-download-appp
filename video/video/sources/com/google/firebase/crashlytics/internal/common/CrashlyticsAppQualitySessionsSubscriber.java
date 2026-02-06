package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.sessions.api.SessionSubscriber;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class CrashlyticsAppQualitySessionsSubscriber implements SessionSubscriber {
    public final DataCollectionArbiter a;
    public final CrashlyticsAppQualitySessionsStore b;

    public CrashlyticsAppQualitySessionsSubscriber(DataCollectionArbiter dataCollectionArbiter, FileStore fileStore) {
        this.a = dataCollectionArbiter;
        this.b = new CrashlyticsAppQualitySessionsStore(fileStore);
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public boolean a() {
        return this.a.d();
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    @InterfaceC5670cr1
    public SessionSubscriber.Name b() {
        return SessionSubscriber.Name.CRASHLYTICS;
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public void c(@InterfaceC5670cr1 SessionSubscriber.SessionDetails sessionDetails) {
        Logger f = Logger.f();
        f.b("App Quality Sessions session changed: " + sessionDetails);
        this.b.f(sessionDetails.d());
    }

    @InterfaceC11300zs1
    public String d(@InterfaceC5670cr1 String str) {
        return this.b.c(str);
    }

    public void e(@InterfaceC11300zs1 String str) {
        this.b.g(str);
    }
}
