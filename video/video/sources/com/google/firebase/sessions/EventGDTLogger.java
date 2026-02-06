package com.google.firebase.sessions;

import android.util.Log;
import com.facebook.S;
import com.google.firebase.inject.Provider;
import com.google.firebase.sessions.EventGDTLogger;
import com.google.firebase.sessions.SessionEvent;
import o.AbstractC2434Ae0;
import o.C3123Hc0;
import o.C6562gT0;
import o.C9516sY;
import o.HB;
import o.InterfaceC3385Js2;
import o.Ot2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class EventGDTLogger implements EventGDTLoggerInterface {
    @NotNull
    public static final Companion b = new Companion(null);
    @NotNull
    public static final String c = "EventGDTLogger";
    @NotNull
    public static final String d = "FIREBASE_APPQUALITY_SESSION";
    @NotNull
    public final Provider<Ot2> a;

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    public EventGDTLogger(@NotNull Provider<Ot2> provider) {
        C6562gT0.p(provider, "transportFactoryProvider");
        this.a = provider;
    }

    @Override // com.google.firebase.sessions.EventGDTLoggerInterface
    public void a(@NotNull SessionEvent sessionEvent) {
        C6562gT0.p(sessionEvent, "sessionEvent");
        this.a.get().b(d, SessionEvent.class, C3123Hc0.b(S.B), new InterfaceC3385Js2() { // from class: o.Fe0
            @Override // o.InterfaceC3385Js2
            public final Object apply(Object obj) {
                byte[] c2;
                c2 = EventGDTLogger.this.c((SessionEvent) obj);
                return c2;
            }
        }).a(AbstractC2434Ae0.g(sessionEvent));
    }

    public final byte[] c(SessionEvent sessionEvent) {
        String b2 = SessionEvents.a.d().b(sessionEvent);
        C6562gT0.o(b2, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d(c, "Session Event: " + b2);
        byte[] bytes = b2.getBytes(HB.b);
        C6562gT0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
