package o;

import android.util.Base64;
import o.C2747Dj;
import o.HT1;
import o.InterfaceC6615gi;

@InterfaceC6615gi
/* loaded from: classes2.dex */
public abstract class Nt2 {

    @InterfaceC6615gi.a
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract Nt2 a();

        public abstract a b(String str);

        public abstract a c(@InterfaceC11300zs1 byte[] bArr);

        @HT1({HT1.a.Y})
        public abstract a d(EnumC10429wH1 enumC10429wH1);
    }

    public static a a() {
        return new C2747Dj.b().d(EnumC10429wH1.DEFAULT);
    }

    public abstract String b();

    @InterfaceC11300zs1
    public abstract byte[] c();

    @HT1({HT1.a.Y})
    public abstract EnumC10429wH1 d();

    public boolean e() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    @HT1({HT1.a.Y})
    public Nt2 f(EnumC10429wH1 enumC10429wH1) {
        return a().b(b()).d(enumC10429wH1).c(c()).a();
    }

    public final String toString() {
        String encodeToString;
        String b = b();
        EnumC10429wH1 d = d();
        if (c() == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(c(), 2);
        }
        return String.format("TransportContext(%s, %s, %s)", b, d, encodeToString);
    }
}
