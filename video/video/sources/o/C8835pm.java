package o;

import java.lang.reflect.Field;
import java.util.Locale;

/* renamed from: o.pm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8835pm<T> extends AbstractC8592om<T, Integer> {
    public C8835pm(Class<?> cls, Field field, boolean z, Locale locale, ER er, Class<? extends InterfaceC7846lm1> cls2, String str, String str2) {
        super(cls, field, z, locale, er, cls2, str, str2);
    }

    @Override // o.AbstractC8592om
    public Object r(InterfaceC7846lm1<Integer, Object> interfaceC7846lm1, String str, Object obj) {
        return Boolean.valueOf(interfaceC7846lm1.put(Integer.valueOf(str), obj));
    }
}
