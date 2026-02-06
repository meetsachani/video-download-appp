package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zaq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class ImageManager {
    public static final Object h = new Object();
    public static HashSet<Uri> i = new HashSet<>();
    public static ImageManager j;
    public final Context a;
    public final Handler b = new zaq(Looper.getMainLooper());
    public final ExecutorService c = zap.a().b(4, 2);
    public final zak d = new zak();
    public final Map<zag, ImageReceiver> e = new HashMap();
    public final Map<Uri, ImageReceiver> f = new HashMap();
    public final Map<Uri, Long> g = new HashMap();

    @KeepName
    /* loaded from: classes2.dex */
    public final class ImageReceiver extends ResultReceiver {
        public final Uri X;
        public final ArrayList<zag> Y;

        public ImageReceiver(Uri uri) {
            super(new zaq(Looper.getMainLooper()));
            this.X = uri;
            this.Y = new ArrayList<>();
        }

        public final void b(zag zagVar) {
            Asserts.a("ImageReceiver.addImageRequest() must be called in the main thread");
            this.Y.add(zagVar);
        }

        public final void c(zag zagVar) {
            Asserts.a("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.Y.remove(zagVar);
        }

        public final void d() {
            Intent intent = new Intent(Constants.c);
            intent.setPackage("com.google.android.gms");
            intent.putExtra(Constants.d, this.X);
            intent.putExtra(Constants.e, this);
            intent.putExtra(Constants.f, 3);
            ImageManager.this.a.sendBroadcast(intent);
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, Bundle bundle) {
            ImageManager imageManager = ImageManager.this;
            imageManager.c.execute(new zaa(imageManager, this.X, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    /* loaded from: classes2.dex */
    public interface OnImageLoadedListener {
        void a(@InterfaceC5670cr1 Uri uri, @InterfaceC11300zs1 Drawable drawable, boolean z);
    }

    public ImageManager(Context context, boolean z) {
        this.a = context.getApplicationContext();
    }

    @InterfaceC5670cr1
    public static ImageManager a(@InterfaceC5670cr1 Context context) {
        if (j == null) {
            j = new ImageManager(context, false);
        }
        return j;
    }

    public void b(@InterfaceC5670cr1 ImageView imageView, int i2) {
        p(new zae(imageView, i2));
    }

    public void c(@InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 Uri uri) {
        p(new zae(imageView, uri));
    }

    public void d(@InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 Uri uri, int i2) {
        zae zaeVar = new zae(imageView, uri);
        zaeVar.b = i2;
        p(zaeVar);
    }

    public void e(@InterfaceC5670cr1 OnImageLoadedListener onImageLoadedListener, @InterfaceC5670cr1 Uri uri) {
        p(new zaf(onImageLoadedListener, uri));
    }

    public void f(@InterfaceC5670cr1 OnImageLoadedListener onImageLoadedListener, @InterfaceC5670cr1 Uri uri, int i2) {
        zaf zafVar = new zaf(onImageLoadedListener, uri);
        zafVar.b = i2;
        p(zafVar);
    }

    public final void p(zag zagVar) {
        Asserts.a("ImageManager.loadImage() must be called in the main thread");
        new zab(this, zagVar).run();
    }
}
