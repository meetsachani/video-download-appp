package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zaa implements Runnable {
    public final Uri X;
    @InterfaceC11300zs1
    public final ParcelFileDescriptor Y;
    public final /* synthetic */ ImageManager Z;

    public zaa(ImageManager imageManager, @InterfaceC11300zs1 Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.Z = imageManager;
        this.X = uri;
        this.Y = parcelFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Asserts.b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        ParcelFileDescriptor parcelFileDescriptor = this.Y;
        Bitmap bitmap = null;
        boolean z = false;
        if (parcelFileDescriptor != null) {
            try {
                bitmap = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError e) {
                Log.e("ImageManager", "OOM while loading bitmap for uri: ".concat(String.valueOf(this.X)), e);
                z = true;
            }
            try {
                this.Y.close();
            } catch (IOException e2) {
                Log.e("ImageManager", "closed failed", e2);
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager imageManager = this.Z;
        handler = imageManager.b;
        handler.post(new zac(imageManager, this.X, bitmap, z, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Log.w("ImageManager", "Latch interrupted while posting ".concat(String.valueOf(this.X)));
        }
    }
}
