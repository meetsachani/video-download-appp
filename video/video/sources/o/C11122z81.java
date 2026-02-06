package o;

/* renamed from: o.z81  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11122z81 {
    public final a a;
    public final C10881y9 b;
    public final C9663t9 c;
    public final boolean d;

    /* renamed from: o.z81$a */
    /* loaded from: classes.dex */
    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public C11122z81(a aVar, C10881y9 c10881y9, C9663t9 c9663t9, boolean z) {
        this.a = aVar;
        this.b = c10881y9;
        this.c = c9663t9;
        this.d = z;
    }

    public a a() {
        return this.a;
    }

    public C10881y9 b() {
        return this.b;
    }

    public C9663t9 c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }
}
