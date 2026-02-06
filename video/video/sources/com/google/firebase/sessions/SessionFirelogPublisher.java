package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface SessionFirelogPublisher {
    @NotNull
    public static final Companion a = Companion.a;

    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        @NotNull
        public final SessionFirelogPublisher a() {
            Object l = FirebaseKt.c(Firebase.a).l(SessionFirelogPublisher.class);
            C6562gT0.o(l, "Firebase.app[SessionFirelogPublisher::class.java]");
            return (SessionFirelogPublisher) l;
        }
    }

    void a(@NotNull SessionDetails sessionDetails);
}
