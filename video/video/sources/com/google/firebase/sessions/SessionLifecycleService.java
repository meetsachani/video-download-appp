package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.google.firebase.sessions.SessionGenerator;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.ArrayList;
import o.C6562gT0;
import o.C9516sY;
import o.Y70;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class SessionLifecycleService extends Service {
    @NotNull
    public static final Companion Y0 = new Companion(null);
    @NotNull
    public static final String Z0 = "SessionLifecycleService";
    @NotNull
    public static final String a1 = "ClientCallbackMessenger";
    @NotNull
    public static final String b1 = "SessionUpdateExtra";
    public static final int c1 = 1;
    public static final int d1 = 2;
    public static final int e1 = 3;
    public static final int f1 = 4;
    @NotNull
    public final HandlerThread X = new HandlerThread("FirebaseSessions_HandlerThread");
    @Nullable
    public MessageHandler Y;
    @Nullable
    public Messenger Z;

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class MessageHandler extends Handler {
        public boolean a;
        public long b;
        @NotNull
        public final ArrayList<Messenger> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessageHandler(@NotNull Looper looper) {
            super(looper);
            C6562gT0.p(looper, "looper");
            this.c = new ArrayList<>();
        }

        public final void a() {
            StringBuilder sb = new StringBuilder();
            sb.append("Broadcasting new session: ");
            SessionGenerator.Companion companion = SessionGenerator.f;
            sb.append(companion.a().c());
            Log.d(SessionLifecycleService.Z0, sb.toString());
            SessionFirelogPublisher.a.a().a(companion.a().c());
            for (Messenger messenger : new ArrayList(this.c)) {
                C6562gT0.o(messenger, "it");
                f(messenger);
            }
        }

        public final void b(Message message) {
            Log.d(SessionLifecycleService.Z0, "Activity backgrounding at " + message.getWhen());
            this.b = message.getWhen();
        }

        public final void c(Message message) {
            this.c.add(message.replyTo);
            Messenger messenger = message.replyTo;
            C6562gT0.o(messenger, "msg.replyTo");
            f(messenger);
            Log.d(SessionLifecycleService.Z0, "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + this.c.size());
        }

        public final void d(Message message) {
            Log.d(SessionLifecycleService.Z0, "Activity foregrounding at " + message.getWhen() + '.');
            if (!this.a) {
                Log.d(SessionLifecycleService.Z0, "Cold start detected.");
                this.a = true;
                g();
            } else if (e(message.getWhen())) {
                Log.d(SessionLifecycleService.Z0, "Session too long in background. Creating new session.");
                g();
            }
            this.b = message.getWhen();
        }

        public final boolean e(long j) {
            if (j - this.b > Y70.A(SessionsSettings.c.c().c())) {
                return true;
            }
            return false;
        }

        public final void f(Messenger messenger) {
            if (this.a) {
                h(messenger, SessionGenerator.f.a().c().h());
                return;
            }
            String a = SessionDatastore.a.a().a();
            Log.d(SessionLifecycleService.Z0, "App has not yet foregrounded. Using previously stored session: " + a);
            if (a != null) {
                h(messenger, a);
            }
        }

        public final void g() {
            SessionGenerator.Companion companion = SessionGenerator.f;
            companion.a().a();
            Log.d(SessionLifecycleService.Z0, "Generated new session " + companion.a().c().h());
            a();
            SessionDatastore.a.a().b(companion.a().c().h());
        }

        public final void h(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString(SessionLifecycleService.b1, str);
                Message obtain = Message.obtain(null, 3, 0, 0);
                obtain.setData(bundle);
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
                Log.d(SessionLifecycleService.Z0, "Removing dead client from list: " + messenger);
                this.c.remove(messenger);
            } catch (Exception e) {
                Log.w(SessionLifecycleService.Z0, "Unable to push new session to " + messenger + '.', e);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
            C6562gT0.p(message, "msg");
            if (this.b > message.getWhen()) {
                Log.d(SessionLifecycleService.Z0, "Ignoring old message from " + message.getWhen() + " which is older than " + this.b + '.');
                return;
            }
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        Log.w(SessionLifecycleService.Z0, "Received unexpected event from the SessionLifecycleClient: " + message);
                        super.handleMessage(message);
                        return;
                    }
                    c(message);
                    return;
                }
                b(message);
                return;
            }
            d(message);
        }
    }

    public final Messenger a(Intent intent) {
        Object parcelableExtra;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra(a1, Messenger.class);
            return (Messenger) parcelableExtra;
        }
        return (Messenger) intent.getParcelableExtra(a1);
    }

    @NotNull
    public final HandlerThread b() {
        return this.X;
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        if (intent == null) {
            Log.d(Z0, "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d(Z0, "Service bound to new client on process " + intent.getAction());
        Messenger a = a(intent);
        if (a != null) {
            Message obtain = Message.obtain(null, 4, 0, 0);
            obtain.replyTo = a;
            MessageHandler messageHandler = this.Y;
            if (messageHandler != null) {
                messageHandler.sendMessage(obtain);
            }
        }
        Messenger messenger = this.Z;
        if (messenger == null) {
            return null;
        }
        return messenger.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.X.start();
        Looper looper = this.X.getLooper();
        C6562gT0.o(looper, "handlerThread.looper");
        this.Y = new MessageHandler(looper);
        this.Z = new Messenger(this.Y);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.X.quit();
    }
}
