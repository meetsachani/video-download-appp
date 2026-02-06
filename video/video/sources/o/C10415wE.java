package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.UUID;
import o.C10415wE;

@Deprecated
/* renamed from: o.wE  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10415wE {
    public static final int d = 64;
    public static final String e = "CMCD-Object";
    public static final String f = "CMCD-Request";
    public static final String g = "CMCD-Session";
    public static final String h = "CMCD-Status";
    public static final String i = "br";
    public static final String j = "bl";
    public static final String k = "cid";
    public static final String l = "sid";
    public static final String m = "rtp";
    public static final String n = "sf";

    /* renamed from: o  reason: collision with root package name */
    public static final String f900o = "st";
    public static final String p = "v";
    public static final String q = "tb";
    public static final String r = "d";
    public static final String s = "mtp";
    public static final String t = "ot";
    @InterfaceC11300zs1
    public final String a;
    @InterfaceC11300zs1
    public final String b;
    public final d c;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.wE$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    /* renamed from: o.wE$b */
    /* loaded from: classes2.dex */
    public interface b {
        public static final b a = new b() { // from class: o.xE
            @Override // o.C10415wE.b
            public final C10415wE a(C8322nf1 c8322nf1) {
                return C10415wE.b.b(c8322nf1);
            }
        };

        /* renamed from: o.wE$b$a */
        /* loaded from: classes2.dex */
        public class a implements d {
        }

        static /* synthetic */ C10415wE b(C8322nf1 c8322nf1) {
            String uuid = UUID.randomUUID().toString();
            String str = c8322nf1.X;
            if (str == null) {
                str = "";
            }
            return new C10415wE(uuid, str, new a());
        }

        C10415wE a(C8322nf1 c8322nf1);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.wE$c */
    /* loaded from: classes2.dex */
    public @interface c {
    }

    /* renamed from: o.wE$d */
    /* loaded from: classes2.dex */
    public interface d {
        default boolean a(String str) {
            return true;
        }

        default int b(int i) {
            return C10323vs.f;
        }

        default AbstractC6044eO0<String, String> c() {
            return AbstractC6044eO0.u();
        }
    }

    public C10415wE(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, d dVar) {
        boolean z;
        boolean z2 = true;
        if (str != null && str.length() > 64) {
            z = false;
        } else {
            z = true;
        }
        C9542sf.a(z);
        if (str2 != null && str2.length() > 64) {
            z2 = false;
        }
        C9542sf.a(z2);
        C9542sf.g(dVar);
        this.a = str;
        this.b = str2;
        this.c = dVar;
    }

    public boolean a() {
        return this.c.a("br");
    }

    public boolean b() {
        return this.c.a(j);
    }

    public boolean c() {
        return this.c.a(k);
    }

    public boolean d() {
        return this.c.a(m);
    }

    public boolean e() {
        return this.c.a(s);
    }

    public boolean f() {
        return this.c.a("d");
    }

    public boolean g() {
        return this.c.a(t);
    }

    public boolean h() {
        return this.c.a(l);
    }

    public boolean i() {
        return this.c.a("st");
    }

    public boolean j() {
        return this.c.a(n);
    }

    public boolean k() {
        return this.c.a("tb");
    }
}
