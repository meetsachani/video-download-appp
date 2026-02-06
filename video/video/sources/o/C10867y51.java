package o;

/* renamed from: o.y51  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10867y51 {
    public static final C10867y51 b = new C10867y51();
    public final Y61<String, C10624x51> a = new Y61<>(20);

    public static C10867y51 c() {
        return b;
    }

    public void a() {
        this.a.d();
    }

    public C10624x51 b(String str) {
        if (str == null) {
            return null;
        }
        return this.a.f(str);
    }

    public void d(String str, C10624x51 c10624x51) {
        if (str == null) {
            return;
        }
        this.a.j(str, c10624x51);
    }

    public void e(int i) {
        this.a.m(i);
    }
}
