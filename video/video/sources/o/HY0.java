package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public final class HY0 implements InterfaceC5580cT1<BitmapDrawable>, DP0 {
    public final Resources X;
    public final InterfaceC5580cT1<Bitmap> Y;

    public HY0(Resources resources, InterfaceC5580cT1<Bitmap> interfaceC5580cT1) {
        this.X = (Resources) C10175vF1.e(resources);
        this.Y = (InterfaceC5580cT1) C10175vF1.e(interfaceC5580cT1);
    }

    @Deprecated
    public static HY0 c(Context context, Bitmap bitmap) {
        return (HY0) e(context.getResources(), C6141eo.c(bitmap, com.bumptech.glide.a.e(context).h()));
    }

    @Deprecated
    public static HY0 d(Resources resources, InterfaceC4931Zn interfaceC4931Zn, Bitmap bitmap) {
        return (HY0) e(resources, C6141eo.c(bitmap, interfaceC4931Zn));
    }

    public static InterfaceC5580cT1<BitmapDrawable> e(Resources resources, InterfaceC5580cT1<Bitmap> interfaceC5580cT1) {
        if (interfaceC5580cT1 == null) {
            return null;
        }
        return new HY0(resources, interfaceC5580cT1);
    }

    @Override // o.InterfaceC5580cT1
    public void a() {
        this.Y.a();
    }

    @Override // o.InterfaceC5580cT1
    /* renamed from: b */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.X, this.Y.get());
    }

    @Override // o.InterfaceC5580cT1
    public int h0() {
        return this.Y.h0();
    }

    @Override // o.InterfaceC5580cT1
    public Class<BitmapDrawable> i0() {
        return BitmapDrawable.class;
    }

    @Override // o.DP0
    public void initialize() {
        InterfaceC5580cT1<Bitmap> interfaceC5580cT1 = this.Y;
        if (interfaceC5580cT1 instanceof DP0) {
            ((DP0) interfaceC5580cT1).initialize();
        }
    }
}
