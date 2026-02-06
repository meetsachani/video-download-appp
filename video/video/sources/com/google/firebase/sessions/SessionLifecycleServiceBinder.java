package com.google.firebase.sessions;

import android.content.ServiceConnection;
import android.os.Messenger;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface SessionLifecycleServiceBinder {
    @NotNull
    public static final Companion a = Companion.a;

    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        @NotNull
        public final SessionLifecycleServiceBinder a() {
            Object l = FirebaseKt.c(Firebase.a).l(SessionLifecycleServiceBinder.class);
            C6562gT0.o(l, "Firebase.app[SessionLife…erviceBinder::class.java]");
            return (SessionLifecycleServiceBinder) l;
        }
    }

    void a(@NotNull Messenger messenger, @NotNull ServiceConnection serviceConnection);
}
