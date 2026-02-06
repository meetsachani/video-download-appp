package o;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import com.google.firebase.messaging.MessagingAnalytics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.InterfaceC6024eJ0;

/* renamed from: o.Vr1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4551Vr1 {
    public static final int A = 4;
    public static final int B = 5;
    public static final String c = "NotifManCompat";
    public static final String d = "checkOpNoThrow";
    public static final String e = "OP_POST_NOTIFICATION";
    public static final String f = "android.support.useSideChannel";
    public static final String g = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    public static final int h = 19;
    public static final int i = 1000;
    public static final int j = 6;
    public static final String k = "enabled_notification_listeners";
    public static String m = null;
    public static l p = null;
    public static final int q = 1;
    public static final int r = 2;
    public static final int s = 3;
    public static final int t = 4;
    public static final int u = 0;
    public static final int v = -1000;
    public static final int w = 0;
    public static final int x = 1;
    public static final int y = 2;
    public static final int z = 3;
    public final Context a;
    public final NotificationManager b;
    public static final Object l = new Object();
    public static Set<String> n = new HashSet();

    /* renamed from: o  reason: collision with root package name */
    public static final Object f649o = new Object();

    /* renamed from: o.Vr1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static List<StatusBarNotification> a(NotificationManager notificationManager) {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            if (activeNotifications == null) {
                return new ArrayList();
            }
            return Arrays.asList(activeNotifications);
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getCurrentInterruptionFilter();
        }
    }

    /* renamed from: o.Vr1$b */
    /* loaded from: classes.dex */
    public static class b {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    /* renamed from: o.Vr1$c */
    /* loaded from: classes.dex */
    public static class c {
        public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        public static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        public static void c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        public static void d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        public static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        public static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static String h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        public static NotificationChannel i(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        public static List<NotificationChannelGroup> j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        public static List<NotificationChannel> k(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    /* renamed from: o.Vr1$d */
    /* loaded from: classes.dex */
    public static class d {
        public static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    /* renamed from: o.Vr1$e */
    /* loaded from: classes.dex */
    public static class e {
        public static NotificationChannel a(NotificationManager notificationManager, String str, String str2) {
            return notificationManager.getNotificationChannel(str, str2);
        }

        public static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }
    }

    /* renamed from: o.Vr1$f */
    /* loaded from: classes.dex */
    public static class f {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.canUseFullScreenIntent();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Vr1$h */
    /* loaded from: classes.dex */
    public @interface h {
    }

    /* renamed from: o.Vr1$j */
    /* loaded from: classes.dex */
    public static class j implements m {
        public final String a;
        public final int b;
        public final String c;
        public final Notification d;

        public j(String str, int i, String str2, Notification notification) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = notification;
        }

        @Override // o.C4551Vr1.m
        public void a(InterfaceC6024eJ0 interfaceC6024eJ0) throws RemoteException {
            interfaceC6024eJ0.D7(this.a, this.b, this.c, this.d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.a + ", id:" + this.b + ", tag:" + this.c + C6566gU0.g;
        }
    }

    /* renamed from: o.Vr1$k */
    /* loaded from: classes.dex */
    public static class k {
        public final ComponentName a;
        public final IBinder b;

        public k(ComponentName componentName, IBinder iBinder) {
            this.a = componentName;
            this.b = iBinder;
        }
    }

    /* renamed from: o.Vr1$l */
    /* loaded from: classes.dex */
    public static class l implements Handler.Callback, ServiceConnection {
        public static final int a1 = 0;
        public static final int b1 = 1;
        public static final int c1 = 2;
        public static final int d1 = 3;
        public final Context X;
        public final HandlerThread Y;
        public final Handler Z;
        public final Map<ComponentName, a> Y0 = new HashMap();
        public Set<String> Z0 = new HashSet();

        /* renamed from: o.Vr1$l$a */
        /* loaded from: classes.dex */
        public static class a {
            public final ComponentName a;
            public InterfaceC6024eJ0 c;
            public boolean b = false;
            public ArrayDeque<m> d = new ArrayDeque<>();
            public int e = 0;

            public a(ComponentName componentName) {
                this.a = componentName;
            }
        }

        public l(Context context) {
            this.X = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.Y = handlerThread;
            handlerThread.start();
            this.Z = new Handler(handlerThread.getLooper(), this);
        }

        public final boolean a(a aVar) {
            if (aVar.b) {
                return true;
            }
            boolean bindService = this.X.bindService(new Intent(C4551Vr1.g).setComponent(aVar.a), this, 33);
            aVar.b = bindService;
            if (bindService) {
                aVar.e = 0;
            } else {
                Log.w(C4551Vr1.c, "Unable to bind to listener " + aVar.a);
                this.X.unbindService(this);
            }
            return aVar.b;
        }

        public final void b(a aVar) {
            if (aVar.b) {
                this.X.unbindService(this);
                aVar.b = false;
            }
            aVar.c = null;
        }

        public final void c(m mVar) {
            j();
            for (a aVar : this.Y0.values()) {
                aVar.d.add(mVar);
                g(aVar);
            }
        }

        public final void d(ComponentName componentName) {
            a aVar = this.Y0.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        public final void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.Y0.get(componentName);
            if (aVar != null) {
                aVar.c = InterfaceC6024eJ0.b.O0(iBinder);
                aVar.e = 0;
                g(aVar);
            }
        }

        public final void f(ComponentName componentName) {
            a aVar = this.Y0.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        public final void g(a aVar) {
            if (Log.isLoggable(C4551Vr1.c, 3)) {
                Log.d(C4551Vr1.c, "Processing component " + aVar.a + C6566gU0.h + aVar.d.size() + " queued tasks");
            }
            if (!aVar.d.isEmpty()) {
                if (a(aVar) && aVar.c != null) {
                    while (true) {
                        m peek = aVar.d.peek();
                        if (peek == null) {
                            break;
                        }
                        try {
                            if (Log.isLoggable(C4551Vr1.c, 3)) {
                                Log.d(C4551Vr1.c, "Sending task " + peek);
                            }
                            peek.a(aVar.c);
                            aVar.d.remove();
                        } catch (DeadObjectException unused) {
                            if (Log.isLoggable(C4551Vr1.c, 3)) {
                                Log.d(C4551Vr1.c, "Remote service has died: " + aVar.a);
                            }
                        } catch (RemoteException e) {
                            Log.w(C4551Vr1.c, "RemoteException communicating with " + aVar.a, e);
                        }
                    }
                    if (!aVar.d.isEmpty()) {
                        i(aVar);
                        return;
                    }
                    return;
                }
                i(aVar);
            }
        }

        public void h(m mVar) {
            this.Z.obtainMessage(0, mVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return false;
                        }
                        d((ComponentName) message.obj);
                        return true;
                    }
                    f((ComponentName) message.obj);
                    return true;
                }
                k kVar = (k) message.obj;
                e(kVar.a, kVar.b);
                return true;
            }
            c((m) message.obj);
            return true;
        }

        public final void i(a aVar) {
            if (this.Z.hasMessages(3, aVar.a)) {
                return;
            }
            int i = aVar.e;
            int i2 = i + 1;
            aVar.e = i2;
            if (i2 > 6) {
                Log.w(C4551Vr1.c, "Giving up on delivering " + aVar.d.size() + " tasks to " + aVar.a + " after " + aVar.e + " retries");
                aVar.d.clear();
                return;
            }
            int i3 = (1 << i) * 1000;
            if (Log.isLoggable(C4551Vr1.c, 3)) {
                Log.d(C4551Vr1.c, "Scheduling retry for " + i3 + " ms");
            }
            this.Z.sendMessageDelayed(this.Z.obtainMessage(3, aVar.a), i3);
        }

        public final void j() {
            Set<String> t = C4551Vr1.t(this.X);
            if (!t.equals(this.Z0)) {
                this.Z0 = t;
                List<ResolveInfo> queryIntentServices = this.X.getPackageManager().queryIntentServices(new Intent().setAction(C4551Vr1.g), 0);
                HashSet<ComponentName> hashSet = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (t.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w(C4551Vr1.c, "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.Y0.containsKey(componentName2)) {
                        if (Log.isLoggable(C4551Vr1.c, 3)) {
                            Log.d(C4551Vr1.c, "Adding listener record for " + componentName2);
                        }
                        this.Y0.put(componentName2, new a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, a>> it = this.Y0.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<ComponentName, a> next = it.next();
                    if (!hashSet.contains(next.getKey())) {
                        if (Log.isLoggable(C4551Vr1.c, 3)) {
                            Log.d(C4551Vr1.c, "Removing listener record for " + next.getKey());
                        }
                        b(next.getValue());
                        it.remove();
                    }
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(C4551Vr1.c, 3)) {
                Log.d(C4551Vr1.c, "Connected to service " + componentName);
            }
            this.Z.obtainMessage(1, new k(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(C4551Vr1.c, 3)) {
                Log.d(C4551Vr1.c, "Disconnected from service " + componentName);
            }
            this.Z.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* renamed from: o.Vr1$m */
    /* loaded from: classes.dex */
    public interface m {
        void a(InterfaceC6024eJ0 interfaceC6024eJ0) throws RemoteException;
    }

    public C4551Vr1(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService(MessagingAnalytics.b);
    }

    public static boolean J(Notification notification) {
        Bundle n2 = C3771Nr1.n(notification);
        if (n2 != null && n2.getBoolean(f)) {
            return true;
        }
        return false;
    }

    public static C4551Vr1 q(Context context) {
        return new C4551Vr1(context);
    }

    public static Set<String> t(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (l) {
            if (string != null) {
                try {
                    if (!string.equals(m)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet.add(unflattenFromString.getPackageName());
                            }
                        }
                        n = hashSet;
                        m = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = n;
        }
        return set;
    }

    public C3575Lr1 A(String str) {
        NotificationChannelGroup z2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            NotificationChannelGroup z3 = z(str);
            if (z3 != null) {
                return new C3575Lr1(z3);
            }
            return null;
        } else if (i2 >= 26 && (z2 = z(str)) != null) {
            return new C3575Lr1(z2, D());
        } else {
            return null;
        }
    }

    public List<NotificationChannelGroup> B() {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.j(this.b);
        }
        return Collections.EMPTY_LIST;
    }

    public List<C3575Lr1> C() {
        List<NotificationChannel> D;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            List<NotificationChannelGroup> B2 = B();
            if (!B2.isEmpty()) {
                if (i2 >= 28) {
                    D = Collections.EMPTY_LIST;
                } else {
                    D = D();
                }
                ArrayList arrayList = new ArrayList(B2.size());
                for (NotificationChannelGroup notificationChannelGroup : B2) {
                    NotificationChannelGroup a2 = C4454Ur1.a(notificationChannelGroup);
                    if (Build.VERSION.SDK_INT >= 28) {
                        arrayList.add(new C3575Lr1(a2));
                    } else {
                        arrayList.add(new C3575Lr1(a2, D));
                    }
                }
                return arrayList;
            }
        }
        return Collections.EMPTY_LIST;
    }

    public List<NotificationChannel> D() {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.k(this.b);
        }
        return Collections.EMPTY_LIST;
    }

    public List<C3380Jr1> E() {
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> D = D();
            if (!D.isEmpty()) {
                ArrayList arrayList = new ArrayList(D.size());
                for (NotificationChannel notificationChannel : D) {
                    arrayList.add(new C3380Jr1(C3478Kr1.a(notificationChannel)));
                }
                return arrayList;
            }
        }
        return Collections.EMPTY_LIST;
    }

    public void F(int i2, Notification notification) {
        G(null, i2, notification);
    }

    public void G(String str, int i2, Notification notification) {
        if (J(notification)) {
            I(new j(this.a.getPackageName(), i2, str, notification));
            this.b.cancel(str, i2);
            return;
        }
        this.b.notify(str, i2, notification);
    }

    public void H(List<i> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = list.get(i2);
            G(iVar.a, iVar.b, iVar.c);
        }
    }

    public final void I(m mVar) {
        synchronized (f649o) {
            try {
                if (p == null) {
                    p = new l(this.a.getApplicationContext());
                }
                p.h(mVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a() {
        return b.a(this.b);
    }

    public boolean b() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29) {
            return true;
        }
        if (i2 < 34) {
            if (this.a.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0) {
                return true;
            }
            return false;
        }
        return f.a(this.b);
    }

    public void c(int i2) {
        d(null, i2);
    }

    public void d(String str, int i2) {
        this.b.cancel(str, i2);
    }

    public void e() {
        this.b.cancelAll();
    }

    public void f(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.a(this.b, notificationChannel);
        }
    }

    public void g(C3380Jr1 c3380Jr1) {
        f(c3380Jr1.m());
    }

    public void h(NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.b(this.b, notificationChannelGroup);
        }
    }

    public void i(C3575Lr1 c3575Lr1) {
        h(c3575Lr1.f());
    }

    public void j(List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.c(this.b, list);
        }
    }

    public void k(List<C3575Lr1> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C3575Lr1 c3575Lr1 : list) {
                arrayList.add(c3575Lr1.f());
            }
            c.c(this.b, arrayList);
        }
    }

    public void l(List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.d(this.b, list);
        }
    }

    public void m(List<C3380Jr1> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C3380Jr1 c3380Jr1 : list) {
                arrayList.add(c3380Jr1.m());
            }
            c.d(this.b, arrayList);
        }
    }

    public void n(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.e(this.b, str);
        }
    }

    public void o(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.f(this.b, str);
        }
    }

    public void p(Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (NotificationChannel notificationChannel : c.k(this.b)) {
                NotificationChannel a2 = C3478Kr1.a(notificationChannel);
                if (!collection.contains(c.g(a2)) && (Build.VERSION.SDK_INT < 30 || !collection.contains(e.b(a2)))) {
                    c.e(this.b, c.g(a2));
                }
            }
        }
    }

    public List<StatusBarNotification> r() {
        return a.a(this.b);
    }

    public int s() {
        return a.b(this.b);
    }

    public int u() {
        return b.b(this.b);
    }

    public NotificationChannel v(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.i(this.b, str);
        }
        return null;
    }

    public NotificationChannel w(String str, String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return e.a(this.b, str, str2);
        }
        return v(str);
    }

    public C3380Jr1 x(String str) {
        NotificationChannel v2;
        if (Build.VERSION.SDK_INT >= 26 && (v2 = v(str)) != null) {
            return new C3380Jr1(v2);
        }
        return null;
    }

    public C3380Jr1 y(String str, String str2) {
        NotificationChannel w2;
        if (Build.VERSION.SDK_INT >= 26 && (w2 = w(str, str2)) != null) {
            return new C3380Jr1(w2);
        }
        return null;
    }

    public NotificationChannelGroup z(String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return d.a(this.b, str);
        }
        if (i2 >= 26) {
            for (NotificationChannelGroup notificationChannelGroup : B()) {
                NotificationChannelGroup a2 = C4454Ur1.a(notificationChannelGroup);
                if (c.h(a2).equals(str)) {
                    return a2;
                }
            }
        }
        return null;
    }

    /* renamed from: o.Vr1$i */
    /* loaded from: classes.dex */
    public static class i {
        public final String a;
        public final int b;
        public Notification c;

        public i(String str, int i, Notification notification) {
            this.a = str;
            this.b = i;
            this.c = notification;
        }

        public i(int i, Notification notification) {
            this(null, i, notification);
        }
    }

    public C4551Vr1(NotificationManager notificationManager, Context context) {
        this.a = context;
        this.b = notificationManager;
    }

    /* renamed from: o.Vr1$g */
    /* loaded from: classes.dex */
    public static class g implements m {
        public final String a;
        public final int b;
        public final String c;
        public final boolean d;

        public g(String str) {
            this.a = str;
            this.b = 0;
            this.c = null;
            this.d = true;
        }

        @Override // o.C4551Vr1.m
        public void a(InterfaceC6024eJ0 interfaceC6024eJ0) throws RemoteException {
            if (this.d) {
                interfaceC6024eJ0.y5(this.a);
            } else {
                interfaceC6024eJ0.m3(this.a, this.b, this.c);
            }
        }

        public String toString() {
            return "CancelTask[packageName:" + this.a + ", id:" + this.b + ", tag:" + this.c + ", all:" + this.d + C6566gU0.g;
        }

        public g(String str, int i, String str2) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = false;
        }
    }
}
