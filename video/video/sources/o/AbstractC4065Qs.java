package o;

import java.io.Reader;
import java.util.Locale;

/* renamed from: o.Qs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4065Qs<T> {
    public final Reader a;
    public boolean g;
    public final C5707d01 b = new C5707d01();
    public final C10970yV1 c = new C10970yV1();
    public final C3774Ns d = new C3774Ns();
    public int e = 0;
    public UI0 f = null;
    public boolean h = true;
    public EnumC4456Us i = EnumC4456Us.NEITHER;
    public int j = 0;
    public Locale k = Locale.getDefault();
    public InterfaceC9752tV1 l = null;

    public AbstractC4065Qs(Reader reader) {
        this.a = reader;
    }

    public abstract T a();

    public UI0 b() {
        return this.f;
    }

    public Locale c() {
        return this.k;
    }

    public C5707d01 d() {
        return this.b;
    }

    public int e() {
        return this.j;
    }

    public UI0 f() {
        return (UI0) C11304zt1.t(this.f, this.d.k(this.i).i(this.k).a());
    }

    public Reader g() {
        return this.a;
    }

    public C10970yV1 h() {
        return this.c;
    }

    public int i() {
        return this.e;
    }

    public boolean j() {
        return this.h;
    }

    public boolean k() {
        return this.g;
    }
}
