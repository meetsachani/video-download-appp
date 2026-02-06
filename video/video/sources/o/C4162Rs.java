package o;

import java.io.Reader;
import java.util.Locale;
import java.util.ResourceBundle;

/* renamed from: o.Rs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4162Rs extends AbstractC4065Qs<C3968Ps> {
    public C4162Rs(Reader reader) {
        super(reader);
        if (reader != null) {
            return;
        }
        throw new IllegalArgumentException(ResourceBundle.getBundle(UI0.k).getString("reader.null"));
    }

    @Override // o.AbstractC4065Qs
    /* renamed from: l */
    public C3968Ps a() {
        return new C3968Ps(this.a, this.e, f(), this.g, this.h, this.j, this.k, this.b, this.c, this.l);
    }

    public C4162Rs m(UI0 ui0) {
        this.f = ui0;
        return this;
    }

    public C4162Rs n(Locale locale) {
        this.k = (Locale) C11304zt1.t(locale, Locale.getDefault());
        return this;
    }

    public C4162Rs o(EnumC4456Us enumC4456Us) {
        this.i = enumC4456Us;
        return this;
    }

    public C4162Rs p(boolean z) {
        this.g = z;
        return this;
    }

    public C4162Rs q(InterfaceC5222b01 interfaceC5222b01) {
        this.b.b(interfaceC5222b01);
        return this;
    }

    public C4162Rs r(int i) {
        this.j = i;
        return this;
    }

    public C4162Rs s(InterfaceC9752tV1 interfaceC9752tV1) {
        this.l = interfaceC9752tV1;
        return this;
    }

    public C4162Rs t(InterfaceC10484wV1 interfaceC10484wV1) {
        this.c.b(interfaceC10484wV1);
        return this;
    }

    public C4162Rs u(int i) {
        this.e = Math.max(i, 0);
        return this;
    }

    public C4162Rs v(boolean z) {
        this.h = z;
        return this;
    }
}
