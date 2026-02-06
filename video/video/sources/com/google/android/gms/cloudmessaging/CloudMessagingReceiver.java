package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.Constants;
import java.lang.ref.SoftReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.InterfaceC10697xN2;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {
    @InterfaceC11300zs1
    public static SoftReference a;

    /* loaded from: classes2.dex */
    public static final class IntentActionKeys {
        @InterfaceC5670cr1
        public static final String a = "com.google.firebase.messaging.NOTIFICATION_OPEN";
        @InterfaceC5670cr1
        public static final String b = "com.google.firebase.messaging.NOTIFICATION_DISMISS";

        private IntentActionKeys() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class IntentKeys {
        @InterfaceC5670cr1
        public static final String a = "pending_intent";
        @InterfaceC5670cr1
        public static final String b = "wrapped_intent";

        private IntentKeys() {
        }
    }

    @InterfaceC5670cr1
    public Executor a() {
        ExecutorService executorService;
        synchronized (CloudMessagingReceiver.class) {
            try {
                SoftReference softReference = a;
                if (softReference != null) {
                    executorService = (ExecutorService) softReference.get();
                } else {
                    executorService = null;
                }
                if (executorService == null) {
                    com.google.android.gms.internal.cloudmessaging.zze.a();
                    executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new NamedThreadFactory("firebase-iid-executor")));
                    a = new SoftReference(executorService);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    @InterfaceC10697xN2
    public abstract int b(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 CloudMessage cloudMessage);

    @InterfaceC10697xN2
    public void c(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Bundle bundle) {
    }

    public final /* synthetic */ void d(Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        Intent intent2;
        int e;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (parcelableExtra instanceof Intent) {
                intent2 = (Intent) parcelableExtra;
            } else {
                intent2 = null;
            }
            if (intent2 != null) {
                e = f(context, intent2);
            } else {
                e = e(context, intent);
            }
            if (z) {
                pendingResult.setResultCode(e);
            }
            pendingResult.finish();
        } catch (Throwable th) {
            pendingResult.finish();
            throw th;
        }
    }

    @InterfaceC10697xN2
    public final int e(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Intent intent) {
        Task c;
        if (intent.getExtras() == null) {
            return 500;
        }
        CloudMessage cloudMessage = new CloudMessage(intent);
        if (TextUtils.isEmpty(cloudMessage.H0())) {
            c = Tasks.g(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(Constants.MessagePayloadKeys.h, cloudMessage.H0());
            Integer I1 = cloudMessage.I1();
            if (I1 != null) {
                bundle.putInt(Constants.MessagePayloadKeys.f369o, I1.intValue());
            }
            bundle.putBoolean("supports_message_handled", true);
            c = zzu.b(context).c(2, bundle);
        }
        int b = b(context, cloudMessage);
        try {
            Tasks.b(c, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
            return b;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e.toString()));
            return b;
        }
    }

    @InterfaceC10697xN2
    public final int f(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(IntentKeys.a);
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove(IntentKeys.a);
        } else {
            extras = new Bundle();
        }
        String action = intent.getAction();
        if (action != IntentActionKeys.b && (action == null || !action.equals(IntentActionKeys.b))) {
            Log.e("CloudMessagingReceiver", "Unknown notification action");
            return 500;
        }
        c(context, extras);
        return -1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@InterfaceC5670cr1 final Context context, @InterfaceC5670cr1 final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        a().execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzf
            @Override // java.lang.Runnable
            public final void run() {
                CloudMessagingReceiver.this.d(intent, context, isOrderedBroadcast, goAsync);
            }
        });
    }
}
