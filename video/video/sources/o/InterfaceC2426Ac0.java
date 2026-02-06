package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.Ac0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2426Ac0 {
    public static final int a = -1;

    /* renamed from: o.Ac0$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public static final String a = "audio/none";

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: o.Ac0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public @interface InterfaceC0151a {
        }

        public static a a(int i, String str, int i2, int i3, int i4, int i5) {
            return new C2950Fi(i, str, i2, i3, i4, i5);
        }

        public abstract int b();

        public abstract int c();

        public abstract int d();

        public abstract String e();

        public abstract int f();

        public abstract int g();
    }

    /* renamed from: o.Ac0$b */
    /* loaded from: classes.dex */
    public static abstract class b implements InterfaceC2426Ac0 {
        public static b h(int i, int i2, List<a> list, List<c> list2) {
            return new C3048Gi(i, i2, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
        }
    }

    /* renamed from: o.Ac0$c */
    /* loaded from: classes.dex */
    public static abstract class c {
        public static final String a = "video/none";
        public static final int b = 8;
        public static final int c = 10;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: o.Ac0$c$a */
        /* loaded from: classes.dex */
        public @interface a {
        }

        public static c a(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            return new C3146Hi(i, str, i2, i3, i4, i5, i6, i7, i8, i9);
        }

        public abstract int b();

        public abstract int c();

        public abstract int d();

        public abstract int e();

        public abstract int f();

        public abstract int g();

        public abstract int h();

        public abstract String i();

        public abstract int j();

        public abstract int k();
    }

    static int c(int i) {
        if (i != 3) {
            if (i == 4) {
                return 5;
            }
            if (i != 5) {
                return -1;
            }
            return 39;
        }
        return 2;
    }

    static String d(int i) {
        switch (i) {
            case 1:
                return C4128Rj1.i;
            case 2:
                return "video/avc";
            case 3:
                return C4128Rj1.p;
            case 4:
                return "video/x-vnd.on2.vp8";
            case 5:
                return C4128Rj1.k;
            case 6:
                return C4128Rj1.m;
            case 7:
                return C4128Rj1.w;
            case 8:
                return C4128Rj1.n;
            default:
                return c.a;
        }
    }

    static String g(int i) {
        switch (i) {
            case 1:
                return C4128Rj1.c0;
            case 2:
                return C4128Rj1.d0;
            case 3:
            case 4:
            case 5:
                return "audio/mp4a-latm";
            case 6:
                return "audio/vorbis";
            case 7:
                return C4128Rj1.a0;
            default:
                return a.a;
        }
    }

    int a();

    List<c> b();

    int e();

    List<a> f();
}
