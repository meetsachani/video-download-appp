package o;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import o.C10138v60;

/* renamed from: o.ud2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10023ud2 implements InterfaceC7290jT1<InputStream, Bitmap> {
    public final C10138v60 a;
    public final InterfaceC2727De b;

    /* renamed from: o.ud2$a */
    /* loaded from: classes.dex */
    public static class a implements C10138v60.b {
        public final GP1 a;
        public final C9300rf0 b;

        public a(GP1 gp1, C9300rf0 c9300rf0) {
            this.a = gp1;
            this.b = c9300rf0;
        }

        @Override // o.C10138v60.b
        public void a(InterfaceC4931Zn interfaceC4931Zn, Bitmap bitmap) throws IOException {
            IOException Y0 = this.b.Y0();
            if (Y0 != null) {
                if (bitmap != null) {
                    interfaceC4931Zn.d(bitmap);
                }
                throw Y0;
            }
        }

        @Override // o.C10138v60.b
        public void b() {
            this.a.d();
        }
    }

    public C10023ud2(C10138v60 c10138v60, InterfaceC2727De interfaceC2727De) {
        this.a = c10138v60;
        this.b = interfaceC2727De;
    }

    @Override // o.InterfaceC7290jT1
    /* renamed from: c */
    public InterfaceC5580cT1<Bitmap> b(InputStream inputStream, int i, int i2, C5448bw1 c5448bw1) throws IOException {
        boolean z;
        GP1 gp1;
        if (inputStream instanceof GP1) {
            gp1 = (GP1) inputStream;
            z = false;
        } else {
            z = true;
            gp1 = new GP1(inputStream, this.b);
        }
        C9300rf0 d = C9300rf0.d(gp1);
        try {
            return this.a.f(new C9904u81(d), i, i2, c5448bw1, new a(gp1, d));
        } finally {
            d.g();
            if (z) {
                gp1.g();
            }
        }
    }

    @Override // o.InterfaceC7290jT1
    /* renamed from: d */
    public boolean a(InputStream inputStream, C5448bw1 c5448bw1) {
        return this.a.s(inputStream);
    }
}
