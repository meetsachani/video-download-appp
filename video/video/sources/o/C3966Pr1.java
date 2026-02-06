package o;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import o.C3771Nr1;
import o.C7505kM1;

/* renamed from: o.Pr1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3966Pr1 {

    /* renamed from: o.Pr1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(RemoteViews remoteViews, int i, CharSequence charSequence) {
            remoteViews.setContentDescription(i, charSequence);
        }
    }

    /* renamed from: o.Pr1$b */
    /* loaded from: classes.dex */
    public static class b {
        public static Notification.MediaStyle a() {
            return new Notification.MediaStyle();
        }

        public static Notification.MediaStyle b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat.Token token) {
            if (iArr != null) {
                e(mediaStyle, iArr);
            }
            if (token != null) {
                c(mediaStyle, (MediaSession.Token) token.f());
            }
            return mediaStyle;
        }

        public static void c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
            mediaStyle.setMediaSession(token);
        }

        public static void d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
            builder.setStyle(mediaStyle);
        }

        public static void e(Notification.MediaStyle mediaStyle, int... iArr) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
    }

    /* renamed from: o.Pr1$c */
    /* loaded from: classes.dex */
    public static class c {
        public static Notification.DecoratedMediaCustomViewStyle a() {
            return new Notification.DecoratedMediaCustomViewStyle();
        }
    }

    /* renamed from: o.Pr1$d */
    /* loaded from: classes.dex */
    public static class d extends e {
        @Override // o.C3966Pr1.e
        public int D(int i) {
            if (i <= 3) {
                return C7505kM1.d.f;
            }
            return C7505kM1.d.d;
        }

        @Override // o.C3966Pr1.e
        public int E() {
            if (this.a.s() != null) {
                return C7505kM1.d.i;
            }
            return super.E();
        }

        public final void K(RemoteViews remoteViews) {
            int color;
            if (this.a.r() != 0) {
                color = this.a.r();
            } else {
                color = this.a.a.getResources().getColor(C7505kM1.a.a);
            }
            remoteViews.setInt(C7505kM1.b.f780o, "setBackgroundColor", color);
        }

        @Override // o.C3966Pr1.e, o.C3771Nr1.y
        public void b(InterfaceC3282Ir1 interfaceC3282Ir1) {
            b.d(interfaceC3282Ir1.a(), b.b(c.a(), this.e, this.f));
        }

        @Override // o.C3966Pr1.e, o.C3771Nr1.y
        public RemoteViews v(InterfaceC3282Ir1 interfaceC3282Ir1) {
            return null;
        }

        @Override // o.C3966Pr1.e, o.C3771Nr1.y
        public RemoteViews w(InterfaceC3282Ir1 interfaceC3282Ir1) {
            return null;
        }

        @Override // o.C3771Nr1.y
        public RemoteViews x(InterfaceC3282Ir1 interfaceC3282Ir1) {
            return null;
        }
    }

    /* renamed from: o.Pr1$e */
    /* loaded from: classes.dex */
    public static class e extends C3771Nr1.y {
        public static final int i = 3;
        public static final int j = 5;
        public int[] e = null;
        public MediaSessionCompat.Token f;
        public boolean g;
        public PendingIntent h;

        public e() {
        }

        public static MediaSessionCompat.Token F(Notification notification) {
            Parcelable parcelable;
            Bundle n = C3771Nr1.n(notification);
            if (n != null && (parcelable = n.getParcelable(C3771Nr1.d0)) != null) {
                return MediaSessionCompat.Token.b(parcelable);
            }
            return null;
        }

        public RemoteViews A() {
            int min = Math.min(this.a.b.size(), 5);
            RemoteViews c = c(false, D(min), false);
            c.removeAllViews(C7505kM1.b.j);
            if (min > 0) {
                for (int i2 = 0; i2 < min; i2++) {
                    c.addView(C7505kM1.b.j, C(this.a.b.get(i2)));
                }
            }
            if (this.g) {
                int i3 = C7505kM1.b.c;
                c.setViewVisibility(i3, 0);
                c.setInt(i3, "setAlpha", this.a.a.getResources().getInteger(C7505kM1.c.a));
                c.setOnClickPendingIntent(i3, this.h);
                return c;
            }
            c.setViewVisibility(C7505kM1.b.c, 8);
            return c;
        }

        public RemoteViews B() {
            int min;
            RemoteViews c = c(false, E(), true);
            int size = this.a.b.size();
            int[] iArr = this.e;
            if (iArr == null) {
                min = 0;
            } else {
                min = Math.min(iArr.length, 3);
            }
            c.removeAllViews(C7505kM1.b.j);
            if (min > 0) {
                for (int i2 = 0; i2 < min; i2++) {
                    if (i2 < size) {
                        c.addView(C7505kM1.b.j, C(this.a.b.get(this.e[i2])));
                    } else {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i2), Integer.valueOf(size - 1)));
                    }
                }
            }
            if (this.g) {
                c.setViewVisibility(C7505kM1.b.e, 8);
                int i3 = C7505kM1.b.c;
                c.setViewVisibility(i3, 0);
                c.setOnClickPendingIntent(i3, this.h);
                c.setInt(i3, "setAlpha", this.a.a.getResources().getInteger(C7505kM1.c.a));
                return c;
            }
            c.setViewVisibility(C7505kM1.b.e, 0);
            c.setViewVisibility(C7505kM1.b.c, 8);
            return c;
        }

        public final RemoteViews C(C3771Nr1.b bVar) {
            boolean z;
            if (bVar.a() == null) {
                z = true;
            } else {
                z = false;
            }
            RemoteViews remoteViews = new RemoteViews(this.a.a.getPackageName(), C7505kM1.d.a);
            int i2 = C7505kM1.b.a;
            remoteViews.setImageViewResource(i2, bVar.e());
            if (!z) {
                remoteViews.setOnClickPendingIntent(i2, bVar.a());
            }
            a.a(remoteViews, i2, bVar.j());
            return remoteViews;
        }

        public int D(int i2) {
            if (i2 <= 3) {
                return C7505kM1.d.e;
            }
            return C7505kM1.d.c;
        }

        public int E() {
            return C7505kM1.d.h;
        }

        public e G(PendingIntent pendingIntent) {
            this.h = pendingIntent;
            return this;
        }

        public e H(MediaSessionCompat.Token token) {
            this.f = token;
            return this;
        }

        public e I(int... iArr) {
            this.e = iArr;
            return this;
        }

        @Override // o.C3771Nr1.y
        public void b(InterfaceC3282Ir1 interfaceC3282Ir1) {
            b.d(interfaceC3282Ir1.a(), b.b(b.a(), this.e, this.f));
        }

        @Override // o.C3771Nr1.y
        public RemoteViews v(InterfaceC3282Ir1 interfaceC3282Ir1) {
            return null;
        }

        @Override // o.C3771Nr1.y
        public RemoteViews w(InterfaceC3282Ir1 interfaceC3282Ir1) {
            return null;
        }

        public e(C3771Nr1.n nVar) {
            z(nVar);
        }

        public e J(boolean z) {
            return this;
        }
    }
}
