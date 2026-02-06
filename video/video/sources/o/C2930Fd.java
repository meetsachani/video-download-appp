package o;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;

/* renamed from: o.Fd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2930Fd extends HT<Bitmap> {
    public final int[] Y0;
    public final ComponentName Z0;
    public final RemoteViews a1;
    public final Context b1;
    public final int c1;

    public C2930Fd(Context context, int i, int i2, int i3, RemoteViews remoteViews, int... iArr) {
        super(i, i2);
        if (iArr.length != 0) {
            this.b1 = (Context) C10175vF1.f(context, "Context can not be null!");
            this.a1 = (RemoteViews) C10175vF1.f(remoteViews, "RemoteViews object can not be null!");
            this.Y0 = (int[]) C10175vF1.f(iArr, "WidgetIds can not be null!");
            this.c1 = i3;
            this.Z0 = null;
            return;
        }
        throw new IllegalArgumentException("WidgetIds must have length > 0");
    }

    @Override // o.InterfaceC2856El2
    /* renamed from: a */
    public void o(Bitmap bitmap, InterfaceC8136mt2<? super Bitmap> interfaceC8136mt2) {
        b(bitmap);
    }

    public final void b(Bitmap bitmap) {
        this.a1.setImageViewBitmap(this.c1, bitmap);
        c();
    }

    public final void c() {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.b1);
        ComponentName componentName = this.Z0;
        if (componentName != null) {
            appWidgetManager.updateAppWidget(componentName, this.a1);
        } else {
            appWidgetManager.updateAppWidget(this.Y0, this.a1);
        }
    }

    @Override // o.InterfaceC2856El2
    public void k(Drawable drawable) {
        b(null);
    }

    public C2930Fd(Context context, int i, RemoteViews remoteViews, int... iArr) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, iArr);
    }

    public C2930Fd(Context context, int i, int i2, int i3, RemoteViews remoteViews, ComponentName componentName) {
        super(i, i2);
        this.b1 = (Context) C10175vF1.f(context, "Context can not be null!");
        this.a1 = (RemoteViews) C10175vF1.f(remoteViews, "RemoteViews object can not be null!");
        this.Z0 = (ComponentName) C10175vF1.f(componentName, "ComponentName can not be null!");
        this.c1 = i3;
        this.Y0 = null;
    }

    public C2930Fd(Context context, int i, RemoteViews remoteViews, ComponentName componentName) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, componentName);
    }
}
