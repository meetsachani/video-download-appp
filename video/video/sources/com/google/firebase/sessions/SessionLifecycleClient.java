package com.google.firebase.sessions;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import o.C10217vQ;
import o.C5910dr;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC5809dQ;
import o.RU0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class SessionLifecycleClient {
    @NotNull
    public static final Companion f = new Companion(null);
    @NotNull
    public static final String g = "SessionLifecycleClient";
    public static final int h = 20;
    @NotNull
    public final InterfaceC5809dQ a;
    @Nullable
    public Messenger b;
    public boolean c;
    @NotNull
    public final LinkedBlockingDeque<Message> d;
    @NotNull
    public final SessionLifecycleClient$serviceConnection$1 e;

    /* loaded from: classes3.dex */
    public static final class ClientUpdateHandler extends Handler {
        @NotNull
        public final InterfaceC5809dQ a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientUpdateHandler(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
            super(Looper.getMainLooper());
            C6562gT0.p(interfaceC5809dQ, "backgroundDispatcher");
            this.a = interfaceC5809dQ;
        }

        public final void a(String str) {
            Log.d(SessionLifecycleClient.g, "Session update received: " + str);
            C5910dr.f(C10217vQ.a(this.a), null, null, new SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
            C6562gT0.p(message, "msg");
            if (message.what == 3) {
                Bundle data = message.getData();
                a((data == null || (r3 = data.getString(SessionLifecycleService.b1)) == null) ? "" : "");
                return;
            }
            Log.w(SessionLifecycleClient.g, "Received unexpected event from the SessionLifecycleService: " + message);
            super.handleMessage(message);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1] */
    public SessionLifecycleClient(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        C6562gT0.p(interfaceC5809dQ, "backgroundDispatcher");
        this.a = interfaceC5809dQ;
        this.d = new LinkedBlockingDeque<>(20);
        this.e = new ServiceConnection() { // from class: com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(@Nullable ComponentName componentName, @Nullable IBinder iBinder) {
                LinkedBlockingDeque linkedBlockingDeque;
                List j;
                StringBuilder sb = new StringBuilder();
                sb.append("Connected to SessionLifecycleService. Queue size ");
                linkedBlockingDeque = SessionLifecycleClient.this.d;
                sb.append(linkedBlockingDeque.size());
                Log.d(SessionLifecycleClient.g, sb.toString());
                SessionLifecycleClient.this.b = new Messenger(iBinder);
                SessionLifecycleClient.this.c = true;
                SessionLifecycleClient sessionLifecycleClient = SessionLifecycleClient.this;
                j = sessionLifecycleClient.j();
                sessionLifecycleClient.o(j);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(@Nullable ComponentName componentName) {
                Log.d(SessionLifecycleClient.g, "Disconnected from SessionLifecycleService");
                SessionLifecycleClient.this.b = null;
                SessionLifecycleClient.this.c = false;
            }
        };
    }

    public final void h() {
        n(2);
    }

    public final void i() {
        SessionLifecycleServiceBinder.a.a().a(new Messenger(new ClientUpdateHandler(this.a)), this.e);
    }

    public final List<Message> j() {
        ArrayList arrayList = new ArrayList();
        this.d.drainTo(arrayList);
        return arrayList;
    }

    public final void k() {
        n(1);
    }

    public final Message l(List<Message> list, int i) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        return (Message) obj;
    }

    public final void m(Message message) {
        if (this.d.offer(message)) {
            Log.d(g, "Queued message " + message.what + ". Queue size " + this.d.size());
            return;
        }
        Log.d(g, "Failed to enqueue message " + message.what + ". Dropping.");
    }

    public final void n(int i) {
        List<Message> j = j();
        Message obtain = Message.obtain(null, i, 0, 0);
        C6562gT0.o(obtain, "obtain(null, messageCode, 0, 0)");
        j.add(obtain);
        o(j);
    }

    public final RU0 o(List<Message> list) {
        RU0 f2;
        f2 = C5910dr.f(C10217vQ.a(this.a), null, null, new SessionLifecycleClient$sendLifecycleEvents$1(this, list, null), 3, null);
        return f2;
    }

    public final void p(Message message) {
        if (this.b != null) {
            try {
                Log.d(g, "Sending lifecycle " + message.what + " to service");
                Messenger messenger = this.b;
                if (messenger != null) {
                    messenger.send(message);
                    return;
                }
                return;
            } catch (RemoteException e) {
                Log.w(g, "Unable to deliver message: " + message.what, e);
                m(message);
                return;
            }
        }
        m(message);
    }
}
