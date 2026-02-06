package o;

import java.io.IOException;
import java.io.Reader;
import java.util.Locale;
import java.util.ResourceBundle;

/* renamed from: o.Ts  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4359Ts extends AbstractC4065Qs<C4262Ss> {
    public C4359Ts(Reader reader) {
        super(reader);
    }

    @Override // o.AbstractC4065Qs
    /* renamed from: l */
    public C4262Ss a() throws RuntimeException {
        try {
            return new C4262Ss(this.a, this.e, f(), this.g, this.h, this.j, this.k, this.b, this.c, this.l);
        } catch (IOException e) {
            throw new RuntimeException(ResourceBundle.getBundle(UI0.k, this.k).getString("csvreaderheaderaware.impossible"), e);
        }
    }

    public C4359Ts m(UI0 ui0) {
        this.f = ui0;
        return this;
    }

    public C4359Ts n(Locale locale) {
        this.k = (Locale) C11304zt1.t(locale, Locale.getDefault());
        return this;
    }

    public C4359Ts o(EnumC4456Us enumC4456Us) {
        this.i = enumC4456Us;
        return this;
    }

    public C4359Ts p(boolean z) {
        this.g = z;
        return this;
    }

    public C4359Ts q(InterfaceC5222b01 interfaceC5222b01) {
        this.b.b(interfaceC5222b01);
        return this;
    }

    public C4359Ts r(int i) {
        this.j = i;
        return this;
    }

    public C4359Ts s(InterfaceC9752tV1 interfaceC9752tV1) {
        this.l = interfaceC9752tV1;
        return this;
    }

    public C4359Ts t(InterfaceC10484wV1 interfaceC10484wV1) {
        this.c.b(interfaceC10484wV1);
        return this;
    }

    public C4359Ts u(int i) {
        this.e = Math.max(i, 0);
        return this;
    }

    public C4359Ts v(boolean z) {
        this.h = z;
        return this;
    }
}
