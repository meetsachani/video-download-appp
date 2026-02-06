package o;

import android.media.MediaFormat;
import android.util.Size;
import com.google.android.gms.common.Scopes;
import o.C2845Ej;

/* loaded from: classes.dex */
public abstract class IF2 implements InterfaceC2923Fb0 {
    public static final int b = 1;
    public static final int c = 2130708361;

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract IF2 a();

        public abstract a b(int i);

        public abstract a c(int i);

        public abstract a d(MF2 mf2);

        public abstract a e(int i);

        public abstract a f(int i);

        public abstract a g(EnumC5905dp2 enumC5905dp2);

        public abstract a h(String str);

        public abstract a i(int i);

        public abstract a j(Size size);
    }

    public static a d() {
        return new C2845Ej.b().i(-1).f(1).c(c).d(MF2.d);
    }

    @Override // o.InterfaceC2923Fb0
    public MediaFormat a() {
        Size j = j();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(b(), j.getWidth(), j.getHeight());
        createVideoFormat.setInteger("color-format", f());
        createVideoFormat.setInteger("bitrate", e());
        createVideoFormat.setInteger("frame-rate", h());
        createVideoFormat.setInteger("i-frame-interval", i());
        if (getProfile() != -1) {
            createVideoFormat.setInteger(Scopes.a, getProfile());
        }
        MF2 g = g();
        if (g.c() != 0) {
            createVideoFormat.setInteger("color-standard", g.c());
        }
        if (g.d() != 0) {
            createVideoFormat.setInteger("color-transfer", g.d());
        }
        if (g.b() != 0) {
            createVideoFormat.setInteger("color-range", g.b());
        }
        return createVideoFormat;
    }

    @Override // o.InterfaceC2923Fb0
    public abstract String b();

    @Override // o.InterfaceC2923Fb0
    public abstract EnumC5905dp2 c();

    public abstract int e();

    public abstract int f();

    public abstract MF2 g();

    @Override // o.InterfaceC2923Fb0
    public abstract int getProfile();

    public abstract int h();

    public abstract int i();

    public abstract Size j();
}
