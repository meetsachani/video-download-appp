package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import o.YE2;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(YE2 ye2) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = ye2.M(iconCompat.a, 1);
        iconCompat.c = ye2.t(iconCompat.c, 2);
        iconCompat.d = ye2.W(iconCompat.d, 3);
        iconCompat.e = ye2.M(iconCompat.e, 4);
        iconCompat.f = ye2.M(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) ye2.W(iconCompat.g, 6);
        iconCompat.i = ye2.d0(iconCompat.i, 7);
        iconCompat.j = ye2.d0(iconCompat.j, 8);
        iconCompat.a();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, YE2 ye2) {
        ye2.j0(true, true);
        iconCompat.g(ye2.i());
        int i = iconCompat.a;
        if (-1 != i) {
            ye2.M0(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            ye2.u0(bArr, 2);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            ye2.X0(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            ye2.M0(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            ye2.M0(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            ye2.X0(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            ye2.f1(str, 7);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            ye2.f1(str2, 8);
        }
    }
}
