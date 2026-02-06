package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.GmsRpc;
import com.google.firebase.messaging.Metadata;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C9654t62;
import o.InterfaceC10251va;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class Rpc {
    public static int h;
    public static PendingIntent i;
    public static final Executor j = new Executor() { // from class: com.google.android.gms.cloudmessaging.zzy
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };
    public static final Pattern k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final zzv c;
    public final ScheduledExecutorService d;
    public Messenger f;
    public zze g;
    public final C9654t62 a = new C9654t62();
    public final Messenger e = new Messenger(new zzad(this, Looper.getMainLooper()));

    public Rpc(@InterfaceC5670cr1 Context context) {
        this.b = context;
        this.c = new zzv(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public static /* synthetic */ Task c(Bundle bundle) throws Exception {
        if (k(bundle)) {
            return Tasks.g(null);
        }
        return Tasks.g(bundle);
    }

    public static /* bridge */ /* synthetic */ void e(Rpc rpc, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zzd());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zze) {
                        rpc.g = (zze) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        rpc.f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!zzw.a(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra(GmsRpc.h);
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra(GmsRpc.i);
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && zzw.a(split[1], "ID")) {
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            rpc.j(str, intent2.putExtra("error", str2).getExtras());
                            return;
                        }
                        Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                        return;
                    }
                    synchronized (rpc.a) {
                        for (int i2 = 0; i2 < rpc.a.size(); i2++) {
                            try {
                                rpc.j((String) rpc.a.g(i2), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                Matcher matcher = k.matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                        return;
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString(GmsRpc.h, group2);
                    rpc.j(group, extras);
                    return;
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    public static synchronized String h() {
        String num;
        synchronized (Rpc.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        return num;
    }

    public static synchronized void i(Context context, Intent intent) {
        synchronized (Rpc.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, com.google.android.gms.internal.cloudmessaging.zza.a);
                }
                intent.putExtra(FirebaseMessaging.r, i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean k(Bundle bundle) {
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return true;
        }
        return false;
    }

    @InterfaceC5670cr1
    public Task<Void> a(@InterfaceC5670cr1 CloudMessage cloudMessage) {
        if (this.c.a() >= 233700000) {
            Bundle bundle = new Bundle();
            bundle.putString(Constants.MessagePayloadKeys.h, cloudMessage.H0());
            Integer I1 = cloudMessage.I1();
            if (I1 != null) {
                bundle.putInt(Constants.MessagePayloadKeys.f369o, I1.intValue());
            }
            return zzu.b(this.b).c(3, bundle);
        }
        return Tasks.f(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    @InterfaceC5670cr1
    public Task<Bundle> b(@InterfaceC5670cr1 final Bundle bundle) {
        if (this.c.a() < 12000000) {
            if (this.c.b() != 0) {
                return g(bundle).p(j, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzz
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object a(Task task) {
                        return Rpc.this.d(bundle, task);
                    }
                });
            }
            return Tasks.f(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return zzu.b(this.b).d(1, bundle).n(j, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzaa
            @Override // com.google.android.gms.tasks.Continuation
            public final Object a(Task task) {
                if (task.v()) {
                    return (Bundle) task.r();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.q())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.q());
            }
        });
    }

    public final /* synthetic */ Task d(Bundle bundle, Task task) throws Exception {
        if (task.v() && k((Bundle) task.r())) {
            return g(bundle).x(j, new SuccessContinuation() { // from class: com.google.android.gms.cloudmessaging.zzx
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task a(Object obj) {
                    return Rpc.c((Bundle) obj);
                }
            });
        }
        return task;
    }

    public final /* synthetic */ void f(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.a) {
            this.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @InterfaceC10251va
    public final Task g(Bundle bundle) {
        final String h2 = h();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.a) {
            this.a.put(h2, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.b() == 2) {
            intent.setAction(Metadata.h);
        } else {
            intent.setAction(Metadata.i);
        }
        intent.putExtras(bundle);
        i(this.b, intent);
        intent.putExtra("kid", "|ID|" + h2 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f != null || this.g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.d.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzab
                @Override // java.lang.Runnable
                public final void run() {
                    if (TaskCompletionSource.this.d(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            taskCompletionSource.a().f(j, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzac
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void a(Task task) {
                    Rpc.this.f(h2, schedule, task);
                }
            });
            return taskCompletionSource.a();
        }
        if (this.c.b() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.d.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzab
            @Override // java.lang.Runnable
            public final void run() {
                if (TaskCompletionSource.this.d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.a().f(j, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzac
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void a(Task task) {
                Rpc.this.f(h2, schedule2, task);
            }
        });
        return taskCompletionSource.a();
    }

    public final void j(String str, @InterfaceC11300zs1 Bundle bundle) {
        synchronized (this.a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.a.remove(str);
                if (taskCompletionSource == null) {
                    Log.w("Rpc", "Missing callback for " + str);
                    return;
                }
                taskCompletionSource.c(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
