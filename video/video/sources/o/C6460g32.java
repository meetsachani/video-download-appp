package o;

/* renamed from: o.g32  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6460g32 implements InterfaceC6776hM {
    public final String a;
    public final a b;
    public final C9177r9 c;
    public final C9177r9 d;
    public final C9177r9 e;
    public final boolean f;

    /* renamed from: o.g32$a */
    /* loaded from: classes.dex */
    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a g(int i) {
            if (i != 1) {
                if (i == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException("Unknown trim path type " + i);
            }
            return SIMULTANEOUSLY;
        }
    }

    public C6460g32(String str, a aVar, C9177r9 c9177r9, C9177r9 c9177r92, C9177r9 c9177r93, boolean z) {
        this.a = str;
        this.b = aVar;
        this.c = c9177r9;
        this.d = c9177r92;
        this.e = c9177r93;
        this.f = z;
    }

    @Override // o.InterfaceC6776hM
    public DL a(C8431o61 c8431o61, C10624x51 c10624x51, AbstractC8588ol abstractC8588ol) {
        return new C10823xu2(abstractC8588ol, this);
    }

    public C9177r9 b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public C9177r9 d() {
        return this.e;
    }

    public C9177r9 e() {
        return this.c;
    }

    public a f() {
        return this.b;
    }

    public boolean g() {
        return this.f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.c + ", end: " + this.d + ", offset: " + this.e + "}";
    }
}
