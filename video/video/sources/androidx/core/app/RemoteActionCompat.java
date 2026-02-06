package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import o.C10907yF1;
import o.InterfaceC5283bF2;

/* loaded from: classes.dex */
public final class RemoteActionCompat implements InterfaceC5283bF2 {
    public IconCompat a;
    public CharSequence b;
    public CharSequence c;
    public PendingIntent d;
    public boolean e;
    public boolean f;

    /* loaded from: classes.dex */
    public static class a {
        public static RemoteAction a(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        public static PendingIntent b(RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        public static CharSequence c(RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }

        public static Icon d(RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }

        public static CharSequence e(RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        public static boolean f(RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        public static void g(RemoteAction remoteAction, boolean z) {
            remoteAction.setEnabled(z);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(RemoteAction remoteAction, boolean z) {
            remoteAction.setShouldShowIcon(z);
        }

        public static boolean b(RemoteAction remoteAction) {
            return remoteAction.shouldShowIcon();
        }
    }

    public RemoteActionCompat(IconCompat iconCompat, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        this.a = (IconCompat) C10907yF1.l(iconCompat);
        this.b = (CharSequence) C10907yF1.l(charSequence);
        this.c = (CharSequence) C10907yF1.l(charSequence2);
        this.d = (PendingIntent) C10907yF1.l(pendingIntent);
        this.e = true;
        this.f = true;
    }

    public static RemoteActionCompat a(RemoteAction remoteAction) {
        C10907yF1.l(remoteAction);
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.l(a.d(remoteAction)), a.e(remoteAction), a.c(remoteAction), a.b(remoteAction));
        remoteActionCompat.l(a.f(remoteAction));
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.m(b.b(remoteAction));
        }
        return remoteActionCompat;
    }

    public PendingIntent g() {
        return this.d;
    }

    public CharSequence h() {
        return this.c;
    }

    public IconCompat i() {
        return this.a;
    }

    public CharSequence j() {
        return this.b;
    }

    public boolean k() {
        return this.e;
    }

    public void l(boolean z) {
        this.e = z;
    }

    public void m(boolean z) {
        this.f = z;
    }

    public boolean n() {
        return this.f;
    }

    public RemoteAction o() {
        RemoteAction a2 = a.a(this.a.K(), this.b, this.c, this.d);
        a.g(a2, k());
        if (Build.VERSION.SDK_INT >= 28) {
            b.a(a2, n());
        }
        return a2;
    }

    public RemoteActionCompat() {
    }

    public RemoteActionCompat(RemoteActionCompat remoteActionCompat) {
        C10907yF1.l(remoteActionCompat);
        this.a = remoteActionCompat.a;
        this.b = remoteActionCompat.b;
        this.c = remoteActionCompat.c;
        this.d = remoteActionCompat.d;
        this.e = remoteActionCompat.e;
        this.f = remoteActionCompat.f;
    }
}
