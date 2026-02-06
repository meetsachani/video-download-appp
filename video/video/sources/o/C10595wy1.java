package o;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* renamed from: o.wy1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10595wy1 implements InterfaceC7290jT1<ParcelFileDescriptor, Bitmap> {
    public static final int b = 536870912;
    public final C10138v60 a;

    public C10595wy1(C10138v60 c10138v60) {
        this.a = c10138v60;
    }

    @Override // o.InterfaceC7290jT1
    /* renamed from: c */
    public InterfaceC5580cT1<Bitmap> b(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, C5448bw1 c5448bw1) throws IOException {
        return this.a.d(parcelFileDescriptor, i, i2, c5448bw1);
    }

    @Override // o.InterfaceC7290jT1
    /* renamed from: d */
    public boolean a(ParcelFileDescriptor parcelFileDescriptor, C5448bw1 c5448bw1) {
        if (e(parcelFileDescriptor) && this.a.r(parcelFileDescriptor)) {
            return true;
        }
        return false;
    }

    public final boolean e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        if ((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) {
            return true;
        }
        return false;
    }
}
