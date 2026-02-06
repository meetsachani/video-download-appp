package o;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* renamed from: o.Jr1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3380Jr1 {
    public static final String s = "miscellaneous";
    public static final boolean t = true;
    public static final int u = 0;
    public final String a;
    public CharSequence b;
    public int c;
    public String d;
    public String e;
    public boolean f;
    public Uri g;
    public AudioAttributes h;
    public boolean i;
    public int j;
    public boolean k;
    public long[] l;
    public String m;
    public String n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f507o;
    public int p;
    public boolean q;
    public boolean r;

    /* renamed from: o.Jr1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        public static boolean b(NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        public static NotificationChannel c(String str, CharSequence charSequence, int i) {
            return new NotificationChannel(str, charSequence, i);
        }

        public static void d(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableLights(z);
        }

        public static void e(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableVibration(z);
        }

        public static AudioAttributes f(NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        public static String h(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        public static String i(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static int j(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        public static int k(NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        public static int l(NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }

        public static CharSequence m(NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        public static Uri n(NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        public static long[] o(NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        public static void p(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        public static void q(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        public static void r(NotificationChannel notificationChannel, int i) {
            notificationChannel.setLightColor(i);
        }

        public static void s(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.setShowBadge(z);
        }

        public static void t(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        public static void u(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        public static boolean v(NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        public static boolean w(NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }
    }

    /* renamed from: o.Jr1$b */
    /* loaded from: classes.dex */
    public static class b {
        public static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    /* renamed from: o.Jr1$c */
    /* loaded from: classes.dex */
    public static class c {
        public static String a(NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        public static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        public static boolean c(NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }

        public static void d(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    /* renamed from: o.Jr1$d */
    /* loaded from: classes.dex */
    public static class d {
        public final C3380Jr1 a;

        public d(String str, int i) {
            this.a = new C3380Jr1(str, i);
        }

        public C3380Jr1 a() {
            return this.a;
        }

        public d b(String str, String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                C3380Jr1 c3380Jr1 = this.a;
                c3380Jr1.m = str;
                c3380Jr1.n = str2;
            }
            return this;
        }

        public d c(String str) {
            this.a.d = str;
            return this;
        }

        public d d(String str) {
            this.a.e = str;
            return this;
        }

        public d e(int i) {
            this.a.c = i;
            return this;
        }

        public d f(int i) {
            this.a.j = i;
            return this;
        }

        public d g(boolean z) {
            this.a.i = z;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.a.b = charSequence;
            return this;
        }

        public d i(boolean z) {
            this.a.f = z;
            return this;
        }

        public d j(Uri uri, AudioAttributes audioAttributes) {
            C3380Jr1 c3380Jr1 = this.a;
            c3380Jr1.g = uri;
            c3380Jr1.h = audioAttributes;
            return this;
        }

        public d k(boolean z) {
            this.a.k = z;
            return this;
        }

        public d l(long[] jArr) {
            boolean z;
            C3380Jr1 c3380Jr1 = this.a;
            if (jArr != null && jArr.length > 0) {
                z = true;
            } else {
                z = false;
            }
            c3380Jr1.k = z;
            c3380Jr1.l = jArr;
            return this;
        }
    }

    public C3380Jr1(String str, int i) {
        this.f = true;
        this.g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.j = 0;
        this.a = (String) C10907yF1.l(str);
        this.c = i;
        this.h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public boolean a() {
        return this.q;
    }

    public boolean b() {
        return this.f507o;
    }

    public boolean c() {
        return this.f;
    }

    public AudioAttributes d() {
        return this.h;
    }

    public String e() {
        return this.n;
    }

    public String f() {
        return this.d;
    }

    public String g() {
        return this.e;
    }

    public String h() {
        return this.a;
    }

    public int i() {
        return this.c;
    }

    public int j() {
        return this.j;
    }

    public int k() {
        return this.p;
    }

    public CharSequence l() {
        return this.b;
    }

    public NotificationChannel m() {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannel c2 = a.c(this.a, this.b, this.c);
        a.p(c2, this.d);
        a.q(c2, this.e);
        a.s(c2, this.f);
        a.t(c2, this.g, this.h);
        a.d(c2, this.i);
        a.r(c2, this.j);
        a.u(c2, this.l);
        a.e(c2, this.k);
        if (i >= 30 && (str = this.m) != null && (str2 = this.n) != null) {
            c.d(c2, str, str2);
        }
        return c2;
    }

    public String n() {
        return this.m;
    }

    public Uri o() {
        return this.g;
    }

    public long[] p() {
        return this.l;
    }

    public boolean q() {
        return this.r;
    }

    public boolean r() {
        return this.i;
    }

    public boolean s() {
        return this.k;
    }

    public d t() {
        return new d(this.a, this.c).h(this.b).c(this.d).d(this.e).i(this.f).j(this.g, this.h).g(this.i).f(this.j).k(this.k).l(this.l).b(this.m, this.n);
    }

    public C3380Jr1(NotificationChannel notificationChannel) {
        this(a.i(notificationChannel), a.j(notificationChannel));
        this.b = a.m(notificationChannel);
        this.d = a.g(notificationChannel);
        this.e = a.h(notificationChannel);
        this.f = a.b(notificationChannel);
        this.g = a.n(notificationChannel);
        this.h = a.f(notificationChannel);
        this.i = a.v(notificationChannel);
        this.j = a.k(notificationChannel);
        this.k = a.w(notificationChannel);
        this.l = a.o(notificationChannel);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.m = c.b(notificationChannel);
            this.n = c.a(notificationChannel);
        }
        this.f507o = a.a(notificationChannel);
        this.p = a.l(notificationChannel);
        if (i >= 29) {
            this.q = b.a(notificationChannel);
        }
        if (i >= 30) {
            this.r = c.c(notificationChannel);
        }
    }
}
