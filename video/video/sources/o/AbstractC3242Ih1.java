package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import o.AbstractC3044Gh;
import o.C4707Xi;
import o.QG2;

/* renamed from: o.Ih1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3242Ih1 {
    public static final String a = "audio/mp4a-latm";
    public static final String b = "audio/vorbis";
    public static final String c = "video/avc";
    public static final String d = "video/x-vnd.on2.vp8";
    public static final int e = 2;
    public static final int f = -1;
    public static final int g = 0;
    public static final int h = 1;

    /* renamed from: o.Ih1$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract AbstractC3242Ih1 a();

        public a b(InterfaceC10929yL<AbstractC3044Gh.a> interfaceC10929yL) {
            AbstractC3044Gh.a g = d().g();
            interfaceC10929yL.accept(g);
            f(g.a());
            return this;
        }

        public a c(InterfaceC10929yL<QG2.a> interfaceC10929yL) {
            QG2.a f = e().f();
            interfaceC10929yL.accept(f);
            h(f.a());
            return this;
        }

        public abstract AbstractC3044Gh d();

        public abstract QG2 e();

        public abstract a f(AbstractC3044Gh abstractC3044Gh);

        public abstract a g(int i);

        public abstract a h(QG2 qg2);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Ih1$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    public static a a() {
        return new C4707Xi.b().g(-1).f(AbstractC3044Gh.a().a()).h(QG2.a().a());
    }

    public static String e(int i) {
        if (i != 1) {
            return "audio/mp4a-latm";
        }
        return "audio/vorbis";
    }

    public static int f(int i) {
        if (Objects.equals(e(i), "audio/mp4a-latm")) {
            return 2;
        }
        return -1;
    }

    public static int g(int i) {
        if (i == 1) {
            return 1;
        }
        return 0;
    }

    public static String h(int i) {
        if (i != 1) {
            return "video/avc";
        }
        return "video/x-vnd.on2.vp8";
    }

    public abstract AbstractC3044Gh b();

    public abstract int c();

    public abstract QG2 d();

    public abstract a i();
}
