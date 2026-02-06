package o;

/* renamed from: o.wI1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10433wI1 {
    public final a a;
    public final b b;

    /* renamed from: o.wI1$a */
    /* loaded from: classes4.dex */
    public enum a {
        BIT_32("32-bit"),
        BIT_64("64-bit"),
        UNKNOWN("Unknown");
        
        public final String X;

        a(String str) {
            this.X = str;
        }

        public String e() {
            return this.X;
        }
    }

    /* renamed from: o.wI1$b */
    /* loaded from: classes4.dex */
    public enum b {
        X86,
        IA_64,
        PPC,
        UNKNOWN
    }

    public C10433wI1(a aVar, b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public a a() {
        return this.a;
    }

    public b b() {
        return this.b;
    }

    public boolean c() {
        if (a.BIT_32 == this.a) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (a.BIT_64 == this.a) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if (b.IA_64 == this.b) {
            return true;
        }
        return false;
    }

    public boolean f() {
        if (b.PPC == this.b) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (b.X86 == this.b) {
            return true;
        }
        return false;
    }
}
