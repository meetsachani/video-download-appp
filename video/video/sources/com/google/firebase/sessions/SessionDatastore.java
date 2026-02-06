package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface SessionDatastore {
    @NotNull
    public static final Companion a = Companion.a;

    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        @NotNull
        public final SessionDatastore a() {
            Object l = FirebaseKt.c(Firebase.a).l(SessionDatastore.class);
            C6562gT0.o(l, "Firebase.app[SessionDatastore::class.java]");
            return (SessionDatastore) l;
        }
    }

    @Nullable
    String a();

    void b(@NotNull String str);
}
