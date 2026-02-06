package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zab implements Runnable {
    public final zag X;
    public final /* synthetic */ ImageManager Y;

    public zab(ImageManager imageManager, zag zagVar) {
        this.Y = imageManager;
        this.X = zagVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        zak zakVar;
        Map map2;
        Map map3;
        Object obj;
        HashSet hashSet;
        HashSet hashSet2;
        Map map4;
        Map map5;
        Map map6;
        zak zakVar2;
        Map map7;
        Asserts.a("LoadImageRunnable must be executed on the main thread");
        map = this.Y.e;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) map.get(this.X);
        if (imageReceiver != null) {
            map7 = this.Y.e;
            map7.remove(this.X);
            imageReceiver.c(this.X);
        }
        zag zagVar = this.X;
        zad zadVar = zagVar.a;
        Uri uri = zadVar.a;
        if (uri != null) {
            map2 = this.Y.g;
            Long l = (Long) map2.get(uri);
            if (l != null) {
                if (SystemClock.elapsedRealtime() - l.longValue() >= 3600000) {
                    map6 = this.Y.g;
                    map6.remove(zadVar.a);
                } else {
                    zag zagVar2 = this.X;
                    ImageManager imageManager = this.Y;
                    Context context = imageManager.a;
                    zakVar2 = imageManager.d;
                    zagVar2.b(context, zakVar2, true);
                    return;
                }
            }
            this.X.a(null, false, true, false);
            map3 = this.Y.f;
            ImageManager.ImageReceiver imageReceiver2 = (ImageManager.ImageReceiver) map3.get(zadVar.a);
            if (imageReceiver2 == null) {
                imageReceiver2 = new ImageManager.ImageReceiver(zadVar.a);
                map5 = this.Y.f;
                map5.put(zadVar.a, imageReceiver2);
            }
            imageReceiver2.b(this.X);
            zag zagVar3 = this.X;
            if (!(zagVar3 instanceof zaf)) {
                map4 = this.Y.e;
                map4.put(zagVar3, imageReceiver2);
            }
            obj = ImageManager.h;
            synchronized (obj) {
                try {
                    hashSet = ImageManager.i;
                    if (!hashSet.contains(zadVar.a)) {
                        hashSet2 = ImageManager.i;
                        hashSet2.add(zadVar.a);
                        imageReceiver2.d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        ImageManager imageManager2 = this.Y;
        Context context2 = imageManager2.a;
        zakVar = imageManager2.d;
        zagVar.b(context2, zakVar, true);
    }
}
