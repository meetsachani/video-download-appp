package o;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.Lr1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3575Lr1 {
    public final String a;
    public CharSequence b;
    public String c;
    public boolean d;
    public List<C3380Jr1> e;

    /* renamed from: o.Lr1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static NotificationChannelGroup a(String str, CharSequence charSequence) {
            return new NotificationChannelGroup(str, charSequence);
        }

        public static List<NotificationChannel> b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        public static String c(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        public static String d(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        public static CharSequence e(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }
    }

    /* renamed from: o.Lr1$b */
    /* loaded from: classes.dex */
    public static class b {
        public static String a(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getDescription();
        }

        public static boolean b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.isBlocked();
        }

        public static void c(NotificationChannelGroup notificationChannelGroup, String str) {
            notificationChannelGroup.setDescription(str);
        }
    }

    /* renamed from: o.Lr1$c */
    /* loaded from: classes.dex */
    public static class c {
        public final C3575Lr1 a;

        public c(String str) {
            this.a = new C3575Lr1(str);
        }

        public C3575Lr1 a() {
            return this.a;
        }

        public c b(String str) {
            this.a.c = str;
            return this;
        }

        public c c(CharSequence charSequence) {
            this.a.b = charSequence;
            return this;
        }
    }

    public C3575Lr1(String str) {
        this.e = Collections.EMPTY_LIST;
        this.a = (String) C10907yF1.l(str);
    }

    public List<C3380Jr1> a() {
        return this.e;
    }

    public final List<C3380Jr1> b(List<NotificationChannel> list) {
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel notificationChannel : list) {
            NotificationChannel a2 = C3478Kr1.a(notificationChannel);
            if (this.a.equals(a.c(a2))) {
                arrayList.add(new C3380Jr1(a2));
            }
        }
        return arrayList;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.a;
    }

    public CharSequence e() {
        return this.b;
    }

    public NotificationChannelGroup f() {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannelGroup a2 = a.a(this.a, this.b);
        if (i >= 28) {
            b.c(a2, this.c);
        }
        return a2;
    }

    public boolean g() {
        return this.d;
    }

    public c h() {
        return new c(this.a).c(this.b).b(this.c);
    }

    public C3575Lr1(NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.EMPTY_LIST);
    }

    public C3575Lr1(NotificationChannelGroup notificationChannelGroup, List<NotificationChannel> list) {
        this(a.d(notificationChannelGroup));
        this.b = a.e(notificationChannelGroup);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.c = b.a(notificationChannelGroup);
        }
        if (i >= 28) {
            this.d = b.b(notificationChannelGroup);
            this.e = b(a.b(notificationChannelGroup));
            return;
        }
        this.e = b(list);
    }
}
