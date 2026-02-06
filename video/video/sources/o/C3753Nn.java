package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: o.Nn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3753Nn implements InterfaceC9502sT1<Bitmap, BitmapDrawable> {
    public final Resources a;

    public C3753Nn(Context context) {
        this(context.getResources());
    }

    @Override // o.InterfaceC9502sT1
    public InterfaceC5580cT1<BitmapDrawable> a(InterfaceC5580cT1<Bitmap> interfaceC5580cT1, C5448bw1 c5448bw1) {
        return HY0.e(this.a, interfaceC5580cT1);
    }

    @Deprecated
    public C3753Nn(Resources resources, InterfaceC4931Zn interfaceC4931Zn) {
        this(resources);
    }

    public C3753Nn(Resources resources) {
        this.a = (Resources) C10175vF1.e(resources);
    }
}
