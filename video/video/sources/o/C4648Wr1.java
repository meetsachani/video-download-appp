package o;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.google.firebase.messaging.MessagingAnalytics;

/* renamed from: o.Wr1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4648Wr1 extends HT<Bitmap> {
    public final RemoteViews Y0;
    public final Context Z0;
    public final int a1;
    public final String b1;
    public final Notification c1;
    public final int d1;

    public C4648Wr1(Context context, int i, RemoteViews remoteViews, Notification notification, int i2) {
        this(context, i, remoteViews, notification, i2, null);
    }

    private void b(Bitmap bitmap) {
        this.Y0.setImageViewBitmap(this.d1, bitmap);
        c();
    }

    private void c() {
        ((NotificationManager) C10175vF1.e((NotificationManager) this.Z0.getSystemService(MessagingAnalytics.b))).notify(this.b1, this.a1, this.c1);
    }

    @Override // o.InterfaceC2856El2
    /* renamed from: a */
    public void o(Bitmap bitmap, InterfaceC8136mt2<? super Bitmap> interfaceC8136mt2) {
        b(bitmap);
    }

    @Override // o.InterfaceC2856El2
    public void k(Drawable drawable) {
        b(null);
    }

    public C4648Wr1(Context context, int i, RemoteViews remoteViews, Notification notification, int i2, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, notification, i2, str);
    }

    public C4648Wr1(Context context, int i, int i2, int i3, RemoteViews remoteViews, Notification notification, int i4, String str) {
        super(i, i2);
        this.Z0 = (Context) C10175vF1.f(context, "Context must not be null!");
        this.c1 = (Notification) C10175vF1.f(notification, "Notification object can not be null!");
        this.Y0 = (RemoteViews) C10175vF1.f(remoteViews, "RemoteViews object can not be null!");
        this.d1 = i3;
        this.a1 = i4;
        this.b1 = str;
    }
}
