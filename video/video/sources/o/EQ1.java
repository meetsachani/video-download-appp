package o;

import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class EQ1<T> extends L0<String, String, T> {
    public final Pattern Z;

    public EQ1(String str, InterfaceC8348nm<T, String> interfaceC8348nm, Locale locale) {
        super(interfaceC8348nm, locale);
        this.Z = C3297Iv1.b(str, 2, AbstractC8592om.class, this.Y);
    }

    @Override // o.VH
    /* renamed from: i */
    public boolean e(String str) {
        return this.Z.matcher(str).matches();
    }

    @Override // o.VH
    /* renamed from: j */
    public String h() {
        return this.Z.pattern();
    }
}
