package o;

import java.lang.reflect.Field;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: o.rm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9327rm<T, I> extends V<T, I> {
    public final Pattern g;
    public final String h;

    public C9327rm(Class<?> cls, Field field, boolean z, Locale locale, ER er, String str, String str2) {
        super(cls, field, z, locale, er);
        this.g = C3297Iv1.c(str, 0, C9327rm.class, this.d);
        this.h = str2;
        C3297Iv1.g(str2, C9327rm.class, this.d);
    }

    @Override // o.V
    public Object b(String str) throws JR, DR {
        Pattern pattern = this.g;
        if (pattern != null && str != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
            }
        }
        ER er = this.e;
        if (er != null) {
            return er.a(str);
        }
        throw new C8027mR(ResourceBundle.getBundle(UI0.k, this.d).getString("no.converter.specified"));
    }

    @Override // o.V
    public String c(Object obj) throws JR {
        ER er = this.e;
        if (er != null) {
            String b = er.b(obj);
            if (C4500Ve2.N0(this.h) && C4500Ve2.N0(b)) {
                return String.format(this.h, b);
            }
            return b;
        }
        throw new C8027mR(ResourceBundle.getBundle(UI0.k, this.d).getString("no.converter.specified"));
    }
}
