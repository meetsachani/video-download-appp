package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zac implements Runnable {
    public final Uri X;
    @InterfaceC11300zs1
    public final Bitmap Y;
    public final /* synthetic */ ImageManager Y0;
    public final CountDownLatch Z;

    public zac(ImageManager imageManager, @InterfaceC11300zs1 Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        this.Y0 = imageManager;
        this.X = uri;
        this.Y = bitmap;
        this.Z = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        Object obj;
        HashSet hashSet;
        ArrayList arrayList;
        Map map2;
        zak zakVar;
        Map map3;
        Asserts.a("OnBitmapLoadedRunnable must be executed in the main thread");
        Bitmap bitmap = this.Y;
        map = this.Y0.f;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) map.remove(this.X);
        if (imageReceiver != null) {
            arrayList = imageReceiver.Y;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zag zagVar = (zag) arrayList.get(i);
                Bitmap bitmap2 = this.Y;
                if (bitmap2 == null || bitmap == null) {
                    map2 = this.Y0.g;
                    map2.put(this.X, Long.valueOf(SystemClock.elapsedRealtime()));
                    ImageManager imageManager = this.Y0;
                    Context context = imageManager.a;
                    zakVar = imageManager.d;
                    zagVar.b(context, zakVar, false);
                } else {
                    zagVar.c(this.Y0.a, bitmap2, false);
                }
                if (!(zagVar instanceof zaf)) {
                    map3 = this.Y0.e;
                    map3.remove(zagVar);
                }
            }
        }
        this.Z.countDown();
        obj = ImageManager.h;
        synchronized (obj) {
            hashSet = ImageManager.i;
            hashSet.remove(this.X);
        }
    }
}
