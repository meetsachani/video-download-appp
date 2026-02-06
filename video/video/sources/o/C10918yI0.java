package o;

import java.io.InputStream;
import o.InterfaceC7595kk1;

/* renamed from: o.yI0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10918yI0 implements InterfaceC7595kk1<C5519cE0, InputStream> {
    public static final C4274Sv1<Integer> b = C4274Sv1.g("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    public final C7352jk1<C5519cE0, C5519cE0> a;

    public C10918yI0() {
        this(null);
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: c */
    public InterfaceC7595kk1.a<InputStream> b(C5519cE0 c5519cE0, int i, int i2, C5448bw1 c5448bw1) {
        C7352jk1<C5519cE0, C5519cE0> c7352jk1 = this.a;
        if (c7352jk1 != null) {
            C5519cE0 b2 = c7352jk1.b(c5519cE0, 0, 0);
            if (b2 == null) {
                this.a.c(c5519cE0, 0, 0, c5519cE0);
            } else {
                c5519cE0 = b2;
            }
        }
        return new InterfaceC7595kk1.a<>(c5519cE0, new GI0(c5519cE0, ((Integer) c5448bw1.c(b)).intValue()));
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: d */
    public boolean a(C5519cE0 c5519cE0) {
        return true;
    }

    public C10918yI0(C7352jk1<C5519cE0, C5519cE0> c7352jk1) {
        this.a = c7352jk1;
    }

    /* renamed from: o.yI0$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC7838lk1<C5519cE0, InputStream> {
        public final C7352jk1<C5519cE0, C5519cE0> a = new C7352jk1<>(500);

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<C5519cE0, InputStream> e(C5650cm1 c5650cm1) {
            return new C10918yI0(this.a);
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }
}
