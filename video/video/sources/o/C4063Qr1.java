package o;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C3771Nr1;

/* renamed from: o.Qr1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4063Qr1 implements InterfaceC3282Ir1 {
    public final Context a;
    public final Notification.Builder b;
    public final C3771Nr1.n c;
    public RemoteViews d;
    public RemoteViews e;
    public final List<Bundle> f = new ArrayList();
    public final Bundle g = new Bundle();
    public int h;
    public RemoteViews i;

    /* renamed from: o.Qr1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Action.Builder e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i, charSequence, pendingIntent);
        }

        public static String f(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        public static Notification.Builder i(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* renamed from: o.Qr1$b */
    /* loaded from: classes.dex */
    public static class b {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }
    }

    /* renamed from: o.Qr1$c */
    /* loaded from: classes.dex */
    public static class c {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* renamed from: o.Qr1$d */
    /* loaded from: classes.dex */
    public static class d {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* renamed from: o.Qr1$e */
    /* loaded from: classes.dex */
    public static class e {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        public static Notification.Builder d(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    /* renamed from: o.Qr1$f */
    /* loaded from: classes.dex */
    public static class f {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }
    }

    /* renamed from: o.Qr1$g */
    /* loaded from: classes.dex */
    public static class g {
        public static Notification.Builder a(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* renamed from: o.Qr1$h */
    /* loaded from: classes.dex */
    public static class h {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        public static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    public C4063Qr1(C3771Nr1.n nVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Icon L;
        List<String> list;
        int i;
        this.c = nVar;
        Context context = nVar.a;
        this.a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.b = e.a(context, nVar.L);
        } else {
            this.b = new Notification.Builder(nVar.a);
        }
        Notification notification = nVar.U;
        Notification.Builder lights = this.b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, nVar.i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(nVar.e).setContentText(nVar.f).setContentInfo(nVar.k).setContentIntent(nVar.g).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = nVar.h;
        if ((notification.flags & 128) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z4).setNumber(nVar.l).setProgress(nVar.u, nVar.v, nVar.w);
        Notification.Builder builder = this.b;
        IconCompat iconCompat = nVar.j;
        if (iconCompat == null) {
            L = null;
        } else {
            L = iconCompat.L(context);
        }
        c.b(builder, L);
        this.b.setSubText(nVar.r).setUsesChronometer(nVar.f558o).setPriority(nVar.m);
        C3771Nr1.y yVar = nVar.q;
        if (yVar instanceof C3771Nr1.o) {
            for (C3771Nr1.b bVar : ((C3771Nr1.o) yVar).D()) {
                b(bVar);
            }
        } else {
            Iterator<C3771Nr1.b> it = nVar.b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        }
        Bundle bundle = nVar.E;
        if (bundle != null) {
            this.g.putAll(bundle);
        }
        int i2 = Build.VERSION.SDK_INT;
        this.d = nVar.I;
        this.e = nVar.J;
        this.b.setShowWhen(nVar.n);
        a.i(this.b, nVar.A);
        a.g(this.b, nVar.x);
        a.j(this.b, nVar.z);
        a.h(this.b, nVar.y);
        this.h = nVar.Q;
        b.b(this.b, nVar.D);
        b.c(this.b, nVar.F);
        b.f(this.b, nVar.G);
        b.d(this.b, nVar.H);
        b.e(this.b, notification.sound, notification.audioAttributes);
        if (i2 < 28) {
            list = e(g(nVar.c), nVar.X);
        } else {
            list = nVar.X;
        }
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                b.a(this.b, str);
            }
        }
        this.i = nVar.K;
        if (nVar.d.size() > 0) {
            Bundle bundle2 = nVar.t().getBundle(C3771Nr1.p.d);
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i3 = 0; i3 < nVar.d.size(); i3++) {
                bundle4.putBundle(Integer.toString(i3), C4260Sr1.j(nVar.d.get(i3)));
            }
            bundle2.putBundle(C3771Nr1.p.h, bundle4);
            bundle3.putBundle(C3771Nr1.p.h, bundle4);
            nVar.t().putBundle(C3771Nr1.p.d, bundle2);
            this.g.putBundle(C3771Nr1.p.d, bundle3);
        }
        int i4 = Build.VERSION.SDK_INT;
        Object obj = nVar.W;
        if (obj != null) {
            c.c(this.b, obj);
        }
        this.b.setExtras(nVar.E);
        d.e(this.b, nVar.t);
        RemoteViews remoteViews = nVar.I;
        if (remoteViews != null) {
            d.c(this.b, remoteViews);
        }
        RemoteViews remoteViews2 = nVar.J;
        if (remoteViews2 != null) {
            d.b(this.b, remoteViews2);
        }
        RemoteViews remoteViews3 = nVar.K;
        if (remoteViews3 != null) {
            d.d(this.b, remoteViews3);
        }
        if (i4 >= 26) {
            e.b(this.b, nVar.M);
            e.e(this.b, nVar.s);
            e.f(this.b, nVar.N);
            e.g(this.b, nVar.P);
            e.d(this.b, nVar.Q);
            if (nVar.C) {
                e.c(this.b, nVar.B);
            }
            if (!TextUtils.isEmpty(nVar.L)) {
                this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i4 >= 28) {
            Iterator<NC1> it2 = nVar.c.iterator();
            while (it2.hasNext()) {
                f.a(this.b, it2.next().k());
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            g.a(this.b, nVar.S);
            g.b(this.b, C3771Nr1.m.k(nVar.T));
            H31 h31 = nVar.O;
            if (h31 != null) {
                g.d(this.b, h31.c());
            }
        }
        if (i5 >= 31 && (i = nVar.R) != 0) {
            h.b(this.b, i);
        }
        if (nVar.V) {
            if (this.c.y) {
                this.h = 2;
            } else {
                this.h = 1;
            }
            this.b.setVibrate(null);
            this.b.setSound(null);
            int i6 = notification.defaults & (-4);
            notification.defaults = i6;
            this.b.setDefaults(i6);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(this.c.x)) {
                    a.g(this.b, C3771Nr1.f1);
                }
                e.d(this.b, this.h);
            }
        }
    }

    public static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C3228Ie c3228Ie = new C3228Ie(list.size() + list2.size());
        c3228Ie.addAll(list);
        c3228Ie.addAll(list2);
        return new ArrayList(c3228Ie);
    }

    public static List<String> g(List<NC1> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (NC1 nc1 : list) {
            arrayList.add(nc1.j());
        }
        return arrayList;
    }

    @Override // o.InterfaceC3282Ir1
    public Notification.Builder a() {
        return this.b;
    }

    public final void b(C3771Nr1.b bVar) {
        Icon icon;
        Bundle bundle;
        IconCompat f2 = bVar.f();
        if (f2 != null) {
            icon = f2.K();
        } else {
            icon = null;
        }
        Notification.Action.Builder a2 = c.a(icon, bVar.j(), bVar.a());
        if (bVar.g() != null) {
            for (RemoteInput remoteInput : C7282jR1.d(bVar.g())) {
                a.c(a2, remoteInput);
            }
        }
        if (bVar.d() != null) {
            bundle = new Bundle(bVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean(C4260Sr1.c, bVar.b());
        int i = Build.VERSION.SDK_INT;
        d.a(a2, bVar.b());
        bundle.putInt(C3771Nr1.b.y, bVar.h());
        if (i >= 28) {
            f.b(a2, bVar.h());
        }
        if (i >= 29) {
            g.c(a2, bVar.l());
        }
        if (i >= 31) {
            h.a(a2, bVar.k());
        }
        bundle.putBoolean(C3771Nr1.b.x, bVar.i());
        a.b(a2, bundle);
        a.a(this.b, a.d(a2));
    }

    public Notification c() {
        RemoteViews remoteViews;
        Bundle n;
        RemoteViews x;
        RemoteViews v;
        C3771Nr1.y yVar = this.c.q;
        if (yVar != null) {
            yVar.b(this);
        }
        if (yVar != null) {
            remoteViews = yVar.w(this);
        } else {
            remoteViews = null;
        }
        Notification d2 = d();
        if (remoteViews != null) {
            d2.contentView = remoteViews;
        } else {
            RemoteViews remoteViews2 = this.c.I;
            if (remoteViews2 != null) {
                d2.contentView = remoteViews2;
            }
        }
        if (yVar != null && (v = yVar.v(this)) != null) {
            d2.bigContentView = v;
        }
        if (yVar != null && (x = this.c.q.x(this)) != null) {
            d2.headsUpContentView = x;
        }
        if (yVar != null && (n = C3771Nr1.n(d2)) != null) {
            yVar.a(n);
        }
        return d2;
    }

    public Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.b.build();
        }
        Notification build = this.b.build();
        if (this.h != 0) {
            if (a.f(build) != null && (build.flags & 512) != 0 && this.h == 2) {
                h(build);
            }
            if (a.f(build) != null && (build.flags & 512) == 0 && this.h == 1) {
                h(build);
            }
        }
        return build;
    }

    public Context f() {
        return this.a;
    }

    public final void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }
}
