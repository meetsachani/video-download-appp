package com.google.firebase.sessions;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import o.C6562gT0;
import o.C9516sY;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class SessionLifecycleServiceBinderImpl implements SessionLifecycleServiceBinder {
    @NotNull
    public static final Companion c = new Companion(null);
    @NotNull
    public static final String d = "LifecycleServiceBinder";
    @NotNull
    public final FirebaseApp b;

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    public SessionLifecycleServiceBinderImpl(@NotNull FirebaseApp firebaseApp) {
        C6562gT0.p(firebaseApp, "firebaseApp");
        this.b = firebaseApp;
    }

    @Override // com.google.firebase.sessions.SessionLifecycleServiceBinder
    public void a(@NotNull Messenger messenger, @NotNull ServiceConnection serviceConnection) {
        C6562gT0.p(messenger, "callback");
        C6562gT0.p(serviceConnection, "serviceConnection");
        Context applicationContext = this.b.n().getApplicationContext();
        Intent intent = new Intent(applicationContext, SessionLifecycleService.class);
        Log.d(d, "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra(SessionLifecycleService.a1, messenger);
        applicationContext.bindService(intent, serviceConnection, 65);
    }
}
