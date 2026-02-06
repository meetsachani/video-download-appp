package o;

import android.graphics.Bitmap;

/* renamed from: o.lA2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7701lA2 implements InterfaceC7290jT1<Bitmap, Bitmap> {
    @Override // o.InterfaceC7290jT1
    /* renamed from: c */
    public InterfaceC5580cT1<Bitmap> b(Bitmap bitmap, int i, int i2, C5448bw1 c5448bw1) {
        return new a(bitmap);
    }

    @Override // o.InterfaceC7290jT1
    /* renamed from: d */
    public boolean a(Bitmap bitmap, C5448bw1 c5448bw1) {
        return true;
    }

    /* renamed from: o.lA2$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC5580cT1<Bitmap> {
        public final Bitmap X;

        public a(Bitmap bitmap) {
            this.X = bitmap;
        }

        @Override // o.InterfaceC5580cT1
        /* renamed from: b */
        public Bitmap get() {
            return this.X;
        }

        @Override // o.InterfaceC5580cT1
        public int h0() {
            return SD2.i(this.X);
        }

        @Override // o.InterfaceC5580cT1
        public Class<Bitmap> i0() {
            return Bitmap.class;
        }

        @Override // o.InterfaceC5580cT1
        public void a() {
        }
    }
}
