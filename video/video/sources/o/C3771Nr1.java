package o;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o.HL1;
import o.NC1;
import o.TD0;

/* renamed from: o.Nr1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3771Nr1 {
    public static final int A = 2;
    public static final int A0 = 3;
    public static final String B = "android.title";
    public static final int B0 = 1;
    public static final String C = "android.title.big";
    public static final int C0 = 0;
    public static final String D = "android.text";
    public static final int D0 = -1;
    public static final String E = "android.subText";
    public static final String E0 = "call";
    public static final String F = "android.remoteInputHistory";
    public static final String F0 = "navigation";
    public static final String G = "android.infoText";
    public static final String G0 = "msg";
    public static final String H = "android.summaryText";
    public static final String H0 = "email";
    public static final String I = "android.bigText";
    public static final String I0 = "event";
    public static final String J = "android.icon";
    public static final String J0 = "promo";
    public static final String K = "android.largeIcon";
    public static final String K0 = "alarm";
    public static final String L = "android.largeIcon.big";
    public static final String L0 = "progress";
    public static final String M = "android.progress";
    public static final String M0 = "social";
    public static final String N = "android.progressMax";
    public static final String N0 = "err";
    public static final String O = "android.progressIndeterminate";
    public static final String O0 = "transport";
    public static final String P = "android.showChronometer";
    public static final String P0 = "sys";
    public static final String Q = "android.chronometerCountDown";
    public static final String Q0 = "service";
    public static final String R = "android.colorized";
    public static final String R0 = "reminder";
    public static final String S = "android.showWhen";
    public static final String S0 = "recommendation";
    public static final String T = "android.picture";
    public static final String T0 = "status";
    public static final String U = "android.pictureIcon";
    public static final String U0 = "workout";
    public static final String V = "android.pictureContentDescription";
    public static final String V0 = "location_sharing";
    public static final String W = "android.showBigPictureWhenCollapsed";
    public static final String W0 = "stopwatch";
    public static final String X = "android.textLines";
    public static final String X0 = "missed_call";
    public static final String Y = "android.template";
    public static final String Y0 = "voicemail";
    public static final String Z = "androidx.core.app.extra.COMPAT_TEMPLATE";
    public static final int Z0 = 0;
    public static final String a = "NotifCompat";
    @Deprecated
    public static final String a0 = "android.people";
    public static final int a1 = 1;
    public static final String b = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final String b0 = "android.people.list";
    public static final int b1 = 2;
    public static final String c = "android.intent.extra.CHANNEL_ID";
    public static final String c0 = "android.backgroundImageUri";
    public static final int c1 = 0;
    public static final String d = "android.intent.extra.CHANNEL_GROUP_ID";
    public static final String d0 = "android.mediaSession";
    public static final int d1 = 1;
    public static final String e = "android.intent.extra.NOTIFICATION_TAG";
    public static final String e0 = "android.compactActions";
    public static final int e1 = 2;
    public static final String f = "android.intent.extra.NOTIFICATION_ID";
    public static final String f0 = "android.selfDisplayName";
    public static final String f1 = "silent";
    public static final int g = -1;
    public static final String g0 = "android.messagingStyleUser";
    public static final int g1 = 0;
    public static final int h = 1;
    public static final String h0 = "android.conversationTitle";
    public static final int h1 = 1;
    public static final int i = 2;
    public static final String i0 = "android.messages";
    public static final int i1 = 2;
    public static final int j = 4;
    public static final String j0 = "android.messages.historic";
    public static final int k = -1;
    public static final String k0 = "android.isGroupConversation";
    public static final int l = 1;
    public static final String l0 = "android.callType";
    public static final int m = 2;
    public static final String m0 = "android.callIsVideo";
    public static final int n = 4;
    public static final String n0 = "android.callPerson";

    /* renamed from: o  reason: collision with root package name */
    public static final int f555o = 8;
    public static final String o0 = "android.callPersonCompat";
    public static final int p = 16;
    public static final String p0 = "android.verificationIcon";
    public static final int q = 32;
    public static final String q0 = "android.verificationIconCompat";
    public static final int r = 64;
    public static final String r0 = "android.verificationText";
    @Deprecated
    public static final int s = 128;
    public static final String s0 = "android.answerIntent";
    public static final int t = 256;
    public static final String t0 = "android.declineIntent";
    public static final int u = 512;
    public static final String u0 = "android.hangUpIntent";
    public static final int v = 4096;
    public static final String v0 = "android.answerColor";
    public static final int w = 0;
    public static final String w0 = "android.declineColor";
    public static final int x = -1;
    public static final String x0 = "android.hiddenConversationTitle";
    public static final int y = -2;
    public static final String y0 = "android.audioContents";
    public static final int z = 1;
    public static final int z0 = 0;

    /* renamed from: o.Nr1$b */
    /* loaded from: classes.dex */
    public static class b {
        public static final int m = 0;
        public static final int n = 1;

        /* renamed from: o  reason: collision with root package name */
        public static final int f557o = 2;
        public static final int p = 3;
        public static final int q = 4;
        public static final int r = 5;
        public static final int s = 6;
        public static final int t = 7;
        public static final int u = 8;
        public static final int v = 9;
        public static final int w = 10;
        public static final String x = "android.support.action.showsUserInterface";
        public static final String y = "android.support.action.semanticAction";
        public final Bundle a;
        public IconCompat b;
        public final C7282jR1[] c;
        public final C7282jR1[] d;
        public boolean e;
        public boolean f;
        public final int g;
        public final boolean h;
        @Deprecated
        public int i;
        public CharSequence j;
        public PendingIntent k;
        public boolean l;

        /* renamed from: o.Nr1$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            public final IconCompat a;
            public final CharSequence b;
            public final PendingIntent c;
            public boolean d;
            public final Bundle e;
            public ArrayList<C7282jR1> f;
            public int g;
            public boolean h;
            public boolean i;
            public boolean j;

            /* renamed from: o.Nr1$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static class C0216a {
                private C0216a() {
                }

                public static Bundle a(Notification.Action action) {
                    return action.getExtras();
                }

                public static RemoteInput[] b(Notification.Action action) {
                    return action.getRemoteInputs();
                }
            }

            /* renamed from: o.Nr1$b$a$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static class C0217b {
                private C0217b() {
                }

                public static Icon a(Notification.Action action) {
                    return action.getIcon();
                }
            }

            /* renamed from: o.Nr1$b$a$c */
            /* loaded from: classes.dex */
            public static class c {
                private c() {
                }

                public static boolean a(Notification.Action action) {
                    return action.getAllowGeneratedReplies();
                }
            }

            /* renamed from: o.Nr1$b$a$d */
            /* loaded from: classes.dex */
            public static class d {
                private d() {
                }

                public static int a(Notification.Action action) {
                    return action.getSemanticAction();
                }
            }

            /* renamed from: o.Nr1$b$a$e */
            /* loaded from: classes.dex */
            public static class e {
                private e() {
                }

                public static boolean a(Notification.Action action) {
                    return action.isContextual();
                }
            }

            /* renamed from: o.Nr1$b$a$f */
            /* loaded from: classes.dex */
            public static class f {
                private f() {
                }

                public static boolean a(Notification.Action action) {
                    return action.isAuthenticationRequired();
                }
            }

            public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public static a f(Notification.Action action) {
                a aVar;
                if (C0217b.a(action) != null) {
                    aVar = new a(IconCompat.m(C0217b.a(action)), action.title, action.actionIntent);
                } else {
                    aVar = new a(action.icon, action.title, action.actionIntent);
                }
                RemoteInput[] b = C0216a.b(action);
                if (b != null && b.length != 0) {
                    for (RemoteInput remoteInput : b) {
                        aVar.b(C7282jR1.e(remoteInput));
                    }
                }
                int i = Build.VERSION.SDK_INT;
                aVar.d = c.a(action);
                if (i >= 28) {
                    aVar.k(d.a(action));
                }
                if (i >= 29) {
                    aVar.j(e.a(action));
                }
                if (i >= 31) {
                    aVar.i(f.a(action));
                }
                aVar.a(C0216a.a(action));
                return aVar;
            }

            public a a(Bundle bundle) {
                if (bundle != null) {
                    this.e.putAll(bundle);
                }
                return this;
            }

            public a b(C7282jR1 c7282jR1) {
                if (this.f == null) {
                    this.f = new ArrayList<>();
                }
                if (c7282jR1 != null) {
                    this.f.add(c7282jR1);
                }
                return this;
            }

            public b c() {
                C7282jR1[] c7282jR1Arr;
                d();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<C7282jR1> arrayList3 = this.f;
                if (arrayList3 != null) {
                    Iterator<C7282jR1> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        C7282jR1 next = it.next();
                        if (next.r()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                C7282jR1[] c7282jR1Arr2 = null;
                if (arrayList.isEmpty()) {
                    c7282jR1Arr = null;
                } else {
                    c7282jR1Arr = (C7282jR1[]) arrayList.toArray(new C7282jR1[arrayList.size()]);
                }
                if (!arrayList2.isEmpty()) {
                    c7282jR1Arr2 = (C7282jR1[]) arrayList2.toArray(new C7282jR1[arrayList2.size()]);
                }
                return new b(this.a, this.b, this.c, this.e, c7282jR1Arr2, c7282jR1Arr, this.d, this.g, this.h, this.i, this.j);
            }

            public final void d() {
                if (!this.i || this.c != null) {
                    return;
                }
                throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
            }

            public a e(InterfaceC0218b interfaceC0218b) {
                interfaceC0218b.a(this);
                return this;
            }

            public Bundle g() {
                return this.e;
            }

            public a h(boolean z) {
                this.d = z;
                return this;
            }

            public a i(boolean z) {
                this.j = z;
                return this;
            }

            public a j(boolean z) {
                this.i = z;
                return this;
            }

            public a k(int i) {
                this.g = i;
                return this;
            }

            public a l(boolean z) {
                this.h = z;
                return this;
            }

            public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.w(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public a(b bVar) {
                this(bVar.f(), bVar.j, bVar.k, new Bundle(bVar.a), bVar.g(), bVar.b(), bVar.h(), bVar.f, bVar.l(), bVar.k());
            }

            public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C7282jR1[] c7282jR1Arr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                this.d = true;
                this.h = true;
                this.a = iconCompat;
                this.b = n.A(charSequence);
                this.c = pendingIntent;
                this.e = bundle;
                this.f = c7282jR1Arr == null ? null : new ArrayList<>(Arrays.asList(c7282jR1Arr));
                this.d = z;
                this.g = i;
                this.h = z2;
                this.i = z3;
                this.j = z4;
            }
        }

        /* renamed from: o.Nr1$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0218b {
            a a(a aVar);
        }

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: o.Nr1$b$c */
        /* loaded from: classes.dex */
        public @interface c {
        }

        public b(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.w(null, "", i) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.e;
        }

        public C7282jR1[] c() {
            return this.d;
        }

        public Bundle d() {
            return this.a;
        }

        @Deprecated
        public int e() {
            return this.i;
        }

        public IconCompat f() {
            int i;
            if (this.b == null && (i = this.i) != 0) {
                this.b = IconCompat.w(null, "", i);
            }
            return this.b;
        }

        public C7282jR1[] g() {
            return this.c;
        }

        public int h() {
            return this.g;
        }

        public boolean i() {
            return this.f;
        }

        public CharSequence j() {
            return this.j;
        }

        public boolean k() {
            return this.l;
        }

        public boolean l() {
            return this.h;
        }

        /* renamed from: o.Nr1$b$d */
        /* loaded from: classes.dex */
        public static final class d implements InterfaceC0218b {
            public static final String e = "android.wearable.EXTENSIONS";
            public static final String f = "flags";
            public static final String g = "inProgressLabel";
            public static final String h = "confirmLabel";
            public static final String i = "cancelLabel";
            public static final int j = 1;
            public static final int k = 2;
            public static final int l = 4;
            public static final int m = 1;
            public int a;
            public CharSequence b;
            public CharSequence c;
            public CharSequence d;

            public d() {
                this.a = 1;
            }

            @Override // o.C3771Nr1.b.InterfaceC0218b
            public a a(a aVar) {
                Bundle bundle = new Bundle();
                int i2 = this.a;
                if (i2 != 1) {
                    bundle.putInt("flags", i2);
                }
                CharSequence charSequence = this.b;
                if (charSequence != null) {
                    bundle.putCharSequence(g, charSequence);
                }
                CharSequence charSequence2 = this.c;
                if (charSequence2 != null) {
                    bundle.putCharSequence(h, charSequence2);
                }
                CharSequence charSequence3 = this.d;
                if (charSequence3 != null) {
                    bundle.putCharSequence(i, charSequence3);
                }
                aVar.g().putBundle("android.wearable.EXTENSIONS", bundle);
                return aVar;
            }

            /* renamed from: b */
            public d clone() {
                d dVar = new d();
                dVar.a = this.a;
                dVar.b = this.b;
                dVar.c = this.c;
                dVar.d = this.d;
                return dVar;
            }

            @Deprecated
            public CharSequence c() {
                return this.d;
            }

            @Deprecated
            public CharSequence d() {
                return this.c;
            }

            public boolean e() {
                if ((this.a & 4) != 0) {
                    return true;
                }
                return false;
            }

            public boolean f() {
                if ((this.a & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Deprecated
            public CharSequence g() {
                return this.b;
            }

            public boolean h() {
                if ((this.a & 1) != 0) {
                    return true;
                }
                return false;
            }

            public d i(boolean z) {
                l(1, z);
                return this;
            }

            @Deprecated
            public d j(CharSequence charSequence) {
                this.d = charSequence;
                return this;
            }

            @Deprecated
            public d k(CharSequence charSequence) {
                this.c = charSequence;
                return this;
            }

            public final void l(int i2, boolean z) {
                if (z) {
                    this.a = i2 | this.a;
                    return;
                }
                this.a = (~i2) & this.a;
            }

            public d m(boolean z) {
                l(4, z);
                return this;
            }

            public d n(boolean z) {
                l(2, z);
                return this;
            }

            @Deprecated
            public d o(CharSequence charSequence) {
                this.b = charSequence;
                return this;
            }

            public d(b bVar) {
                this.a = 1;
                Bundle bundle = bVar.d().getBundle("android.wearable.EXTENSIONS");
                if (bundle != null) {
                    this.a = bundle.getInt("flags", 1);
                    this.b = bundle.getCharSequence(g);
                    this.c = bundle.getCharSequence(h);
                    this.d = bundle.getCharSequence(i);
                }
            }
        }

        public b(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (C7282jR1[]) null, (C7282jR1[]) null, true, 0, true, false, false);
        }

        public b(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C7282jR1[] c7282jR1Arr, C7282jR1[] c7282jR1Arr2, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
            this(i != 0 ? IconCompat.w(null, "", i) : null, charSequence, pendingIntent, bundle, c7282jR1Arr, c7282jR1Arr2, z, i2, z2, z3, z4);
        }

        public b(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C7282jR1[] c7282jR1Arr, C7282jR1[] c7282jR1Arr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.B() == 2) {
                this.i = iconCompat.y();
            }
            this.j = n.A(charSequence);
            this.k = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.c = c7282jR1Arr;
            this.d = c7282jR1Arr2;
            this.e = z;
            this.g = i;
            this.f = z2;
            this.h = z3;
            this.l = z4;
        }
    }

    /* renamed from: o.Nr1$c */
    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(RemoteInput remoteInput) {
            return remoteInput.getAllowFreeFormInput();
        }

        public static CharSequence[] b(RemoteInput remoteInput) {
            return remoteInput.getChoices();
        }

        public static Bundle c(Notification.Action action) {
            return action.getExtras();
        }

        public static Bundle d(RemoteInput remoteInput) {
            return remoteInput.getExtras();
        }

        public static String e(Notification notification) {
            return notification.getGroup();
        }

        public static CharSequence f(RemoteInput remoteInput) {
            return remoteInput.getLabel();
        }

        public static RemoteInput[] g(Notification.Action action) {
            return action.getRemoteInputs();
        }

        public static String h(RemoteInput remoteInput) {
            return remoteInput.getResultKey();
        }

        public static String i(Notification notification) {
            return notification.getSortKey();
        }
    }

    /* renamed from: o.Nr1$d */
    /* loaded from: classes.dex */
    public static class d {
        public static Icon a(Notification.Action action) {
            return action.getIcon();
        }
    }

    /* renamed from: o.Nr1$e */
    /* loaded from: classes.dex */
    public static class e {
        public static boolean a(Notification.Action action) {
            return action.getAllowGeneratedReplies();
        }
    }

    /* renamed from: o.Nr1$f */
    /* loaded from: classes.dex */
    public static class f {
        public static int a(Notification notification) {
            return notification.getBadgeIconType();
        }

        public static String b(Notification notification) {
            return notification.getChannelId();
        }

        public static int c(Notification notification) {
            return notification.getGroupAlertBehavior();
        }

        public static CharSequence d(Notification notification) {
            return notification.getSettingsText();
        }

        public static String e(Notification notification) {
            return notification.getShortcutId();
        }

        public static long f(Notification notification) {
            return notification.getTimeoutAfter();
        }
    }

    /* renamed from: o.Nr1$g */
    /* loaded from: classes.dex */
    public static class g {
        public static int a(Notification.Action action) {
            return action.getSemanticAction();
        }
    }

    /* renamed from: o.Nr1$h */
    /* loaded from: classes.dex */
    public static class h {
        public static boolean a(Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        public static Notification.BubbleMetadata b(Notification notification) {
            return notification.getBubbleMetadata();
        }

        public static int c(RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        public static LocusId d(Notification notification) {
            return notification.getLocusId();
        }

        public static boolean e(Notification.Action action) {
            return action.isContextual();
        }
    }

    /* renamed from: o.Nr1$i */
    /* loaded from: classes.dex */
    public static class i {
        public static boolean a(Notification.Action action) {
            return action.isAuthenticationRequired();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Nr1$j */
    /* loaded from: classes.dex */
    public @interface j {
    }

    /* renamed from: o.Nr1$k */
    /* loaded from: classes.dex */
    public static class k extends y {
        public static final String j = "androidx.core.app.NotificationCompat$BigPictureStyle";
        public IconCompat e;
        public IconCompat f;
        public boolean g;
        public CharSequence h;
        public boolean i;

        /* renamed from: o.Nr1$k$a */
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: o.Nr1$k$b */
        /* loaded from: classes.dex */
        public static class b {
            private b() {
            }

            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        public k() {
        }

        public static IconCompat A(Parcelable parcelable) {
            if (parcelable != null) {
                if (parcelable instanceof Icon) {
                    return IconCompat.l((Icon) parcelable);
                }
                if (parcelable instanceof Bitmap) {
                    return IconCompat.r((Bitmap) parcelable);
                }
                return null;
            }
            return null;
        }

        public static IconCompat F(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable(C3771Nr1.T);
            if (parcelable != null) {
                return A(parcelable);
            }
            return A(bundle.getParcelable(C3771Nr1.U));
        }

        public k B(Bitmap bitmap) {
            IconCompat r;
            if (bitmap == null) {
                r = null;
            } else {
                r = IconCompat.r(bitmap);
            }
            this.f = r;
            this.g = true;
            return this;
        }

        public k C(Icon icon) {
            IconCompat l;
            if (icon == null) {
                l = null;
            } else {
                l = IconCompat.l(icon);
            }
            this.f = l;
            this.g = true;
            return this;
        }

        public k D(Bitmap bitmap) {
            IconCompat r;
            if (bitmap == null) {
                r = null;
            } else {
                r = IconCompat.r(bitmap);
            }
            this.e = r;
            return this;
        }

        public k E(Icon icon) {
            this.e = IconCompat.l(icon);
            return this;
        }

        public k G(CharSequence charSequence) {
            this.b = n.A(charSequence);
            return this;
        }

        public k H(CharSequence charSequence) {
            this.h = charSequence;
            return this;
        }

        public k I(CharSequence charSequence) {
            this.c = n.A(charSequence);
            this.d = true;
            return this;
        }

        public k J(boolean z) {
            this.i = z;
            return this;
        }

        @Override // o.C3771Nr1.y
        public void b(InterfaceC3282Ir1 interfaceC3282Ir1) {
            Context context;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(interfaceC3282Ir1.a()).setBigContentTitle(this.b);
            IconCompat iconCompat = this.e;
            Context context2 = null;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    if (interfaceC3282Ir1 instanceof C4063Qr1) {
                        context = ((C4063Qr1) interfaceC3282Ir1).f();
                    } else {
                        context = null;
                    }
                    b.a(bigContentTitle, this.e.L(context));
                } else if (iconCompat.B() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.e.x());
                }
            }
            if (this.g) {
                if (this.f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    if (interfaceC3282Ir1 instanceof C4063Qr1) {
                        context2 = ((C4063Qr1) interfaceC3282Ir1).f();
                    }
                    a.a(bigContentTitle, this.f.L(context2));
                }
            }
            if (this.d) {
                bigContentTitle.setSummaryText(this.c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                b.c(bigContentTitle, this.i);
                b.b(bigContentTitle, this.h);
            }
        }

        @Override // o.C3771Nr1.y
        public void g(Bundle bundle) {
            super.g(bundle);
            bundle.remove(C3771Nr1.L);
            bundle.remove(C3771Nr1.T);
            bundle.remove(C3771Nr1.U);
            bundle.remove(C3771Nr1.W);
        }

        @Override // o.C3771Nr1.y
        public String t() {
            return j;
        }

        @Override // o.C3771Nr1.y
        public void y(Bundle bundle) {
            super.y(bundle);
            if (bundle.containsKey(C3771Nr1.L)) {
                this.f = A(bundle.getParcelable(C3771Nr1.L));
                this.g = true;
            }
            this.e = F(bundle);
            this.i = bundle.getBoolean(C3771Nr1.W);
        }

        public k(n nVar) {
            z(nVar);
        }
    }

    /* renamed from: o.Nr1$l */
    /* loaded from: classes.dex */
    public static class l extends y {
        public static final String f = "androidx.core.app.NotificationCompat$BigTextStyle";
        public CharSequence e;

        public l() {
        }

        public l A(CharSequence charSequence) {
            this.e = n.A(charSequence);
            return this;
        }

        public l B(CharSequence charSequence) {
            this.b = n.A(charSequence);
            return this;
        }

        public l C(CharSequence charSequence) {
            this.c = n.A(charSequence);
            this.d = true;
            return this;
        }

        @Override // o.C3771Nr1.y
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // o.C3771Nr1.y
        public void b(InterfaceC3282Ir1 interfaceC3282Ir1) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(interfaceC3282Ir1.a()).setBigContentTitle(this.b).bigText(this.e);
            if (this.d) {
                bigText.setSummaryText(this.c);
            }
        }

        @Override // o.C3771Nr1.y
        public void g(Bundle bundle) {
            super.g(bundle);
            bundle.remove(C3771Nr1.I);
        }

        @Override // o.C3771Nr1.y
        public String t() {
            return f;
        }

        @Override // o.C3771Nr1.y
        public void y(Bundle bundle) {
            super.y(bundle);
            this.e = bundle.getCharSequence(C3771Nr1.I);
        }

        public l(n nVar) {
            z(nVar);
        }
    }

    /* renamed from: o.Nr1$m */
    /* loaded from: classes.dex */
    public static final class m {
        public static final int h = 1;
        public static final int i = 2;
        public PendingIntent a;
        public PendingIntent b;
        public IconCompat c;
        public int d;
        public int e;
        public int f;
        public String g;

        /* renamed from: o.Nr1$m$a */
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            public static m a(Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                c i = new c(bubbleMetadata.getIntent(), IconCompat.l(bubbleMetadata.getIcon())).b(bubbleMetadata.getAutoExpandBubble()).c(bubbleMetadata.getDeleteIntent()).i(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    i.d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    i.e(bubbleMetadata.getDesiredHeightResId());
                }
                return i.a();
            }

            public static Notification.BubbleMetadata b(m mVar) {
                if (mVar == null || mVar.g() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(mVar.f().K()).setIntent(mVar.g()).setDeleteIntent(mVar.c()).setAutoExpandBubble(mVar.b()).setSuppressNotification(mVar.i());
                if (mVar.d() != 0) {
                    suppressNotification.setDesiredHeight(mVar.d());
                }
                if (mVar.e() != 0) {
                    suppressNotification.setDesiredHeightResId(mVar.e());
                }
                return suppressNotification.build();
            }
        }

        /* renamed from: o.Nr1$m$b */
        /* loaded from: classes.dex */
        public static class b {
            private b() {
            }

            public static m a(Notification.BubbleMetadata bubbleMetadata) {
                c cVar;
                if (bubbleMetadata == null) {
                    return null;
                }
                if (bubbleMetadata.getShortcutId() != null) {
                    cVar = new c(bubbleMetadata.getShortcutId());
                } else {
                    cVar = new c(bubbleMetadata.getIntent(), IconCompat.l(bubbleMetadata.getIcon()));
                }
                cVar.b(bubbleMetadata.getAutoExpandBubble()).c(bubbleMetadata.getDeleteIntent()).i(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    cVar.d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    cVar.e(bubbleMetadata.getDesiredHeightResId());
                }
                return cVar.a();
            }

            public static Notification.BubbleMetadata b(m mVar) {
                Notification.BubbleMetadata.Builder builder;
                if (mVar == null) {
                    return null;
                }
                if (mVar.h() != null) {
                    builder = new Notification.BubbleMetadata.Builder(mVar.h());
                } else {
                    builder = new Notification.BubbleMetadata.Builder(mVar.g(), mVar.f().K());
                }
                builder.setDeleteIntent(mVar.c()).setAutoExpandBubble(mVar.b()).setSuppressNotification(mVar.i());
                if (mVar.d() != 0) {
                    builder.setDesiredHeight(mVar.d());
                }
                if (mVar.e() != 0) {
                    builder.setDesiredHeightResId(mVar.e());
                }
                return builder.build();
            }
        }

        /* renamed from: o.Nr1$m$c */
        /* loaded from: classes.dex */
        public static final class c {
            public PendingIntent a;
            public IconCompat b;
            public int c;
            public int d;
            public int e;
            public PendingIntent f;
            public String g;

            @Deprecated
            public c() {
            }

            public m a() {
                String str = this.g;
                if (str == null && this.a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                m mVar = new m(this.a, this.f, this.b, this.c, this.d, this.e, str);
                mVar.j(this.e);
                return mVar;
            }

            public c b(boolean z) {
                f(1, z);
                return this;
            }

            public c c(PendingIntent pendingIntent) {
                this.f = pendingIntent;
                return this;
            }

            public c d(int i) {
                this.c = Math.max(i, 0);
                this.d = 0;
                return this;
            }

            public c e(int i) {
                this.d = i;
                this.c = 0;
                return this;
            }

            public final c f(int i, boolean z) {
                if (z) {
                    this.e = i | this.e;
                    return this;
                }
                this.e = (~i) & this.e;
                return this;
            }

            public c g(IconCompat iconCompat) {
                if (this.g == null) {
                    if (iconCompat != null) {
                        this.b = iconCompat;
                        return this;
                    }
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
            }

            public c h(PendingIntent pendingIntent) {
                if (this.g == null) {
                    if (pendingIntent != null) {
                        this.a = pendingIntent;
                        return this;
                    }
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
            }

            public c i(boolean z) {
                f(2, z);
                return this;
            }

            public c(String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.g = str;
                    return;
                }
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }

            public c(PendingIntent pendingIntent, IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat != null) {
                    this.a = pendingIntent;
                    this.b = iconCompat;
                    return;
                }
                throw new NullPointerException("Bubbles require non-null icon");
            }
        }

        public static m a(Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                return b.a(bubbleMetadata);
            }
            if (i2 != 29) {
                return null;
            }
            return a.a(bubbleMetadata);
        }

        public static Notification.BubbleMetadata k(m mVar) {
            if (mVar == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                return b.b(mVar);
            }
            if (i2 != 29) {
                return null;
            }
            return a.b(mVar);
        }

        public boolean b() {
            if ((this.f & 1) != 0) {
                return true;
            }
            return false;
        }

        public PendingIntent c() {
            return this.b;
        }

        public int d() {
            return this.d;
        }

        public int e() {
            return this.e;
        }

        public IconCompat f() {
            return this.c;
        }

        public PendingIntent g() {
            return this.a;
        }

        public String h() {
            return this.g;
        }

        public boolean i() {
            if ((this.f & 2) != 0) {
                return true;
            }
            return false;
        }

        public void j(int i2) {
            this.f = i2;
        }

        public m(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i2, int i3, int i4, String str) {
            this.a = pendingIntent;
            this.c = iconCompat;
            this.d = i2;
            this.e = i3;
            this.b = pendingIntent2;
            this.f = i4;
            this.g = str;
        }
    }

    /* renamed from: o.Nr1$o */
    /* loaded from: classes.dex */
    public static class o extends y {

        /* renamed from: o  reason: collision with root package name */
        public static final String f559o = "androidx.core.app.NotificationCompat$CallStyle";
        public static final int p = 0;
        public static final int q = 1;
        public static final int r = 2;
        public static final int s = 3;
        public static final String t = "key_action_priority";
        public int e;
        public NC1 f;
        public PendingIntent g;
        public PendingIntent h;
        public PendingIntent i;
        public boolean j;
        public Integer k;
        public Integer l;
        public IconCompat m;
        public CharSequence n;

        /* renamed from: o.Nr1$o$a */
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            public static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            public static Notification.Action.Builder b(Notification.Action.Builder builder, RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            public static Notification.Action c(Notification.Action.Builder builder) {
                return builder.build();
            }

            public static Notification.Action.Builder d(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i, charSequence, pendingIntent);
            }
        }

        /* renamed from: o.Nr1$o$b */
        /* loaded from: classes.dex */
        public static class b {
            private b() {
            }

            public static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            public static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        /* renamed from: o.Nr1$o$d */
        /* loaded from: classes.dex */
        public static class d {
            private d() {
            }

            public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
                return builder.setAllowGeneratedReplies(z);
            }
        }

        /* renamed from: o.Nr1$o$f */
        /* loaded from: classes.dex */
        public static class f {
            private f() {
            }

            public static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            public static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle d(Notification.CallStyle callStyle, int i) {
                return callStyle.setAnswerButtonColorHint(i);
            }

            public static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z) {
                return builder.setAuthenticationRequired(z);
            }

            public static Notification.CallStyle f(Notification.CallStyle callStyle, int i) {
                return callStyle.setDeclineButtonColorHint(i);
            }

            public static Notification.CallStyle g(Notification.CallStyle callStyle, boolean z) {
                return callStyle.setIsVideo(z);
            }

            public static Notification.CallStyle h(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            public static Notification.CallStyle i(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: o.Nr1$o$g */
        /* loaded from: classes.dex */
        public @interface g {
        }

        public o() {
        }

        public static o A(NC1 nc1, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new o(1, nc1, null, pendingIntent, pendingIntent2);
        }

        public static o B(NC1 nc1, PendingIntent pendingIntent) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            return new o(2, nc1, pendingIntent, null, null);
        }

        public static o C(NC1 nc1, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new o(3, nc1, pendingIntent, null, pendingIntent2);
        }

        public ArrayList<b> D() {
            b I = I();
            b H = H();
            ArrayList<b> arrayList = new ArrayList<>(3);
            arrayList.add(I);
            ArrayList<b> arrayList2 = this.a.b;
            int i = 2;
            if (arrayList2 != null) {
                for (b bVar : arrayList2) {
                    if (bVar.l()) {
                        arrayList.add(bVar);
                    } else if (!F(bVar) && i > 1) {
                        arrayList.add(bVar);
                        i--;
                    }
                    if (H != null && i == 1) {
                        arrayList.add(H);
                        i--;
                    }
                }
            }
            if (H != null && i >= 1) {
                arrayList.add(H);
            }
            return arrayList;
        }

        public final String E() {
            int i = this.e;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return this.a.a.getResources().getString(HL1.h.call_notification_screening_text);
                }
                return this.a.a.getResources().getString(HL1.h.call_notification_ongoing_text);
            }
            return this.a.a.getResources().getString(HL1.h.call_notification_incoming_text);
        }

        public final boolean F(b bVar) {
            if (bVar != null && bVar.d().getBoolean(t)) {
                return true;
            }
            return false;
        }

        public final b G(int i, int i2, Integer num, int i3, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(C10201vM.g(this.a.a, i3));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.a.a.getResources().getString(i2));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            b c2 = new b.a(IconCompat.v(this.a.a, i), spannableStringBuilder, pendingIntent).c();
            c2.d().putBoolean(t, true);
            return c2;
        }

        public final b H() {
            int i;
            int i2;
            int i3 = HL1.d.ic_call_answer_video;
            int i4 = HL1.d.ic_call_answer;
            PendingIntent pendingIntent = this.g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z = this.j;
            if (z) {
                i = i3;
            } else {
                i = i4;
            }
            if (z) {
                i2 = HL1.h.call_notification_answer_video_action;
            } else {
                i2 = HL1.h.call_notification_answer_action;
            }
            return G(i, i2, this.k, HL1.b.call_notification_answer_color, pendingIntent);
        }

        public final b I() {
            int i = HL1.d.ic_call_decline;
            PendingIntent pendingIntent = this.h;
            if (pendingIntent == null) {
                return G(i, HL1.h.call_notification_hang_up_action, this.l, HL1.b.call_notification_decline_color, this.i);
            }
            return G(i, HL1.h.call_notification_decline_action, this.l, HL1.b.call_notification_decline_color, pendingIntent);
        }

        public o J(int i) {
            this.k = Integer.valueOf(i);
            return this;
        }

        public o K(int i) {
            this.l = Integer.valueOf(i);
            return this;
        }

        public o L(boolean z) {
            this.j = z;
            return this;
        }

        public o M(Bitmap bitmap) {
            this.m = IconCompat.r(bitmap);
            return this;
        }

        public o N(Icon icon) {
            IconCompat l;
            if (icon == null) {
                l = null;
            } else {
                l = IconCompat.l(icon);
            }
            this.m = l;
            return this;
        }

        public o O(CharSequence charSequence) {
            this.n = charSequence;
            return this;
        }

        @Override // o.C3771Nr1.y
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt(C3771Nr1.l0, this.e);
            bundle.putBoolean(C3771Nr1.m0, this.j);
            NC1 nc1 = this.f;
            if (nc1 != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable(C3771Nr1.n0, e.b(nc1.k()));
                } else {
                    bundle.putParcelable(C3771Nr1.o0, nc1.m());
                }
            }
            IconCompat iconCompat = this.m;
            if (iconCompat != null) {
                bundle.putParcelable(C3771Nr1.p0, c.a(iconCompat.L(this.a.a)));
            }
            bundle.putCharSequence(C3771Nr1.r0, this.n);
            bundle.putParcelable(C3771Nr1.s0, this.g);
            bundle.putParcelable(C3771Nr1.t0, this.h);
            bundle.putParcelable(C3771Nr1.u0, this.i);
            Integer num = this.k;
            if (num != null) {
                bundle.putInt(C3771Nr1.v0, num.intValue());
            }
            Integer num2 = this.l;
            if (num2 != null) {
                bundle.putInt(C3771Nr1.w0, num2.intValue());
            }
        }

        @Override // o.C3771Nr1.y
        public void b(InterfaceC3282Ir1 interfaceC3282Ir1) {
            CharSequence charSequence;
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence2 = null;
            r2 = null;
            Notification.CallStyle a2 = null;
            charSequence2 = null;
            if (i >= 31) {
                int i2 = this.e;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (Log.isLoggable(C3771Nr1.a, 3)) {
                                Log.d(C3771Nr1.a, "Unrecognized call type in CallStyle: " + String.valueOf(this.e));
                            }
                        } else {
                            a2 = f.c(this.f.k(), this.i, this.g);
                        }
                    } else {
                        a2 = f.b(this.f.k(), this.i);
                    }
                } else {
                    a2 = f.a(this.f.k(), this.h, this.g);
                }
                if (a2 != null) {
                    a2.setBuilder(interfaceC3282Ir1.a());
                    Integer num = this.k;
                    if (num != null) {
                        f.d(a2, num.intValue());
                    }
                    Integer num2 = this.l;
                    if (num2 != null) {
                        f.f(a2, num2.intValue());
                    }
                    f.i(a2, this.n);
                    IconCompat iconCompat = this.m;
                    if (iconCompat != null) {
                        f.h(a2, iconCompat.L(this.a.a));
                    }
                    f.g(a2, this.j);
                    return;
                }
                return;
            }
            Notification.Builder a3 = interfaceC3282Ir1.a();
            NC1 nc1 = this.f;
            if (nc1 != null) {
                charSequence = nc1.f();
            } else {
                charSequence = null;
            }
            a3.setContentTitle(charSequence);
            Bundle bundle = this.a.E;
            if (bundle != null && bundle.containsKey(C3771Nr1.D)) {
                charSequence2 = this.a.E.getCharSequence(C3771Nr1.D);
            }
            if (charSequence2 == null) {
                charSequence2 = E();
            }
            a3.setContentText(charSequence2);
            NC1 nc12 = this.f;
            if (nc12 != null) {
                if (nc12.d() != null) {
                    c.c(a3, this.f.d().L(this.a.a));
                }
                if (i >= 28) {
                    e.a(a3, this.f.k());
                } else {
                    b.a(a3, this.f.g());
                }
            }
            b.b(a3, C3771Nr1.E0);
        }

        @Override // o.C3771Nr1.y
        public boolean r() {
            return true;
        }

        @Override // o.C3771Nr1.y
        public String t() {
            return f559o;
        }

        @Override // o.C3771Nr1.y
        public void y(Bundle bundle) {
            Integer num;
            super.y(bundle);
            this.e = bundle.getInt(C3771Nr1.l0);
            this.j = bundle.getBoolean(C3771Nr1.m0);
            if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey(C3771Nr1.n0)) {
                this.f = NC1.a(C3673Mr1.a(bundle.getParcelable(C3771Nr1.n0)));
            } else if (bundle.containsKey(C3771Nr1.o0)) {
                this.f = NC1.b(bundle.getBundle(C3771Nr1.o0));
            }
            if (bundle.containsKey(C3771Nr1.p0)) {
                this.m = IconCompat.l((Icon) bundle.getParcelable(C3771Nr1.p0));
            } else if (bundle.containsKey(C3771Nr1.q0)) {
                this.m = IconCompat.j(bundle.getBundle(C3771Nr1.q0));
            }
            this.n = bundle.getCharSequence(C3771Nr1.r0);
            this.g = (PendingIntent) bundle.getParcelable(C3771Nr1.s0);
            this.h = (PendingIntent) bundle.getParcelable(C3771Nr1.t0);
            this.i = (PendingIntent) bundle.getParcelable(C3771Nr1.u0);
            Integer num2 = null;
            if (bundle.containsKey(C3771Nr1.v0)) {
                num = Integer.valueOf(bundle.getInt(C3771Nr1.v0));
            } else {
                num = null;
            }
            this.k = num;
            if (bundle.containsKey(C3771Nr1.w0)) {
                num2 = Integer.valueOf(bundle.getInt(C3771Nr1.w0));
            }
            this.l = num2;
        }

        public o(n nVar) {
            z(nVar);
        }

        public o(int i, NC1 nc1, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
            if (nc1 != null && !TextUtils.isEmpty(nc1.f())) {
                this.e = i;
                this.f = nc1;
                this.g = pendingIntent3;
                this.h = pendingIntent2;
                this.i = pendingIntent;
                return;
            }
            throw new IllegalArgumentException("person must have a non-empty a name");
        }

        /* renamed from: o.Nr1$o$c */
        /* loaded from: classes.dex */
        public static class c {
            private c() {
            }

            public static Notification.Action.Builder b(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            public static void c(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }

            public static Parcelable a(Icon icon) {
                return icon;
            }
        }

        /* renamed from: o.Nr1$o$e */
        /* loaded from: classes.dex */
        public static class e {
            private e() {
            }

            public static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            public static Parcelable b(Person person) {
                return person;
            }
        }
    }

    /* renamed from: o.Nr1$q */
    /* loaded from: classes.dex */
    public static class q extends y {
        public static final String e = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        public static final int f = 3;

        /* renamed from: o.Nr1$q$a */
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            public static Notification.Style a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        public static List<b> C(List<b> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (b bVar : list) {
                if (!bVar.l()) {
                    arrayList.add(bVar);
                }
            }
            return arrayList;
        }

        public static List<CharSequence> D(Context context, Notification notification) {
            if (!Notification.DecoratedCustomViewStyle.class.getName().equals(notification.extras.getString(C3771Nr1.Y))) {
                return Collections.EMPTY_LIST;
            }
            RemoteViews remoteViews = notification.contentView;
            if (remoteViews == null && notification.bigContentView == null && notification.headsUpContentView == null) {
                return Collections.EMPTY_LIST;
            }
            RemoteViews remoteViews2 = notification.bigContentView;
            if (remoteViews2 != null) {
                remoteViews = remoteViews2;
            } else if (remoteViews == null) {
                remoteViews = notification.headsUpContentView;
            }
            String str = remoteViews.getPackage();
            try {
                Context createPackageContext = context.createPackageContext(str, 0);
                createPackageContext.setTheme(context.getPackageManager().getApplicationInfo(str, 0).theme);
                View apply = remoteViews.apply(createPackageContext, null);
                ArrayList arrayList = new ArrayList();
                E(apply, arrayList);
                return arrayList;
            } catch (PackageManager.NameNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }

        public static void E(View view, ArrayList<CharSequence> arrayList) {
            CharSequence text;
            if (view instanceof ViewGroup) {
                int i = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i);
                        if ((childAt instanceof TextView) && (text = ((TextView) childAt).getText()) != null && text.length() > 0) {
                            arrayList.add(text);
                        }
                        if (childAt instanceof ViewGroup) {
                            E(childAt, arrayList);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        public final RemoteViews A(RemoteViews remoteViews, boolean z) {
            int min;
            int i = 0;
            RemoteViews c = c(true, HL1.g.f, false);
            c.removeAllViews(HL1.e.L);
            List<b> C = C(this.a.b);
            if (z && C != null && (min = Math.min(C.size(), 3)) > 0) {
                for (int i2 = 0; i2 < min; i2++) {
                    c.addView(HL1.e.L, B(C.get(i2)));
                }
            } else {
                i = 8;
            }
            c.setViewVisibility(HL1.e.L, i);
            c.setViewVisibility(HL1.e.I, i);
            e(c, remoteViews);
            return c;
        }

        public final RemoteViews B(b bVar) {
            boolean z;
            int i;
            if (bVar.k == null) {
                z = true;
            } else {
                z = false;
            }
            String packageName = this.a.a.getPackageName();
            if (z) {
                i = HL1.g.e;
            } else {
                i = HL1.g.d;
            }
            RemoteViews remoteViews = new RemoteViews(packageName, i);
            IconCompat f2 = bVar.f();
            if (f2 != null) {
                remoteViews.setImageViewBitmap(HL1.e.J, o(f2, HL1.b.e));
            }
            remoteViews.setTextViewText(HL1.e.K, bVar.j);
            if (!z) {
                remoteViews.setOnClickPendingIntent(HL1.e.H, bVar.k);
            }
            remoteViews.setContentDescription(HL1.e.H, bVar.j);
            return remoteViews;
        }

        @Override // o.C3771Nr1.y
        public void b(InterfaceC3282Ir1 interfaceC3282Ir1) {
            interfaceC3282Ir1.a().setStyle(a.a());
        }

        @Override // o.C3771Nr1.y
        public boolean r() {
            return true;
        }

        @Override // o.C3771Nr1.y
        public String t() {
            return e;
        }

        @Override // o.C3771Nr1.y
        public RemoteViews v(InterfaceC3282Ir1 interfaceC3282Ir1) {
            return null;
        }

        @Override // o.C3771Nr1.y
        public RemoteViews w(InterfaceC3282Ir1 interfaceC3282Ir1) {
            return null;
        }

        @Override // o.C3771Nr1.y
        public RemoteViews x(InterfaceC3282Ir1 interfaceC3282Ir1) {
            return null;
        }
    }

    /* renamed from: o.Nr1$r */
    /* loaded from: classes.dex */
    public interface r {
        n a(n nVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Nr1$s */
    /* loaded from: classes.dex */
    public @interface s {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Nr1$v */
    /* loaded from: classes.dex */
    public @interface v {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Nr1$w */
    /* loaded from: classes.dex */
    public @interface w {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Nr1$x */
    /* loaded from: classes.dex */
    public @interface x {
    }

    public static String A(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.e(notification);
        }
        return null;
    }

    public static boolean B(Notification notification) {
        return notification.extras.getBoolean(S);
    }

    public static String C(Notification notification) {
        return c.i(notification);
    }

    public static CharSequence D(Notification notification) {
        return notification.extras.getCharSequence(E);
    }

    public static long E(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.f(notification);
        }
        return 0L;
    }

    public static boolean F(Notification notification) {
        return notification.extras.getBoolean(P);
    }

    public static int G(Notification notification) {
        return notification.visibility;
    }

    public static boolean H(Notification notification) {
        if ((notification.flags & 512) != 0) {
            return true;
        }
        return false;
    }

    public static Bitmap I(Context context, Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = context.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(HL1.c.g);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(HL1.c.f);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
        }
        return bitmap;
    }

    public static b a(Notification notification, int i2) {
        return b(notification.actions[i2]);
    }

    public static b b(Notification.Action action) {
        C7282jR1[] c7282jR1Arr;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        RemoteInput[] g2 = c.g(action);
        IconCompat iconCompat = null;
        boolean z4 = false;
        if (g2 == null) {
            c7282jR1Arr = null;
        } else {
            C7282jR1[] c7282jR1Arr2 = new C7282jR1[g2.length];
            for (int i5 = 0; i5 < g2.length; i5++) {
                RemoteInput remoteInput = g2[i5];
                String h2 = c.h(remoteInput);
                CharSequence f2 = c.f(remoteInput);
                CharSequence[] b2 = c.b(remoteInput);
                boolean a2 = c.a(remoteInput);
                if (Build.VERSION.SDK_INT >= 29) {
                    i2 = h.c(remoteInput);
                } else {
                    i2 = 0;
                }
                c7282jR1Arr2[i5] = new C7282jR1(h2, f2, b2, a2, i2, c.d(remoteInput), null);
            }
            c7282jR1Arr = c7282jR1Arr2;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (!c.c(action).getBoolean(C4260Sr1.c) && !e.a(action)) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z5 = c.c(action).getBoolean(b.x, true);
        if (i6 >= 28) {
            i3 = g.a(action);
        } else {
            i3 = c.c(action).getInt(b.y, 0);
        }
        int i7 = i3;
        if (i6 >= 29) {
            z3 = h.e(action);
        } else {
            z3 = false;
        }
        if (i6 >= 31) {
            z4 = i.a(action);
        }
        boolean z6 = z4;
        if (d.a(action) == null && (i4 = action.icon) != 0) {
            return new b(i4, action.title, action.actionIntent, c.c(action), c7282jR1Arr, (C7282jR1[]) null, z2, i7, z5, z3, z6);
        }
        if (d.a(action) != null) {
            iconCompat = IconCompat.m(d.a(action));
        }
        return new b(iconCompat, action.title, action.actionIntent, c.c(action), c7282jR1Arr, (C7282jR1[]) null, z2, i7, z5, z3, z6);
    }

    public static int c(Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean d(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return h.a(notification);
        }
        return false;
    }

    public static boolean e(Notification notification) {
        if ((notification.flags & 16) != 0) {
            return true;
        }
        return false;
    }

    public static int f(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.a(notification);
        }
        return 0;
    }

    public static m g(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return m.a(h.b(notification));
        }
        return null;
    }

    public static String h(Notification notification) {
        return notification.category;
    }

    public static String i(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.b(notification);
        }
        return null;
    }

    public static int j(Notification notification) {
        return notification.color;
    }

    public static CharSequence k(Notification notification) {
        return notification.extras.getCharSequence(G);
    }

    public static CharSequence l(Notification notification) {
        return notification.extras.getCharSequence(D);
    }

    public static CharSequence m(Notification notification) {
        return notification.extras.getCharSequence(B);
    }

    @JR1(expression = "notification.extras")
    @Deprecated
    public static Bundle n(Notification notification) {
        return notification.extras;
    }

    public static String o(Notification notification) {
        return c.e(notification);
    }

    public static int p(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.c(notification);
        }
        return 0;
    }

    public static boolean q(Notification notification) {
        if ((notification.flags & 128) != 0) {
            return true;
        }
        return false;
    }

    public static List<b> r(Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle(p.d);
        if (bundle2 != null && (bundle = bundle2.getBundle(p.h)) != null) {
            for (int i2 = 0; i2 < bundle.size(); i2++) {
                arrayList.add(C4260Sr1.g(bundle.getBundle(Integer.toString(i2))));
            }
        }
        return arrayList;
    }

    public static boolean s(Notification notification) {
        if ((notification.flags & 256) != 0) {
            return true;
        }
        return false;
    }

    public static H31 t(Notification notification) {
        LocusId d2;
        if (Build.VERSION.SDK_INT < 29 || (d2 = h.d(notification)) == null) {
            return null;
        }
        return H31.d(d2);
    }

    public static Notification[] u(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if (!(parcelableArray instanceof Notification[]) && parcelableArray != null) {
            Notification[] notificationArr = new Notification[parcelableArray.length];
            for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                notificationArr[i2] = (Notification) parcelableArray[i2];
            }
            bundle.putParcelableArray(str, notificationArr);
            return notificationArr;
        }
        return (Notification[]) parcelableArray;
    }

    public static boolean v(Notification notification) {
        if ((notification.flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public static boolean w(Notification notification) {
        if ((notification.flags & 8) != 0) {
            return true;
        }
        return false;
    }

    public static List<NC1> x(Notification notification) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(b0);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(NC1.a(C3673Mr1.a(it.next())));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(a0);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    arrayList.add(new NC1.c().g(str).a());
                }
            }
        }
        return arrayList;
    }

    public static Notification y(Notification notification) {
        return notification.publicVersion;
    }

    public static CharSequence z(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.d(notification);
        }
        return null;
    }

    /* renamed from: o.Nr1$p */
    /* loaded from: classes.dex */
    public static final class p implements r {
        public static final String d = "android.car.EXTENSIONS";
        public static final String e = "large_icon";
        public static final String f = "car_conversation";
        public static final String g = "app_color";
        public static final String h = "invisible_actions";
        public static final String i = "author";
        public static final String j = "text";
        public static final String k = "messages";
        public static final String l = "remote_input";
        public static final String m = "on_reply";
        public static final String n = "on_read";

        /* renamed from: o  reason: collision with root package name */
        public static final String f560o = "participants";
        public static final String p = "timestamp";
        public Bitmap a;
        public c b;
        public int c;

        /* renamed from: o.Nr1$p$b */
        /* loaded from: classes.dex */
        public static class b {
            private b() {
            }

            public static int a(RemoteInput remoteInput) {
                return remoteInput.getEditChoicesBeforeSending();
            }
        }

        @Deprecated
        /* renamed from: o.Nr1$p$c */
        /* loaded from: classes.dex */
        public static class c {
            public final String[] a;
            public final C7282jR1 b;
            public final PendingIntent c;
            public final PendingIntent d;
            public final String[] e;
            public final long f;

            /* renamed from: o.Nr1$p$c$a */
            /* loaded from: classes.dex */
            public static class a {
                public final List<String> a = new ArrayList();
                public final String b;
                public C7282jR1 c;
                public PendingIntent d;
                public PendingIntent e;
                public long f;

                public a(String str) {
                    this.b = str;
                }

                public a a(String str) {
                    if (str != null) {
                        this.a.add(str);
                    }
                    return this;
                }

                public c b() {
                    List<String> list = this.a;
                    return new c((String[]) list.toArray(new String[list.size()]), this.c, this.e, this.d, new String[]{this.b}, this.f);
                }

                public a c(long j) {
                    this.f = j;
                    return this;
                }

                public a d(PendingIntent pendingIntent) {
                    this.d = pendingIntent;
                    return this;
                }

                public a e(PendingIntent pendingIntent, C7282jR1 c7282jR1) {
                    this.c = c7282jR1;
                    this.e = pendingIntent;
                    return this;
                }
            }

            public c(String[] strArr, C7282jR1 c7282jR1, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j) {
                this.a = strArr;
                this.b = c7282jR1;
                this.d = pendingIntent2;
                this.c = pendingIntent;
                this.e = strArr2;
                this.f = j;
            }

            public long a() {
                return this.f;
            }

            public String[] b() {
                return this.a;
            }

            public String c() {
                String[] strArr = this.e;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            public String[] d() {
                return this.e;
            }

            public PendingIntent e() {
                return this.d;
            }

            public C7282jR1 f() {
                return this.b;
            }

            public PendingIntent g() {
                return this.c;
            }
        }

        public p() {
            this.c = 0;
        }

        public static Bundle b(c cVar) {
            String str;
            Bundle bundle = new Bundle();
            if (cVar.d() != null && cVar.d().length > 1) {
                str = cVar.d()[0];
            } else {
                str = null;
            }
            int length = cVar.b().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i2 = 0; i2 < length; i2++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", cVar.b()[i2]);
                bundle2.putString(i, str);
                parcelableArr[i2] = bundle2;
            }
            bundle.putParcelableArray("messages", parcelableArr);
            C7282jR1 f2 = cVar.f();
            if (f2 != null) {
                RemoteInput.Builder d2 = a.d(f2.o());
                a.l(d2, f2.n());
                a.k(d2, f2.h());
                a.j(d2, f2.f());
                a.a(d2, f2.m());
                bundle.putParcelable(l, a.c(a.b(d2)));
            }
            bundle.putParcelable(m, cVar.g());
            bundle.putParcelable(n, cVar.e());
            bundle.putStringArray(f560o, cVar.d());
            bundle.putLong("timestamp", cVar.a());
            return bundle;
        }

        public static c f(Bundle bundle) {
            String[] strArr;
            C7282jR1 c7282jR1;
            if (bundle == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("messages");
            int i2 = 0;
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                for (int i3 = 0; i3 < length; i3++) {
                    Parcelable parcelable = parcelableArray[i3];
                    if (parcelable instanceof Bundle) {
                        String string = ((Bundle) parcelable).getString("text");
                        strArr2[i3] = string;
                        if (string != null) {
                        }
                    }
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(n);
            PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable(m);
            RemoteInput remoteInput = (RemoteInput) bundle.getParcelable(l);
            String[] stringArray = bundle.getStringArray(f560o);
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            if (remoteInput != null) {
                String i4 = a.i(remoteInput);
                CharSequence h2 = a.h(remoteInput);
                CharSequence[] f2 = a.f(remoteInput);
                boolean e2 = a.e(remoteInput);
                if (Build.VERSION.SDK_INT >= 29) {
                    i2 = b.a(remoteInput);
                }
                c7282jR1 = new C7282jR1(i4, h2, f2, e2, i2, a.g(remoteInput), null);
            } else {
                c7282jR1 = null;
            }
            return new c(strArr, c7282jR1, pendingIntent2, pendingIntent, stringArray, bundle.getLong("timestamp"));
        }

        @Override // o.C3771Nr1.r
        public n a(n nVar) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                bundle.putParcelable(e, bitmap);
            }
            int i2 = this.c;
            if (i2 != 0) {
                bundle.putInt(g, i2);
            }
            c cVar = this.b;
            if (cVar != null) {
                bundle.putBundle(f, b(cVar));
            }
            nVar.t().putBundle(d, bundle);
            return nVar;
        }

        public int c() {
            return this.c;
        }

        public Bitmap d() {
            return this.a;
        }

        @Deprecated
        public c e() {
            return this.b;
        }

        public p g(int i2) {
            this.c = i2;
            return this;
        }

        public p h(Bitmap bitmap) {
            this.a = bitmap;
            return this;
        }

        @Deprecated
        public p i(c cVar) {
            this.b = cVar;
            return this;
        }

        public p(Notification notification) {
            this.c = 0;
            Bundle bundle = C3771Nr1.n(notification) == null ? null : C3771Nr1.n(notification).getBundle(d);
            if (bundle != null) {
                this.a = (Bitmap) bundle.getParcelable(e);
                this.c = bundle.getInt(g, 0);
                this.b = f(bundle.getBundle(f));
            }
        }

        /* renamed from: o.Nr1$p$a */
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            public static RemoteInput.Builder a(RemoteInput.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            public static RemoteInput b(RemoteInput.Builder builder) {
                return builder.build();
            }

            public static RemoteInput.Builder d(String str) {
                return new RemoteInput.Builder(str);
            }

            public static boolean e(RemoteInput remoteInput) {
                return remoteInput.getAllowFreeFormInput();
            }

            public static CharSequence[] f(RemoteInput remoteInput) {
                return remoteInput.getChoices();
            }

            public static Bundle g(RemoteInput remoteInput) {
                return remoteInput.getExtras();
            }

            public static CharSequence h(RemoteInput remoteInput) {
                return remoteInput.getLabel();
            }

            public static String i(RemoteInput remoteInput) {
                return remoteInput.getResultKey();
            }

            public static RemoteInput.Builder j(RemoteInput.Builder builder, boolean z) {
                return builder.setAllowFreeFormInput(z);
            }

            public static RemoteInput.Builder k(RemoteInput.Builder builder, CharSequence[] charSequenceArr) {
                return builder.setChoices(charSequenceArr);
            }

            public static RemoteInput.Builder l(RemoteInput.Builder builder, CharSequence charSequence) {
                return builder.setLabel(charSequence);
            }

            public static Parcelable c(RemoteInput remoteInput) {
                return remoteInput;
            }
        }
    }

    /* renamed from: o.Nr1$t */
    /* loaded from: classes.dex */
    public static class t extends y {
        public static final String f = "androidx.core.app.NotificationCompat$InboxStyle";
        public ArrayList<CharSequence> e = new ArrayList<>();

        public t() {
        }

        public t A(CharSequence charSequence) {
            if (charSequence != null) {
                this.e.add(n.A(charSequence));
            }
            return this;
        }

        public t B(CharSequence charSequence) {
            this.b = n.A(charSequence);
            return this;
        }

        public t C(CharSequence charSequence) {
            this.c = n.A(charSequence);
            this.d = true;
            return this;
        }

        @Override // o.C3771Nr1.y
        public void b(InterfaceC3282Ir1 interfaceC3282Ir1) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(interfaceC3282Ir1.a()).setBigContentTitle(this.b);
            if (this.d) {
                bigContentTitle.setSummaryText(this.c);
            }
            Iterator<CharSequence> it = this.e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // o.C3771Nr1.y
        public void g(Bundle bundle) {
            super.g(bundle);
            bundle.remove(C3771Nr1.X);
        }

        @Override // o.C3771Nr1.y
        public String t() {
            return f;
        }

        @Override // o.C3771Nr1.y
        public void y(Bundle bundle) {
            super.y(bundle);
            this.e.clear();
            if (bundle.containsKey(C3771Nr1.X)) {
                Collections.addAll(this.e, bundle.getCharSequenceArray(C3771Nr1.X));
            }
        }

        public t(n nVar) {
            z(nVar);
        }
    }

    /* renamed from: o.Nr1$z */
    /* loaded from: classes.dex */
    public static final class z implements r {
        public static final String f = "TvExtender";
        public static final String g = "android.tv.EXTENSIONS";
        public static final String h = "flags";
        public static final String i = "content_intent";
        public static final String j = "delete_intent";
        public static final String k = "channel_id";
        public static final String l = "suppressShowOverApps";
        public static final int m = 1;
        public int a;
        public String b;
        public PendingIntent c;
        public PendingIntent d;
        public boolean e;

        public z() {
            this.a = 1;
        }

        @Override // o.C3771Nr1.r
        public n a(n nVar) {
            if (Build.VERSION.SDK_INT < 26) {
                return nVar;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("flags", this.a);
            bundle.putString(k, this.b);
            bundle.putBoolean(l, this.e);
            PendingIntent pendingIntent = this.c;
            if (pendingIntent != null) {
                bundle.putParcelable(i, pendingIntent);
            }
            PendingIntent pendingIntent2 = this.d;
            if (pendingIntent2 != null) {
                bundle.putParcelable(j, pendingIntent2);
            }
            nVar.t().putBundle(g, bundle);
            return nVar;
        }

        public String b() {
            return this.b;
        }

        public PendingIntent c() {
            return this.c;
        }

        public PendingIntent d() {
            return this.d;
        }

        public boolean e() {
            if ((this.a & 1) != 0) {
                return true;
            }
            return false;
        }

        public boolean f() {
            return this.e;
        }

        public z g(String str) {
            this.b = str;
            return this;
        }

        public z h(PendingIntent pendingIntent) {
            this.c = pendingIntent;
            return this;
        }

        public z i(PendingIntent pendingIntent) {
            this.d = pendingIntent;
            return this;
        }

        public z j(boolean z) {
            this.e = z;
            return this;
        }

        public z(Notification notification) {
            if (Build.VERSION.SDK_INT < 26) {
                return;
            }
            Bundle bundle = notification.extras;
            Bundle bundle2 = bundle == null ? null : bundle.getBundle(g);
            if (bundle2 != null) {
                this.a = bundle2.getInt("flags");
                this.b = bundle2.getString(k);
                this.e = bundle2.getBoolean(l);
                this.c = (PendingIntent) bundle2.getParcelable(i);
                this.d = (PendingIntent) bundle2.getParcelable(j);
            }
        }
    }

    /* renamed from: o.Nr1$u */
    /* loaded from: classes.dex */
    public static class u extends y {
        public static final String j = "androidx.core.app.NotificationCompat$MessagingStyle";
        public static final int k = 25;
        public final List<d> e = new ArrayList();
        public final List<d> f = new ArrayList();
        public NC1 g;
        public CharSequence h;
        public Boolean i;

        /* renamed from: o.Nr1$u$a */
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            public static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            public static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* renamed from: o.Nr1$u$b */
        /* loaded from: classes.dex */
        public static class b {
            private b() {
            }

            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        /* renamed from: o.Nr1$u$c */
        /* loaded from: classes.dex */
        public static class c {
            private c() {
            }

            public static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z) {
                return messagingStyle.setGroupConversation(z);
            }
        }

        public u() {
        }

        public static u E(Notification notification) {
            y s = y.s(notification);
            if (s instanceof u) {
                return (u) s;
            }
            return null;
        }

        public u A(d dVar) {
            if (dVar != null) {
                this.f.add(dVar);
                if (this.f.size() > 25) {
                    this.f.remove(0);
                }
            }
            return this;
        }

        @Deprecated
        public u B(CharSequence charSequence, long j2, CharSequence charSequence2) {
            this.e.add(new d(charSequence, j2, new NC1.c().f(charSequence2).a()));
            if (this.e.size() > 25) {
                this.e.remove(0);
            }
            return this;
        }

        public u C(CharSequence charSequence, long j2, NC1 nc1) {
            D(new d(charSequence, j2, nc1));
            return this;
        }

        public u D(d dVar) {
            if (dVar != null) {
                this.e.add(dVar);
                if (this.e.size() > 25) {
                    this.e.remove(0);
                }
            }
            return this;
        }

        public final d F() {
            List<d> list;
            for (int size = this.e.size() - 1; size >= 0; size--) {
                d dVar = this.e.get(size);
                if (dVar.g() != null && !TextUtils.isEmpty(dVar.g().f())) {
                    return dVar;
                }
            }
            if (!this.e.isEmpty()) {
                return this.e.get(list.size() - 1);
            }
            return null;
        }

        public CharSequence G() {
            return this.h;
        }

        public List<d> H() {
            return this.f;
        }

        public List<d> I() {
            return this.e;
        }

        public NC1 J() {
            return this.g;
        }

        @Deprecated
        public CharSequence K() {
            return this.g.f();
        }

        public final boolean L() {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                d dVar = this.e.get(size);
                if (dVar.g() != null && dVar.g().f() == null) {
                    return true;
                }
            }
            return false;
        }

        public boolean M() {
            n nVar = this.a;
            if (nVar != null && nVar.a.getApplicationInfo().targetSdkVersion < 28 && this.i == null) {
                if (this.h == null) {
                    return false;
                }
                return true;
            }
            Boolean bool = this.i;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }

        public final TextAppearanceSpan N(int i) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null);
        }

        public final CharSequence O(d dVar) {
            CharSequence f;
            C4820Ym c2 = C4820Ym.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence charSequence = "";
            if (dVar.g() == null) {
                f = "";
            } else {
                f = dVar.g().f();
            }
            int i = -16777216;
            if (TextUtils.isEmpty(f)) {
                f = this.g.f();
                if (this.a.r() != 0) {
                    i = this.a.r();
                }
            }
            CharSequence m = c2.m(f);
            spannableStringBuilder.append(m);
            spannableStringBuilder.setSpan(N(i), spannableStringBuilder.length() - m.length(), spannableStringBuilder.length(), 33);
            if (dVar.i() != null) {
                charSequence = dVar.i();
            }
            spannableStringBuilder.append((CharSequence) TD0.a.Y0).append(c2.m(charSequence));
            return spannableStringBuilder;
        }

        public u P(CharSequence charSequence) {
            this.h = charSequence;
            return this;
        }

        public u Q(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        @Override // o.C3771Nr1.y
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence(C3771Nr1.f0, this.g.f());
            bundle.putBundle(C3771Nr1.g0, this.g.m());
            bundle.putCharSequence(C3771Nr1.x0, this.h);
            if (this.h != null && this.i.booleanValue()) {
                bundle.putCharSequence(C3771Nr1.h0, this.h);
            }
            if (!this.e.isEmpty()) {
                bundle.putParcelableArray(C3771Nr1.i0, d.a(this.e));
            }
            if (!this.f.isEmpty()) {
                bundle.putParcelableArray(C3771Nr1.j0, d.a(this.f));
            }
            Boolean bool = this.i;
            if (bool != null) {
                bundle.putBoolean(C3771Nr1.k0, bool.booleanValue());
            }
        }

        @Override // o.C3771Nr1.y
        public void b(InterfaceC3282Ir1 interfaceC3282Ir1) {
            Notification.MessagingStyle b2;
            Q(M());
            if (Build.VERSION.SDK_INT >= 28) {
                b2 = c.a(this.g.k());
            } else {
                b2 = a.b(this.g.f());
            }
            for (d dVar : this.e) {
                a.a(b2, dVar.l());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                for (d dVar2 : this.f) {
                    b.a(b2, dVar2.l());
                }
            }
            if (this.i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                a.c(b2, this.h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                c.b(b2, this.i.booleanValue());
            }
            b2.setBuilder(interfaceC3282Ir1.a());
        }

        @Override // o.C3771Nr1.y
        public void g(Bundle bundle) {
            super.g(bundle);
            bundle.remove(C3771Nr1.g0);
            bundle.remove(C3771Nr1.f0);
            bundle.remove(C3771Nr1.h0);
            bundle.remove(C3771Nr1.x0);
            bundle.remove(C3771Nr1.i0);
            bundle.remove(C3771Nr1.j0);
            bundle.remove(C3771Nr1.k0);
        }

        @Override // o.C3771Nr1.y
        public String t() {
            return j;
        }

        @Override // o.C3771Nr1.y
        public void y(Bundle bundle) {
            super.y(bundle);
            this.e.clear();
            if (bundle.containsKey(C3771Nr1.g0)) {
                this.g = NC1.b(bundle.getBundle(C3771Nr1.g0));
            } else {
                this.g = new NC1.c().f(bundle.getString(C3771Nr1.f0)).a();
            }
            CharSequence charSequence = bundle.getCharSequence(C3771Nr1.h0);
            this.h = charSequence;
            if (charSequence == null) {
                this.h = bundle.getCharSequence(C3771Nr1.x0);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(C3771Nr1.i0);
            if (parcelableArray != null) {
                this.e.addAll(d.f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(C3771Nr1.j0);
            if (parcelableArray2 != null) {
                this.f.addAll(d.f(parcelableArray2));
            }
            if (bundle.containsKey(C3771Nr1.k0)) {
                this.i = Boolean.valueOf(bundle.getBoolean(C3771Nr1.k0));
            }
        }

        @Deprecated
        public u(CharSequence charSequence) {
            this.g = new NC1.c().f(charSequence).a();
        }

        /* renamed from: o.Nr1$u$d */
        /* loaded from: classes.dex */
        public static final class d {
            public static final String g = "text";
            public static final String h = "time";
            public static final String i = "sender";
            public static final String j = "type";
            public static final String k = "uri";
            public static final String l = "extras";
            public static final String m = "person";
            public static final String n = "sender_person";
            public final CharSequence a;
            public final long b;
            public final NC1 c;
            public Bundle d;
            public String e;
            public Uri f;

            /* renamed from: o.Nr1$u$d$a */
            /* loaded from: classes.dex */
            public static class a {
                private a() {
                }

                public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
                }

                public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            public d(CharSequence charSequence, long j2, NC1 nc1) {
                this.d = new Bundle();
                this.a = charSequence;
                this.b = j2;
                this.c = nc1;
            }

            public static Bundle[] a(List<d> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bundleArr[i2] = list.get(i2).m();
                }
                return bundleArr;
            }

            public static d e(Bundle bundle) {
                NC1 nc1;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey(m)) {
                            nc1 = NC1.b(bundle.getBundle(m));
                        } else if (bundle.containsKey(n) && Build.VERSION.SDK_INT >= 28) {
                            nc1 = NC1.a(C3673Mr1.a(bundle.getParcelable(n)));
                        } else if (bundle.containsKey("sender")) {
                            nc1 = new NC1.c().f(bundle.getCharSequence("sender")).a();
                        } else {
                            nc1 = null;
                        }
                        d dVar = new d(bundle.getCharSequence("text"), bundle.getLong("time"), nc1);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            dVar.k(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            dVar.d().putAll(bundle.getBundle("extras"));
                        }
                        return dVar;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            public static List<d> f(Parcelable[] parcelableArr) {
                d e;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (e = e((Bundle) parcelable)) != null) {
                        arrayList.add(e);
                    }
                }
                return arrayList;
            }

            public String b() {
                return this.e;
            }

            public Uri c() {
                return this.f;
            }

            public Bundle d() {
                return this.d;
            }

            public NC1 g() {
                return this.c;
            }

            @Deprecated
            public CharSequence h() {
                NC1 nc1 = this.c;
                if (nc1 == null) {
                    return null;
                }
                return nc1.f();
            }

            public CharSequence i() {
                return this.a;
            }

            public long j() {
                return this.b;
            }

            public d k(String str, Uri uri) {
                this.e = str;
                this.f = uri;
                return this;
            }

            public Notification.MessagingStyle.Message l() {
                Notification.MessagingStyle.Message a2;
                NC1 g2 = g();
                CharSequence charSequence = null;
                Person person = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    CharSequence i2 = i();
                    long j2 = j();
                    if (g2 != null) {
                        person = g2.k();
                    }
                    a2 = b.b(i2, j2, person);
                } else {
                    CharSequence i3 = i();
                    long j3 = j();
                    if (g2 != null) {
                        charSequence = g2.f();
                    }
                    a2 = a.a(i3, j3, charSequence);
                }
                if (b() != null) {
                    a.b(a2, b(), c());
                }
                return a2;
            }

            public final Bundle m() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.b);
                NC1 nc1 = this.c;
                if (nc1 != null) {
                    bundle.putCharSequence("sender", nc1.f());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable(n, b.a(this.c.k()));
                    } else {
                        bundle.putBundle(m, this.c.m());
                    }
                }
                String str = this.e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            @Deprecated
            public d(CharSequence charSequence, long j2, CharSequence charSequence2) {
                this(charSequence, j2, new NC1.c().f(charSequence2).a());
            }

            /* renamed from: o.Nr1$u$d$b */
            /* loaded from: classes.dex */
            public static class b {
                private b() {
                }

                public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j, person);
                }

                public static Parcelable a(Person person) {
                    return person;
                }
            }
        }

        public u(NC1 nc1) {
            if (!TextUtils.isEmpty(nc1.f())) {
                this.g = nc1;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    /* renamed from: o.Nr1$A */
    /* loaded from: classes.dex */
    public static final class A implements r {
        public static final String A = "displayIntent";
        public static final String B = "pages";
        public static final String C = "background";
        public static final String D = "contentIcon";
        public static final String E = "contentIconGravity";
        public static final String F = "contentActionIndex";
        public static final String G = "customSizePreset";
        public static final String H = "customContentHeight";
        public static final String I = "gravity";
        public static final String J = "hintScreenTimeout";
        public static final String K = "dismissalId";
        public static final String L = "bridgeTag";
        public static final int M = 1;
        public static final int N = 2;
        public static final int O = 4;
        public static final int P = 8;
        public static final int Q = 16;
        public static final int R = 32;
        public static final int S = 64;
        public static final int T = 1;
        public static final int U = 8388613;
        public static final int V = 80;

        /* renamed from: o  reason: collision with root package name */
        public static final int f556o = -1;
        @Deprecated
        public static final int p = 0;
        @Deprecated
        public static final int q = 1;
        @Deprecated
        public static final int r = 2;
        @Deprecated
        public static final int s = 3;
        @Deprecated
        public static final int t = 4;
        @Deprecated
        public static final int u = 5;
        @Deprecated
        public static final int v = 0;
        @Deprecated
        public static final int w = -1;
        public static final String x = "android.wearable.EXTENSIONS";
        public static final String y = "actions";
        public static final String z = "flags";
        public ArrayList<b> a;
        public int b;
        public PendingIntent c;
        public ArrayList<Notification> d;
        public Bitmap e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public String m;
        public String n;

        /* renamed from: o.Nr1$A$a */
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            public static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            public static Notification.Action.Builder b(Notification.Action.Builder builder, RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            public static Notification.Action c(Notification.Action.Builder builder) {
                return builder.build();
            }

            public static Notification.Action.Builder d(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i, charSequence, pendingIntent);
            }

            public static b e(ArrayList<Parcelable> arrayList, int i) {
                return C3771Nr1.b((Notification.Action) arrayList.get(i));
            }
        }

        /* renamed from: o.Nr1$A$b */
        /* loaded from: classes.dex */
        public static class b {
            private b() {
            }

            public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }
        }

        /* renamed from: o.Nr1$A$c */
        /* loaded from: classes.dex */
        public static class c {
            private c() {
            }

            public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
                return builder.setAllowGeneratedReplies(z);
            }
        }

        /* renamed from: o.Nr1$A$d */
        /* loaded from: classes.dex */
        public static class d {
            private d() {
            }

            public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
                return builder.setAuthenticationRequired(z);
            }
        }

        public A() {
            this.a = new ArrayList<>();
            this.b = 1;
            this.d = new ArrayList<>();
            this.g = 8388613;
            this.h = -1;
            this.i = 0;
            this.k = 80;
        }

        public static Notification.Action i(b bVar) {
            Icon K2;
            Bundle bundle;
            int i = Build.VERSION.SDK_INT;
            IconCompat f = bVar.f();
            if (f == null) {
                K2 = null;
            } else {
                K2 = f.K();
            }
            Notification.Action.Builder a2 = b.a(K2, bVar.j(), bVar.a());
            if (bVar.d() != null) {
                bundle = new Bundle(bVar.d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean(C4260Sr1.c, bVar.b());
            c.a(a2, bVar.b());
            if (i >= 31) {
                d.a(a2, bVar.k());
            }
            a.a(a2, bundle);
            C7282jR1[] g = bVar.g();
            if (g != null) {
                for (RemoteInput remoteInput : C7282jR1.d(g)) {
                    a.b(a2, remoteInput);
                }
            }
            return a.c(a2);
        }

        @Deprecated
        public boolean A() {
            if ((this.b & 4) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public List<Notification> B() {
            return this.d;
        }

        public boolean C() {
            if ((this.b & 8) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public A D(Bitmap bitmap) {
            this.e = bitmap;
            return this;
        }

        public A E(String str) {
            this.n = str;
            return this;
        }

        public A F(int i) {
            this.h = i;
            return this;
        }

        @Deprecated
        public A G(int i) {
            this.f = i;
            return this;
        }

        @Deprecated
        public A H(int i) {
            this.g = i;
            return this;
        }

        public A I(boolean z2) {
            N(1, z2);
            return this;
        }

        @Deprecated
        public A J(int i) {
            this.j = i;
            return this;
        }

        @Deprecated
        public A K(int i) {
            this.i = i;
            return this;
        }

        public A L(String str) {
            this.m = str;
            return this;
        }

        @Deprecated
        public A M(PendingIntent pendingIntent) {
            this.c = pendingIntent;
            return this;
        }

        public final void N(int i, boolean z2) {
            if (z2) {
                this.b = i | this.b;
                return;
            }
            this.b = (~i) & this.b;
        }

        @Deprecated
        public A O(int i) {
            this.k = i;
            return this;
        }

        @Deprecated
        public A P(boolean z2) {
            N(32, z2);
            return this;
        }

        @Deprecated
        public A Q(boolean z2) {
            N(16, z2);
            return this;
        }

        public A R(boolean z2) {
            N(64, z2);
            return this;
        }

        @Deprecated
        public A S(boolean z2) {
            N(2, z2);
            return this;
        }

        @Deprecated
        public A T(int i) {
            this.l = i;
            return this;
        }

        @Deprecated
        public A U(boolean z2) {
            N(4, z2);
            return this;
        }

        public A V(boolean z2) {
            N(8, z2);
            return this;
        }

        @Override // o.C3771Nr1.r
        public n a(n nVar) {
            Bundle bundle = new Bundle();
            if (!this.a.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.a.size());
                Iterator<b> it = this.a.iterator();
                while (it.hasNext()) {
                    arrayList.add(i(it.next()));
                }
                bundle.putParcelableArrayList(y, arrayList);
            }
            int i = this.b;
            if (i != 1) {
                bundle.putInt("flags", i);
            }
            PendingIntent pendingIntent = this.c;
            if (pendingIntent != null) {
                bundle.putParcelable(A, pendingIntent);
            }
            if (!this.d.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.d;
                bundle.putParcelableArray(B, (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.e;
            if (bitmap != null) {
                bundle.putParcelable(C, bitmap);
            }
            int i2 = this.f;
            if (i2 != 0) {
                bundle.putInt(D, i2);
            }
            int i3 = this.g;
            if (i3 != 8388613) {
                bundle.putInt(E, i3);
            }
            int i4 = this.h;
            if (i4 != -1) {
                bundle.putInt(F, i4);
            }
            int i5 = this.i;
            if (i5 != 0) {
                bundle.putInt(G, i5);
            }
            int i6 = this.j;
            if (i6 != 0) {
                bundle.putInt(H, i6);
            }
            int i7 = this.k;
            if (i7 != 80) {
                bundle.putInt(I, i7);
            }
            int i8 = this.l;
            if (i8 != 0) {
                bundle.putInt(J, i8);
            }
            String str = this.m;
            if (str != null) {
                bundle.putString(K, str);
            }
            String str2 = this.n;
            if (str2 != null) {
                bundle.putString(L, str2);
            }
            nVar.t().putBundle("android.wearable.EXTENSIONS", bundle);
            return nVar;
        }

        public A b(b bVar) {
            this.a.add(bVar);
            return this;
        }

        public A c(List<b> list) {
            this.a.addAll(list);
            return this;
        }

        @Deprecated
        public A d(Notification notification) {
            this.d.add(notification);
            return this;
        }

        @Deprecated
        public A e(List<Notification> list) {
            this.d.addAll(list);
            return this;
        }

        public A f() {
            this.a.clear();
            return this;
        }

        @Deprecated
        public A g() {
            this.d.clear();
            return this;
        }

        /* renamed from: h */
        public A clone() {
            A a2 = new A();
            a2.a = new ArrayList<>(this.a);
            a2.b = this.b;
            a2.c = this.c;
            a2.d = new ArrayList<>(this.d);
            a2.e = this.e;
            a2.f = this.f;
            a2.g = this.g;
            a2.h = this.h;
            a2.i = this.i;
            a2.j = this.j;
            a2.k = this.k;
            a2.l = this.l;
            a2.m = this.m;
            a2.n = this.n;
            return a2;
        }

        public List<b> j() {
            return this.a;
        }

        @Deprecated
        public Bitmap k() {
            return this.e;
        }

        public String l() {
            return this.n;
        }

        public int m() {
            return this.h;
        }

        @Deprecated
        public int n() {
            return this.f;
        }

        @Deprecated
        public int o() {
            return this.g;
        }

        public boolean p() {
            if ((this.b & 1) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public int q() {
            return this.j;
        }

        @Deprecated
        public int r() {
            return this.i;
        }

        public String s() {
            return this.m;
        }

        @Deprecated
        public PendingIntent t() {
            return this.c;
        }

        @Deprecated
        public int u() {
            return this.k;
        }

        @Deprecated
        public boolean v() {
            if ((this.b & 32) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public boolean w() {
            if ((this.b & 16) != 0) {
                return true;
            }
            return false;
        }

        public boolean x() {
            if ((this.b & 64) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public boolean y() {
            if ((this.b & 2) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public int z() {
            return this.l;
        }

        public A(Notification notification) {
            this.a = new ArrayList<>();
            this.b = 1;
            this.d = new ArrayList<>();
            this.g = 8388613;
            this.h = -1;
            this.i = 0;
            this.k = 80;
            Bundle n = C3771Nr1.n(notification);
            Bundle bundle = n != null ? n.getBundle("android.wearable.EXTENSIONS") : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(y);
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    b[] bVarArr = new b[size];
                    for (int i = 0; i < size; i++) {
                        bVarArr[i] = a.e(parcelableArrayList, i);
                    }
                    Collections.addAll(this.a, bVarArr);
                }
                this.b = bundle.getInt("flags", 1);
                this.c = (PendingIntent) bundle.getParcelable(A);
                Notification[] u2 = C3771Nr1.u(bundle, B);
                if (u2 != null) {
                    Collections.addAll(this.d, u2);
                }
                this.e = (Bitmap) bundle.getParcelable(C);
                this.f = bundle.getInt(D);
                this.g = bundle.getInt(E, 8388613);
                this.h = bundle.getInt(F, -1);
                this.i = bundle.getInt(G, 0);
                this.j = bundle.getInt(H);
                this.k = bundle.getInt(I, 80);
                this.l = bundle.getInt(J);
                this.m = bundle.getString(K);
                this.n = bundle.getString(L);
            }
        }
    }

    /* renamed from: o.Nr1$y */
    /* loaded from: classes.dex */
    public static abstract class y {
        public n a;
        public CharSequence b;
        public CharSequence c;
        public boolean d = false;

        /* renamed from: o.Nr1$y$a */
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            public static void a(RemoteViews remoteViews, int i, boolean z) {
                remoteViews.setChronometerCountDown(i, z);
            }
        }

        public static float h(float f, float f2, float f3) {
            if (f < f2) {
                return f2;
            }
            if (f > f3) {
                return f3;
            }
            return f;
        }

        public static y i(String str) {
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -716705180:
                        if (str.equals(q.e)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -171946061:
                        if (str.equals(k.j)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 714386739:
                        if (str.equals(o.f559o)) {
                            c = 2;
                            break;
                        }
                        break;
                    case 912942987:
                        if (str.equals(t.f)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 919595044:
                        if (str.equals(l.f)) {
                            c = 4;
                            break;
                        }
                        break;
                    case 2090799565:
                        if (str.equals(u.j)) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new q();
                    case 1:
                        return new k();
                    case 2:
                        return new o();
                    case 3:
                        return new t();
                    case 4:
                        return new l();
                    case 5:
                        return new u();
                    default:
                        return null;
                }
            }
            return null;
        }

        public static y j(String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new k();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new l();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new t();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new u();
            }
            if (!str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return null;
            }
            return new q();
        }

        public static y k(Bundle bundle) {
            y i = i(bundle.getString(C3771Nr1.Z));
            if (i != null) {
                return i;
            }
            if (!bundle.containsKey(C3771Nr1.f0) && !bundle.containsKey(C3771Nr1.g0)) {
                if (!bundle.containsKey(C3771Nr1.T) && !bundle.containsKey(C3771Nr1.U)) {
                    if (bundle.containsKey(C3771Nr1.I)) {
                        return new l();
                    }
                    if (bundle.containsKey(C3771Nr1.X)) {
                        return new t();
                    }
                    if (bundle.containsKey(C3771Nr1.l0)) {
                        return new o();
                    }
                    return j(bundle.getString(C3771Nr1.Y));
                }
                return new k();
            }
            return new u();
        }

        public static y l(Bundle bundle) {
            y k = k(bundle);
            if (k == null) {
                return null;
            }
            try {
                k.y(bundle);
                return k;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        public static y s(Notification notification) {
            Bundle n = C3771Nr1.n(notification);
            if (n == null) {
                return null;
            }
            return l(n);
        }

        public void a(Bundle bundle) {
            if (this.d) {
                bundle.putCharSequence(C3771Nr1.H, this.c);
            }
            CharSequence charSequence = this.b;
            if (charSequence != null) {
                bundle.putCharSequence(C3771Nr1.C, charSequence);
            }
            String t = t();
            if (t != null) {
                bundle.putString(C3771Nr1.Z, t);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x018a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RemoteViews c(boolean z, int i, boolean z2) {
            boolean z3;
            boolean z4;
            CharSequence charSequence;
            int i2;
            Resources resources = this.a.a.getResources();
            RemoteViews remoteViews = new RemoteViews(this.a.a.getPackageName(), i);
            this.a.y();
            n nVar = this.a;
            int i3 = 0;
            if (nVar.j != null) {
                int i4 = HL1.e.T;
                remoteViews.setViewVisibility(i4, 0);
                remoteViews.setImageViewBitmap(i4, o(this.a.j, 0));
                if (z && this.a.U.icon != 0) {
                    int dimensionPixelSize = resources.getDimensionPixelSize(HL1.c.p);
                    n nVar2 = this.a;
                    Bitmap q = q(nVar2.U.icon, dimensionPixelSize, dimensionPixelSize - (resources.getDimensionPixelSize(HL1.c.r) * 2), nVar2.r());
                    int i5 = HL1.e.d0;
                    remoteViews.setImageViewBitmap(i5, q);
                    remoteViews.setViewVisibility(i5, 0);
                }
            } else if (z && nVar.U.icon != 0) {
                int i6 = HL1.e.T;
                remoteViews.setViewVisibility(i6, 0);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(HL1.c.m) - resources.getDimensionPixelSize(HL1.c.j);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(HL1.c.s);
                n nVar3 = this.a;
                remoteViews.setImageViewBitmap(i6, q(nVar3.U.icon, dimensionPixelSize2, dimensionPixelSize3, nVar3.r()));
            }
            CharSequence charSequence2 = this.a.e;
            if (charSequence2 != null) {
                remoteViews.setTextViewText(HL1.e.x0, charSequence2);
            }
            CharSequence charSequence3 = this.a.f;
            boolean z5 = true;
            if (charSequence3 != null) {
                remoteViews.setTextViewText(HL1.e.u0, charSequence3);
                z3 = true;
            } else {
                z3 = false;
            }
            n nVar4 = this.a;
            CharSequence charSequence4 = nVar4.k;
            if (charSequence4 != null) {
                int i7 = HL1.e.V;
                remoteViews.setTextViewText(i7, charSequence4);
                remoteViews.setViewVisibility(i7, 0);
            } else if (nVar4.l > 0) {
                if (this.a.l > resources.getInteger(HL1.f.a)) {
                    remoteViews.setTextViewText(HL1.e.V, resources.getString(HL1.h.h));
                } else {
                    remoteViews.setTextViewText(HL1.e.V, NumberFormat.getIntegerInstance().format(this.a.l));
                }
                remoteViews.setViewVisibility(HL1.e.V, 0);
            } else {
                remoteViews.setViewVisibility(HL1.e.V, 8);
                z4 = false;
                charSequence = this.a.r;
                if (charSequence != null) {
                    int i8 = HL1.e.u0;
                    remoteViews.setTextViewText(i8, charSequence);
                    CharSequence charSequence5 = this.a.f;
                    if (charSequence5 != null) {
                        int i9 = HL1.e.v0;
                        remoteViews.setTextViewText(i9, charSequence5);
                        remoteViews.setViewVisibility(i9, 0);
                        if (z2) {
                            remoteViews.setTextViewTextSize(i8, 0, resources.getDimensionPixelSize(HL1.c.t));
                        }
                        remoteViews.setViewPadding(HL1.e.X, 0, 0, 0, 0);
                    } else {
                        remoteViews.setViewVisibility(HL1.e.v0, 8);
                    }
                }
                if (this.a.z() == 0) {
                    if (this.a.f558o) {
                        int i10 = HL1.e.O;
                        remoteViews.setViewVisibility(i10, 0);
                        remoteViews.setLong(i10, "setBase", this.a.z() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
                        remoteViews.setBoolean(i10, "setStarted", true);
                        boolean z6 = this.a.p;
                        if (z6) {
                            a.a(remoteViews, i10, z6);
                        }
                    } else {
                        int i11 = HL1.e.w0;
                        remoteViews.setViewVisibility(i11, 0);
                        remoteViews.setLong(i11, "setTime", this.a.z());
                    }
                } else {
                    z5 = z4;
                }
                int i12 = HL1.e.e0;
                if (!z5) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                remoteViews.setViewVisibility(i12, i2);
                int i13 = HL1.e.Y;
                if (!z3) {
                    i3 = 8;
                }
                remoteViews.setViewVisibility(i13, i3);
                return remoteViews;
            }
            z3 = true;
            z4 = true;
            charSequence = this.a.r;
            if (charSequence != null) {
            }
            if (this.a.z() == 0) {
            }
            int i122 = HL1.e.e0;
            if (!z5) {
            }
            remoteViews.setViewVisibility(i122, i2);
            int i132 = HL1.e.Y;
            if (!z3) {
            }
            remoteViews.setViewVisibility(i132, i3);
            return remoteViews;
        }

        public Notification d() {
            n nVar = this.a;
            if (nVar != null) {
                return nVar.h();
            }
            return null;
        }

        public void e(RemoteViews remoteViews, RemoteViews remoteViews2) {
            u(remoteViews);
            int i = HL1.e.b0;
            remoteViews.removeAllViews(i);
            remoteViews.addView(i, remoteViews2.clone());
            remoteViews.setViewVisibility(i, 0);
            remoteViews.setViewPadding(HL1.e.c0, 0, f(), 0, 0);
        }

        public final int f() {
            Resources resources = this.a.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(HL1.c.u);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(HL1.c.v);
            float h = (h(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - h) * dimensionPixelSize) + (h * dimensionPixelSize2));
        }

        public void g(Bundle bundle) {
            bundle.remove(C3771Nr1.H);
            bundle.remove(C3771Nr1.C);
            bundle.remove(C3771Nr1.Z);
        }

        public Bitmap m(int i, int i2) {
            return n(i, i2, 0);
        }

        public final Bitmap n(int i, int i2, int i3) {
            return p(IconCompat.v(this.a.a, i), i2, i3);
        }

        public Bitmap o(IconCompat iconCompat, int i) {
            return p(iconCompat, i, 0);
        }

        public final Bitmap p(IconCompat iconCompat, int i, int i2) {
            int i3;
            Drawable E = iconCompat.E(this.a.a);
            if (i2 == 0) {
                i3 = E.getIntrinsicWidth();
            } else {
                i3 = i2;
            }
            if (i2 == 0) {
                i2 = E.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
            E.setBounds(0, 0, i3, i2);
            if (i != 0) {
                E.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            E.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        public final Bitmap q(int i, int i2, int i3, int i4) {
            int i5 = HL1.d.n;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap n = n(i5, i4, i2);
            Canvas canvas = new Canvas(n);
            Drawable mutate = this.a.a.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return n;
        }

        public boolean r() {
            return false;
        }

        public String t() {
            return null;
        }

        public final void u(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(HL1.e.x0, 8);
            remoteViews.setViewVisibility(HL1.e.v0, 8);
            remoteViews.setViewVisibility(HL1.e.u0, 8);
        }

        public RemoteViews v(InterfaceC3282Ir1 interfaceC3282Ir1) {
            return null;
        }

        public RemoteViews w(InterfaceC3282Ir1 interfaceC3282Ir1) {
            return null;
        }

        public RemoteViews x(InterfaceC3282Ir1 interfaceC3282Ir1) {
            return null;
        }

        public void y(Bundle bundle) {
            if (bundle.containsKey(C3771Nr1.H)) {
                this.c = bundle.getCharSequence(C3771Nr1.H);
                this.d = true;
            }
            this.b = bundle.getCharSequence(C3771Nr1.C);
        }

        public void z(n nVar) {
            if (this.a != nVar) {
                this.a = nVar;
                if (nVar != null) {
                    nVar.z0(this);
                }
            }
        }

        public void b(InterfaceC3282Ir1 interfaceC3282Ir1) {
        }
    }

    /* renamed from: o.Nr1$n */
    /* loaded from: classes.dex */
    public static class n {
        public static final int Y = 5120;
        public boolean A;
        public boolean B;
        public boolean C;
        public String D;
        public Bundle E;
        public int F;
        public int G;
        public Notification H;
        public RemoteViews I;
        public RemoteViews J;
        public RemoteViews K;
        public String L;
        public int M;
        public String N;
        public H31 O;
        public long P;
        public int Q;
        public int R;
        public boolean S;
        public m T;
        public Notification U;
        public boolean V;
        public Object W;
        @Deprecated
        public ArrayList<String> X;
        public Context a;
        public ArrayList<b> b;
        public ArrayList<NC1> c;
        public ArrayList<b> d;
        public CharSequence e;
        public CharSequence f;
        public PendingIntent g;
        public PendingIntent h;
        public RemoteViews i;
        public IconCompat j;
        public CharSequence k;
        public int l;
        public int m;
        public boolean n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f558o;
        public boolean p;
        public y q;
        public CharSequence r;
        public CharSequence s;
        public CharSequence[] t;
        public int u;
        public int v;
        public boolean w;
        public String x;
        public boolean y;
        public String z;

        /* renamed from: o.Nr1$n$a */
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            public static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            public static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i) {
                return builder.setContentType(i);
            }

            public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i) {
                return builder.setLegacyStreamType(i);
            }

            public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i) {
                return builder.setUsage(i);
            }
        }

        /* renamed from: o.Nr1$n$b */
        /* loaded from: classes.dex */
        public static class b {
            private b() {
            }

            public static Icon a(Notification notification) {
                return notification.getLargeIcon();
            }

            public static Icon b(Notification notification) {
                return notification.getSmallIcon();
            }
        }

        /* renamed from: o.Nr1$n$c */
        /* loaded from: classes.dex */
        public static class c {
            private c() {
            }

            public static RemoteViews a(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            public static RemoteViews b(Notification.Builder builder) {
                return builder.createContentView();
            }

            public static RemoteViews c(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            public static Notification.Builder d(Context context, Notification notification) {
                return Notification.Builder.recoverBuilder(context, notification);
            }
        }

        public n(Context context, Notification notification) {
            this(context, C3771Nr1.i(notification));
            ArrayList parcelableArrayList;
            Bundle bundle = notification.extras;
            y s = y.s(notification);
            O(C3771Nr1.m(notification)).N(C3771Nr1.l(notification)).L(C3771Nr1.k(notification)).A0(C3771Nr1.D(notification)).o0(C3771Nr1.z(notification)).z0(s).Y(C3771Nr1.o(notification)).a0(C3771Nr1.H(notification)).f0(C3771Nr1.t(notification)).H0(notification.when).r0(C3771Nr1.B(notification)).E0(C3771Nr1.F(notification)).C(C3771Nr1.e(notification)).j0(C3771Nr1.w(notification)).i0(C3771Nr1.v(notification)).e0(C3771Nr1.s(notification)).b0(notification.largeIcon).D(C3771Nr1.f(notification)).F(C3771Nr1.h(notification)).E(C3771Nr1.g(notification)).h0(notification.number).B0(notification.tickerText).M(notification.contentIntent).T(notification.deleteIntent).X(notification.fullScreenIntent, C3771Nr1.q(notification)).y0(notification.sound, notification.audioStreamType).F0(notification.vibrate).d0(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).S(notification.defaults).k0(notification.priority).I(C3771Nr1.j(notification)).G0(C3771Nr1.G(notification)).m0(C3771Nr1.y(notification)).w0(C3771Nr1.C(notification)).D0(C3771Nr1.E(notification)).p0(C3771Nr1.A(notification)).l0(bundle.getInt(C3771Nr1.N), bundle.getInt(C3771Nr1.M), bundle.getBoolean(C3771Nr1.O)).B(C3771Nr1.d(notification)).u0(notification.icon, notification.iconLevel).c(u(notification, s));
            this.W = b.b(notification);
            Icon a2 = b.a(notification);
            if (a2 != null) {
                this.j = IconCompat.l(a2);
            }
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null && actionArr.length != 0) {
                for (Notification.Action action : actionArr) {
                    b(b.a.f(action).c());
                }
            }
            List<b> r = C3771Nr1.r(notification);
            if (!r.isEmpty()) {
                for (b bVar : r) {
                    e(bVar);
                }
            }
            String[] stringArray = notification.extras.getStringArray(C3771Nr1.a0);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    f(str);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(C3771Nr1.b0)) != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    g(NC1.a(C3673Mr1.a(it.next())));
                }
            }
            int i = Build.VERSION.SDK_INT;
            if (bundle.containsKey(C3771Nr1.Q)) {
                H(bundle.getBoolean(C3771Nr1.Q));
            }
            if (i < 26 || !bundle.containsKey(C3771Nr1.R)) {
                return;
            }
            J(bundle.getBoolean(C3771Nr1.R));
        }

        public static CharSequence A(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                return charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        public static Bundle u(Notification notification, y yVar) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove(C3771Nr1.B);
            bundle.remove(C3771Nr1.D);
            bundle.remove(C3771Nr1.G);
            bundle.remove(C3771Nr1.E);
            bundle.remove(C3771Nr1.c);
            bundle.remove(C3771Nr1.d);
            bundle.remove(C3771Nr1.S);
            bundle.remove(C3771Nr1.M);
            bundle.remove(C3771Nr1.N);
            bundle.remove(C3771Nr1.O);
            bundle.remove(C3771Nr1.Q);
            bundle.remove(C3771Nr1.R);
            bundle.remove(C3771Nr1.b0);
            bundle.remove(C3771Nr1.a0);
            bundle.remove(C4160Rr1.d);
            bundle.remove(C4160Rr1.b);
            bundle.remove(C4160Rr1.c);
            bundle.remove(C4160Rr1.a);
            bundle.remove(C4160Rr1.e);
            Bundle bundle2 = bundle.getBundle(p.d);
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove(p.h);
                bundle.putBundle(p.d, bundle3);
            }
            if (yVar != null) {
                yVar.g(bundle);
            }
            return bundle;
        }

        public n A0(CharSequence charSequence) {
            this.r = A(charSequence);
            return this;
        }

        public n B(boolean z) {
            this.S = z;
            return this;
        }

        public n B0(CharSequence charSequence) {
            this.U.tickerText = A(charSequence);
            return this;
        }

        public n C(boolean z) {
            V(16, z);
            return this;
        }

        @Deprecated
        public n C0(CharSequence charSequence, RemoteViews remoteViews) {
            this.U.tickerText = A(charSequence);
            this.i = remoteViews;
            return this;
        }

        public n D(int i) {
            this.M = i;
            return this;
        }

        public n D0(long j) {
            this.P = j;
            return this;
        }

        public n E(m mVar) {
            this.T = mVar;
            return this;
        }

        public n E0(boolean z) {
            this.f558o = z;
            return this;
        }

        public n F(String str) {
            this.D = str;
            return this;
        }

        public n F0(long[] jArr) {
            this.U.vibrate = jArr;
            return this;
        }

        public n G(String str) {
            this.L = str;
            return this;
        }

        public n G0(int i) {
            this.G = i;
            return this;
        }

        public n H(boolean z) {
            this.p = z;
            t().putBoolean(C3771Nr1.Q, z);
            return this;
        }

        public n H0(long j) {
            this.U.when = j;
            return this;
        }

        public n I(int i) {
            this.F = i;
            return this;
        }

        public final boolean I0() {
            y yVar = this.q;
            if (yVar != null && yVar.r()) {
                return false;
            }
            return true;
        }

        public n J(boolean z) {
            this.B = z;
            this.C = true;
            return this;
        }

        public n K(RemoteViews remoteViews) {
            this.U.contentView = remoteViews;
            return this;
        }

        public n L(CharSequence charSequence) {
            this.k = A(charSequence);
            return this;
        }

        public n M(PendingIntent pendingIntent) {
            this.g = pendingIntent;
            return this;
        }

        public n N(CharSequence charSequence) {
            this.f = A(charSequence);
            return this;
        }

        public n O(CharSequence charSequence) {
            this.e = A(charSequence);
            return this;
        }

        public n P(RemoteViews remoteViews) {
            this.J = remoteViews;
            return this;
        }

        public n Q(RemoteViews remoteViews) {
            this.I = remoteViews;
            return this;
        }

        public n R(RemoteViews remoteViews) {
            this.K = remoteViews;
            return this;
        }

        public n S(int i) {
            Notification notification = this.U;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public n T(PendingIntent pendingIntent) {
            this.U.deleteIntent = pendingIntent;
            return this;
        }

        public n U(Bundle bundle) {
            this.E = bundle;
            return this;
        }

        public final void V(int i, boolean z) {
            if (z) {
                Notification notification = this.U;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.U;
            notification2.flags = (~i) & notification2.flags;
        }

        public n W(int i) {
            this.R = i;
            return this;
        }

        public n X(PendingIntent pendingIntent, boolean z) {
            this.h = pendingIntent;
            V(128, z);
            return this;
        }

        public n Y(String str) {
            this.x = str;
            return this;
        }

        public n Z(int i) {
            this.Q = i;
            return this;
        }

        public n a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new b(i, charSequence, pendingIntent));
            return this;
        }

        public n a0(boolean z) {
            this.y = z;
            return this;
        }

        public n b(b bVar) {
            if (bVar != null) {
                this.b.add(bVar);
            }
            return this;
        }

        public n b0(Bitmap bitmap) {
            IconCompat r;
            if (bitmap == null) {
                r = null;
            } else {
                r = IconCompat.r(C3771Nr1.I(this.a, bitmap));
            }
            this.j = r;
            return this;
        }

        public n c(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.E;
                if (bundle2 == null) {
                    this.E = new Bundle(bundle);
                    return this;
                }
                bundle2.putAll(bundle);
            }
            return this;
        }

        public n c0(Icon icon) {
            IconCompat l;
            if (icon == null) {
                l = null;
            } else {
                l = IconCompat.l(icon);
            }
            this.j = l;
            return this;
        }

        public n d(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.d.add(new b(i, charSequence, pendingIntent));
            return this;
        }

        public n d0(int i, int i2, int i3) {
            int i4;
            Notification notification = this.U;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            if (i2 != 0 && i3 != 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            notification.flags = i4 | (notification.flags & (-2));
            return this;
        }

        public n e(b bVar) {
            if (bVar != null) {
                this.d.add(bVar);
            }
            return this;
        }

        public n e0(boolean z) {
            this.A = z;
            return this;
        }

        @Deprecated
        public n f(String str) {
            if (str != null && !str.isEmpty()) {
                this.X.add(str);
            }
            return this;
        }

        public n f0(H31 h31) {
            this.O = h31;
            return this;
        }

        public n g(NC1 nc1) {
            if (nc1 != null) {
                this.c.add(nc1);
            }
            return this;
        }

        @Deprecated
        public n g0() {
            this.V = true;
            return this;
        }

        public Notification h() {
            return new C4063Qr1(this).c();
        }

        public n h0(int i) {
            this.l = i;
            return this;
        }

        public n i() {
            this.b.clear();
            return this;
        }

        public n i0(boolean z) {
            V(2, z);
            return this;
        }

        public n j() {
            this.d.clear();
            Bundle bundle = this.E.getBundle(p.d);
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove(p.h);
                this.E.putBundle(p.d, bundle2);
            }
            return this;
        }

        public n j0(boolean z) {
            V(8, z);
            return this;
        }

        public n k() {
            this.c.clear();
            this.X.clear();
            return this;
        }

        public n k0(int i) {
            this.m = i;
            return this;
        }

        public RemoteViews l() {
            RemoteViews v;
            if (this.J != null && I0()) {
                return this.J;
            }
            C4063Qr1 c4063Qr1 = new C4063Qr1(this);
            y yVar = this.q;
            if (yVar != null && (v = yVar.v(c4063Qr1)) != null) {
                return v;
            }
            return c.a(c.d(this.a, c4063Qr1.c()));
        }

        public n l0(int i, int i2, boolean z) {
            this.u = i;
            this.v = i2;
            this.w = z;
            return this;
        }

        public RemoteViews m() {
            RemoteViews w;
            if (this.I != null && I0()) {
                return this.I;
            }
            C4063Qr1 c4063Qr1 = new C4063Qr1(this);
            y yVar = this.q;
            if (yVar != null && (w = yVar.w(c4063Qr1)) != null) {
                return w;
            }
            return c.b(c.d(this.a, c4063Qr1.c()));
        }

        public n m0(Notification notification) {
            this.H = notification;
            return this;
        }

        public RemoteViews n() {
            RemoteViews x;
            if (this.K != null && I0()) {
                return this.K;
            }
            C4063Qr1 c4063Qr1 = new C4063Qr1(this);
            y yVar = this.q;
            if (yVar != null && (x = yVar.x(c4063Qr1)) != null) {
                return x;
            }
            return c.c(c.d(this.a, c4063Qr1.c()));
        }

        public n n0(CharSequence[] charSequenceArr) {
            this.t = charSequenceArr;
            return this;
        }

        public n o(r rVar) {
            rVar.a(this);
            return this;
        }

        public n o0(CharSequence charSequence) {
            this.s = A(charSequence);
            return this;
        }

        public RemoteViews p() {
            return this.J;
        }

        public n p0(String str) {
            this.N = str;
            return this;
        }

        public m q() {
            return this.T;
        }

        public n q0(U42 u42) {
            if (u42 != null) {
                this.N = u42.k();
                if (this.O == null) {
                    if (u42.o() != null) {
                        this.O = u42.o();
                    } else if (u42.k() != null) {
                        this.O = new H31(u42.k());
                    }
                }
                if (this.e == null) {
                    O(u42.w());
                }
            }
            return this;
        }

        public int r() {
            return this.F;
        }

        public n r0(boolean z) {
            this.n = z;
            return this;
        }

        public RemoteViews s() {
            return this.I;
        }

        public n s0(boolean z) {
            this.V = z;
            return this;
        }

        public Bundle t() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        public n t0(int i) {
            this.U.icon = i;
            return this;
        }

        public n u0(int i, int i2) {
            Notification notification = this.U;
            notification.icon = i;
            notification.iconLevel = i2;
            return this;
        }

        public int v() {
            return this.R;
        }

        public n v0(IconCompat iconCompat) {
            this.W = iconCompat.L(this.a);
            return this;
        }

        public RemoteViews w() {
            return this.K;
        }

        public n w0(String str) {
            this.z = str;
            return this;
        }

        @Deprecated
        public Notification x() {
            return h();
        }

        public n x0(Uri uri) {
            Notification notification = this.U;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder e = a.e(a.c(a.b(), 4), 5);
            this.U.audioAttributes = a.a(e);
            return this;
        }

        public int y() {
            return this.m;
        }

        public n y0(Uri uri, int i) {
            Notification notification = this.U;
            notification.sound = uri;
            notification.audioStreamType = i;
            AudioAttributes.Builder d = a.d(a.c(a.b(), 4), i);
            this.U.audioAttributes = a.a(d);
            return this;
        }

        public long z() {
            if (this.n) {
                return this.U.when;
            }
            return 0L;
        }

        public n z0(y yVar) {
            if (this.q != yVar) {
                this.q = yVar;
                if (yVar != null) {
                    yVar.z(this);
                }
            }
            return this;
        }

        public n(Context context, String str) {
            this.b = new ArrayList<>();
            this.c = new ArrayList<>();
            this.d = new ArrayList<>();
            this.n = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.Q = 0;
            this.R = 0;
            Notification notification = new Notification();
            this.U = notification;
            this.a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.U.audioStreamType = -1;
            this.m = 0;
            this.X = new ArrayList<>();
            this.S = true;
        }

        @Deprecated
        public n(Context context) {
            this(context, (String) null);
        }
    }
}
